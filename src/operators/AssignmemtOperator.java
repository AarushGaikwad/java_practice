package operators;

public class AssignmemtOperator {

	public static void main(String[] args) {
		
		boolean x = false;
		x =!x;
		System.out.println(x);
		
		double y = 1.21;
		y = -y;
		
		int a = 3;
		int b = ++a * 5 / a-- + --a;  //--a is pre-increment operator and a++ is post increment
		// int b = 4*5/ a-- + --a
		// int b = 4*5/ 4 + --a //value of a is 4 due ++a operator -> a will become 3 again due to a--
		// int b = 4*5/ 4 + 2   // due to --a a's value become 2 
		
		System.out.println(a);
		System.out.println(b);
		
		//EXPICIT TYPE CASTING
		
		int r = (int)1.0;
		short t = (short)15478834;  //in this case overflows happens	
		System.out.println(t);
	}

}
