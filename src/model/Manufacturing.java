package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

import java.util.ArrayList;

public class Manufacturing extends Company{

	//relations
	
	private ArrayList<Product> products;
	
	//methods
	
	public Manufacturing(String name, String nit, String address, String phone, int employ, 
	double price, int[] bornDate, String type, String agent, int floor){
		super( name,  nit,  address,  phone,  employ,  price,  bornDate,  type,  agent,  floor);
		products = new ArrayList<Product>();
	}
	
	public void addProduct(String n, String c, double w, int u){
		products.add(new Product(n, c, w, u));
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	public String waterXTree(){
		String 	tree = "La cantidad de arboles que debe sembrar son: ";
		double water = 0;
		for(int i = 0;i < products.size();i++){
			water = products.get(i).getWater();
		}
		if(water < 140){
			tree += 6;
		}
		else if(water < 800){
			tree += 25;
		}
		else{
			tree += 200;
		}
		return tree;
	}
}