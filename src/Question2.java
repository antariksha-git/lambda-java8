import java.util.function.Predicate;

/*
 * 
 * Problem: Write a Predicate that checks if a number is even. 
 * Use this Predicate to filter a list of integers, keeping only the even numbers.
Hint: Use Predicate<Integer>.
 * 
 * 
 * 
 */
public class Question2 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = (num) -> num % 2 == 0;
		
		System.out.print(isEven.test(5));
		
	}

}
