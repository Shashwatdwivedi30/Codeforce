import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int[] b = new int[26];
        int x = 0;
        for (int i = 0; i < s.length(); i++)
            b[s.charAt(i) - 97]++;
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 1)
                x++;
        }
        if (x % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
