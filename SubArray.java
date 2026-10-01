public class SubArray{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++){
            int startInd = i;
            for(int j = i; j < arr.length; j++){
                int endInd = j;
                System.out.println("Start idx is " + startInd + " and End idx is: " + endInd);
                for(int k = startInd; k <= endInd; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }
    }
}