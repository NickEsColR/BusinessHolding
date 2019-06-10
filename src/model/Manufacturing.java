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
	
	/**
	* <b>Descrpition:</b> constructor of a Manufacturing<br>
	* @param name is the company name <br>
	* @param nit is the unic code of a company<br>
	* @param address is the company address<br>
	* @param phone is the company phone<br>
	* @param employ is how many employs the company have<br>
	* @param price is the assents price of a company<br>
	* @param bornDate is the date the company was created<br>
	* @param type is what the company is<br>
	* @param agent is the name of the company agent<br>
	* @param floor is how many floors the company building have<br>
	*/
	
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