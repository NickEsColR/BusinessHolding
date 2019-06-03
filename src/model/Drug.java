package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

public class Drug extends Manufacturing{
	
	//constants
	
	public final static String MANUFACTURED_EXPORT = "m&e";
	public final static String MANUFACTURED_SELL = "m&s";
	public final static String IMPORT_SELL = "i&s";
	
	//attributes
	
	private String sanitary;
	private boolean validation;
	private int[] expiration;
	private String modality; 
	
	//methods
	
	public Drug(String name, String nit, String address, String phone, int employ, 
	double price, int[] bornDate, String type, String agent, int floor, String sanitary, 
	boolean validation, int[] expiration, String modality){
		super( name,  nit,  address,  phone,  employ,  price,  bornDate,  type,  agent,  floor);
		this.sanitary = sanitary;
		this.validation = validation;
		this.expiration = expiration;
		this.modality = modality;
	}
	
	public String getSanitary(){
		return sanitary;
	}
	
	public boolean getValidation(){
		return validation;
	}
	
	public int[] getExpiration(){
		return expiration;
	}
	
	public String getModality(){
		return modality;
	}
}