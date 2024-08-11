
//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike{  
    Bike()
    {
    System.out.println("bike is created");
    }  

    abstract void run(); 

    void changeGear()
    {
        System.out.println("gear changed");
    }

  }  

 //Creating a Child class which inherits Abstract class  
  class Honda extends Bike
  {  
  void run()
  {
    System.out.println("Honada running safely..");
    }  
  }

  class Tata extends Bike
  {  
  void run()
  {
    System.out.println("Tata running safely..");
    }  
  }
  
  
 //Creating a Test class which calls abstract and non-abstract methods  
  class Abstract_Classes{  
  public static void main(String args[]){  
   Bike ob1 = new Honda();  
   ob1.run();
   
   Bike ob2 = new Tata();  
   ob2.run();

   ob1.changeGear();  
  }  
 }  