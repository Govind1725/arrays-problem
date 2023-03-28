import java.util.Arrays;

public class Govindh {
    public static void main(String arg[]) {
        int a[]= {1,4,6,8,9,};
        int b[]= {2,3,5,7,10};
        int s =5;
        int n=a.length;
        int m=b.length;
        int c[]=new int[n+m];
        int i=0,j=0,k=0;
        while ( i < n && j< m){
            if(a[i]< b[j]){
                c[k++]= a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }
        while(i < n){
            c[k++] = a[i++];
        }
        while(j < m){
            c[k++] = b[j++];
        }
        System.out.println(c[(n+m)/2]+c[((n+m)/2)-1]);
        }

    }
