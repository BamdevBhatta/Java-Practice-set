package ArrayPracrice;

public class Student {
	//Student class containing array of object 'leture'
	    private Lecture[] lecture;
	//lecture setter method
	    public void setStudentLecture(Lecture[] lecture) {
	        this.lecture = lecture;
	    }
	//lecture getter method
	    public Lecture[] getStudentLecture() {
	        return lecture;
	    }


	//main method for running code
	    public static void main(String[] args) {
	//Student object declaration
	        Student student = new Student();
	//lecture object declaration
	        Lecture[] lectures = new Lecture[3];
	//setting values for lecture names for each array element
	        lectures[0] = new Lecture("Physics");
	        lectures[1] = new Lecture("Mathematics");
	        lectures[2] = new Lecture("Chemistry");
	//Adding those elements to the array of lecture objects in Student Class
	        student.setStudentLecture(lectures);
	//displaying array of lecture objects
	        Lecture[] lectures1 = student.getStudentLecture();
	        for (int i = 0; i <lectures1.length; ++i) {
	            System.out.println(lectures1[i].getName());
	        }
	    }
	}


	//Lecture class with name attribute
	public class Lecture {
	    private String name;
	//setter for name value 
	    public Lecture(String name) {
	        this.name = name;
	    }
	//getter for name value
	    public String getName(){
	        return name;
	    }
	}

