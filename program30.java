package basic;
import java.util.Scanner;
public class program30 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n= scanner.nextInt();
        double[] a=new double[n];
        System.out.print("Enter "+n+" numbers:");
        for(int i=0;i<n;i++){
            a[i]= scanner.nextDouble();
        }
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(sum/n);
    }
}
