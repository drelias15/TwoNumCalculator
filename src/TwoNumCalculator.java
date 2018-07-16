import java.util.Scanner;

public class TwoNumCalculator {

    public static void main(String[] args) {
        int num1, num2;
        int sum;
        int product;
        int average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1+num2;
        product=num1*num2;
        average=(num1+num2)/2;


        if (sum > 200){
            System.out.println("The sum of the two numbers is " + sum + " *");
            System.out.println("The product of the two numbers is " + product);
            System.out.println("The average of the two numbers is " + average);
        }
        else {
            System.out.println("The sum of the two numbers is " + sum);
            System.out.println("The product of the two numbers is " + product);
            System.out.println("The average of the two numbers is " + average);

        }

    }

}