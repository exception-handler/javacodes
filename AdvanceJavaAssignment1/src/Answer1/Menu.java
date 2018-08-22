package Answer1;

import java.util.ArrayList;
import java.util.List;


public class Menu {
	static List<Dish> menuList=new ArrayList<Dish>();
	
	static
	{
	Dish d1=new Dish(101, "Paneer Tikka", 12);
	Dish d2=new Dish(102, "Chicken Tikka", 2);
	Dish d3=new Dish(103, "Fish Tikka", 1);
	
	menuList.add(d1);//store the object
	menuList.add(d2);
	menuList.add(d3);
	
	}
	
	public void print()
	{
		for (Dish dish : menuList) {
			System.out.println(dish);
		}
	}
}
