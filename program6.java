import java.util.Scanner;
public class program6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter temperature in degree celecios:");
        int c=scan.nextInt();
        int temp=(c*9/5)+32;
        System.out.println(temp);
    }
}
