package ui;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* LABORATORIO 5 HOLDING 
* 01/06/2019
*/

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class Main{

	//attributes 
	
	private Scanner board;
	
	//relations
	
	private Holding holding;
	
	//methods
	
	public final static void main(String[]args){
		Main m = new Main();
	}
	
	public Main(){
		board = new Scanner(System.in);
		holding = new Holding();
		int election = 0;
		
		int[]date = new int[3];
		date[0] = 18;
		date[1] = 5;
		date[2] = 1935;
		Company c = new PublicService("EmCali","2358901","Calle 10 45-32","4597917",3,200000,date,holding.PUBLIC_SERVICE, "Cristian Muslera", 3,3.2,'e', 30,10);
		holding.addBussiness(c);
		date[0] = 13;
		date[1] = 10;
		date[2] = 2010;
		int[]date2 = new int[3];
		date2[0] = 13;
		date2[1] = 10;
		date2[2] = 2019;
		c = new Food("Corral", "2358312","av 4 69-12","2091743", 2,100000,date,holding.FOOD,"Harry Parker",3,"56" ,true, date2,Food.MANUFACTURED_SELL);
		holding.addBussiness(c);
		String name = "";
		String nit = "";
		String address = "";
		String phone = "";
		int employ = 0;
		double price = 0;
		String type = "";
		String agentName = "";
		int floor = 0;
		String sanitary = "";
		boolean validation = false;
		String modality = "";
		double satisfaction = 0;
		char typeChar = ' ';
		int suscriptorsOrStudents = 0;
		int suscriptorsOrStudents1And2 = 0;
		String rectorName = "";
		int ranking = 0;
		int year = 0;
		String register = "";
		
	
		while(election != 10){
			showMenu();
			election = board.nextInt();
			board.nextLine();
			switch(election){
				case 1:
					System.out.println("escriba el codigo nit de la empresa de educacion que desea conocer el impuesto procultura");
					showBussiness();
					nit =  board.nextLine();
					System.out.println(holding.proCultureIvaEducation(nit));
				break;
				case 2:
					System.out.println("escriba el codigo nit de la empresa de fabricacion que desea conocer la cantidad de arboles a plantar");
					showBussiness();
					nit =  board.nextLine();
					System.out.println(holding.waterXTree(nit));
				break;
				case 3:
					System.out.println("escriba el numero del tipo de empresa que desea añadir");
					System.out.println("1. "+holding.MANUFACTURING);
					System.out.println("2. "+holding.EDUCATION);
					System.out.println("3. "+holding.TECNOLOGY);
					System.out.println("4. "+holding.DRUG);
					System.out.println("5. "+holding.FOOD);
					System.out.println("6. "+holding.PUBLIC_SERVICE);
					int opt = board.nextInt();
					board.nextLine();
					System.out.println("escriba el nombre de la empresa");
					name = board.nextLine();
					System.out.println("escriba el codigo nit de la empresa");
					nit = board.nextLine();
					System.out.println("escriba la direccion  de la empresa");
					address = board.nextLine();
					System.out.println("escriba el telefono de la empresa");
					phone = board.nextLine();
					System.out.println("escriba el total de empleados de la empresa");
					employ = board.nextInt();
					board.nextLine();
					System.out.println("escriba el valor de los activos de la empresa");
					price = board.nextInt();
					board.nextLine();
					System.out.println("escriba el dia de creacion de la empresa");
					date[0] = board.nextInt();
					board.nextLine();
					System.out.println("escriba el mes de creacion de la empresa");
					date[1] = board.nextInt();
					board.nextLine();
					System.out.println("escriba el año de creacion de la empresa");
					date[2] = board.nextInt();
					board.nextLine();
					type = holding.MANUFACTURING;
					System.out.println("escriba el nombre del agente de la empresa");
					agentName = board.nextLine();
					System.out.println("escriba el numero de pisos de la empresa");
					floor = board.nextInt();
					board.nextLine();
					switch(opt){
						case 1:
							c = new Manufacturing(name,nit,address,phone,employ,price,date,type,agentName,floor);
							holding.addBussiness(c);
						break;
						case 2:
							System.out.println("escriba los puntos de satisfaccion");
							satisfaction = board.nextInt();
							board.nextLine();
							System.out.println("escriba el numero de registro de la empresa");
							register = board.nextLine();
							
							System.out.println("escriba los años de acreitacion de la empresa");
							year = board.nextInt();
							board.nextLine();
							System.out.println("escriba el puesto en el ranking saber11 o saberPro de la empresa");
							ranking = board.nextInt();
							board.nextLine();
							System.out.println("escriba el nombre del rector de la empresa");
							rectorName = board.nextLine();
							System.out.println("escriba 1 si la empresa es universidad y 2 si es colegio");
							typeChar = board.nextInt() == 1 ? 'u' : 's';
							board.nextLine();
							System.out.println("escriba el numero de estudiantes estrato 1 y 2 de la empresa");
							suscriptorsOrStudents1And2 = board.nextInt();
							board.nextLine();
							System.out.println("escriba el numero de estudiantes de la empresa");
							suscriptorsOrStudents = board.nextInt();
							board.nextLine();
							c = new Education(name,nit,address,phone,employ,price,date,type,agentName,floor,satisfaction,register,year,ranking,rectorName,typeChar,suscriptorsOrStudents1And2,suscriptorsOrStudents);
							holding.addBussiness(c);
						break;
						case 3:
							System.out.println("escriba los puntos de satisfaccion");
							satisfaction = board.nextInt();
							board.nextLine();
							ArrayList<String> services = new ArrayList<String>();
							System.out.println("escriba 1 si la empresa presta ese servicio y 2 en caso contrario");	
							System.out.println(Tecnology.CONSULT);
							if(board.nextInt() == 1){
								services.add(Tecnology.CONSULT);
							}
							board.nextLine();
							System.out.println(Tecnology.TRAINING);
							if(board.nextInt() == 1){
								services.add(Tecnology.TRAINING);
							}
							board.nextLine();
							System.out.println(Tecnology.SOFTWARE);
							if(board.nextInt() == 1){
								services.add(Tecnology.SOFTWARE);
							}
							board.nextLine();
							System.out.println(Tecnology.INFRAESTRUCTURE);
							if(board.nextInt() == 1){
								services.add(Tecnology.INFRAESTRUCTURE);
							}
							board.nextLine();
							System.out.println(Tecnology.SOFTWARE_SERVICE);
							if(board.nextInt() == 1){
								services.add(Tecnology.SOFTWARE_SERVICE);
							}
							board.nextLine();
							System.out.println(Tecnology.PLATFORM);
							if(board.nextInt() == 1){
								services.add(Tecnology.PLATFORM);
							}
							board.nextLine();
							System.out.println("Escriba cuanta energia ha consumido");
							int energy = board.nextInt();
							board.nextLine();
							c = new Tecnology(name,nit,address,phone,employ,price,date,type,agentName,floor,satisfaction,services,energy);
							holding.addBussiness(c);
						break;
						case 4:
							System.out.println("escriba el numero sanitario de la empresa");
							sanitary = board.nextLine();
							System.out.println("escriba 1 si esta vigente 2 si no de la empresa");
							validation = board.nextInt() == 1?true : false;
							System.out.println("escriba el dia de expiracion sanitario de la empresa");
							date2[0] = board.nextInt();
							board.nextLine();
							System.out.println("escriba el mes de expiracion sanitario de la empresa");
							date2[1] = board.nextInt();
							board.nextLine();
							System.out.println("escriba el año de expiracion sanitario de la empresa");
							date2[2] = board.nextInt();
							board.nextLine();
							System.out.println("escriba 1 si fabrica y exporta, 2 si fabrica y vende o 3 si importa y vende");
							int e = board.nextInt();
							board.nextLine();
							switch(e){
								case 1:
									modality = Drug.MANUFACTURED_EXPORT;
								break;
								case 2:
									modality = Drug.MANUFACTURED_SELL;
								break;
								case 3:
									modality = Drug.IMPORT_SELL;
								break;
							}
							c = new Drug(name,nit,address,phone,employ,price,date,type,agentName,floor,sanitary,validation,date2,modality);
							holding.addBussiness(c);
						break;
						case 5:
							System.out.println("escriba el numero sanitario de la empresa");
							sanitary = board.nextLine();
							System.out.println("escriba 1 si esta vigente 2 si no de la empresa");
							int m = board.nextInt();
							board.nextLine();
							if(m == 1){
								validation = true;
							}
							else if(m == 2){
								validation = false;
							}
							System.out.println("escriba el dia de expiracion sanitario de la empresa");
							date2[0] = board.nextInt();
							board.nextLine();
							System.out.println("escriba el mes de expiracion sanitario de la empresa");
							date2[1] = board.nextInt();
							board.nextLine();
							System.out.println("escriba el año de expiracion sanitario de la empresa");
							date2[2] = board.nextInt();
							board.nextLine();
							System.out.println("escriba 1 si fabrica y exporta, 2 si fabrica y vende o 3 si importa y vende");
							int p = board.nextInt();
							board.nextLine();
							switch(p){
								case 1:
									modality = Food.MANUFACTURED_EXPORT;
								break;
								case 2:
									modality = Food.MANUFACTURED_SELL;
								break;
								case 3:
									modality = Food.IMPORT_SELL;
								break;
							}
							c = new Food(name,nit,address,phone,employ,price,date,type,agentName,floor,sanitary,validation,date2,modality);
							holding.addBussiness(c);
						break;
						case 6:
							System.out.println("escriba los puntos de satisfaccion");
							satisfaction = board.nextInt();
							board.nextLine();
							System.out.println("escriba 1 si la empresa es de alcantarillado, 2 si es de energia o 3 si es de acueducto");
							int o = board.nextInt();
							board.nextLine();
							switch(o){
								case 1:
									typeChar = PublicService.SEWERAGE;
								break;
								case 2:
									typeChar = PublicService.ENERGY;
								break;
								case 3:
									typeChar = PublicService.AQUEDUCT;
								break;
							}
							System.out.println("escriba los suscriptores de la empresa");
							suscriptorsOrStudents = board.nextInt();
							board.nextLine();
							System.out.println("escriba los suscriptores de estrato 1 y 2 ");
							suscriptorsOrStudents1And2 = board.nextInt();
							board.nextLine();
							c = new PublicService(name,nit,address,phone,employ,price,date,type,agentName,floor,satisfaction,typeChar,suscriptorsOrStudents,suscriptorsOrStudents1And2);
							holding.addBussiness(c);
						break;
					}
				break;
				case 4:
					showBussiness();
				break;
				case 5:
					System.out.println("escriba el codigo nit de la empresa de servicios que desea hacer la encuesta");
					showBussiness();
					nit = board.nextLine();
					System.out.println("escriba a cuantas personas desea encuestar entre 10 y 50");
					int encuestas = board.nextInt();
					board.nextLine();
					int points = 0;
					System.out.println("escriba a del 1 al 5 como se siente con el servicio prestado");
					if(encuestas > 9 && encuestas < 51){
						for(int i = 0;i < encuestas;i++){
							System.out.println(holding.quest1Service(nit));
							points += board.nextInt();
							System.out.println(holding.quest2Service(nit));
							points += board.nextInt();
							System.out.println(holding.quest3Service(nit));
							points += board.nextInt();
						}
						holding.setSatisfactionService(nit,points,encuestas);
					}
					else{
						System.out.println("escriba un numero entre 10 y 50");
					}
				
				break;
				case 6:
					System.out.println("escriba el codigo nit de la empresa de servicio publico que desea conocer su impuesto procultura");
					showBussiness();
					nit =  board.nextLine();
					System.out.println(holding.proCultureIvaPublicService(nit));
				break;
				case 7:
					System.out.println("escriba el codigo nit de la empresa de tecnologia que desea conocer la cantidad de arboles a plantar");
					showBussiness();
					nit =  board.nextLine();
					System.out.println(holding.kilowattsXTree(nit));
				break;
				case 8:
					System.out.println("escriba el codigo nit de la empresa que desea conocer la extension de su empleado");
					showBussiness();
					nit = board.nextLine();
					System.out.println("escriba el nombre del empleado");
					name = board.nextLine();
					System.out.println("escriba la letra segun el tipo de busqueda que desea realizar");
					System.out.println("las letras posibles son: l , z , x , o , e");
					typeChar = board.next().charAt(0);
					board.nextLine();
					System.out.println(holding.searchEmploy(nit,name,typeChar));
				break;
				case 9: 
					System.out.println("escriba el codigo nit de la empresa de educacion que desea conocer el impuesto procultura");
				break;
				case 10:
					System.out.println("**********************************************************************");
					System.out.println("GRACIAS POR USAR EL PROGRAMA");
					System.out.println("**********************************************************************");
				break;
			}
		}
	}
	
	public void showMenu(){
		System.out.println("Escoja la opcion que desea");
		System.out.println("1. Conocer impuesto procultura de un servicio educativo");
		System.out.println("2. Conocer la cantidad de arboles a plantar de una empresa de fabricacion");
		System.out.println("3. Registrar una nueva empresa");
		System.out.println("4. Listar todas las empresas existentes");
		System.out.println("5. Realizar encuesta a una empresa de servicios");
		System.out.println("6. Conocer impuesto procultura de un servicio publico");
		System.out.println("7. Conocer la cantidad de arboles a plantar de una empresa de tecnologia");
		System.out.println("8. Buscar la extension del empleado de una empresa especifica");
		System.out.println("9. Buscar todos los emails de los empleados de una empresa especifica");
		System.out.println("10. Salir del programa");
	}
	
	public void showBussiness(){
		ArrayList<Company> bussiness = new ArrayList<Company>();
		bussiness = holding.getBussiness();
		for(int i = 0;i < bussiness.size();i++){
			System.out.println(bussiness.get(i));
			System.out.println(" ");
		}
	}
	
	
}