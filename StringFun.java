import java.util.*;
public class StringFun {
	String str;
	String arr[];
	Scanner sc;
	public StringFun() {
		sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		System.out.println(str);
	}
	public void removeDup() {
		Set<Character> unq = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            unq.add(c);
        }
        StringBuffer sb = new StringBuffer();
        for (char c : unq) {
            sb.append(c);
        }
        System.out.println("String without duplictaes:"+sb.toString());
	}
	public void strInStr() {
		System.out.println("Enter the string you want to search:");
		String str2=sc.nextLine();
		if(str.contains(str2)) {
			System.out.println("String in string present");
		}
		else {
			System.out.println("not present");
		}
	}
	public void countWords() {
	        String[] words = str.split("\\s+");
	        System.out.println("Total no of words are: "+words.length);
	}
	public void reverseWords() {
		String[] words = str.split("\\s+");
        StringBuffer result = new StringBuffer();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        System.out.println("String reverse: "+result);
	}
	public void conso() {
		StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (isConsonant(c)) {
                if (c == 'z') {
                    sb.append('a');
                } else {
                    sb.append((char) (c + 1));
                }
            } else {
                sb.append(c);
            }
        }
        System.out.println("conso method: "+sb.toString());
	}
	private static boolean isVowel(char c) {
	     c = Character.toLowerCase(c);
	     return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
	 
	private static boolean isConsonant(char c) {
       return Character.isLetter(c) && !isVowel(c);
	}
	
	public static void main(String[] args) {
		StringFun sf = new StringFun();
		sf.removeDup();
		sf.strInStr();
		sf.countWords();
		sf.reverseWords();
		sf.conso();
	}

}
