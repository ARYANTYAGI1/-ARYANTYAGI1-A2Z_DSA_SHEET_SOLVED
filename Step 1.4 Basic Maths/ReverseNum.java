import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.print("Enter Number:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int rev=0;
        while(n!=0){
            int a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        System.out.print("Reverse is:"+rev);
        scanner.close();
    }
}
