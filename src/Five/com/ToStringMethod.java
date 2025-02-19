package Five.com;

public class ToStringMethod {
	public static void main(String[] args) {
		ToStringMethod aobj1=new ToStringMethod();
		ToStringMethod aobj2=new ToStringMethod();
		System.out.println(aobj1.toString());
		System.out.println(aobj2.toString());


/*
 toString():
 1.It is going to convert an Object into a String format
 2.The return for toString() is string;
 3.Internal return statement of toString() is
  
      public String toString()
       {
       return getClass().getName()+"@"+Integer.toHexString(hashCode());
       }
 */
	
		
	}

}