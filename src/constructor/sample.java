package constructor;

public class sample {
	int  value1;
    int  value2;
    sample(){
       value1 = 10;
       value2 = 20;
       System.out.println("Inside Constructor");
   }

   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
  }

 public static void main(String args[]){
     sample d1 = new sample();
    d1.display();
}

}
