import java.util.Scanner;
public class PatternP15 {
    public static void main(String[] args) {
        System.out.println("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char a=65;
        for(int i=n;i>=1;i--){
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
