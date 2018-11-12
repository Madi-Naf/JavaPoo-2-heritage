/*	Une classe abstraite ne peut pas avoir d'instance,
 	il est donc impossible de créer un objet Vehicle.
	En revanche une class abstraite permet de regrouper
	des comportements qui seront hérité par d'autre class.
*/
public abstract class Vehicle{

	//	attributs
	private String brand;
	private int kilometers;

	//	Constructeurs
	public Vehicle(String brand, int kilometers){
		this.brand = brand;
		this.kilometers = kilometers;
	} 

	//	Getter brang attribut
	public String getBrand(){
		return this.brand;
	}

	//	Setter brand attribut
	public void setBrand(String newBrand){
		this.brand = newBrand;
	}

	//	Getter kilometers attribut
	public int getKilometers(){
		return this.kilometers;
	}

	//	Setter kilometers attribut
	public void setKilometers(int newKilometers){
		this.kilometers = newKilometers;
	}

	/*	doStuff() est une methode abstraite.
		Une méthode abstraite est une méthode qui na pas,
		d'implémentation, c'est à dire une méthode qui aura
		le ventre vide (pas de corps).
	*/	
	public abstract String doStuff();
}