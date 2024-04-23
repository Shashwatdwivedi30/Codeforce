import java.util.*;
public class Beautifulmat263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
            System.out.println((char)(s.charAt(0) - 32) + s.substring(1, s.length()));
        else
            System.out.println(s);
    }
}