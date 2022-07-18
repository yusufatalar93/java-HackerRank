package src.strings.introduction;

import java.util.Locale;
import java.util.Scanner;

public class StringIntroduction {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();

    //  sum the lengths of A and B .
    int length = A.length() + B.length();
    System.out.println(length);

    // A is lexicographically greater than B
    int result = A.compareToIgnoreCase(B);
    String isBigger = new String();
    if (result > 0) {
      isBigger = "Yes";
    } else {
      isBigger = "No";
    }
    System.out.println(isBigger);

    //capitalize the first letter  in both A and B
    A = A.substring(0,1).toUpperCase() + A.substring(1);
    B = B.substring(0,1).toUpperCase() + B.substring(1);
    System.out.println(A + " " + B);

  }
}