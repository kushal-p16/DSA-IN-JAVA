package array;

public class Multiodd2AndEvenadd10 {
    public static void main(String[] args){
        int[] arr={10,32,43,54,65,76,87,98};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
            }
            }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
