//	 Je fais hérité la class Car la class abtraite Vehicle
class Car extends Vehicle{

	public Car(String brand, int kilometers) {  
	//	super() Permet d'utiliser le constructeur parent comme il a été definie
        super(brand, kilometers);  
    }

    // Implémentation d'une méthode abstraite
    @Override  
    /*	L'annotation @Override n'est pas obligatoire,
     	elle indique au développeur que la méthode est héritée et modifiée.
     	On appelle "polymorphisme" le fait de redéfinir une méthode héritée.
     */
    public String doStuff() {  
        return "Je suis une " + this.getBrand() + "	et je fais vroum vroum vroooooom vroum!";  
    }
}