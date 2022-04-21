import java.util.*;
class ArrayAvg
{
	public static void main(String args[])
	{
		int arr[]={3,3,3,3,3,3};
		int n=arr.length;
		int total=0;
		for(int i=0;i<n;i++)
		total=total+arr[i];
		int avg=total/n;
		System.out.println(avg);
	}
}
