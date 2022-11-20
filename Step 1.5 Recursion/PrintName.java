import java.util.Scanner;

public class PrintName {
    public static void solution(int n){
        if(n==0){
            return;
        }
        solution(n-1);
        System.out.println("GFG");
    }
    public static void main(String[] args) {
        System.out.print("Enter N:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        solution(n);
        scanner.close();
    }
}
