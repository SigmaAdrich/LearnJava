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
	//����һ���޲εĹ��췽��
	private SxtArrayList(){
		//Ĭ�ϴ�С��10
		this(3);
		
	};
	//����һ���вεĹ��췽��
	public SxtArrayList(int initialCapacity){
		//�жϲ��������������쳣
		if (initialCapacity<0){
			try{
			throw new Exception();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//�趨����Ĵ�С
		elementData=new Object[initialCapacity];
	}
	public void add(Object obj){
		//�������ݺ����ݵĿ���
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
		//ɾ��ָ��λ�ö���
	}
	
	
}
