
public class Govindh {
    public static void main(String arg[]) {
        int a[] ={10, 5 ,3, 9 ,8 ,3};
        int n=a.length;
        long min= a[0];
        long max= a[0];
        for(int i=0; i<n; i++){
            if(min>a[i]){
                min=a[i];
            }
            else if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(min +" "+max);
    }

    }
