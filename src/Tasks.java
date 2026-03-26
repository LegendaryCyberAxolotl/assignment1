import java.util.Scanner;

public class Tasks {
    public static void task1(int n){
        if (n<10) {
            System.out.println(n);
            return;
        }

        task1(n/10);
        System.out.println(n % 10);
    }

    public static double task2(Scanner scan, int n){
        if (n == 0) return 0;

        double current = scan.nextDouble();
        return (current + task2(scan, n - 1));
    }

    public static boolean task3(int n, int i)
    {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;

        return task3(n, i + 1);
    }

    public static int task4(int n)
    {
        if (n <= 1) return 1;

        return n * task4(n - 1);
    }

    public static int task5(int n)
    {
        if (n <= 1)
            return n;

        // F_n = F_(n-1) + F_(n-2)

        return task5(n - 1) + task5(n - 2);
    }

    public static int task6(int a, int n)
    {
        if (n == 0)
            return 1;
        return a * task6(a, n - 1);
    }

    public static void task7(Scanner scan, int n)
    {
        if (n == 0)
            return;
        int current = scan.nextInt();
        task7(scan, n - 1);
        System.out.print(current + " ");
    }

    public static boolean task8(String s, int i)
    {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;

        return task8(s, i + 1);
    }

    public static int task9(String s)
    {
        if (s.isEmpty()) return 0;

        return 1 + task9(s.substring(1));
    }

    public static int task10(int a, int b)
    {
        if (b == 0)
            return a;
        return task10(b, a % b);
    }
}