import java.util.*;
public class constructor_chaining {
    
    int id;
    String name, branch, city, university;
    constructor_chaining()
    {
        System.out.println("Default Constructor");
        
    }
    constructor_chaining(int id)
    {
        this();
        this.id =id;
        System.out.println("Constructor vaing 1 parameter id :" +id);
        
    }
    constructor_chaining(int id, String name)
    {
        this(id);
        this.name = name;
        System.out.println("Constructor vaing 2 parameter id and name :" +id + " " +name);
        
    }
   
    constructor_chaining(int id, String name, String branch)
    {
        this(id, name);
        this.branch = branch;
        System.out.println("Constructor vaing 3 parameter id, name and branch:" +id + " " +name +" " +branch);
        
    }
    constructor_chaining(int id, String name, String branch, String city)
    {
        this(id, name, branch);
        this.city = city;
        System.out.println("Constructor vaing 4 parameter id, name, branch and city:" +id +" " +name +" " +branch + " " +city);
        
    }
    constructor_chaining(int id, String name, String branch, String city, String university)
    {
        this(id, name, branch, city);
        this.university = university;
        System.out.println("Constructor vaing 5 parameter id, name, branch, city and university:" +id + " " +name + " " +branch + " " +city + " " +university);

    }

    public void display()
    {
        System.out.print("ID :" + id +"\t");
        System.out.print("NAME :" + name + "\t");
        System.out.print("BRANCH :" + branch + "\t");
        System.out.print("CITY :" + city + "\t");
        System.out.println("UNIVERSITY :" + university );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
       
        System.out.println(" Enter id  name  branch  city and university");
        int id = sc.nextInt();
        sc.nextLine();              // Consume newline
        String name = sc.nextLine();
        String branch = sc.nextLine();
        String city = sc.nextLine();
        String university = sc.nextLine();

        constructor_chaining c1 = new constructor_chaining(id, name, branch, city, university);
        System.out.println("Student 1: details");
        c1.display();

        constructor_chaining c2 = new constructor_chaining(id, name, branch, city);
        System.out.println("Student 2: details");
        c2.display();

        constructor_chaining c3 = new constructor_chaining(id, name, branch, city);
        System.out.println("Student 3: details");
        c3.display();

        sc.close();
    }
}