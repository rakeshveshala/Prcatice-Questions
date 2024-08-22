
import java.util.*;
import java.util.Scanner;

public class IntFun {
	static int counter;
	int sum=0;
	int arr[];
	public IntFun() {
		Scanner sc=new Scanner(System.in);
		arr=new int[50];
		counter=0;
		System.out.println("Enter the values");
		while(sc.hasNextLine())
		{
			String value=sc.nextLine();
			if(value.isEmpty())
			{
				break;
			}
				int val=Integer.parseInt(value);
				
			arr[counter]=val;
			counter++;		
		}
	}
	public void sum() {
		for(int i:arr){
            sum=sum+i;
        }
		System.out.println("The sum is: "+sum);
	}
	
	public void noOfValues() {
		System.out.println("Total number of integers:"+counter);
	}
	public void maxInt() {
        int max=0;
        for(int i=0;i<counter;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
		System.out.println("Maximum is: "+max);
	}
	public void minInt() {
        int max=Integer.MAX_VALUE;
        for(int i=0;i<counter;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
		System.out.println("Minimus is: "+max);
	}
	public void display() {
		System.out.println("the values are: ");
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		IntFun fun = new IntFun();
		fun.sum();
		fun.noOfValues();
		fun.maxInt();
		fun.minInt();
		fun.display();
	}
}