package encapsulationPractice;

public class Student {
	private String name;
	private double marks;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		Student sd = new Student();
		sd.setName("John");
		sd.setMarks(94.33);
		
		System.out.println(sd.getName() + " has " + sd.getMarks() + " in final exams");
	}
}
