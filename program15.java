package basic;
import java.util.Scanner;
public class program15 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the length of array");
        int n=scan.nextInt();
        int[] arr = new int[n];
        int i;
        System.out.println("Enter the array elements:");
        for(i=0;i<=n-1;i++){
            arr[i]=scan.nextInt();
        }
        int large=arr[0];
        for(i=1;i<=n-1;i++){
            if(large<=arr[i]){
                large=arr[i];
            }
            else {
                continue;
            }
        }
        int small=arr[0];
        for(i=1;i<=n-1;i++){
            if(small>=arr[i]){
                small=arr[i];
            }
            else {
                continue;
            }
        }
        System.out.println(large+" is the largest number in the given array");
        System.out.println(small+" is the smallest number in the given array");
    }
}