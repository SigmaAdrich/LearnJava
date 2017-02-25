package collection;

public class SxtLinkedList {
	private Node first;
	private Node last;

	private int size;

	public void add(Object obj) {
		Node n = new Node();
		// 第一个节点
		if (first == null) {

			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			first = n;
			last = n;
		} else {
			// 直接往last后增加新的节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);

			last.setNext(n);
			last = n;
		}
		size++;
	}

	public int size() {
		return size;
	}

	
	 public void RangeCheck(int index){
		if (index<0){
			try{
			throw new Exception();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}	
	
	
	
	public Object get(int index) {
		//index越界处理
		
		RangeCheck(index);
		Node temp = null;
		if (first != null) {
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}
		
		return temp.obj;
	}

	
	public void remove(int index){
		
		Node temp=node(index);
		Node up=temp.previous;
		Node down=temp.next;
		up.next=down;
		down.previous=up;
		size--;
		
	}
	
	
	public Node node(int index){
		//找到索引处的node
		RangeCheck(index);
		Node temp = null;
		if (first != null) {
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}
		return temp;
	}
	
	public void add(int index,Object obj){
		Node temp=node(index);
		Node newNode=new Node();
		newNode.obj=obj;
		if(temp!=null){
			Node up=temp.previous;
			up.next=newNode;
			newNode.previous=up;
			
			newNode.next=temp;
			temp.previous=newNode;
			size++;
		}
	}
	
	public static void main(String[] args) {
		SxtLinkedList list = new SxtLinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add(1,"BBBB");
		System.out.println(list.get(1));
	}
}
