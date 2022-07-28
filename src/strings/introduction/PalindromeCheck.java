package src.strings.introduction;

import java.util.Scanner;

public class PalindromeCheck {

  private static boolean isPalindrome(String word) {
    String reverseOfWord = new String();
    int lengthOfWord = word.length();
    for (int i = 0; i < lengthOfWord; i++) {
      reverseOfWord += word.charAt(lengthOfWord - i - 1);
    }
    return reverseOfWord.equals(word);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String word = sc.next();

    if (isPalindrome(word)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

