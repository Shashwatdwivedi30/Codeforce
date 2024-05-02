import java.util.Scanner;

public class Vanya_and_fence677A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int d=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a>h)
                d+=2;
            else
                d++;
        }
        System.out.println(d);
    }
}
