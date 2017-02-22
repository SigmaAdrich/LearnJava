package collection;

public class SxtArrayList {
	private Object[] elementData;
	private int size;
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	//创建一个无参的构造方法
	private SxtArrayList(){
		//默认大小是10
		this(3);
		
	};
	//创建一个有参的构造方法
	public SxtArrayList(int initialCapacity){
		//判断参数正负，捕获异常
		if (initialCapacity<0){
			try{
			throw new Exception();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//设定数组的大小
		elementData=new Object[initialCapacity];
	}
	public void add(Object obj){
		//数组扩容和数据的拷贝
		if(size==elementData.length){
			Object[] newArray=new Object[size*2];
			System.arraycopy(elementData,0,newArray,0,elementData.length);
//			for(int i=0;i<elementData.length;i++){
//				newArray[i]=elementData[i];
//			}
			elementData=newArray;
		}
		elementData[size++]=obj;
		
	}
	public static void main(String[] args){
		SxtArrayList list=new SxtArrayList();
		list.add("2222");
		list.add("12");
		list.add("23");
		list.add("36");
		list.add("55");
		System.out.println(list.get(4));
	}
	
	
	public Object get(int index){
		if (index<0||index>=size)
		try{
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();
		}
		return elementData[index];
	}
	
	public void remove(int index){
		//删除指定位置对象
	}
	
	
}
