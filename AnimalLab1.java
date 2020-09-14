package Animal;

public class AnimalLab1 {

	
	private static String name;

    AnimalLab1(String name){
	
  	 AnimalLab1.name = "Buster";}

	
	public static String getName() {
		return name;       // "la in detta i koden för o testa om den failar" --> + "break" ;
		
	}
	
	public void setName(String name) {
		AnimalLab1.name = name;
	}
	
}
   
  
 
