import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        for(int i = 1; i<= n; i++){
            System.out.println("Enter a Number:");
            int num = sc.nextInt();
            if(num % 2 == 1){
                System.out.println(num + " number is odd");
                odd += num;
            } else{
                System.out.println(num + "number is even");
                even += num;
            }
            
        }
        System.out.println("Odd sum: " + odd + "and Even sum: " + even);
    }
}