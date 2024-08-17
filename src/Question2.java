import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		
		List<Integer> lis = Arrays.asList(4, 5, 6, 8, 9);
		
		List<Integer> allEven = lis.stream().filter(isEven).collect(Collectors.toList());
		
		System.out.println(allEven);
		
	}

}
