import java.util.Scanner;

public class Soldier_banana546A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int total=0;
        for(int i=1;i<=w;i++){
            total+=i*k;
        }
        total=total-n;
        if(total>0)
           System.out.println(total);
        else System.out.println(0);
    }
}
