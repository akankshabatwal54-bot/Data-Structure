import java.util.Scanner;
public class PrimeNumber{
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    static void primeInRange(int n){
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        primeInRange(num);
    }
}