import java.util.ArrayList;
import java.util.Scanner;

public class Govindh {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int arr[]= {16,17,4,3,5,2,};
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();

        int max=arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                ans.add(arr[i]);
            }
        }
        for (int i=ans.size()-1; i>=0;i--){
            System.out.println(ans.get(i));
        }
    }
}
