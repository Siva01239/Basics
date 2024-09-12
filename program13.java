import java.util.Scanner;
public class program13 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the list of number to be entered:");
        int n=scan.nextInt();
        int i;
        int sum=0;
        System.out.println("Enter the number:");
        for(i=1;i<=n;i++){
            sum+=scan.nextInt();
        }
        System.out.println(sum/n);
    }
}
