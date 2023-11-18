package Stringdatatype;

public class Trim {

	public static void main(String[] args) {
		String str = " mindq ";
		System.out.println(str.length());
		System.out.println(str.trim());
		System.out.println(str.indexOf(str));
		
		String strd = " sr nagar ";
		System.out.println(strd.replaceAll(" ",""));
		System.out.println(strd.trim());
		System.out.println(strd.indent(0));
		
		System.out.println(strd.replace("sr", "pr"));
		
		String strs = " ram nagar ";
		System.out.println(strs.replaceAll(" ",""));
		
		String sdf = " kukat palli ";
		System.out.println(sdf.replaceAll(" ",""));
		
		String scf = " mende poojitha";
		System.out.println(scf.replaceAll(" ",""));
		

	}

}