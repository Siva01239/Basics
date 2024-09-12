package basic;
import java.util.Scanner;
public class program17 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i;
        System.out.print("Enter the multiplication table to be printed:");
        int n= scan.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
