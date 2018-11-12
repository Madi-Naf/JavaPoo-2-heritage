class Hangar{
	public static void main(String[] args) {
		Car bentley = new Car("Bentley Continental GT sport 24", 336);
		Boat vogueMerry = new Boat("Vogue Merry", 75);

		System.out.println(bentley.doStuff() );
		System.out.println(vogueMerry.doStuff() );
	}
}