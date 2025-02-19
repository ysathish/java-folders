package Four.com;

public class ClassA {
	public static void main(String[] args) {
		ClassA aobj1=new ClassA();
		ClassA aobj2=new ClassA();
		System.out.println("aobj1:"+aobj1.hashCode());//hashCode() gives the unique identification of the Object
		System.out.println("aobj2:"+aobj2.hashCode());
		System.out.println(aobj1.equals(aobj2)); //equals() is going to comparing address of the object
		System.out.println(aobj1.equals(aobj1));
		System.out.println(aobj2.equals(aobj1));
		System.out.println(aobj1.equals(new ClassA()));
		System.out.println(new ClassA().equals(new ClassA()));
	}

}
