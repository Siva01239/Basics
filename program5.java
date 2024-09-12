import java.util.Scanner;
public class program5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter age:");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not yet an adult");
        }
    }
}
