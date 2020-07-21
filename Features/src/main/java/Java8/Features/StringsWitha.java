package Java8.Features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class StringsWitha {

	public static void main(String[] args) {
      List<String> list=Arrays.asList("abc","Adarsh","Jayani","aruhi","jon","acd","sansa","atr");
      List<String> l1=list.stream().filter(str->str.startsWith("a")&&str.length()==3).collect(Collectors.toList());
      System.out.println("Strings starting with 'a' with length 3");
      l1.forEach(System.out::println);
	}
}