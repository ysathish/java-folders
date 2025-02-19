package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ClassA 
{
	
	public void m1()
	{
		ArrayList<Employee>li=new ArrayList<>();
		Employee e1=new Employee(26,"sathish",50030);
		Employee e2=new Employee(24,"raj",70030);
		Employee e3=new Employee(27,"aron",60030);
		li.add(e1);
		li.add(e2);
		li.add(e3);
//		System.out.println(li);
		Iterator<Employee> iterator = li.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		Stream<Employee> stream = li.stream();
		stream.forEach(data->
		{
			if(data.getAge()>25)
			{
				data.setSal(data.getSal()+data.getSal()*0.1);
			}
		});
		
		
		Collections.sort(li);
		System.out.println("..........................");
		Iterator<Employee> iterator2 = li.iterator();
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
		
		
		
		
		
	}

	public static void main(String[] args) 
	{
		ClassA aobj=new ClassA();
		aobj.m1();

	}

	

}
