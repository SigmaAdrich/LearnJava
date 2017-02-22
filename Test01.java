package collection;
import java.util.*;
public class Test01 {
	public static void main(String[] args){
		List list=new ArrayList();
		
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1230);//包装类，自动装箱
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
//		list.remove("aaa");
//		System.out.println(list.size());
		
		
		List list2=new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
		list2.add("ddd");
		list.add(list2);
		System.out.println(list.size());
		System.out.println(list2.size());
		Object a=list.get(4);
		System.out.println(a);
	}
}


class Dog {
	
}
