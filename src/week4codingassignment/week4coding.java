package week4codingassignment;

import java.util.ArrayList;
import java.util.List;

public class week4coding {


		public static void main (String[] args) {
//1. Create an Integer array called ages, through the program subtracted the value from the last element
// in the array. Added a new age to the end of the array to check the work. Finally looped through the array
// to calculate the average age. 
			
int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 27};
	int lastNumber = ages[ages.length-1];
	int firstNumber = ages[0];
	
	System.out.println(lastNumber - firstNumber);
	
	int length = ages.length;
	int sum = 0;
	
	for (int i = 0; i < ages.length; i++) {
		sum += ages[i];	
	}
	int average = sum / length;
	
	System.out.println("Average age:" + " " + average);

//2. Create a String array of names. Looped through the array to calculate the average number of letters
// per name. Looped through the array a second time to concatenate all the names together. 
	
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int length2 = names.length;
	int sum2 = 0;
	
	for (int i = 0; i < names.length; i++) {
		sum2 += names[i].length();
	}
	int average2 = sum2 / length2;
	
	System.out.println("Average letters per name:" + " " + average2);
	
	StringBuilder names2 = new StringBuilder();
		for (String string : names) {
			names2.append(string + " ");
	}
	System.out.println(names2);
			
	
// 3. How do you access the last element in an array? 
// By using the syntax System.out.println(array[array.length-1])
	
// 4. How do you access the first element of any array? 
// By using the array[0] syntax - 0 accesses the first element
	
//5 and 6. Created an integer array nameLengths and looped to get the length of each name in the
// previously created names array. Then looped again to calculate the sum of all the elements in the array.
	
	int[] nameLengths = new int[length2] ; 
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
	}
	
	int sumOfElements = 0;
	for (int j : nameLengths) {
		sumOfElements += j;
	}
	System.out.println(sumOfElements);	
	
	
//7. The call of the method created to return a word concatenated to itself. 
	System.out.println(repeatString("random", 3));
			

	
//8. The call of a method created to return two strings that when combined print fullName. 
	String firstName = "Brady";
	String lastName = "Greer";
	//String fullName = firstName + " " + lastName;
	System.out.println(fullName(firstName,lastName));
	
//9. The call of a method to see if all the ages from the array above were greater than 100.		
	System.out.println(isGreaterThan(ages));
	
//10. The call of a method that returns the average of the elements in the array. 
	double[] scores = {3, 9, 23, 64, 2, 8, 28, 93, 27};
	
	System.out.println(findAverage(scores));
	
//11. The call of a method that takes two arrays of double, and returns a boolean value if the first array
// average is greater than the average of the second array. 
	double[] goals = {5, 7, 23, 64, 2, 9, 28, 91, 27};
	System.out.println(isAverageGreater(goals,scores));

//12. The call of a method that returns a boolean value from a boolean parameter and a double parameter.
	System.out.println(willBuyDrink(true, 8.50));
	
//13. The call of a method to see if you won a bet that uses a boolean value and a double value. 
	System.out.println(didCreightonWin(false, 5.50));
	
		}// End of Main
	
	
		
		
//7.
		public static String repeatString(String word, int n) {
			return word.repeat(n);
		}
		
//8.
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
//9.		
	public static boolean isGreaterThan(int[] array) {
		int sum4 = 0;
		
	for (int i = 0; i < array.length; i++) {
		sum4 += array[i];
	}
		return (sum4 > 100);


	}
//10. 
	public static double findAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
		}
//11.
	public static boolean isAverageGreater(double[] array1, double[] array2) {

		return (findAverage(array1) > findAverage(array2));
	}
	
////12.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return ((isHotOutside == true) && (moneyInPocket > 10.50)) ;
			
	}
//13. 
	public static double didCreightonWin(boolean winner, double bet) {
		double result = 1;
		if (winner == true) {
			result *= bet*2;
		} else {
			return 0;
		}
		return result;
	}
	
	}
			
		
		

	

		
	
	
	
		
	
	
	
	
	
	
	
	






		



