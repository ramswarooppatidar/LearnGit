package com.lerangit;

public class DevString {
	public static boolean isAnagram(String s1, String s2) {
		int index[] = new int[26];
		for(int i =0; i<s1.length(); i++) {
			index[s1.charAt(i) - 'a']++;
		}
		for(int i =0; i<s2.length(); i++) {
			index[s2.charAt(i) - 'a']--;
		}
		for(int i =0; i<index.length; i++) {
			if(index[i] != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String arg[]) {
		boolean result = isAnagram("listner", "islernt");
		System.out.println(result);
	}
}
