package collections;

import java.util.PriorityQueue;

public class QueueInterface
{
	public void m1()
	{
		PriorityQueue<Object> pq=new PriorityQueue<>();
		pq.offer(100);// insertion order is not maintained
		//  pq.offer("true");// Hetro genius data is not allowed ce ClasscastException
		//  pq.offer(null);// null values not accepted ce NullPointerException
		pq.offer(100);// duplicates are allowed   
		pq.offer(9);// available from 1.5v
		pq.offer(3);// default capacity is 11 and first in first out
		pq.offer(100); //size increase by double
		pq.offer(500);// not Synchronized
		System.out.println(pq);
		pq.clear();
		System.out.println(pq);
		pq.poll();       //remove first output 
		System.out.println(pq);
		pq.remove();//remove first output  if elements are empty then it shows NoSuchElementException
		System.out.println(pq);
		pq.peek();
		System.out.println(pq);
		


	}
	public static void main(String[] args)
	{
		QueueInterface p=new QueueInterface();
		p.m1();

	}

}
