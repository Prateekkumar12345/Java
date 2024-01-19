import java.util.*;
public class sumOfmatrix {
public static void main(String[] args) {
	Scanner sr= new Scanner(System.in);
	int arr[]= {1,2,3,4,56,7};
	int arr2[]= {1,2,3,4,5,6};
	int arr3[] = new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length;i++) {
	 arr3[i]=arr2[j]*arr[i];
	   j++;
	}
	System.out.print(Arrays.toString(arr3));
}
}
