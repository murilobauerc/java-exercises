package main;

import java.util.ArrayList;

public class Queue<T extends Comparable<T>> implements QueueTAD<T> {
	public ArrayList<T> items;

	public Queue(ArrayList<T> items) {
		this.items = items;
	}

	public Queue() {
		items = new ArrayList<T>();
	}

	@Override
	public void enqueue(T d) {
		// TODO Auto-generated method stub
		items.add(d);
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		T aux = null;
		try {
			aux = items.get(0);
			items.remove(0);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Queue is empty, cannot dequeue.");
		} finally {
			return aux;
		}
		
		
		//T filaAux = items.get(0);
		//this.items.remove(0);
		//return filaAux;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return items.get(0);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return items.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return items.size();
	}
}
