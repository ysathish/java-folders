package collections;

public class Employee 
{
	private String empName;
	private Long phNumber;
	private Double sal;
	public Employee(String empName, Long phNumber, Double sal) {
		super();
		this.empName = empName;
		this.phNumber = phNumber;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "empName=" + empName + ", phNumber=" + phNumber + ", sal=" + sal ;
	}

	public Employee() {
		super();
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	




	





	
	
	

}

/*HashSet<Employee> hset=new HashSet<>();
		                 
		                  hset.add(new Employee("raju"));
		                  hset.add(new Employee("mahesh"));
		                  hset.add(new Employee("vijay"));
		                  hset.add(new Employee("shiva"));
		                  hset.add(new Employee("sathish"));
		                  hset.add(new Employee("rajesh"));
//		System.out.println(hset);
		Iterator<Employee> ie=hset.iterator();
		while(ie.hasNext())
		{
			System.out.println(ie.next());
		}
		System.out.println("\n");
		ArrayList<Employee> all=new ArrayList<>(hset);
		           ListIterator<Employee> li=all.listIterator(all.size());
		    while(li.hasPrevious())
		    	System.out.println(li.previous());
	*/
