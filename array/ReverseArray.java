package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 5, -3, 10, 2};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
