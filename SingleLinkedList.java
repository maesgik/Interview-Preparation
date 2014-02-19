
public class SingleLinkedList<T> {
	private SingleNode<T> head;
	private SingleNode<T> tail;
	private int length = 0;

	public SingleLinkedList () {
	}

	public int getLength() {
		return length;
	}

	public void addFirst(SingleNode<T> node) {
		node.setNext(head);
		if (head == null) {
			head = tail = node;
		} else {
			head = node;
		}
		length++;
	}

	public void addLast(SingleNode<T> node) {
		if (tail == null) {
			node.setNext(head);
			head = tail = node;
		} else {
			node.setNext(null);
			tail.setNext(node);
			tail = tail.getNext();
		}
		length++;
	}

	public void removeFirst() {
		if (length == 1) {
			head = tail = null;
			length--;
		} else if (length > 1) {
			head = head.getNext();
			length--;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		SingleNode<T> pt = head;
		while (pt != null) {
			if (pt.getValue() == null) {
				sb.append("null");
			} else {
				sb.append(pt.getValue().toString());
			}
			sb.append("->");
			pt = pt.getNext();
		}
		int len = sb.length();
		if (len > 0) {
			sb.delete(len-2, len);
		}
		return sb.toString();
	}

}
