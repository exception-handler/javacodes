package generics;

public class Add implements GenericInterface<Integer, Integer> {

	Integer t;
	Integer u;
	
	
	@Override
	public void getData(Integer t, Integer u) {
		// TODO Auto-generated method stub
	
		this.t=t;
		this.u=u;
	}
	
	Integer sum()

	{
		return t+u;
	}

}
