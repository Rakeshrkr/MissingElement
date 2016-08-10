package com.example.simplecode;

public class MissingInt {
	public static void main(String[] arg){
		int array_sum = 0 ; 
		int array[] = {5 , 8 , 6 , 7 , 1 , 9 , 2 , 3 ,8} ; // array of length 9
		for(int i=0 ; i< array.length ; i++){
			array_sum +=  array[i] ; // summing the elements of the array
		}
			int real_sum = 10*11/2 ; // Real sum of the array 
			int missing_int = real_sum - array_sum ; // differnce b/w real sum and array sum
			
			System.out.println("Missing integer in the given array of length 10 is : " + missing_int);
			
	
	}

}
