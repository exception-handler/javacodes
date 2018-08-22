package p3;

public class LaptopRecord {
	
	laptop arr[]=new laptop[5];
	int count=-1;
	
	public void addLaptop(laptop l)
	{
		arr[++count]=l;
		
	}	//add laptop fucntion end
	
	public void searchSerial(int serial)
	{
		for(int i=0;i<=count;i++)
		{
			if(arr[i].getSerialNumber()==serial)
			{
				displayContent(i);
			}
		}
	}
	
	public void searchPrice(int lower,int higher)
	{
		for(int i=0;i<=count;i++)
		{
			if(arr[i].getCost()>=lower&&arr[i].getCost()<=higher)
			{
				displayContent(i);
			}
		}
	}
	public void displayContent(int i)
	{
		System.out.println("the serail number is:"+arr[i].getSerialNumber());
		System.out.println("the brand name is :"+arr[i].getBrandName());
		System.out.println("the cost of laptop is:"+arr[i].getCost());
		System.out.println("----------------------------------------");
	}

}//laptopRecord class end



