public class Array{
    public static void main (String[] args){
        int[] arr = {4, 9, 10, 12, 20};
        for(int i = 0; i < arr.length; i++){
            int first = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                int second = arr[j];
                System.out.println("Pair of: " + first + " and " + second);
            }
        }
    }
}