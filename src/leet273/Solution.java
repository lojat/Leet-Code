package leet273;

  

public class Solution {
	
	String[] counts = {"","","Hundred ","Thousand ","Thousand ","Thousand ","Million ","Million ","Million ","Billion "};
	String[] singles = {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
	String[] teens = {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
	String[] tens = { "", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
		
	public String numberToWords(int num) {//46,346,773  1,234,567
		
		String res="" ;
		
		String n = Integer.toString(num);
		
		if(num!=0) {
			while(n!="") {
				
				int len = n.length()%3!=0 ? n.length()%3 : 3;
				int len1 = n.length();
				int num1 = Integer.parseInt(n.substring(0,len));
				
				if(num1!=0) {
					if(len<3) { 
						
						res += getHundred(num1, len1);
			
					}else {
						if(num1>99) {
							res += singles[num1/100]+counts[2];
						}
						num1 = num1%100;
						
						res += 	getHundred(num1,len1);
					}
				}
				n = n.substring(len);
			}
		
		}
		else {
			res = "Zero";
		}
		
		return res;
		
	}
	
	public String getHundred(int num1,int len) {
		String res ="";	
		
		if(num1>19) {
			res += tens[num1/10]+singles[num1%10];
		}else if(num1>9){
			res += teens[num1%10];
		}
		else{
			res+= singles[num1];
		} 
		
		if(len>3) {
			res += counts[len-1]; 
		}
		
		return res;
	}

}
