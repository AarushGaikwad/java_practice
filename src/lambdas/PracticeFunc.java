package lambdas;

@FunctionalInterface
public interface PracticeFunc {

	boolean test(String A);
	
	default boolean test2(){
		return true;
	}
}
