package src.strings.introduction;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AnagramCheck {

  static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    } else {
      a = a.toLowerCase();
      b = b.toLowerCase();
      char test;
      for (int i = 0; i < a.length(); i++) {
        test = a.charAt(i);
        int countA = 0;
        int countB = 0;
        for (int j = 0; j < a.length(); j++) {
          if (a.charAt(j) == test) {
            countA++;
          }
          if (b.charAt(j) == test) {
            countB++;
          }
        }
        if (countA != countB) {
          return false;
        }
      }
      return true;
    }
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}