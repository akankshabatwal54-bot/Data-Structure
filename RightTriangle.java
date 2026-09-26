import java.util.Scanner;
public class RightTriangle{
    public static void right(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j >= i){
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        right(n);
    }
}