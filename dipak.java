// Simple inheritance example

class student       			// Super-class
{
	int roll, marks;
	String name;
	protected void inpt(int a, int b, String s)
	{
		roll= a;
		marks= b;
		name=  s;

	}
}

class dipak extends student		// Sub-class
{
	void disp()
	{
		System.out.println(roll+" "+name+" "+marks);
	}
	public static void main(String args[])
	{
		dipak d = new dipak();
		d.inpt(1, 87, "Mohite");
		d.disp();
	}
}
