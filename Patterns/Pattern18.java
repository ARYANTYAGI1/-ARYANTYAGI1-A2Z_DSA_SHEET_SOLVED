import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        System.out.print("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
        scanner.close();


    }
}
