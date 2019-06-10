package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

import java.util.ArrayList;

public abstract class Company{
	
	//constants
	
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
	
	/**
	* <b>Descrpition:</b> constructor of a company<br>
	* @param name is the company name <br>
	* @param nit is the unic code of a company<br>
	* @param address is the company address<br>
	* @param phone is the company phone<br>
	* @param employ is how many employs the company have<br>
	* @param price is the assents price of a company<br>
	* @param bornDate is the date the company was created<br>
	* @param type is what the company is<br>
	* @param agent is the name of the company agent<br>
	* @param floor is how many floors the company building have<br>
	*/
	
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
		int i = floor-1;
		int cont = 1;
		while(i >= 0){
			for(int j = 0;j < CUBICLES;j++){
				building[i][j] = new Cubicle("","","",cont);
				cont++;
			}
			i--;
		}
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
	
	public Cubicle[][] getBuilding(){
		return building;
	}
	public String searchEmploy(String employName, char type){
		String employExtension = "La extension del empleado es: ";
		boolean find = false;
		int column = 0;
		if(type == 'l'){
			for(int i = 0;i < building.length && !find;i++){
				if(findEmploy(employName,i,0)){
					employExtension += building[i][0].getExtension();
					find = true;
				}
				else if(i == floor-1){
					for(int j = 0;j < building[i].length && !find;j++){
						if(findEmploy(employName,i,j)){
							employExtension += building[i][j].getExtension();
							find = true;
						}
					}
				}
			}
		}
		else if(type == 'z'){
			int i = 0;
			Cubicle[][] cuadrada = new Cubicle[floor][floor];
			for( ;i < floor ;i++){
				
				cuadrada[i][column] = building[i][column];
				if(i == floor-1 && column != floor-1){
					i = 0;
					column++;
				}
			}
			int z = floor-1;
			for(int j = 0;j < cuadrada.length && !find;j++){
				if(findEmploy(employName,0,j)){
					employExtension += building[0][i].getExtension();
					find = true;
				}
				else if( findEmploy(employName,z,j)){
					employExtension += building[floor-1][i].getExtension();
					find = true;
				}
				else if(  findEmploy(employName,floor-1,j)){
					employExtension += building[floor-1][i].getExtension();
					find = true;
				}
				z--;
			}
		}
		else if(type == 'x'){
			int x = 0;
			for(int i = 0;i < floor && !find;i++){
				if(findEmploy(employName,i,x)){
					employExtension += building[i][x].getExtension();
					find = true;
				}
				x++;
			}
			x--;
			for(int j = 0;j < floor && !find;j++){
				if(findEmploy(employName,j,x)){
					employExtension += building[j][x].getExtension();
					find = true;
				}
				x--;
			}
		}
		else if(type == 'o'){
			for(int i = 0;i < CUBICLES && !find;i++){
				if(findEmploy(employName,0,i)){
					employExtension += building[0][i].getExtension();
					find = true;
				}
				else if(findEmploy(employName,floor-1,i)){
					employExtension += building[floor-1][i].getExtension();
					find = true;
				}
				else if(i < floor){
					if(findEmploy(employName,i,0)){
						employExtension += building[i][0].getExtension();
						find = true;
					}
					else if(findEmploy(employName,i,CUBICLES-1)){
						employExtension += building[i][CUBICLES-1].getExtension();
						find = true;
					}
				}
					
			}
		}
		else if(type == 'e'){
			if(floor % 2 != 0){
				int down = floor-1;
				int up = 0;
				while(up != down){
					up++;
					down--;
				}
				for(int i = 0;i < CUBICLES;i++){
					if(findEmploy(employName,0,i)){
						employExtension += building[0][i].getExtension();
						find = true;
					}
					else if(findEmploy(employName,floor-1,i)){
						employExtension += building[floor-1][i].getExtension();
						find = true;
					}
					else if(findEmploy(employName,i,0)){
						employExtension += building[i][0].getExtension();
						find = true;
					}
					else if(findEmploy(employName,up,i)){
						employExtension += building[up][i].getExtension();
						find = true;
					}
				}
			}
		}
		if(!find){
			employExtension = "No se encontro al empleado";
		}
		return employExtension;
	}
	
	public ArrayList<String> searchEmployEmail(String employPosition){
		ArrayList<String> emails = new ArrayList<String>();
		int spiral = 0;
		int limitFloorU = 0;
		int limitFloorD = floor;
		int limitCubicleR = CUBICLES;
		int limitCubicleL = 0;
		int j = 0;
		
		for(int i = 0;i < limitFloorD;i++){
			if(findEmploy(employPosition,i,0)){
						emails.add(building[i][spiral].getEmail()) ;
			}
			if(i == floor-1){
				for(;j < limitCubicleR;j++){
					if(findEmploy(employPosition,i,j)){
						emails.add(building[i][j].getEmail());
					}
				}
			}
			if(j == limitCubicleR){
				j--;
				for( ;i >= limitFloorU;i--){
					if(findEmploy(employPosition,i,j)){
						emails.add(building[i][j].getEmail());
					}
				}
			}
			if(i == limitFloorU-1){
				i++;
				for( ;j >= limitCubicleL;j--){
					if(findEmploy(employPosition,i,j)){
						emails.add(building[i][j].getEmail());
					}
				}
			}
			if(j == limitCubicleL-1){
				j+= 2;
				i++;
				limitFloorU++;
				limitFloorD--;
				limitCubicleR--;
				limitCubicleL++;
				
			}
			
		}
		return emails;
	}
	public boolean findEmploy(String name, int row, int column){
		boolean find = false;
		if(building[row][column].getName().equals(name) || building[row][column].getPosition().equals(name)){
					find = true;
		}
		return find;
	}
	
	public String toString(){
	return "El nombre de la empresa es: "+name+" con codigo nit "+nit+" ubicado en "+address+" y cuyo numero de telefono es "+phone+
			"que cuenta con un total de "+totalEmploy+" empleados "+"y es una empresa de tipo "+type;
	}
	
	public void setCubicleEmploy(String name, String position, String email,int row, int column){
		building[row][column].setName(name);
		building[row][column].setPosition(position);
		building[row][column].setEmail(email);
	}
}