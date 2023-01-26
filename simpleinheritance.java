
// Simple inheritance

class student 
{
	int roll, marks;
	String name;
	void input()
	{
		System.out.println("Enter student details :");
	}
}

class dipak extends student
{
	void display()
	{
		roll= 30;
		marks= 98;
		name= "Dipak";
		System.out.println(roll+" "+name+" "+marks);
	}
}

class simpleinheritance
{
	dipak d = new dipak();
	d.input();
	d.display();
}