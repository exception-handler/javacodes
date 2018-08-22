package ans5;

public class Restaurant implements IRestaurant{
	@Override
	public Dish getDish(int dishId) {
		
		
		for(int i=0;i<menu.length;i++){
		if(menu[i].getDishId()==dishId)
		{
			return menu[i];
		}
		
		}
			return null;
		
		
	}
	
	static Dish[] menu;
	static{
		menu=new Dish[2];
		menu[0]=new Dish(101,"paneer tikka",200,"2.30pm");
		menu[1]=new Dish(102,"chicken tandoori",250,"3.30pm");
		//initialize Dish array here
	}

}
