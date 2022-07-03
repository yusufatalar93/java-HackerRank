package src.exception.handling;

import java.util.Scanner;

public class ExceptionHandling {

  public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);
    try {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      scanner.close();
      int result = x/y;
      System.out.println(result);
    }catch (Exception e){
      System.out.println(e);
    }

  }
}
