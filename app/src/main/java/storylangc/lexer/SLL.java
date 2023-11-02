package storylangc.lexer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import storylangc.App;

public class SLL {

  private String projectDirectoryPath;
  List<String> filePaths;

  /**
     * Get File from the resources folder.
     * @param fileName
     * @return
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public static File getFileFromResource(String fileName) throws IllegalArgumentException, NullPointerException {
        ClassLoader classLoader = App.class.getClassLoader();
        if (classLoader == null)
            throw new NullPointerException("Could not get class loader.");
        if (fileName == null)
            throw new NullPointerException("File name cannot be null.");
    
        URL resourceUrl = classLoader.getResource(fileName);
        if (resourceUrl == null)
            throw new IllegalArgumentException("File does not exist.");
    
        File file = new File(resourceUrl.getFile());
        return file;
    }

    /**
     * Get File from set path
     * @param path
     * @return
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public static File getFileFromPath(String path) throws IllegalArgumentException, NullPointerException {
        if (path == null)
            throw new NullPointerException("Path cannot be null.");
    
        File file = new File(path);
        if (!file.exists())
            throw new IllegalArgumentException("File does not exist.");
    
        return file;
    }

  /**
   * Method to convert a file to String.
   * 
   * @param filePath Path to file.
   * @return String
   */
  public String fileToString(String filePath) {
    String fileString = "";
    try {
      fileString = Files.readString(Paths.get(filePath))
        .strip()
        .replaceAll("\n", "")
        .replaceAll("\r", "")
        .replaceAll("\t", "");
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fileString;
  }

  /**
   * Method to find all file paths in a directory and subdirectories.
   * 
   * @return Array of file paths.
   */
  public List<String> getAllFilePaths() {
    List<String> filePaths = new ArrayList<>();
    try {
      Files.walk(Paths.get(projectDirectoryPath))
          .filter(Files::isRegularFile)
          .map(Path::toString)
          .forEach(filePaths::add);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return filePaths;
  }

  /**
   * Method to find all file paths in a directory and subdirectories.
   * 
   * @return Array of file paths.
   */
  public List<String> getAllFilePaths(String directoryPath) {
    List<String> filePaths = new ArrayList<>();
    try {
      Files.walk(Paths.get(directoryPath))
          .filter(Files::isRegularFile)
          .map(Path::toString)
          .forEach(filePaths::add);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return filePaths;
  }

  /**
   * Method to get all file strings in a directory and subdirectories.
   */
  public List<String> getAllFileStrings() {
    List<String> fileStrings = new ArrayList<>();
    List<String> filePaths = getAllFilePaths(projectDirectoryPath);
    for (String filePath : filePaths) {
      fileStrings.add(fileToString(filePath));
    }
    return fileStrings;
  }

  /**
   * Method to get all file strings in a directory and subdirectories.
   */
  public List<String> getAllFileStrings(String projectDirectoryPath) {
    List<String> fileStrings = new ArrayList<>();
    List<String> filePaths = getAllFilePaths(projectDirectoryPath);
    for (String filePath : filePaths) {
      fileStrings.add(fileToString(filePath));
    }
    return fileStrings;
  }

  public SLL(String directoryPath) {
    this.projectDirectoryPath = directoryPath;
    filePaths = getAllFileStrings();
  }

  /**
   * Method to begin Lexing Files and Splitting Them To Namespaces.
   */
}
