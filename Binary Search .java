import java.util.Scanner;

public class Govindh {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5,};
        int n = 5;
        int result;
        while (true) {
            System.out.println("enter the search element: ");
            int k = scc.nextInt();
            result = binarysearch(arr, n, k);
            System.out.println(result);
        }
    }

    public static int binarysearch(int[] arr, int n, int k) {
        int l = 0;
        int h = n-1;
        int mid = 1;
        while ( l <= h ) {
            mid = l+( h- l ) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (k > arr[mid]) {
                l = mid + 1;
            } else if (k < arr[mid]) {
                h = mid - 1;
            }
        }
            return -1;
        }
}
