package lab1;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("manju");
		list.add("manju1");
		list.add("manju2");
		list.add("manju3");
		list.add("manju4");
		list.add("manju5");
		String []array=new String[list.size()];
		list.toArray(array);
		System.out.println("...............coverted array values from arraylist are..........");
		for(String key:array)
		{
			System.out.println(key);
		}


	}

}
