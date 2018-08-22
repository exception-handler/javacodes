package p1;

public class LaptopRecord {
	Laptop arr[]= new Laptop[10];
	int count=-1;
	
	public void addLaptop(Laptop l)
	{
		arr[++count]=l;
		
	}
	
	public void searchThroughSerial(int serial)
	{
		for(int i=0;i<=count;i++)
		{
			if(arr[i].serialNumber==serial)
			{
				show(i);
			}
		}
	}
	
	public void searchThroughPrice(int low,int high)
	{
		for(int i=0;i<=count;i++)
		{
			if(arr[i].getCost()>=low&&arr[i].getCost()<=high)
			{
				show(i);
			}
		}
		
	}
	
	public void show(int i){
		System.out.println("Employee serail number is :"+arr[i].getSerialNumber());
		System.out.println("Employee brand name is :"+arr[i].getBrandName());
		System.out.println("Employee cost is :"+arr[i].getCost());	
		System.out.println("--------------------------------");
		
	}
	
}

