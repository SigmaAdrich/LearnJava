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
		RangeCheck(initialCapacity);
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
	//判断正负
	 public void RangeCheck(int index){
		if (index<0){
			try{
			throw new Exception();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public Object get(int index){
		if (index>=size)
		try{
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();
		}
		return elementData[index];
	}
	
	public void remove(int index){
		RangeCheck(index);
		//删除指定位置对象
		int numMoved=size-index-1;
		if(index>0){
			System.arraycopy(elementData,index+1,elementData,index,numMoved);
			elementData[--size]=null;
		}
	}
	public void remove(Object obj){
		for(int i=1;i<size;i++){
			if(get(i).equals(obj)){
				remove(i);
			}
		}
	}
	public void set(int index,Object obj){
		RangeCheck(index);
		elementData[index]=obj;
	}
	
	public void add(int index,Object obj){
		ensureCapacity();
		RangeCheck(index);
		System.arraycopy(elementData,index,elementData,index+1,size-index);
		elementData[index]=obj;
		size++;
	}
	
	private void ensureCapacity(){
		//数组扩容和数据的拷贝
		if(size==elementData.length){
			Object[] newArray=new Object[size*2];
			System.arraycopy(elementData,0,newArray,0,elementData.length);
//			for(int i=0;i<elementData.length;i++){
//				newArray[i]=elementData[i];
//			}
		}
	}
	public static void main(String[] args){
		SxtArrayList list=new SxtArrayList();
		list.add("2222");
		list.add("12");
		list.add("23");
		list.add("36");
		list.add("55");
		list.add(1,"23456");

	}
	
}
