package Application;

import Services.BrazilInterestService;
import Services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        UsaInterestService s = new UsaInterestService(1.0);

        double payment = s.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.printf("%.2f", payment);

        sc.close();
    }
}