package src.end.of.file;

import java.util.Scanner;

public class EndOfLine {

  public static void main(String[] args) {
    Scanner newScanner = new Scanner(System.in);
    int counter = 1;
    while (newScanner.hasNextLine()) {
      String line = newScanner.nextLine();
      System.out.println(String.format("%s %s", counter, line));
      counter++;
    }

  }
}
