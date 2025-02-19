package streamAPI;

public class Employee implements Comparable<Employee>
{
	private int age;
	private String name;
	private double sal;
	public Employee(int age, String name, double sal) {
		super();
		this.age = age;
		this.name = name;
		this.sal = sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getSal()
	{
		return sal;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		return (int) (this.getSal()-e1.getSal());
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
