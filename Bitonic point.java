int findMaximum(int[] arr, int n) {
        // code here
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max ){
                max=arr[i];
            }
        }
        return max;
    }
}
