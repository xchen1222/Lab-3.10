public class Runnin {
	public static void main(String[] args) {
	
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
	
	
	
	
	
	}
}
