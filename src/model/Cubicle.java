package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

public class Cubicle{

	//attributes
	
	private String employName;
	private String employPosition;
	private String employEmail;
	private int employExtension;
	
	//methods
	
	public Cubicle(String name, String pos, String email, int ext){
		employName = name;
		employPosition = pos;
		employEmail = email;
		employExtension = ext;
	}
	
	public String getEmployName(){
		return employName;
	}
	
	public String getEmployPosition(){
		return employPosition;
	}
	
	public String getEmployEmail(){
		return employEmail;
	}
	
	public int getEmployExtension(){
		return employExtension;
	}
}