package p1;

import java.io.Serializable;
import java.util.Scanner;

public class Laptop implements Serializable {

	private int cost;
	private String name;
	private transient Camera camera;
	
	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Laptop() {
		super();
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop(int cost, String name, Camera camera) {
		super();
		this.cost = cost;
		this.name = name;
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", name=" + name + ", camera=" + camera + "]";
	}

}
