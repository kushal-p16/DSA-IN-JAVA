package array;
import java.util.*;

public class SearchInArray {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index: " + i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }
    }
}
