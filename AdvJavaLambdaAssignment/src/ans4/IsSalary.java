package ans4;


public interface IsSalary {

	default public void reach()
	{
		System.out.println("reach");
	}
	public int calculateSalary(int days,int salPerDay);
}
