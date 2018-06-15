import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	private int studentId;
	@Column(name="sname",length=20)
	private String studentName;
	@Column
	private String course;	
	@Column
	private int marks;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, String course, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
	}

	public void setStudentId(int s)
	{
		studentId=s;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentName(String name)
	{
		studentName=name;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", course=" + course + ", marks=" + marks + "]";
	}

}