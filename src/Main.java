import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.print("Enter a number: ");
        Tasks.task1(scan.nextInt());

        System.out.println("\nTask 2");
        System.out.print("Enter a number of numbers: ");
        int amount = scan.nextInt();
        System.out.println("\nEnter numbers: ");
        double avg = Tasks.task2(scan, amount) / amount;
        System.out.println("Среднее: " + avg);

        System.out.println("\nTask 3");
        System.out.print("Enter a number");
        int number = scan.nextInt();
        System.out.println(Tasks.task3(number, 2) ? "Prime" : "Composite");

        System.out.println("\nTask 4");
        System.out.print("Enter a number: ");
        System.out.println("Result: " + Tasks.task4(scan.nextInt()));

        System.out.println("\nTask 5:");
        System.out.print("Enter an index of Fibonacci number: ");
        System.out.println("The n-th Fibonacci number is: " + Tasks.task5(scan.nextInt()));

        System.out.println("\nTask 6:");
        System.out.print("Enter a base a and a power n: ");
        System.out.println("Result: " + Tasks.task6(scan.nextInt(), scan.nextInt()));

        System.out.println("\nTask 7:");
        System.out.print("Enter a number of numbers: ");
        int i = scan.nextInt();
        System.out.println("Enter a sequence of numbers: ");
        Tasks.task7(scan, i);
        System.out.println();

        System.out.println("\nTask 8:");
        System.out.print("Enter a string: ");
        System.out.println(Tasks.task8(scan.next(), 0) ? "Yes" : "No");

        System.out.println("\nTask 9:");
        System.out.print("Enter a string: ");
        System.out.println("The number of characters is: " + Tasks.task9(scan.next()));

        System.out.println("\nTask 10:");
        System.out.print("Enter two numbers: ");
        System.out.println("The GCD is: " + Tasks.task10(scan.nextInt(), scan.nextInt()));

        scan.close();
    }
}