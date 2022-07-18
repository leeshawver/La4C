import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(2);
		numbers.add(234);
		numbers.add(2653);
		numbers.add(1);
		numbers.add(2234987);
		numbers.add(22343);
		numbers.add(233334);
		
		System.out.println(evenNums(numbers));
		System.out.println("_____________");
		Map<String, String> wordDefs = new HashMap<String, String>();
		wordDefs.put("hello", "a common greeting in the English language");
		wordDefs.put("elucidate", "to expound upon, to make more clear");
		wordDefs.put("ravage", "to render something void of its resources");
		System.out.println(wordDefs);
		System.out.println("_____________");
		System.out.println(returnValue(wordDefs, "elucidate"));
		System.out.println("_____________");
		List<String> myList = Arrays.asList("bob", "jose", "ziggy", "josie", "elanor", "agnes", "james");
		System.out.println(startingLetterCount(myList));
		

	}
	
	public static Set<Integer> evenNums(Set<Integer> list) {
		Set<Integer> evenNums = new HashSet<Integer>();
		for (int num : list) {
			if (num % 2 == 0) {
				evenNums.add(num);
			}
		}
		return evenNums;
	}
	
	public static String returnValue(Map<String, String> mapList, String definition) {
		for (String key : mapList.keySet()) {
			if (key.equals(definition)) {
				return mapList.get(key);
			}
		}
		return "No such definition";
	}
	
	public static Map<Character, Integer> startingLetterCount(List<String> words) {
		Map<Character, Integer> firstLetterCount = new HashMap<Character, Integer>();
		for (String word : words) {
			char c = word.charAt(0);
			if (firstLetterCount.containsKey(c)) {
				firstLetterCount.put(c, firstLetterCount.get(c) + 1);
			} else firstLetterCount.put(c, 1);
		}
		return firstLetterCount;
	}
}
