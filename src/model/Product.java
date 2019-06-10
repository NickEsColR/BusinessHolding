package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

public class Product{
	
	//attributes
	
	private String name;
	private String code;
	private double water;
	private int unities;
	
	//methods
	
	/**
	* <b>Descrpition:</b> constructor of a product<br>
	* @param n is the name of the product<br>
	* @param c is the code of the product<br>
	* @param w is how many water the product need to it manufacturing<br>
	* @param u is the unities of a product<br>
	*/
	
	public Product(String n, String c, double w, int u ){
		name = n;
		code = c;
		water = w;
		unities = u;
	}
	
	/**
	* <b>Description:</b> get the name of a product<br>
	* @return name is the name of a product<br>
	*/
	
	public String getName(){
		return name;
	}
	
	/**
	* <b>Description:</b> get the code of a product<br>
	* @return code is the code of a product<br>
	*/
	
	public String getCode(){
		return code;
	}
	
	/**
	* <b>Description:</b> get the water of a product<br>
	* @return water is the water of a product<br>
	*/
	
	public double getWater(){
		return water;
	}
	
	/**
	* <b>Description:</b> get the unities of a product<br>
	* @return unities is the unitites of a product<br>
	*/
	
	public int getUnitites(){
		return unities;
	}
	
	/**
	* <b>Description:</b> make a plus of the water<br>
	* @param plus is how many water they add<br>
	*/
	
	public void plusWater(double plus){
		water += plus;
	}
}