package generics;

public class GenericMethod {

	public static <E> void print(E[] e)
	{
		for (E e1 : e) {
			System.out.print(e1+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Integer [] num={20,30,50};
		print(num);
		
		Character stream[]={'J','A','V','A'};
		print(stream);

	}

}
