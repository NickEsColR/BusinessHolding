package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

public class Tecnology extends Service{

	//constants
	
	public  final static String CONSULT = "Consultoria";
	public  final static String TRAINING = "Capacitacion";
	public  final static String SOFTWARE = "Desarrollo de software a medida";
	public  final static String INFRAESTRUCTURE = "Infraestructura de servicio";
	public  final static String SOFTWARE_SERVICE = "Software como servicio";
	public  final static String PLATFORM = "Plataforma como servicio";
	
	//attributes
	
	private ArrayList<String> services;
	private double energy;
	
	//methods
	
	public Tecnology(String name, String nit, String address, String phone, int employ, 
	double price, int[] bornDate, String type, String agent, int floor, double satisfaction
	ArrayList<String> s, double energy){
		super( name,  nit,  address,  phone,  employ,  price,  bornDate,  type,  agent,  floor,  satisfaction);
		services = new ArrayList<String>();
		services = s;
		this.energy = energy;
	}
	
	public double getEnergy(){
		return energy;
	}
	
	public void plusEnergy(double plus){
		energy += plus;
	}
	
	public String KilowattsXTree(){
		String tree = "La cantidad de arboles que debe plantar es: ";
		if(energy < 1000){
			tree += 8;
		}
		else if(energy < 3000){
			tree += 35;
		}
		else{
			tree += 500;
		}
		return tree:
	}
}