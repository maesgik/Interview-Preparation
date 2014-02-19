
public class DoubleLinkedList<T> {

	private DoubleNode<T> head;
	private DoubleNode<T> tail;
	private int length = 0;

	public DoubleLinkedList() {
	}
	
	public int getLength() {
		return length;
	}
	
	public DoubleNode<T> getPrev(DoubleNode<T> node) {
		return node.getPrev();
	}
	
	public DoubleNode<T> getNext(DoubleNode<T> node) {
		return node.getNext();
	}
	
	public void addBefore(DoubleNode<T> ref, DoubleNode<T> node) {
		DoubleNode<T> pre = ref.getPrev();
		if (pre != null) {
			pre.setNext(node);
		} else {
			head = node;
		}
		node.setNext(ref);
		node.setPrev(pre);
		ref.setPrev(node);
		length++;
	}
	
	public void addAfter(DoubleNode<T> ref, DoubleNode<T> node) {
		DoubleNode<T> nex = ref.getNext();
		if (nex != null) {
			nex.setPrev(node);
		} else {
			tail = node;
		}
		node.setNext(nex);
		node.setPrev(ref);
		ref.setNext(node);
		length++;
	}

	public void addFirst(DoubleNode<T> node) {
		if (head == null) {
			node.setPrev(null);
			node.setNext(null);
			head = tail = node;
			length++;
		} else {
			addBefore(head, node);
		}
	}

	public void addLast(DoubleNode<T> node) {
		if (tail == null) {
			node.setPrev(null);
			node.setNext(null);
			head = tail = node;
			length++;
		} else {
			addAfter(tail, node);
		}
	}

	public void removeFirst() {
		if (length == 1) {
			head = tail = null;
			length--;
		} else if (length > 1) {
			head = head.getNext();
			head.setPrev(null);
			length--;
		}
	}

	public void removeLast() {
		if (length == 1) {
			head = tail = null;
			length--;
		} else if (length > 1) {
			tail = tail.getPrev();
			tail.setNext(null);
			length--;
		}
	}
	
	public void remove(DoubleNode<T> node) {
		DoubleNode<T> pre = node.getPrev();
		DoubleNode<T> nex = node.getNext();
		if (nex != null) {
			nex.setPrev(pre);
		} else {
			tail = pre;
		}
		if (pre != null) {
			pre.setNext(nex);
		} else {
			head = nex;
		}
		length--;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DoubleNode<T> pt = head;
		while (pt != null) {
			if (pt.getValue() == null) {
				sb.append("null");
			} else {
				sb.append(pt.getValue().toString());
			}
			sb.append("<->");
			pt = pt.getNext();
		}
		int len = sb.length();
		if (len > 0) {
			sb.delete(len-3, len);
		}
		return sb.toString();
	}

	public String toStringReverse() {
		StringBuilder sb = new StringBuilder();
		DoubleNode<T> pt = tail;
		while (pt != null) {
			if (pt.getValue() == null) {
				sb.append("null");
			} else {
				sb.append(pt.getValue().toString());
			}
			sb.append("<->");
			pt = pt.getPrev();
		}
		int len = sb.length();
		if (len > 0) {
			sb.delete(len-3, len);
		}
		return sb.toString();
	}
}
