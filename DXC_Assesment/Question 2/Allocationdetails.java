package oops_concepts;

class Allocationdetails
{
	String studentName;
	int courseId;
	int registrationId;
	float qualifyingMarks;
	double courseFee;
	boolean hostelRequired;
	
	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public float getQualifyingMarks() {
		return qualifyingMarks;
	}

	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean isHostelRequired() {
		return hostelRequired;
	}

	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getCourseId() {
		return courseId;
	}
	
	public boolean ishostelRequired()
	{
		return hostelRequired;
	}
	
	public boolean validateMarks()
	{
		if(qualifyingMarks>=65 && qualifyingMarks<=100)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean validateCourseId()
	{
		if(courseId>=1001 && courseId<=1005)
		{
			return true;
		}
		else
			return false;
	}
	
	public void calculateCourseFee()
	{
		double baseFee=0,discount=0;
		if(!validateMarks())
		{
			courseFee=0;
		}
		switch(courseId)
		{
		case 1001: baseFee=55000;
		break;
		case 1002: baseFee=35675;
		break;
		case 1003: baseFee=28300;
		break;
		case 1004: baseFee=22350;
		break;
		case 1005: baseFee=115000;
		break;
		}
		
		if(qualifyingMarks>=65 && qualifyingMarks<=69)
		{
			discount=0.05*baseFee;
		}
		else if(qualifyingMarks>=70 && qualifyingMarks<=84)
		{
			discount=0.1*baseFee;
		}
		else if(qualifyingMarks>=85)
		{
			discount=0.15*baseFee;
		}
		courseFee=baseFee-discount;
		
	}
	
	
}