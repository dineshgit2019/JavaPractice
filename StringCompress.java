package org.example;
public class StringCompress{

  public static String compressString(String input) {
    if (input == null || input.length() <= 1) {
      return input;
    }

    int size = input.length();
    int i = 0;
    int j = 1;
    int count = 1;
    StringBuilder result = new StringBuilder();

    while (j < size) {
      count = 1;
      while (j < size && input.charAt(i) == input.charAt(j)) {
        j++;
        count++;
      }

      result.append(input.charAt(i));
      result.append(Integer.toString(count));
      i = j;
      j++;
    }
    return result.toString();

  }

  public static void main(String[] args) {
    System.out.println(compressString("aaabbb"));
  }
}