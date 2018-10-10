import java.util.ArrayList;

public class Queue<T extends Comparable<T>> implements QueueTAD<T>{
	private ArrayList<T> itens = new ArrayList<T>();
	@Override
	public void enqueue(T d) {
		// TODO Auto-generated method stub
		itens.add(d);
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		T filaAux = this.itens.get(0);
		this.itens.remove(0);
		return filaAux;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return this.itens.get(0);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.itens == null ? true : false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}



