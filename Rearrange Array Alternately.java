   Class Govindh{
     public static void main(Strings args[]){
       int a[]= {1,2,3,4,5,6,};
        int b[]=new int[a.length];
        int left =0;
        int right = a.length-1;
        int i=0;
        while(i < a.length){
            if(i%2==0 || i==0){
                b[i] = a[right];
                right--;
                i++;
            }
            else {
                b[i] = a[left];
                left++;
                i++;
            }
        }
