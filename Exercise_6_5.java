import java.util.Arrays;
import java.util.Scanner;
public class Exercise_6_5 {
    public static int[] arr, arr2; // arr2 = temporary array for merging
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input number of elements
        arr = new int[n];
        arr2 = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt(); // input elements
        }
        // merge sort
        mergeSort(0, n - 1);
        System.out.println(Arrays.toString(arr)); // output
        sc.close();
    }
    public static void merge(int l, int m, int r)
    {
        int i = l, j = m + 1, k = l;
        while (i <= m || j <= r)
        {
            if (i > m || (j <= r && arr[i] > arr[j]))
            {
                arr2[k] = arr[j];
                j++;
                k++;
            }
            else
            {
                arr2[k] = arr[i];
                i++;
                k++;
            }
        }
        for (i = l; i <= r; i++) arr[i] = arr2[i];
    }
    public static void mergeSort(int l, int r)
    {
        if (l == r) return;
        int m = (l + r) / 2;
        mergeSort(l, m);
        mergeSort(m + 1, r);
        merge(l, m, r);
    }
}
