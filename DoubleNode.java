
public class DoubleNode<T> {
	private T value;
	private DoubleNode<T> prev;
	private DoubleNode<T> next;
	
	public DoubleNode(T value, DoubleNode<T> prev, DoubleNode<T> next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public DoubleNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode<T> prev) {
		this.prev = prev;
	}

	public DoubleNode<T> getNext() {
		return next;
	}

	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}
	
}
