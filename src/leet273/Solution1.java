package leet273;

public class Solution1 {//1,111,111,111


	String[] singles = {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
	String[] teens = {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
	String[] tens = { "", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
		
	
	public String numberToWords(int num) {
		
		String res ="";
		
		if(num==0) {
			res = "Zero";
		}
		
		if(num>999999999) {
			res+= getBillion(num);
			num =  num%1000000000;
		}
		if(num>999999) {
			int num1 = num/1000000;
			res += getMillion(num1);
			num = num%1000000;
		}
		if(num>999) {
			int num1 = num/1000;
			res += getThousands(num1);
			num=num%1000;
		}
		if(num>0) {
			res += getHundred(num);
		}
		
		
		res = res.strip();
		
		return res;
	}
	
	private String getHundred(int num) {
		String res = ""; 
		
		if(num>99) {
			int num1 = getFirst(num);
			res = singles[num1] + "Hundred ";
			num = num%100;
		}
		res += getEnd(num);
		
		
		return res;
	}

	private String getThousands(int num) {
		String res = ""; 
		
		if(num>99) {
			int num1 = getFirst(num);
			res = singles[num1] + "hundred ";
			num = num%100;
		}
			res += getEnd(num)+"Thousand ";
		
		
		return res;
	}

	public int getFirst(int num) {
		return num/100;
	}
	
	public String getEnd(int num) {
		String res="";
		
		if(num<10) {
			res = singles[num];
		}else if(num<20) {
			res = teens[num%10];
		}else {
			res = tens[num/10]+singles[num%10];
		}
		
		return res;
	}
	
	private String getMillion(int num) {
		String res = ""; 
		
		if(num>99) {
			int num1 = getFirst(num);
			res = singles[num1] + "Hundred ";
			num = num%100;
		}
			res += getEnd(num)+"Million ";
		
		
		return res;
	}

	public String getBillion(int num) {
		String res ="";
		
		int num1 = num/1000000000;
		
		res = singles[num1]+"Billion ";
		
		return res;
	}
	
	
}
