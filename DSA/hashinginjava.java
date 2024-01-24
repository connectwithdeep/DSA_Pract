import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,2,3,1,1,2,3,4,5,8};
		int[] hash= new int[13];
		for(int i=0;i<10;i++){
		        hash[arr[i]]+=1;
		}
		System.out.print("Enter the number to get its frequency ");
        Scanner sc=new Scanner(System.in);
		int num;
		num= sc.nextInt();
        System.out.print(hash[num]);
	}
}
