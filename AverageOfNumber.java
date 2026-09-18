public class AverageOfNumber{
    static void average(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Average of: " + avg);
    }
    public static void main(String[] args){
        average(10, 20, 30);
    }
}