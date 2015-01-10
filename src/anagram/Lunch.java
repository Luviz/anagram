package anagram;

public class Lunch {
	public static void main(String[] args){
		System.out.println(1);
		String test = "lasse pryt";
		System.out.println(test.getBytes().length);
		test = test.replaceAll(" ", "");
		System.out.println(test);
		System.out.println(test.getBytes().length);
		for (int i =0 ; i < test.getBytes().length; i ++) {
			System.out.println(i + " "+ test.charAt(i));
			
		}
		pre(test);
	}
	
	public static String pre(String in){
		if(in.getBytes().length>0){
			System.out.println(in);
			pre(in.substring(1));
		}else{
			return in;
		}
		
		return "Fail";
	}
}
