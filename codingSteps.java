package CodingProject;

public class codingSteps {

	public static void main(String[] args) {
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3,9,23,64,2,8,28,93};
		
//		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages[ages.length - 1] - ages[0] );
//		b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(numbers[numbers.length - 1] - numbers[0] );
//		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum = 0;
		for (int age : ages) {
			sum += age;
		}
		System.out.println(sum / ages.length);
		
//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters / names.length);
		
//		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String combinedNames = "";
		for (String name : names) {
			combinedNames += name + " ";
		}
		System.out.println(combinedNames);
		
//		3. How do you access the last element of any array?
//		 array.length - 1
//		4. How do you access the first element of any array?
//			array[0]
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println(nameLengths[i]);
		}
		
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int total = 0;
		for (int length : nameLengths) {
			total += length;
		}
		System.out.println("Sum of all elements " + ": " + total);
		
//		7. Write a method that takes a String word, and an int n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println(combineWords("Hello", 4));
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println(fullName("Joseph", "Faya"));
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("The sum is greater " + ": " + greaterThan100(ages));
//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] ages1 = {3.3,9.2,23.5,64.5,2.6,8.7,28.5};
		System.out.println("Average " + ": " + average(ages1));
//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] ages2 = {4.5,9.5,23.5,64.5,2.5,8.5,28.5};
		System.out.println("ages1 is greater than ages2 " + ": " + isGreaterLength(ages1, ages2));
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("This statement is " + willBuyDrink(true, 9.00));
//		13. Write and test a method that takes a string and returns true if the string is a palindrome.
		System.out.println("This is a Palindrome: " + isPalindrome("civic"));
		System.out.println("This is a Palindrome: " + isPalindrome("radar"));
		System.out.println("This is a Palindrome: " + isPalindrome("computer"));
	}
	
//     7) Method Below
		public static String combineWords(String string, int number) {
			String result = "";
			for (int i = 0; i < number; i++) {
				result += string;
			}
			return result;
		}
		
//		8) Method Below
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
		
//		9) Method Below
		public static Boolean greaterThan100(int[] numbers) {
			int sum1 = 0;
			for (int number : numbers) {
				sum1 += number;
			}
			if (sum1 > 100) {
				return true;
			} else {
				return false;
			}
		}
//		10) Method Below
		public static double average(double[] array) {
			double sum = 0;
			for (double number : array) {
				sum += number;
			}
			return sum / array.length;
		}
//		11) Method Below
		public static Boolean isGreaterLength(double[] array, double[] array1) {
			double sum1 = 0;
			double sum2  = 0;
			for (double num : array) {
				sum1 += num;
			}
			double result1 = sum1 / array.length;
			for (double num : array1) {
				sum2 += num;
			}
			double result2 = sum2 / array1.length;
			if (result1 > result2) {
				return true;
			} else {
				return false;
			}
		}
//		12) Method Below
		public static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket ) {
			if(isHotOutside && moneyInPocket > 10.50) {
				return true;
			} else {
				return false;
			}
		}
		
//		13) Method Below
		public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
