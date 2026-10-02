import java.util.Scanner;
public class UserArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
           
        }
        for(int i = 0; i< arr.length; i++){
             System.out.print(arr[i] + " ");
        }
    }
}