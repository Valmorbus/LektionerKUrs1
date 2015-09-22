
public class CastingTest {

	public static void main(String[] args) {
		int i;
		byte b;
		double d;
		float f = 10.56f;
		boolean state;
		long l;
		
		b = 23;
		i = b;
		d = i;
		
		d = 323.11;
		i = (int) d;
		System.out.println(i);
		b = (byte) i;
		System.out.println(b);
		b=(byte) d;
		System.out.println(b+i +" " +(b+d));
		d = 0;
		d = f;
		System.out.println(d);
		f=(float) d;
		System.out.println(f);

	}

}
