package mamathaQuestion01;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsExample <Integer, String> generics = new GenericsExample<Integer, String>(1,"Generics Example Demo");
		generics.printValues();
	}
}
class GenericsExample<T1, T2>
{
	T1 t1; 
	T2 t2; 
	GenericsExample(T1 t1, T2 t2)
	{
		this.t1 = t1;
		this.t2 = t2;
	}
	public void printValues()
	{
		System.out.println(t1);
		System.out.println(t2);
	}
}
