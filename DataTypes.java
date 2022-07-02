package introduction;


import java.util.Scanner;

//Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.
public class DataTypes {

  public static void main(String[] argh) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {

      try {
        long x = sc.nextLong();
        long limitNumber;
        System.out.println(x + " can be fitted in:");
        limitNumber = 128;
        if (x >= -limitNumber && x < limitNumber) {
          System.out.println("* byte");
        }
        limitNumber = (long) Math.pow(2, 16);
        if (x >= -limitNumber && x < limitNumber) {
          System.out.println("* short");
        }
        limitNumber = (long) Math.pow(2, 32);
        if (x >= -limitNumber && x < limitNumber) {
          System.out.println("* integer");
        }
        System.out.println("* long");
      } catch (Exception e) {
        System.out.println(sc.next() + " can't be fitted anywhere.");
      }

    }
  }

}




