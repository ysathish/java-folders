package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class TestAllSetImplentedClasses 
{
	public void setInterFaceMethod()
	{
		ArrayList<String> alist=new ArrayList<>();
		alist.add("sathish");
		alist.add("raju");
		alist.add("mahesh");
		LinkedHashSet<Long> lset=new LinkedHashSet<>();
		lset.add(9553413133l);
		lset.add(9578945947l);
		lset.add(8555344484l);
		TreeSet<Double> tset=new TreeSet<>();
		tset.add(5000d);
		tset.add(9000d);
		tset.add(3000d);
		ArrayList<Employee> al=new ArrayList<>();
		Iterator<String> iname=alist.iterator();
		Iterator<Long> inumber=lset.iterator();
		Iterator<Double> isal=tset.iterator();
		while(iname.hasNext() && inumber.hasNext() && isal.hasNext())
		{
			String name=iname.next();
			Long number=inumber.next();
			Double sal=isal.next();
			Employee e=new Employee(name,number,sal);
			System.out.println(e);
			al.add(e);			
		}
		System.out.println("\n");

		ListIterator<Employee> il=al.listIterator(al.size());
		while(il.hasPrevious())
		{
			System.out.println(il.previous());
		}
	}
	public static void main(String[] args)
	{
		TestAllSetImplentedClasses test = new TestAllSetImplentedClasses();
		test.setInterFaceMethod();
	}
}
