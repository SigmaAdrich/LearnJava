package collection;

public class SxtLinkedList {
	private Node first;
	private Node last;
	
	private int size;
	
	
	public void add(Object obj){
		Node n=new Node();
		//第一个节点
		if(first==null){

			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			first=n;
			last=n;
		}else{
			//直接往last后增加新的节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			last=n;
		}
		size++;
	}
	public int size(){
		return size;
	}
	public static void main(String[] args){
		SxtLinkedList list=new SxtLinkedList();
		list.add("aaa");
		list.add("bbb");
		System.out.println(list.size());
	}
}

