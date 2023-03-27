public class Govindh {
    public static void main(String arg[]){
        
        int arr[] = {1,2,3,-2,5};
        int n= arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int currentsum=0;
            for(int j=i; j<n; j++){
                currentsum+= arr[j];
                if(currentsum> max){
                    max = currentsum;
                }
            }
        }
        System.out.println(max);

    }
}
