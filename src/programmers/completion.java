package programmers;

public class completion {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("World");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		
		if(sb2 == sb3) {
			System.out.println("sb2 == sb3");
			System.out.println();
		}
		
		String str2 = new StringBuffer().append("hello").append(" " ).append("World").toString();
		System.out.println(str2);		
	}

}
