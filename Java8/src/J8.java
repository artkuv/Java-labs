import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class J8{
	
	public static void main(String[] args) {
		ArrayList<Integer>	testValuesNull = new ArrayList();
		testValuesNull.add(0, null);
		testValuesNull.add(1,-1);
		testValuesNull.add(2,-70);
		testValuesNull.add(3,-2);
		testValuesNull.add(4,-2);
		
		Optional<Integer> maxValueNotNull = testValuesNull.stream().filter((p) -> p != null).max(Integer::compareTo);
		System.out.println("maxValueNotNull="+maxValueNotNull);
		
		List<Integer> only2 = testValuesNull.stream().filter((p)-> p!=null && p == -2).collect(Collectors.toList());
		System.out.println("only2="+only2);
		
		testValuesNull.remove(0);
		System.out.println("BEFORE:\ntestValuesNull="+testValuesNull);
		
		Collections.sort(testValuesNull, (o1, o2) -> o1 - o2);
		System.out.println("AFTER:\ntestValuesNull="+testValuesNull);
	}  
}