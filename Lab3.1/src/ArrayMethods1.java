
public class ArrayMethods1 {
	int[] list1 = {5,4,3,2,1,0} ;  
	double[] list2 = {21,34,32,23,6,83,81,12,17,98,12} ; 
	String[] list3 = {"c" , "b" , "a"} ; 
	
	
	public static void insertionSort(int [] list1)
	{
	while(list1[0] > list1[1])	
	{
		for (int i=0 ; i < list1.length-1 ; i++ )
		{
			if (list1[i] > list1[i+1] )
			{
			swap (list1 , i , i+1) ;
			System.out.println();
			}
		}
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
		arr[index1] = arr[index2] ;
		arr[index2] = x ; 
		System.out.println(x);
		}
	}
	

	
