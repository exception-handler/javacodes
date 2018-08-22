package generics;

public class JoinString implements GenericInterface<String, String>{

	String s1;
	String s2;
	@Override
	public void getData(String t, String u) {
		s1=t;
		s2=u;
		
	}
	
	String joinString()
	{
		return s1.concat(s2);
	}

	
}
