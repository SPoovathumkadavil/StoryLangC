package storylangc.components;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameSpace {
  private Map<String, Word> words;

  public NameSpace(List<Word> words) {
    this.words = new HashMap<>();
    for (Word word : words) {
      if (word == null) {
        throw new IllegalArgumentException("null word");
      }
      if (this.words.values().stream().anyMatch(w -> w.getIdentifier().equals(word.getIdentifier()))) {
        throw new IllegalArgumentException("duplicate word: " + word.getIdentifier());
      }
      this.words.put(word.getIdentifier(), word);
    }
  }

  public Word getWord(String name) {
    return words.get(name);
  }

  public void addWord(Word word) {
    words.put(word.getIdentifier(), word);
  }

  public void removeWord(Word word) {
    words.remove(word.getIdentifier());
  }
}
