import java.util.Scanner;

public class Govindh {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int a[] ={1,7,4,3,3,4,8,7,4};
        int n= a.length;
        int k = 2;
        int flag =0;
        int count[]=new int [100000];

        for(int i =0; i<n; i++)

        {
            count[a[i]]++;

            if(count[a[i]]==k)

            {
                System.out.println( a[i]);
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("-1");
        }
    }
        }
