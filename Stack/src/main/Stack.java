package main;
import java.util.Deque;
import java.util.LinkedList;

public class Stack<T extends Comparable<T>> implements StackTAD<T> {
	public Deque<T> items;
	
	public Stack(Deque<T> items) {
		this.items = items;
	}
	
	public Stack() {
		items = new LinkedList<T>();
	}
	
	@Override
	public void push(T d) {
		// TODO Auto-generated method stub
		items.push(d);
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return (this.isEmpty()) ? null : items.pop();
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		return (this.isEmpty() ? null: items.peek());
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
