package basic;
import java.util.Scanner;
public class program29 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n= scanner.nextInt();
        int[] a=new int[n];
        System.out.print("Enter "+n+" numbers:");
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        int large =a[0];
        for(int i=1;i<n;i++){
            if(a[i]>large){
                large=a[i];
            }
            else{
                continue;
            }
        }
        System.out.println(large);
    }
}
