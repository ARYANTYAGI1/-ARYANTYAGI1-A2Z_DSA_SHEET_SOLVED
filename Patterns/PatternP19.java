import java.util.Scanner;

public class PatternP19 {
    public static void main(String[] args) {
        System.out.print("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=2*n;j++){
                if(j<=i||j>=2*n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int k=1;k<=n;k++){
            for(int l=1;l<=2*n;l++){
                if(l<=k||l>=2*n-k+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
