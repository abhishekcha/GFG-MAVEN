package mypkg;

public class MyCalc {
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int diff(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int divi(int a,int b)
	{
		return a/b;
	}
	public void show()
	{
		System.out.println("GFG show Function:?");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc calc=new MyCalc();
		System.out.println("sum is :"+calc.sum(25, 20));
		System.out.println("diff is :"+calc.diff(244, 40));
		System.out.println("multiplication is :"+calc.mul(24, 20));
		System.out.println("division is :"+calc.divi(24, 20));
		calc.show();
	}

}
