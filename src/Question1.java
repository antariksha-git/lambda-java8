import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Question1 {
	
	public static void main(String []args ) {
		
		BiFunction<Integer, Integer, Integer> getSum = (num1, num2)->num1 + num2;
		
		
		List<List<Integer>> lists = Arrays.asList(Arrays.asList(3, 4), Arrays.asList(5, 5), Arrays.asList(6, 4));
		
		for(List<Integer> li : lists) {
			System.out.println(getSum.apply(li.get(0), li.get(1)));
		}
		
		
	}

}
