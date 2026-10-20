package array;

public class SecondMax {
    public static void main(String[] args){
        int arr[]={5,10,8,10,3,6};
        int max=arr[0];
        int smax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("The second  maximum element is: " + smax); 
    }
}
