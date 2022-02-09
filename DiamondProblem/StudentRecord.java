package DiamondProblem;

	interface University
	{
	    default void universityInfo()
	    {
	        System.out.println("University Name : APJ ABDUL KALAM TECHNICAL UNIVERSITY");
	        System.out.println("Number of departments : 10");
	        System.out.println("Grade of university : A");
	    }
	}
	interface CollegeData extends University
	{
	    public void collegeDetail(); 
	    default void studentData() 
	    {
	        System.out.println("Courses of Student : MCA, MTECH, MBA, BCA");
	    }
	}
	interface HostelData extends University
	{
	    public void hostelDetail(); 
	    default void studentData()
	    {
	        System.out.println("Student selected on based : Percentage, Financial condition");
	    }
	}
	public class StudentRecord implements CollegeData, HostelData 
	{ 
	    @Override
	    public void hostelDetail() 
	    {
	        System.out.println("Hostel Name : RAMESHWAR");
	        System.out.println("Hostel location : LUCKHNOW");
	    }
	    @Override
	    public void collegeDetail() 
	    {
	        System.out.println("College Name : DIMS");
	        System.out.println("College Grade : A");
	        System.out.println("University of College : APJ ABDUL KALAM TECHNICAL UNIVERSITY");
	    }
	    @Override
	    public void studentData() 
	    {
	        HostelData.super.studentData();
	        CollegeData.super.studentData();
	    }
	    public static void main (String[] args) 
	    { 
	       StudentRecord obj = new StudentRecord();
	       obj.universityInfo();
	       obj.collegeDetail();
	       obj.hostelDetail();
	       obj.studentData();
	    }
	}