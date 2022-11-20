import java.util.Scanner;

public class PrintNto1 {
    public static void solution(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        solution(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter N:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        solution(n);
        scanner.close();
    }
}
