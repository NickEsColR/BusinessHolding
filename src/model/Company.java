package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

java.util.ArrayList;

public abstract class Company{
	
	//constants
	
	public final static String MANUFACTURING = "Manufacturera";
	public final static String EDUCATION = "Educacion";
	public final static String TECNOLOGY = "Tecnologia";
	public final static String DRUG = "Medicamentos";
	public final static String FOOD = "Alimentos";
	public final static String PUBLIC_SERVICE = "Servicios publicos";
	public final static int CUBICLES = 20;
	
	//attributes
	
	private String name;
	private String nit;
	private String address;
	private String phone;
	private int totalEmploy;
	private double assetsPrice;
	private int[] bornDate;
	private String type;
	private String agentName;
	private int floor;
	
	//relations
	
	private Cubicle[][] building;
	//methods
	
	public Company(String name, String nit, String address, String phone, int employ, 
	double price, int[] bornDate, String type, String agent, int floor){
		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		totalEmploy = employ;
		assetsPrice = price;
		this.bornDate = bornDate;
		agentName = agent;
		this.floor = floor;
		building = new Cubicle[floor][CUBICLES];
	}
	
	public String getName(){
		return name;
	}
	
	public String getNit(){
		return nit;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public int getTotalEmploy(){
		return totalEmploy;
	}
	
	public double getAssetsPrice(){
		return assetsPrice;
	}
	
	public int[] getBornDate(){
		return bornDate;
	}
	
	public String getType(){
		return type;
	}
	
	public String getAgentName(){
		return agentName;
	} 
	
	public int getFloor(){
		return floor;
	}
	
	public String searchEmploy(String employName, char type){
		String employExtension = "no se encontro el empleado";
		boolean find = false;
		if(type == 'l'){
			for(int i = 0;i < building.length && !find;i++){
				if(findEmploy(employName,i,0)){
					employExtension = building[i][0].getEmployExtension();
					find = true;
				}
				else if(i == building.lenght-1){
					for(int j = 0;j < building[i].length && !find;j++){
						if(findEmploy(employName,i,j)){
							employExtension = building[i][j].getEmployExtension();
							find = true;
						}
					}
				}
			}
		}
		if(type == 'z'){
			for(int i = 0;i < building[0].lenght && !find;i++){
				if(findEmploy(employName,0,i)){
					employExtension = building[0][i];
					find = true;
				}
				else if(  findEmploy(employName,building.lenght-1,i)){
					employExtension = building[lenght-1][i];
					find = true;
				}
				else if(i == building[0].lenght-1){
					int z = building.lenght-1;
					while(i => 0;)
				}
			}
		}
		if(type == 'x'){
			int x = 0;
			for(int i = 0;i < building.lenght && !find;i++){
				if(findEmploy(employName,i,x)){
					employExtension = building[i][x].getEmployExtension();
					find = true;
				}
				x++;
			}
			x--;
			for(int j = 0;j < building.lenght && !find;j++){
				if(findEmploy(employName,j,x)){
					employExtension = building[j][x].getEmployExtension();
					find = true;
				}
				x--;
			}
		}
		if(type == 'o'){
			for(int i = 0;i < CUBICLES && !find;i++){
				if(findEmploy(employName,0,i)){
					employExtension = building[0][i].getEmployExtension();
					find = true;
				}
				else if(findEmploy(employName,floor-1,i)){
					employExtension = building[floor-1][i].getEmployExtension();
					find = true;
				}
				else if(i < building.lenght){
					if(findEmploy(employName,i,0)){
						employExtension = building[i][0].getEmployExtension();
						find = true;
					}
					else if(findEmploy(employName,i,CUBICLES-1)){
						employExtension = building[i][CUBICLES-1].getEmployExtension();
						find = true;
					}
				}
					
			}
		}
		if(type == 'e'){
			
		}
		return employExtension;
	}
	
	public ArrayList<String> searchEmployEmail(){
		ArrayList<String> emails = new ArrayList<String>();
		boolean find = false;
		int spiral = 0;
		for(int i = 0;i < CUBICLES && !find;i++){
			if(i < floor){
				
			}
		}
		return emails;
	}
	public boolean findEmploy(String name, int row, int column){
		boolean find = false;
		if(building[row][column].getEmployName().equals(name) || building[row][column].getEmployPosition().equals(name)){
					find = true;
		}
		return find;
	}
	
}