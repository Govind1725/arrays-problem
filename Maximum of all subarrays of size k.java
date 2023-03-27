public class Govindh {
    public static void main(String arg[]) {
        int a[] ={1,2,3,4,5,6,7};
        int k= 3;
        int max = Integer.MIN_VALUE;
        for (int i=0; i < a.length-(k-1); i++){
            for (int j=i; j< i+k; j++){
                if (max < a[j]){
                    max = a[j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
//another method
 {
        // Your code here
         ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < n-k+1; i++){

            int start = i;

            int max = Integer.MIN_VALUE;

            while(i+k <= n && start < i+k){

                max = Math.max(max,arr[start++]);

                

            }

            res.add(max);

        }

        return res;

        

    }
