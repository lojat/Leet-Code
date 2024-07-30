package roman.integer;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		String s = "XXXV";
		
		int res= romanToInt(s) ;
		
		System.out.println(res);

//		System.out.println(map.get("L")<map.get("X"));
//		 M = 1000, CM = 900, XC = 90 and IV = 4. I        
	
    }
	
	public static int romanToInt(String s) {
		boolean flag = false;
		int res =0;
		
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
		int l= s.length();
		
		for(int i=0;i<l-1;i++) {
			String s1= String.valueOf(s.charAt(i)), s2= String.valueOf(s.charAt(i+1));
			
			 if(map.get(s1)<map.get(s2)){ 
				 res+= map.get(s2)-map.get(s1);
				 if(i==l-2)
					 flag=true;
				 i++;
			 }
			 else {
				 res+=map.get(s1);
			 }
		}
		if(!flag)
			res+= map.get(String.valueOf(s.charAt(l-1)));
		 
		return res;
	}
	
}
