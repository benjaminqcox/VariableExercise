import java.util.Scanner;
public class App {
    public static void newFunc() {
        Scanner scanner2 = new Scanner(System.in);
        String test = scanner2.nextLine();
        System.out.println("Test" + test);
        scanner2.close();
    }
    public static void main(String[] args) {
        // String firstName = "Ben";
        // String lastName = "Cox";
        // String name = firstName + " " + lastName;
        // System.out.println(name);
        // int num1 = 20;
        // int num2 = 30;
        // System.out.println(num1 + num2);
        // int result = num1 + num2;
        // int num3 = 8;
        // System.out.println(num3++);
        // System.out.println(num3);
        // System.out.println(++num3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first and last name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + ".");
        System.out.println("Enter 2 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("The sum of those numbers is: " + (num1+num2));
        scanner.close();
        newFunc();
    }
}
