package main;
public interface StackTAD<T extends Comparable<T>> {
	public void push(T d);

	public T pop();

	public T top();

	public boolean isEmpty();

	public int size();
}