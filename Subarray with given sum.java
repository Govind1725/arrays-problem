import java.util.ArrayList;
import java.util.Scanner;

public class Govindh {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int s=15;
            int start = 0;
            int last = 0;
            boolean flag=false;
            int currsum=0;
            ArrayList<Integer> res = new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                currsum+= arr[i];
                if(currsum>=s)
                {
                    last=i;
                    while(s<currsum && start<last)
                    {
                        currsum-= arr[start];
                        ++start;
                    }
                    if(currsum==s)
                    {
                        res.add(start + 1);
                        res.add(last + 1);
                        flag = true;
                        break;
                    }
                }
            }
            if (flag==false) {
                res.add(-1);
            }
        System.out.println(res);
        }

    }

