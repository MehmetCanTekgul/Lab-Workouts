
public class CompareNumbers {

	public static void main(String[] args){
		int value1 = Integer.parseInt(args[0]);
		int value2 = Integer.parseInt(args[1]);
		
		if (value1 < value2) {
			System.out.println(value1 + " < " + value2);
		}else if (value1 == value2) {
			System.out.println(value1 + " = " + value2);
		}else {
			System.out.println(value1 + " > " + value2);
		}

	}
}