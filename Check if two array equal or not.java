import java.util.Scanner;

public class Govindh {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,};
        int b[] = {5,4,3,2,1,6,};
        int count =0;
        int pos = 0;
        int flag=1;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < b.length; j++) {
                if (b[i] == a[j]) {
                    int temp = a[pos];
                    a[pos++] = a[j];
                    a[j] = temp;
                    count ++;
                    break;
                }
            }
                if(count == 0){
                    System.out.println("0");
                    flag = 0;
                    break;
                }
                count=0;
        }
            if (flag==1){
            System.out.println("1");
        }

        }
        }
