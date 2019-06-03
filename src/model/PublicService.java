package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

public class PublicService extends Service{

	//constants
	
	public final static char SEWERAGE = 's';
	public final static char ENERGY = 'e';
	public final static char AQUEDUCT = 'a';
	public final static int PROCULTURE_BASE = 40;
	
	//attributes
	
	private char type;
	private int suscriptors;
	private int suscriptors1And2;
	
	//methods
	
	public PublicService(String name, String nit, String address, String phone, int employ, 
	double price, int[] bornDate, String type, String agent, int floor, double satisfaction, char type, int s, int s12){
		super( name,  nit,  address,  phone,  employ,  price,  bornDate,  type,  agent,  floor,  satisfaction);
		this.type = type;
		suscriptors = s;
		suscriptors1And2 = s12;
	}
	
	public char getType(){
		return type;
	}
	
	public int getSuscriptors(){
		return suscriptors;
	}
	
	public int getSuscriptors1And2(){
		return suscriptors1And2;
	}
	
	public double proCultureIva(){
		return PROCULTURE_BASE - suscriptors3456Percent();
	}
	
	public double suscriptors3456Percent(){
		return (suscriptors - suscriptors1And2) / suscriptors;
	}
}