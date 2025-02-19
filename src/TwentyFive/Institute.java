package TwentyFive;
public class Institute {
	static String instituteName="Naresh It";//static variable 
	       String studentName; //not static variable 
	       byte id;
	       float fee;
//	       static Integer staff=5;//wrapper class Integer
	       static int noOfStudents=100;
	       public Institute() {//Default Constructor
	    	   System.out.println("default Constructor");
	    	    }
	       public Institute(String studentName, byte id, float fee) {//Parameter - Constructor
			this.studentName = studentName;
			this.id = id;
			this.fee = fee;
			}
	static {//static block 
		System.out.println(instituteName);
	}
	static int setNoOfStudents() { //no parameter static and return type method
		return noOfStudents;
	}
    public void getStudentName(String studentName) {//without return type parameter method
		System.out.println(studentName);
	}
	public void getId(byte id) {//without return type parameter method
		System.out.println(id);
	}
	
	public void getFee(float fee) {// without return type parameter method
		System.out.println(fee);
	}
	public static void main(String[] args) {//main()
		//Object creation and type casting (explicit)
		Institute c=new Institute("sathish",(byte)01,4000);
		//Method Calling using respective Class Object
		c.getStudentName(c.studentName);
		c.getId(c.id);
		setNoOfStudents(); //static method calling with identifier name
		byte smallRoom=101;//Local variable
		//increment
		smallRoom++;
		//Implicit Type casting
		int largeRoom=smallRoom;
		//Relational and Logical
		if(smallRoom>noOfStudents) {
			//Auto un-boxing
			Byte b=new Byte (smallRoom);
			System.out.println("small room :"+b);
		}
		else{
			//Auto Boxing
			Integer i= Integer.valueOf(largeRoom);
			System.out.println("large Room :"+i);
		}
		//Object Class Methods 
		System.out.println("hascode() :"+c.hashCode());
		System.out.println("equals() :"+c.equals(c));
		System.out.println("Get class() :"+c.getClass());
		System.out.println("to String() : "+c.toString());
//        System.out.println(c.finalize());
		}
}
