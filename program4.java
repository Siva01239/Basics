import java.util.Scanner;
public class program4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the nuber:");
        int n=scan.nextInt();
        if(n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
