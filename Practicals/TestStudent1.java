class TestStudent 
{

	public static void main(String[] args)
	{
		// creating object of class EncapsulationExample
		Student a=new Student();
		// object is used to access the methods of a class
		a.setId(1);
        a.setAge(21);
		a.setName("Gaurav");
		System.out.println("Id:"+a.getId()+"\n"+"Age:"+a.getAge()+"\n"+"Name:"+a.getName());

	}

}