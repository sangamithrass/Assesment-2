package oops_concepts;

public class CourseRegisteration {

	public static void main(String[] args) 
	{
		Allocationdetails c1=new Allocationdetails();
		c1.setStudentName("peter");
		c1.setRegistrationId(5001);
		c1.setQualifyingMarks(78);
		c1.setCourseId(1005);
		c1.setHostelRequired(false);
		c1.calculateCourseFee();
		if(!c1.validateMarks())
		{
			System.out.println("Marks are less than 65 . You are not eligible");
		}
		else if(!c1.validateCourseId())
		{
			System.out.println("Invalid Course ID. Please try again");
		}
		else
			{
		System.out.println("***** Course Allocation Details *****\n");
		System.out.println("Student name : "+c1.getStudentName());
		System.out.println("Course Id : "+c1.getCourseId());
		System.out.println("Qualifying Exam Marks : "+c1.getQualifyingMarks());
		System.out.println("Student's Registration Id : "+c1.getRegistrationId());
		System.out.println("Total course Fee : "+c1.getCourseFee());
		if(c1.ishostelRequired()) {
		System.out.println("Hostel Required : Yes");
		}
		else
			System.out.println("Hostel Required : No");
			
			}
	}

}
