import java.util.Scanner;
public class PatternP20 {
   
    public static void main(String[] args) {
        System.out.print("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
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
        for(int i=n-1;i>=1;i--){
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
        scanner.close();
    }
}
