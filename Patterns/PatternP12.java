import java.util.Scanner;

public class PatternP12 {
    public static void main(String[] args) {
        System.out.print("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=(2*n-2*i);k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
            System.out.print(l);
            }
            System.out.println();
        }

    
       
    
        scanner.close();
    }
}
