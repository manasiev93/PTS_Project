package controller;

public class ValidationUtils {
	
	public static boolean isTooShort(String s, int minLength){
		return s.length() < minLength ? true : false;
	}
	
	public static boolean isNegative(int n){
		return n < 0 ? true : false;
	}
	
	public static boolean isNull(Object o){
		return o == null ? true : false;
	}

}
