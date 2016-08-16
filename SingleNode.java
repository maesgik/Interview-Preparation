
public class SingleNode<T> {
	private T value;
	private SingleNode<T> next;
	
	public SingleNode (T value, SingleNode<T> next) {
		this.value = value;
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public SingleNode<T> getNext() {
		return next;
	}

	public void setNext(SingleNode<T> next) {
		this.next = next;
	}







}
