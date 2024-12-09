public class India{

  public State(String name){
   System.out.println("State Name"+ name);
}
  public State(String name,int length){
   System.out.println("State Name"+ name + " " +"Length:"+length);
}
 public State(String name,int length, String captial){
   System.out.println("State Name"+ name + " " +"Length:"+length+ " " + "Captial:"+captial );
}
public static void main(String args[]){
     
	 India.state("Karnataka");
	 India.state("Karnataka",233);
	  India.state("Karnataka",233,"New Dehli");

}
}