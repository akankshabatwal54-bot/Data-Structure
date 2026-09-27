import java.util.Scanner;
public class Even{
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println(num + " is Even");
        } else{
            System.out.println(num + " is Odd");
        }
    }
}