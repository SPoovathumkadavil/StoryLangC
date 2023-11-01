package storylangc.lexer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SLL {

  /**
   * Method to convert a file to an ArrayList of lines.
   * 
   * @param filePath Path to file.
   * @return ArrayList of Lines
   */
  public String fileToString(String filePath) {
    String fileString = "";
    try {
      fileString = Files.readString(Paths.get(filePath))
        .strip()
        .replaceAll("\n", " ")
        .replaceAll("\r", " ")
        .replaceAll("\t", " ");
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

}
