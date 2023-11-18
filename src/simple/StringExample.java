package simple;

public class StringExample {

	public static void main(String[] args) {
		
		/**
		 * Disadvantage of String class is If we done any changes to string that are not applicable to the string.
		 * The changes will applicable to place.
		 */
		String str = new String("HelloFRiends");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.indexOf("Friends"));
		System.out.println(str.charAt(6));
		System.out.println(str.replaceAll("Friends", "Kanya"));
		System.out.println(str.replaceAll("k", "s"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.compareTo("HelloFriends"));
		String str2 = " Hello   Friends ";
		System.out.println(str2.trim()); // It will remove whitespaces that are before and after the string not between the string.
		String str3 = str2.concat(" Jashu").trim();
		System.out.println(str3);
		String fn = new String("Kanya");
		String ln = new String("Kumari");
		System.out.println(fn.compareTo(ln));
	} 

}
