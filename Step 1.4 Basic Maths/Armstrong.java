
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter Number:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=n;
        int temp=n;
        int ans=0;
        String s=Integer.toString(temp);
        int order=s.length();
        while(n!=0){
            int a=n%10;
           ans=ans+(int)Math.pow(a, order);
           n=n/10;
        }
        if(ans==m){
            System.out.print("ArmsStrong:");
        }
        else{
            System.out.print("Not Armstrong:");
        }
        scanner.close();
    }

}
