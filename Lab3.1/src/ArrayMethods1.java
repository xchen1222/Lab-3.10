
public class ArrayMethods1 {
	int[] list1 = {21,34,32,23,6,83,81,12,17,98,12} ; 
	
	
	public static void insertionSort(int [] list1)
	{
		for (int i=0 ; i < list1.length ; i++ )
		{
			swap (list1 , i , i+1) ;
		}
		
		
	}
	
	public static void selectionSort(double [] list1)
	{
		
	}
	
	public static void bubbleSort(String [] list1)
	{
		for (int i=0 ; i < list1.length ; i++ )
		{
			
		}
	}
	
	public static void swap(int[] arr , int index1 , int index2)
	{
		int x = arr[index1] ;
		if (index1 > index2)
		{
		arr[index1] = arr[index2] ;
		arr[index2] = arr[x] ; 
		}
	}
	
}
	
