package array;

public class ForEach{
    public static void main (String[] args){
        int[] arr={4,1,7,5,-3,10,2};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        //for(int ele:arr){
        // ele *=2;                    Modifying the value of ele will not change the original array
    }
}