package Five.com;

public class _FinalizeMethodd {
	@Override
	protected void finalize() {
		System.out.println("distroyed");
	}

	private void m1() {
		// TODO Auto-generated method stub
		System.out.println("obj1");
		
	}
	
	public static void main(String[] args) {
		_FinalizeMethodd aobj1=new _FinalizeMethodd();
		aobj1.m1();//
		aobj1=null;//
		System.gc();//way to call garbage collector
		
		
	}
	/*
	 finalize();
	 1.It will be called internally by  the garbage collector
	 2.garbage collector is going to act on our program if there is an object eligible for destruction.
	 */
	

}
