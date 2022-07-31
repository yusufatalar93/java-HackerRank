package src.strings.introduction;

import java.util.Scanner;

public class IpAddressRegex {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String IP = in.next();
      System.out.println(IP.matches(new MyRegex().pattern));
    }
  }
}

class MyRegex {

  String pattern = "\\b(?:(?:2(?:[0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9])\\.){3}(?:(?:2([0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9]))\\b";
}

