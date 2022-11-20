import java.util.Scanner;

public class Print1toN {
    public static void solution(int n,int i){
    if(i==n+1){
        return;
    }
    System.out.println(i);
    solution(n, i+1);

    }
    public static void main(String[] args) {
        System.out.print("Enter N:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        solution(n, 1);
        scanner.close();
        
    }
}
