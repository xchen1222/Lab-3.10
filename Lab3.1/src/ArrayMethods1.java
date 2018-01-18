
public class ArrayMethods1 {
	int[] list1 = {21,34,32,23,6,83,81,12,17,98,12} ; 
	
	
	public static void insertionSort(int [] list1)
	{
		if (list1[1] > list1[2]) ;
		swap(list1 , 1 , 2) ;
	}
	
	public static void selectionSort(double [] list1)
	{
		
	}
	
	public static void bubleSort(String [] list1)
	{
		
	}
	
	public static void swap(int[] arr , int index1 , int index2)
	{
		int x = arr[index1] ;
		arr[index1] = arr[index2] ;
		arr[index2] = arr[x] ; 
	}
	
}
	
