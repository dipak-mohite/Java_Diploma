class student{
	int rollno;
	String name;
	show(int a, String b)
	{
		rollno= a;
		name= b;
		Sytem.out.println("Roll no.: "+rollno);
		System.out.println("Name : "+name);
	} 
}

class library{
	int libno;
	library(int a, String b, int c)
	{
		Super(a,b);
		libno= c;
	}
	display()
	{
		Sytem.out.println("Roll no.: "+rollno);
		System.out.println("Name : "+name);
		Sytem.out.println("Library No.: "+libno);
	}
}