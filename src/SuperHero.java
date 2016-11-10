
public class SuperHero {
String name;
String superpower;
public SuperHero (String name, String superpower){
	this.name=name;
	this.superpower=superpower;
	
}
public String getname(){
return name;
}
public void setname(String name){
	this.name=name;
}
public String getsuperpower(){
return superpower;
}
public void setsuperhero(String superhero){
	this.superpower=superhero;
}
public String toString(){
	return name +" has mad " + superpower +" skills! ";
}
public static void main(String[] args) {
	SuperHero superman = new SuperHero("Superman","flying");
	System.out.println(superman);
	
	SuperHero Flash = new SuperHero("Flash","speed");
	System.out.println(Flash);
	
	SuperHero 
}
}
