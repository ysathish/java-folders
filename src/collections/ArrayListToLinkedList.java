package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListToLinkedList 
{
	public  void arrayList()
	{
		ArrayList<Phone>al=new ArrayList<>();
		              al.add(new Phone("1+",26000));
		              al.add(new Phone("1+",26000));
		              
		              al.add(new Phone("redmi",16000));
		              al.add(new Phone("samsung",56000));
		              al.add(new Phone("apple",60000));
		              al.add(new Phone("realme",6000));
//		              System.out.println(al+" ");
		              ListIterator<Phone> li1=al.listIterator();
		              while(li1.hasNext())
		              {
		            	  System.out.println(li1.next());
		              }
		              LinkedList<Phone> ll=new LinkedList<>(al);
		              System.out.println("\nListIterator\n");
		              ListIterator<Phone>li=ll.listIterator(ll.size());
		              while(li.hasPrevious())
		              {
		            	  System.out.println(li.previous());
		              }
		
	}
	public void linkedList()
	{
		
	}

	public static void main(String[] args)
	{
		ArrayListToLinkedList list=new ArrayListToLinkedList();
		                      list.arrayList();


	}

}
