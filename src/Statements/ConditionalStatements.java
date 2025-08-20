package Statements;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int hourofday = 24;
		
		if(hourofday<15) {
			System.out.println("good afternoon");
		}
		else if(hourofday<11){
			System.out.println("good morning");
		}
		
		else {
			System.out.println("nothing");
		}
	}

}
