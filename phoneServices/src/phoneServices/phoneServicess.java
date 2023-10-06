package phoneServices;
import java.util.Scanner;

public class phoneServicess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentPage = 1;

        while (true) {
            switch (currentPage) {
                case 1:
                    currentPage = page1(scanner);
                    break;
                case 2:
                    currentPage = page2(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
            }
        }
    }

    private static int page1(Scanner scanner) {
        System.out.println("0.Sh20(30mins, 3hrs)");
        System.out.println("1.Sh10(15mins, 1hr)");
        System.out.println("2.Sh20(15mins, midnight)");
        System.out.println("3.Okoa 50");
        System.out.println("4.Okoa 20");
        System.out.println("5.Okoa 10");
        System.out.println("6.Okoa 5");
        System.out.println("7.Okoa 20 (900MB,1hr)");
        System.out.println("8.Okoa internet");
        System.out.println("98:More");
        System.out.print(": ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                return 1; 
            case 1:
                return 2; 
            case 2:
                return 3; 
            default:
                System.out.println("Invalid choice. Try again.");
                return 1; 
        }
    }

    private static int page2(Scanner scanner) {
        System.out.println("Existing Unpaid Okoa:0");
        System.out.println("New Okoa request:20");
        System.out.println("TOTAL DEBT will be: 20");
        System.out.println("1.Accept");
        System.out.println("2.Decline");
        System.out.println("0:BACK 00:HOME");
        System.out.print(": ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                return 1;
            case 1:
                return 1; 
            case 2:
                return 3;
            default:
                System.out.println("Invalid choice. Try again.");
                return 2;
        }
    }
}
