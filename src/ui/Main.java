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
		String nit = "";
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
				break;
				case 4:
					System.out.println("escriba el codigo nit de la empresa de educacion que desea conocer el impuesto procultura");
				break;
				case 5:
					System.out.println("escriba el codigo nit de la empresa de educacion que desea conocer el impuesto procultura");
				break;
				case 6:
					System.out.println("escriba el codigo nit de la empresa de educacion que desea conocer el impuesto procultura");
				break;
				case 7:
					System.out.println("escriba el codigo nit de la empresa de educacion que desea conocer el impuesto procultura");
				break;
				case 8:
					System.out.println("escriba el codigo nit de la empresa de educacion que desea conocer el impuesto procultura");
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