import java.util.Scanner;

public class PatternP13 {
    public static void main(String[] args) {
        System.out.print("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
