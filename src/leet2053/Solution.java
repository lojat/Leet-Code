package leet2053;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String kthDistinct(String[] arr, int k) {
    	
    	String[] distnict = new String[arr.length];
    	int ind=0;
    	
    	
    	for(int i =0 ; i < arr.length; i++) {
    		
    		boolean flag = true;
    		
    		for(int j = i+1 ; j < arr.length ; j++ ) {
    			if(arr[i]==arr[j]) {
    				flag = false;
    				arr[j] = null; 
    				break;
    			}
    		}
    		if(flag && arr[i] != null) {
    			distnict[ind] = arr[i];
    			ind++;
    			if(ind == k) {
    				ind=i;
    				break;
    			}
    		}
    		
    	}
    	
    	return arr[ind]; 
    	
    }
}