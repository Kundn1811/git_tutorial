package dataStructures;

import java.util.Arrays;

public class LsearchForString {

	public static void main(String[] args) {
		String name = "Kundan kumar";
		char search = 'b';
		boolean ans = searchSt(name, search);
		System.out.println(ans);
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(searchSt2(name, search));
	}
	
	// methods for searching a character in stirng
	static boolean searchSt(String str,char element) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			char found = str.charAt(i);
			if(found==element) {
				return true;
			}
		}
		return false;
	} 
	static boolean searchSt2(String str,char element) {
		if(str.length()==0) {
			return false;
		}
		for(char ch :str.toCharArray()) {
			if(ch == element)
		     return true;
		}
		return false;
	} 

}
