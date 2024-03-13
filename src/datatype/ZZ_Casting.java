package datatype;

public class ZZ_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// implicit casting
		short x = 10;
		int y = 30+x;
		System.out.println("y = "+y);

// explicit casting
		double x1=10.1;
		int y1=(int)x1 + 30;
		System.out.println("y1 = "+y1);
		
// casting can use > byte, short, int, long, float, double;
// casting can not use > string;
// but called "Wrapper Classes" can be use string;
		
		String x2 = "1";
		int xInteger = Integer.parseInt(x2);
		int y2 = xInteger + 30;
//		int y2 = Integer.parseInt(x2) + 30;
		
// can use > Short.parseShort , Float.parseFloat , Double.parseDouble;
		
		System.out.println("y2 = "+y2);
		
		
		
		
		

	}

}
