package src.strings.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTokens {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    final String delimiters = "[ \\\"!,?._'@\\\". ]";
    final String[] list = s.split(delimiters);
    List<String> finalList = new ArrayList<>();
    for (int i = 0; i < list.length; i++) {
      if ("".equals(list[i])) {
        continue;
      }
      finalList.add(list[i]);
    }
    System.out.println(finalList.size());
    finalList.forEach(item -> System.out.println(item));
    scan.close();
  }
}



