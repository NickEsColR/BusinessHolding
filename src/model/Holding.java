package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

import java.util.ArrayList;

public class Holding{
	
	//relations
	
	private ArrayList<Company> bussiness;
	
	//methods
	
	public Holding(){
		bussiness = new ArrayList<Company>();
	}
	
	public void addBussiness(Company c){
		bussiness.add(c);
	}
	
	public ArrayList<Company> getBussiness(){
		return bussiness;
	}
	
	public String proCultureIvaEducation(String nit){
		String msg = "El impuesto procultura es: ";
		boolean find = false;
			for(int i = 0;i < bussiness.size() && !find;i++){
				if(bussiness.get(i).getNit().equals(nit)){
					if(bussiness.get(i) instanceof Education){
						Education e = (Education)bussiness.get(i);
						msg += e.proCultureIva();
					}
					else{
						msg = "La empresa no es de educacion";
					}
					find = true;
				}
			}
		return msg;
	}
	
	public String waterXTree(String nit){
		String msg = "";
		boolean find = false;
		for(int i = 0;i < bussiness.size() && !find;i++){
			if(bussiness.get(i).getNit().equals(nit)){
					if(bussiness.get(i) instanceof Manufacturing){
						Manufacturing m = (Manufacturing)bussiness.get(i);
						msg += m.waterXTree();
					}
					else{
						msg = "La empresa no es de fabricacion";
					}
					find = true;
				}
		}
		return msg;
	}
	
	public String proCultureIvaPublicService(String nit){
		String msg = "El impuesto procultura es: ";
		boolean find = false;
		for(int i = 0;i < bussiness.size() && !find;i++){
			if(bussiness.get(i).getNit().equals(nit)){
					if(bussiness.get(i) instanceof PublicService){
						PublicService ps = (PublicService)bussiness.get(i);
						msg += ps.proCultureIva();
					}
					else{
						msg = "La empresa no es de servicio publico";
					}
					find = true;
				}
		}
		return msg;
	}
	
	public String kilowattsXTree(String nit){
		String msg = "";
		boolean find = false;
		for(int i = 0;i < bussiness.size() && !find;i++){
			if(bussiness.get(i).getNit().equals(nit)){
					if(bussiness.get(i) instanceof Tecnology){
						Tecnology t = (Tecnology)bussiness.get(i);
						msg += t.KilowattsXTree();
					}
					else{
						msg = "La empresa no es de tecnologia";
					}
					find = true;
				}
		}
		return msg;
	}
	
	public String searchEmploy(String nit,String name, char type){
		String ext = "";
		boolean find = false;
		for(int i = 0;i < bussiness.size() && !find;i++){
			if(bussiness.get(i).getNit().equals(nit)){
				ext += bussiness.get(i).searchEmploy(name,type);	
				find = true;
			}
		}
		return ext;
	}
	
	public ArrayList<String> searchEmployEmail(String nit,String position){
		ArrayList<String> email = new ArrayList<String>();
		boolean find = false;
		for(int i = 0;i < bussiness.size() && !find;i++){
			if(bussiness.get(i).getNit().equals(nit)){
				email = bussiness.get(i).searchEmployEmail(position);	
				find = true;
			}
		}
		return email;
	}
}