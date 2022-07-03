package src.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

  public static void main(String[] args) {

    Scanner scanner  = new Scanner(System.in);


    try {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      scanner.close();
      int result = x/y;
      System.out.println(result);
    }catch (Exception e){
      if(e instanceof ArithmeticException){
        System.out.println("java.lang.ArithmeticException: / by zero");
      } else if (e instanceof InputMismatchException) {
        System.out.println("java.util.InputMismatchException");
      }
    }

  }
}
