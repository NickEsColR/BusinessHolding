package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

public class Service extends Company{
	
	//attributes
	
	private double satisfaction;
	
	//methods
	
	public Service(String name, String nit, String address, String phone, int employ, 
	double price, int[] bornDate, String type, String agent, int floor, double satisfaction){
		super( name,  nit,  address,  phone,  employ, price, bornDate,  type,  agent, floor);
		this.satisfaction = satisfaction;
	}
	
	public double getSatisfaction(){
		return satisfaction;
	}
	
	public void setSatisfaction(int points, int quests){
		satisfaction = points / quests;
	}
	
	public String quest1(){
		return 	"El servicio prestado";
	}
	
	public String quest2(){
		return "El tiempo de respuesta dado";
	}
	
	public String quest3(){
		return "La relacion costo / beneficio del servicio adquirido";
	}
}