import java.util.ArrayList;
import java.util.Scanner;

public class Govindh {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int n = 5;
        int k = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseInGroups(arr,n,k);
    }

    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
            for(int i = 0;i<n;i+=k){
                int left = i;
                int right = Math.min(i+k-1,n-1);

                while(left<right){
                    int temp = arr.get(left);
                    arr.set(left, arr.get(right));
                    arr.set(right, temp);
                    left++;
                    right--;
                }
            }
            for(int a:arr){
                System.out.println(a);
            }
        }
    }
