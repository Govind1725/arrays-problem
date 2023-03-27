import java.util.Scanner;

public class Govindh {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8};
        int n=a.length;

                Boolean flag = true;
                for(int i=0;i<n-1;i++){
                    if(flag){
                        if(a[i]>a[i+1]){
                            swap(i,i+1,a);
                        }
                    }else{
                        if(a[i]<a[i+1]){
                            swap(i,i+1,a);
                        }
                    }
                    flag=!flag;
                }
                for (int abc: a){
                    System.out.print(abc);
                }
            }
            public static void swap(int a1,int a2,int[] a){
                int temp = a[a1];
                a[a1] = a[a2];
                a[a2] = temp;
            }
        }
