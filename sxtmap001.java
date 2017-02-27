package collection;
/*
 * �Զ���ʵ��map�Ĺ���
 * ������
 * 
 */


public class sxtmap001 {
	SxtEntry[] arr=new SxtEntry[990];
	int size;
	
	//put����
	public void put(Object key,Object value){
		SxtEntry e=new SxtEntry(key,value);
		for(int i=0;i<size;i++){
			//��ֵ���ֱ�Ӹ���
			if(arr[i].key.equals(key)){
				arr[i].value=value;
				return ;
			}
		}
		
		arr[size++]=e;
	}
	
	//get����
	public Object get(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value){
		for(int i=0;i<size;i++){
			if(arr[i].value.equals(value)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		sxtmap001 m=new sxtmap001();
		m.put("gaoqi",new Wife("yangmi"));
		//m.put("gaoqi",new Wife("lisi"));
		m.put("zhangsan", new Wife("lisi"));
		Wife w=(Wife)m.get("gaoqi");
		System.out.print(w.name);
	}
}

class SxtEntry{
	Object key;
	Object value;
	public SxtEntry(Object key,Object value){
		super();
		this.key=key;
		this.value=value;
	}
}