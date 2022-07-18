package src.strings.introduction;

import java.util.Scanner;

public class SubstringComparisons {

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    int i = 0;
    while (i + k <= s.length()) {
      String substring = "";
      substring = s.substring(i, i + k);

      if (smallest.length() == 0 || smallest.compareTo(substring) > 0) {
        smallest = substring;
      }
      if (largest.length() == 0 || largest.compareTo(substring) < 0) {
        largest = substring;
      }
      i = i + 1;
    }

    return smallest + "\n" + largest;

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String text = in.next();
    int range = in.nextInt();
    String result = getSmallestAndLargest(text, range);
    System.out.println(result);
  }
}