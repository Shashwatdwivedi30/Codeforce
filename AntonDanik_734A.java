import java.util.*;
public class AntonDanik_734A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next().toUpperCase();
        int anton=0,danik=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='A')
                anton++;
            else
                danik++;
        }
        if(anton>danik)
            System.out.println("Anton");
        else if(danik>anton)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
