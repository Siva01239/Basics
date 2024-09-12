package basic;
import java.util.Scanner;
public class program21 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int f1=-1;
        int f2=1;
        int f3=0;
        System.out.print("Enter the limit:");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            f3=f1+f2;
            System.out.print(f3+" ");
            f1=f2;
            f2=f3;
        }
    }
}
