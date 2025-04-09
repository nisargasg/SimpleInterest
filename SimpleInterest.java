
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time: ");
        double time = sc.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
        System.out.println("This is master branch");
    }

}

