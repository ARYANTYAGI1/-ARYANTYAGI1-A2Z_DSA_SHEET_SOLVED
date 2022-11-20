import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        System.out.println("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char a=65;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            a=65;
            System.out.println();
        }
        scanner.close();
    }
}
