import java.util.Scanner;

public class Prime {
   public static void main(String[] args) {
    System.out.print("Enter Num:");
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int c=0;
    for(int i=2;i<n/2;i++){
        if(n%i==0){
             c=c+1;
            break;
        }
    }
    if(c==1){
        System.out.print("Not Prime");
    }
    else{
        System.out.println("Prime");
    }
    scanner.close();
   } 
}
