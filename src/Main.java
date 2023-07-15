import java.util.Scanner;
class Equalarray{
    public static int[] equalarrayrange(int[] array,int[][] que)
    {
        int[] result=new int[que.length];
        for(int i=0;i< que.length;i++){
            int count=0;
            int l = que[i][0];
            int r = que[i][1];
            for(int j=l;j<=r;j++){
                if(array[j]%2==0){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;


    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int queries= scanner.nextInt();
        int[][] query=new int[queries][2];
        for(int i=0;i<queries;i++) {
            for (int j = 0; j < 2; j++) {
                query[i][j] = scanner.nextInt();
            }
        }
        Equalarray equal=new Equalarray();
        System.out.println(equal.equalarrayrange(arr,query));


    }
}