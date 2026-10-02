public class UpdateArray{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
         arr[2] = 100;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}