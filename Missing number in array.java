public class Govindh {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int array[]={1,2,3,5};
        int n= array.length;
        int sumr =0,sumf=0;
        for(int i=1;i<=n;i++)
        {
            sumr+=i;
        }
        for(int i=0;i<n-1;i++)
        {
            sumf+=array[i];
        }
        System.out.println(sumr - sumf);
    }
