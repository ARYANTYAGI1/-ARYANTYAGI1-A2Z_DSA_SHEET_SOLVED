import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.print("Enter 1st Num:");
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        System.out.print("Enter 2nd Num:");
        int n2=scanner.nextInt();
        while(n1-n2!=0){
            if(n1>n2){
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }
        }
        System.out.print("HCF is "+n1);
        scanner.close();
    }
}
