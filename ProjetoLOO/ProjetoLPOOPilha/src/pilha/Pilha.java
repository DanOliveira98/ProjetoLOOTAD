package pilha;

public class Pilha{
	int elemento[];
	int topo;
	
	public Pilha() {
		elemento = new int [10];
	}
	
	public void push(int e) {
		if(isFull())
			throw new RuntimeException("Pilha cheia");
		topo++;
		elemento[topo]=e;
	}
	public int pop() {
		if(isEmpty())
			throw new RuntimeException("Pilha vazia");
		int e;
		e = elemento[topo];
		topo--;
		return e;
	}
	public boolean isEmpty() {
		return (topo==-1);
	}
	public boolean isFull() {
		return (topo == 9);
	}
	public int top() {
		return 1;
	}
	
	
}