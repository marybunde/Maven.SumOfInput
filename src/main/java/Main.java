import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        //write a program prompting user to input number n
        //program should respond by printing numbers 1-n

        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");

        int usrInput = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= usrInput; i++) {

            sum += i;

        }
        System.out.println(sum);

    }
}