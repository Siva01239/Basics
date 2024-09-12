import java.util.Scanner;
public class program8 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=scan.nextInt();
        if(n<=50){
            System.out.println("The number is in the lower half");
        } else if (n>50&&n<=100) {
            System.out.println("The number is in the lower half");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
