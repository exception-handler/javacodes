package Question4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Question1.Employee;

public class MainClass {
	Scanner sc=new Scanner(System.in);
	static Dish[] dish=new Dish[10];
	static int counter=0;
	static File path=new File("Menu.txt");
	public static void main(String[] args) throws IOException {
		dish[0]=new Dish(101,"paneer tikka",200,"2.30pm");
		dish[1]=new Dish(102,"chicken tikka",300,"3.30pm");
		dish[2]=new Dish(103,"fish tikka",400,"4.30pm");
		
		for(int i=0;i<3;i++){
		FileWriter fw=new FileWriter(path,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(dish[i].getDishId()+","+dish[i].getDishName()+","+dish[i].getDishPrice()+","+dish[i].getDishMakeTime()+"\n");
		bw.close();
		}
		
		Dish dish1=new Dish();
		MainClass runner=new MainClass();
		while (true) {
			System.out.println("\n0.Exit \n1.add new dish \n2.view menu");
			System.out.println("Enter choice");
			int choice = Integer.parseInt(runner.sc.nextLine());

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				runner.addDish(dish1);
				break;
			case 2:
				runner.viewMenu(dish);
				break;
			
			default:
				System.out.println("wrong choice");
			}// switch end

		} // while end

		
	}

	public void addDish(Dish dish) throws IOException
	{
	
		
		System.out.println("enter Data");
		System.out.println("enter dish ID");
		int dishId = Integer.parseInt(sc.nextLine());
		dish.setDishId(dishId);
		System.out.println("enter dish name");
		String dishName = sc.nextLine();
		dish.setDishName(dishName);
		System.out.println("enter dish price");
		int dishPrice = Integer.parseInt(sc.nextLine());
		dish.setDishPrice(dishPrice);
		System.out.println("enter dish make time");
		String dishMakeTime = sc.nextLine();
		dish.setDishMakeTime(dishMakeTime);
		
		FileWriter fw=new FileWriter(path,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(dish.getDishId()+","+dish.getDishName()+","+dish.getDishPrice()+","+dish.getDishMakeTime()+"\n");
		bw.close();
	

	}
	

	
	public void viewMenu(Dish dish[]) throws NumberFormatException, IOException
	{
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		int i = 0, j = 0;
		String string = "";
		while ((string = br.readLine()) != null) {
			// System.out.println(string);
			String str[] = string.split(",");
			dish[j] = new Dish(Integer.parseInt(str[i]), str[i + 1], Integer.parseInt(str[i + 2]),str[i + 3]);
			System.out.println(string);
			j++;
	}
}
}