//Author: Xing Chen
//Date: 2/1/18
//Lab 3.1

import java.util.Arrays;

public class Runnin {
	public static void main(String[] args) {
		
/*	
		int[] list1 = {5,4,3,2,1,0} ;  
		double[] list2 = {21,34,32,23,6,83,81,12,17,98,12} ; 
		String[] list3 = {"c" , "b" , "a"} ; 
	
		ArrayMethods1.insertionSort(list1) ; 
		for (int i = 0; i < list1.length; i++) 
		{
			
			System.out.print(list1[i]);
		}
		ArrayMethods1.selectionSort(list2) ; 
		ArrayMethods1.bubbleSort(list3) ; 
*/	
	
		//Testing arrays
		int [] test1 = {1,4,4,6,2,4,3,17,0};
		double [] test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		String [] test3 = {"zebra" , "tortilla" , "abba" , "foo", "bar", "aba"};
		
		//Insertion Sort Test
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end -start; 
		System.out.println("Test1 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort Test
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start ; 
		System.out.println("Test2 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start ; 
		System.out.println("Test3 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test3));
	}
			
		public static void insertionSort(int [] test)
		{
		int swapCounter =0;
		while(swapCounter > 0 )	
		{
		swapCounter = 0 ; 
			for ( int i = 0  ; i> test.length-1 ; i++)
		{
				if (test[i] > test[i+1]);
					
		}
			
	
		
		}	
		}
		
		public static void selectionSort(double [] test)
		{
			int swapCounter =0; int repeats = 1 ; 
			while ( swapCounter > 0  )
			{
				for ( int i=0 ; i < test.length; i++)
				{
					 
					double smallest = test[repeats] ;
					if ( test[repeats] > test[i])
						test[i] = smallest ; 
					swap2 ( test , test[repeats] , test[i]);
					swapCounter++ ; 
					
				}
				repeats++ ;
			
			}
		}
		public static void bubbleSort(String [] list1)
		{
			for (int i=0 ; i < list1.length ; i++ )
			{
				
			}
		}
		
public static void swap2(double[] test , double index1 , double index2)
{
	double x = test[(int) index1] ;
	test[(int) index1] = test[(int) index2] ;
	test[(int) index2] = x ; 
	System.out.println(x);
	}
public static void swap(int[] arr , int index1 , int index2)
{
	int x = arr[index1] ;
	arr[index1] = arr[index2] ;
	arr[index2] = x ; 
	System.out.println(x);
	}	
	}

