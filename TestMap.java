package collection;
import java.util.*;


/**
 * ����map�Ļ����÷�
 * @author xupeng
 *
 */
public class TestMap {
public static void main(String[] args){
	Map map=new HashMap();
	map.put("zhangsan", new Wife("yanmi"));
	map.put("gaoqi", new Wife("zhangmanyu"));
	Wife w=(Wife)map.get("gaoqi");
	System.out.println(w.name);
}
	
	

	
	
}
class Wife{
	String name;
	public Wife(String name){
		this.name=name;
	}
}
	