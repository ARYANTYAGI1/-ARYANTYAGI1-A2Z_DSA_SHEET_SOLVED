import java.util.Scanner;

public class PrintDivisor {
    public static void main(String[] args) {
        System.out.print("Enter Num:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        scanner.close();
 
    }
}
