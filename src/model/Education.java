package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

public class Education extends Service{
	
	//constants 
	
	public final static char UNIVERSITY = 'u';
	public final static char SCHOOL = 's';
	public final static int PROCULTURE_BASE = 20;
	
	//attributes
	
	private String registerNumber;
	private int accreditedYears;
	private int rankingSaber;
	private String rectorName;
	private char type;
	private int students1And2;
	private int students;
	
	//methods
	
	public Education(String name, String nit, String address, String phone, int employ, 
	double price, int[] bornDate, String type, String agent, int floor, double satisfaction,
	String rNumber,int years, int ranking, String rectorName, char typeE,int s12, int s){
		super( name,  nit,  address,  phone,  employ,  price, bornDate,  type,  agent,  floor,  satisfaction);
		registerNumber = rNumber;
		accreditedYears = years;
		rankingSaber = ranking;
		this.rectorName = rectorName;
		type = typeE;
		students1And2 = s12;
		students = s;
	}
	
	public String getRegisterNumber(){
		return registerNumber;
	}
	
	public int getAccreditedYears(){
		return accreditedYears;
	}
	
	public int getRankingSaber(){
		return rankingSaber;
	}
	
	public String getRectorNane(){
		return rectorName;
	}
	
	public char getType(){
		return type;
	}
	
	public int getStudents1And2(){
		return students1And2;
	}
	
	public int getStudents(){
		return students;
	}
	
	public double proCultureIva(){
		return PROCULTURE_BASE - students12Percent();
	}
	
	public double students12Percent(){
		return students1And2 / students;
	}
}