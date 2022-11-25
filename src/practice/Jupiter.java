package practice;

import java.util.HashMap;
import java.util.Iterator;

public class Jupiter {

	public static void main(String[] args)
	{
		  String st ="MY NAME IS MONU DHAKAD";
		  st=st.replaceAll("\\s","");
		  HashMap<Character, Integer>map = new HashMap<Character,Integer>();
		  int count=0;
		  for(int i=0;i<st.length();i++)
		  {
			  count=0;
			  for(int j=0;j<st.length();j++)
			  {
				  if(st.charAt(i)==st.charAt(j))
				  {
					  count++;
				  }
			  }
			  map.put(st.charAt(i),count);
			  
		  }
		  System.out.println(map);
		  
		  Iterator<Character>itr=map.keySet().iterator();
		  while(itr.hasNext())
		  {
			  Character temp=itr.next();
			  if(map.get(temp)>1)
			  {
				  System.out.println(temp+"  "+map.get(temp));
			  }
		  }
		  
	}

}
