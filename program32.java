package basic;
public class program32 {
    public static void main(String[] args){
        int f1=-1;
        int f2=1;
        int f3=0;
        for(int i=1;i<=10;i++){
            f3=f1+f2;
            System.out.print(f3+" ");
            f1=f2;
            f2=f3;
        }
    }
}
