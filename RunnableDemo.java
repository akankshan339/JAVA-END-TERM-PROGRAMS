class  Test implements Runnable
{
public void run()
{
for(int i = 1; i<=5;i++)
{
System.out.println("\t Thread Test " + i);
}
System.out.println("End of Thread Test");
}
}


public class RunnableDemo {
public static void main(String[] args) 
{
// TODO Auto-generated method stub
Test ob1 = new Test();
Test ob2 = new Test();
Thread th1 = new Thread(ob1);
Thread th2 = new Thread(ob2);

th1.start();
th2.start();
System.out.println("End of main Thread");
}
}
