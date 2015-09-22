
public class ScopeTest {
	
	static int test1 = 10;
	
	
	
	public static void main(String[] args)
	{
		int x = 0,y = 0;
		if (x==y)
		{
			int z =20;
			x=z*2;
			
			System.out.println(z);
		}
		System.out.println(x);
		System.out.println(test1);
	}

}
