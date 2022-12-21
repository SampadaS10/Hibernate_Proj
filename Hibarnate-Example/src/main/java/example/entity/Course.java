package example.entity;

public class Course 
{
	private String courseid;
	private String coursename;
	private int duration;
	private int fees;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String courseid, String coursename, int duration, int fees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.duration = duration;
		this.fees = fees;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", duration=" + duration + ", fees="
				+ fees + "]";
	}
	

}
