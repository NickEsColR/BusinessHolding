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
	
	public Product(String n, String c, double w, int u ){
		name = n;
		code = c;
		water = w;
		unities = u;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCode(){
		return code;
	}
	
	public double getWater(){
		return water;
	}
	
	public int getUnitites(){
		return unities;
	}
	
	public void plusWater(double plus){
		water += plus;
	}
}