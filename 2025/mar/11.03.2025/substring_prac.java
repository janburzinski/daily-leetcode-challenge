public class substring_prac {

  /**
   * substring(int beginIndex, int endIndex)
   * => method is used to extract part of a string
   * 
   * substring(int beginIndex)
   * => extract the remaining string, so we basically skip until the beginIndex in
   * the String
   */

  // bsp: miau teng mustermann
  public String extractLastName(String fullName) {
    int parts = fullName.lastIndexOf(" ");
    return fullName.substring(parts + 1);
  }
}
