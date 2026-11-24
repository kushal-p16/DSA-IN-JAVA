package array;

import java.util.ArrayList;

public class ArrayBasicInJavaBasic {
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(45);
        arr.add(67);
        arr.add(89);
        arr.add(90);
        System.out.println(arr);
        System.out.println(arr.get(2)); //arr[2];
        arr.set(3,100); //arr[3] = 100;
        System.out.println(arr);

        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");  // arr[i];
        }
        System.out.println();

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        arr.add(2,1000); //arr[2] = 1000;

        int n1=arr.size();
        arr.remove(n-1);
        System.out.println(arr);
    }
}
