import java.util.Scanner;

public class Tram116A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxCapacity = 0;
        int currentCapacity = 0;

        for (int i = 0; i < n; i++) {
            int exit = scanner.nextInt();
            int enter = scanner.nextInt();
            currentCapacity -= exit;
            currentCapacity += enter;
            maxCapacity = Math.max(maxCapacity, currentCapacity);
        }
        System.out.println(maxCapacity);
    }
}
