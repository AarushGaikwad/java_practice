package stringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder alpha = new StringBuilder();
		
		for(char i='a'; i<='z'; i++) {
			alpha.append(i);
			
			System.out.print(i);
		}

	}

}
