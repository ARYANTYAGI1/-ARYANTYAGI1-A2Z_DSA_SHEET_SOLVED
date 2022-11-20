// import java.nio.ReadOnlyBufferException;
import java.util.Scanner;

public class SumofSeries {
    public static int solution(int n){
        
     if(n==0){
        return 0;
     }
     int sum=n+solution(n-1);
     return sum;
      
    }
    public static void main(String[] args) {
    System.out.print("Enter Nth:");
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int ans=solution(n);
    System.out.println(ans);
    scanner.close();
    }
}
