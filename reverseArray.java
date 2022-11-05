import java.util.Scanner;

public class reverseArray {
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int i;
		for(i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int[] temp=new int[n];
		i=n-1;
		for(int j=0;j<n;j++){
		   temp[j]=arr[i];
		   --i;
		}
		for(int j=0;j<n;j++){
            System.out.print(temp[j]+ " ");
        }
    }
}
