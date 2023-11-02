package storylangc.components;

public class Word {

  private int index;
  private String identifier;
  private Words type;

  public Word(int index, String identifier, Words type) {
    this.index = index;
    this.identifier = identifier;
    this.type = type;
  }

  public Word(String identifier, Words type) {
    this.identifier = identifier;
    this.type = type;
  }

  public int getIndex() {
    return this.index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getIdentifier() {
    return this.identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Words getType() {
    return type;
  }

  public void setType(Words type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return String.format("Word {identifier: %s, type: %s}", identifier, type);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Word other = (Word) obj;
    if (identifier == null) {
      if (other.identifier != null)
        return false;
    } else if (!identifier.equals(other.identifier))
      return false;
    if (type == null) {
      if (other.type != null)
        return false;
    } else if (!type.equals(other.type))
      return false;
    return true;
  }

}
