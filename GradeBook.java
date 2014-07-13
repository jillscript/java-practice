package chapter3;

public class GradeBook {
	
	private String courseName;
	
	public GradeBook(String name)
	{
		courseName = name;
	}
	
/*	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}*/
	
	public void setCourseName(String name) {
		courseName = name;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void displayMessage() {
		// TODO Auto-generated method stub
		System.out.printf("Welcome to the gradebook for \n%s!\n", getCourseName());
	}

}

