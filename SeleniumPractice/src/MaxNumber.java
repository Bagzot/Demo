
public class MaxNumber {

	public static void main(String[] args) {
	
		int arr[] = {3,45,2323,65,876,1,0,-56,-3,6,};
		int max = arr[0];

		for(int i=1; i<arr.length; i++)
		if(arr[i]>max)
		max = arr[i];
		System.out.println("Max number is:" + max);
	}

}
