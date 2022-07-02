package src.sttc.initialization.blocks;

import java.util.Scanner;

public class StaticInitializationBlocks {

  static boolean flag;
  static int B, H;

  static {
    Scanner scanner = new Scanner(System.in);
    B = scanner.nextInt();
    H = scanner.nextInt();
    scanner.close();

    if (B <= 0 || H <= 0) {
      System.out.print("lang.Exception: Breadth and height must be positive");
      flag = false;
    } else {
      flag = true;
    }
  }
  public static void main(String[] args) {

    if (flag) {
      int area = B * H;
      System.out.print(area);
    }

  }
}
