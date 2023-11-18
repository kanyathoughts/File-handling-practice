package simple;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println(sb.append(" Java"));
		System.out.println(sb.insert(8, "hi "));
		System.out.println(sb.delete(8, 11));
		System.out.println(sb.reverse());
		System.out.println(sb); //at the same location only.
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 7, "Hi")); //endindex-1 will be considered 
		System.out.println(sb.length());
		System.out.println(sb.substring(sb.indexOf("Java")));
		System.out.println(sb.indexOf("Java"));
		System.out.println(sb.charAt(sb.indexOf("Java")));
		System.out.println(sb.subSequence(3, sb.length()));
	}

}
