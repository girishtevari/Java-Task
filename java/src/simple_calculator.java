import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args) {
        System.out.println("welcome to simple calculator :");
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.println( "Do u want to start the Calculator?(Yes(y)/No(n)");
        char choice = sc.next().charAt(0);
        while (choice == 'y') {
            System.out.println("Enter a 1st number");
            double num1 = sc.nextDouble();
            System.out.println("Enter a 2nd number");
            double num2 = sc.nextDouble();
            System.out.println("Enter the Operator(+,-,*,/,%)");
            char op = sc.next().charAt(0);
            if (op == '+') {
                System.out.println(result = num1 + num2);
            }

            if (op == '-') {
                System.out.println(result = num1 - num2);

            }
            if (op == '*') {
                System.out.println(result = num1 * num2);
            }

            if (op == '/') {
                if (num2!=0){
                    System.out.println(result = num1 / num2);
                }
                else{
                    System.out.println("Error");
                }

            }

            if (op == '%') {
                System.out.println(result = num1 % num2);

            }
            System.out.println("Do u want to continue(y/n)");
            choice = sc.next().charAt(0);
            System.out.println("Thank you");



        }
    }
}
