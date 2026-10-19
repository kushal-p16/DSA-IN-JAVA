package array;
public class PassingArraysToMethods {
    public static void main(String[] args) {
    //     int x=10;
    //     Change(x);
    //     System.out.print(x);                              pass by value
    // }
    // public static void Change(int x){
    //     x=20;
    // }}
            int x[]={10,29,48,438};
            System.out.println(x[0]);
            change(x);
            System.out.println(x[0]);                     //pass by reference
        }
        public static void change(int x[]){
            x[0]=333;
        }
        }