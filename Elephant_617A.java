import java.util.Scanner;
public class Elephant_617A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int x=0;
        while(n>0){
            if(n==1 || n==2 || n==3 || n==4 || n==5){
                x++;
                System.out.println(x);
                break;
            }
            n=n-5;
            x++;
        }
    }
}
