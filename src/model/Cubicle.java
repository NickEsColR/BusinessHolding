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
	
	private String name;
	private String position;
	private String email;
	private int extension;
	
	//methods
	
	public Cubicle(String name, String pos, String email, int ext){
		this.name = name;
		position = pos;
		this.email = email;
		extension = ext;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPosition(){
		return position;
	}
	
	public String getEmail(){
		return email;
	}
	
	public int getExtension(){
		return extension;
	}
}