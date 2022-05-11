package Ab_Ag_Int;

class method
{
	public int method1(int a)
	{
		return a;
	}
	public String method2(String str)
	{
		return str;
	}
	public float method3(float fl)
	{
		return fl;
	}
	public double method4(double b)
	{
		return b;
	}
	public void method5(){
		System.out.println("Returns nothing");
	}
}

public class Methods {

	public static void main(String[] args) {
		method m=new method();
		System.out.println(m.method1(10));
		System.out.println(m.method2("Bikki"));
		System.out.println(m.method3(5.5f));
		System.out.println(m.method4(57568d));
		m.method5();
	}
}
