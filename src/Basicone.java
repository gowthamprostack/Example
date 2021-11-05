



public class Basicone {
	 void m(Basicone obj){  
		  System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basicone s1 = new Basicone();  
		  s1.p();  
		
	}

}
