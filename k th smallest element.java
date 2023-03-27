
public class Govindh {
    public static void main(String arg[]){
        //Kadane's Algorithm
        int arr[] = {1,6,4,3,8,9};
        int k=3;
        int element =0;
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            count++;
            if(count==k)  element = arr[i];
        }
        System.out.println(element);
    }
}
