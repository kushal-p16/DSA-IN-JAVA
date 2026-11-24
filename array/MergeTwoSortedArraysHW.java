
package array;

public class MergeTwoSortedArraysHW {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 7, 8};

        int[] c = new int[a.length + b.length];

        merge(c, a, b);

        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = a.length-1, j = b.length-1, k = c.length-1;

        // Compare and merge elements
        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) {
                c[k] = a[i];
                i--;
            } else {
                c[k] = b[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements of a
        while (i >=0) {
            c[k] = a[i];
            i--;
            k--;
        }

        // Copy remaining elements of b
        while (j >=0) {
            c[k] =b[j];
            j--;
            k--;
        }
    }
}