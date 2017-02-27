package collection;

import java.util.LinkedList;

/*自定义map升级版
 * 提高map查询效率
 * 
 */
public class SxtMap002 {
	LinkedList[] arr=new LinkedList[999];//map的底层结构是数组加链表
	int size;
	
	//put方法
	public void put(Object key,Object value){
		SxtEntry e=new SxtEntry(key,value);
		int a=key.hashCode()%arr.length;
		if(arr[a]==null){
			LinkedList list=new LinkedList();
			arr[a]=list;
			list.add(e);
		}else{
			arr[a].add(e);
		}
	}
	
	public Object get(Object key){
		int a=key.hashCode()%arr.length;
		if(arr[a]!=null){
			LinkedList list=arr[a];
			for(int i=0;i<list.size();i++){
				SxtEntry e=(SxtEntry)list.get(i);
				if(e.key.equals(key)){
					return e.value;
				}
			}
		}
		return null;
		
		
	}
	
	
	public static void main(String[] args){
		sxtmap001 m=new sxtmap001();
		m.put("gaoqi",new Wife("yangmi"));
		m.put("gaoqi",new Wife("lisi"));
		m.put("gaoqi",new Wife("lisisi"));
		m.put("zhangsan", new Wife("lisi"));
		Wife w=(Wife)m.get("gaoqi");
		System.out.print(w.name);
	}
}

