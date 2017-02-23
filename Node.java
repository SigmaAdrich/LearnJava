package collection;

public class Node {
	//用来表示一个节点
	private Object previous;
	private Object obj;
	private Object next;
	
	
	
	
		public Node(){
			
		}

		public Node(Object previous, Object obj, Object next) {
			super();
			this.previous = previous;
			this.obj = obj;
			this.next = next;
		}
		
		public Object getPrevious() {
			return previous;
		}
		public void setPrevious(Object previous) {
			this.previous = previous;
		}
		public Object getObj() {
			return obj;
		}
		public void setObj(Object obj) {
			this.obj = obj;
		}
		public Object getNext() {
			return next;
		}
		public void setNext(Object next) {
			this.next = next;
		}

}
