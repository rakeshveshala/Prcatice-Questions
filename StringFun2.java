
import java.util.*;
public class StringFun2 {
	String str;
	String arr[];
	Scanner sc;
	public StringFun2() {
		sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		System.out.println(str);
	}
	public void countStrings() {
        String[] words = str.split("\\s+");
        System.out.println("Total no of Strings are: "+words.length);
	}
	public void longestString() {
		String[] words = str.split("\\s+");
        String len=words[0];
        String longest = words[0];
        for (String str : words) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println("Largest String: "+longest);
	}
	public void shortestString() {
		String[] words = str.split("\\s+");
        String len=words[0];
        String longest = words[0];
        for (String str : words) {
            if (str.length() < longest.length()) {
                longest = str;
            }
        }
        System.out.println("Shortest String: "+longest);
	}
	public void orderAlphaString() {
		String[] words = str.split("\\s+");
		List<String> list = Arrays.asList(words);
        Collections.sort(list);
        System.out.println("Strings in alphabetical order:");
        for (String str : list) {
            System.out.println(str);
        }
	}
	public static void main(String[] args) {
		StringFun2 sf = new StringFun2();
		sf.countStrings();
		sf.longestString();
		sf.shortestString();
		sf.orderAlphaString();
	}

}
