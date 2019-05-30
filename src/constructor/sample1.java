package constructor;

public class sample1 {
	int  value1;
	   int  value2;
	    sample1(){
	      value1 = 1;
	      value2 = 2;
	      System.out.println("Inside 1st Parent Constructor");
	   }
	   sample1(int a){
	      value1 = a;
	      System.out.println("Inside 2nd Parent Constructor");
	   }
	  public void display(){
	     System.out.println("Value1 === "+value1);
	     System.out.println("Value2 === "+value2);
	  }
	  public static void main(String args[]){
	     sampleChild d1 = new sampleChild();
	     d1.display();
	  }
	}
	class sampleChild extends sample1{
	    int value3;
	    int value4;
	    sampleChild(){
	    //super(5);
	     value3 = 3;
	     value4 = 4;
	    System.out.println("Inside the Constructor of Child");
	    }
	    public void display(){
	      System.out.println("Value1 === "+value1);
	      System.out.println("Value2 === "+value2);
	      System.out.println("Value1 === "+value3);
	      System.out.println("Value2 === "+value4);
	   }

}
