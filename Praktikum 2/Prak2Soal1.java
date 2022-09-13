import java.util.Scanner;

    public class Prak2Soal01 {
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    int num1, num2;

    System.out.print("num1 = ");
    num1 = input.nextInt();

    System.out.print("num2 = ");
    num2 = input.nextInt();

    System.out.println("num1 + num2 = " + (num1 + num2) );
    System.out.println("num1 - num2 = " + (num1 - num2) );
    System.out.println("num1 * num2 = " + (num1 * num2) );
    System.out.println("num1 / num2 = " + ((float)num1 / num2));
    System.out.println("num1 % num2 = " + (num1 % num2) );
    }
} 
