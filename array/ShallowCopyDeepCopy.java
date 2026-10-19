package array;
import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        // int[] x=arr; //shallow copy                     changes the original array
        // x[0]=100;
        // System.out.println(arr[0]); //100
        int[] deep=Arrays.copyOf(arr,arr.length);                //deep copy - does not change the original array
        deep[0]=190;
        System.out.println(arr[0]);
}
}
