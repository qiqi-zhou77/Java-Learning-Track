public class Main {
    public static void main(String[] args){

// for-each
        String[] animals = {"cat","dog","horse","bird"};
        
        // for every index i in our string array: animal
        for(String i: animals){
            System.out.println(i);
        }

// call the method in the main
            String  name = "Bro";
            int age = 12;

            hello(name,age);
            hello(name,age);
            hello(name,age);

        }


// Method : just like function in python
        static void hello(String calling,int old){
            System.out.println("piss" +  calling + old);
        }

}

///////
public class Baby {
    public static void Baby(String[] args){

        int x = 3;
        int y =4;
        int z = addition(x,y);
    }


    static int addition(int x, int y){
        int z = x +y;
        return z;
    }

}
//////overloaded method
//// methods that share the same name but have different parameters
//// method name + parameters = method signatures

public class Jira{

    public static void Jira(String[] args){

        int k = add (1,2);
        int p = add(3,4,5);
        int z = add(1,2,3,4);
        double f = add(1.2,3.4);

    }

    static int add (int a, int b){
        return a+b;
    }

    static int add (int a, int b, int c){
        return a+b +c;
    }
    
     static int add (int a, int b, int c, int d){
        return a+b + c +d;
    }

    static double add (double a, double b){
        return a+b;
    }

    static double add (double a, double b,double c){
        return a+b+c;
    }
}


/////formated printing --printf
System.out.printf("This is duck %d", 123);//int
System.out.printf("This is duck %b", true);//bolean
System.out.printf("This is duck %c", '@');//charactre
System.out.printf("This is duck %s", "Heell");//String
System.out.printf("This is duck %f", 123.123);//double

//width -- minimum number of characters ot be written as output
System.out.printf("This is duck %10d", 123);//int
System.out.printf("This is duck %10s", "Heell");//String
//precision
System.out.printf("This is duck %.2f", 123.123);//double

//flags
System.out.printf("This is duck %,f", 123.123);//double
// -: left-justify
// +: output a plus or minus sign for a numeric
// 0: numeric values are zero-padded
//,: comma grouping separator if numebrs > 1000


//final keywords
 final double PI = 3.1415;
 //you cannot change the amount of pi 

///OOP
 // object: an instance of a class that may contains attributes and methods
 // example: phone, desk, computer,coffee cups


 //// this should be in a separate java file
 public class Car{

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    void drive(){
        System.out.println("Drive intoxcated.");
    }

    void brake(){
        System.out.println("You stop the car ");
    }
 }

 /// Then back to the main java file and construct
 public class Main{
    public static void main (String[] args){

        Car myCar = new Car();
        Car myDidi = new Car();

        System.out.println(myCar.model); // Corvette
        System.out.println(myDidi.make); 
        myCar.drive();
        myCar.brake();
      
    }

 }

 /// Constructors
 ///  a special method that is called when an object is initiated (created)
 ///  In Human Java File
 // Can assign different attributes to each objects

public class Human{

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name =name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + "is eating");
    }
    void drinking(){
        System.out.println(this.name +" is drinking");
    }
}

 // In Main Class
 public class Main{

    public static void main(String[] args){

        Human homo = new Human("Rick",65,70);
        Human sapiens = new Human("Morty",65,70);
        homo.eat();
        sapiens.drinking();
    
    }
 }


 ////Local and global varibales
 //import java.util.Random;


 // local == declared inside a method visible only to that method
 // global == declared outside a method, but within a class visible to all parts of th
 public class DiceRoller{

    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random,number);
    }
    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
 }

  public class DiceRoller{

    Random random;
    int number;

    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll();
    }
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
 }

public class Main {
    public static void main(String[]args){

    DiceRoller diceRoller = new DiceRoller();

    }
}

/////overloaded constructors
/// multiple constructors within a class with the same name but have different parameters
/// name  + parameters = signature

public class Main{
    public static void main(String[] args){

        Pizza pizza = new Pizza("Thicc crust","Tomato","Mozzerella","Pepperoni");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


        Pizza pizza = new Pizza("Thicc crust","Tomato","Mozzerella");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);

    }
}

public class Pizza{

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread,String sauce,String cheese,String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }

    Pizza(String bread,String sauce,String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
   }
}

///toString method
public class Car{
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2023;

    public String toString(){
        return make + "\n" +model +"\n" +color +"\n" + year;
    }

}

public class Main{
    public static void main (String[] args){
        Car car = new Car();
        //car.toString() -- the address of the obj
        System.out.println(car.toString());
        System.out.println(car);
    }
}


//////array of objects
public class Main{
        public static void main(String[] args){

            Food food1 = new Food("pizza");
            Food food2 = new Food("burger");
            Food food3 = new Food("hotdog");

            Food[] refer = new Food[3];
            refer[0] = food1;
            refer[1] = food2;
            refer[2] = food3;

            //306-310
            Food[] refer = {food1, food2, food3};

            System.out.println(refer[0].name);

        }

}


public class Food{
    String name;
    Food(String name){
        this.name =name;  
    }
}

/////object passing as parameters
public class Car{
    String name;
    Car(String name){
        this.name =name;
    }
}

public class Garage{
    void park(Car car){
        System.out.println("The" + car.name);

    }
}

public class Main{
    public static void main(String[] args){

        Garage gaga = new Garage();
        Car Pipi = new Car("BMW");
        Car Titi = new Car("Tesla");
        gaga.park(Pipi);
        gaga.park(Titi);
}


///Static keyword
// a single copy of var/method is created and shared
// the class owns the static member

public class Friends{
    String name;
    static int numberoffri;
    
    Friend(String name){
        this.name =name;
        numberoffri++;
    }

    static void displayfri(){
        System.out.println("NO"+ numberoffri);
    }

}

public class Main{
    public static void main(String[] args){
        Friends f1 = new Friends("SP");
        Friends f2 = new Friends("ST");
        Friends f3 = new Friends("SJ");

        System.out.println(Friends.numberoffri); //3
        Friends.displayfri();//3   
}


///Inheritance
// The process there one class acquires the attribute and methods of another
public class Vehicle{
    double speed;
    void go(){
        System.out.println("Moving");
    }

    void stop(){
        System.out.println("Stopping");
    }

}


public class Car extends Vehicle{
    int wheels =4;
    int doors =4;

}

public class Bike extends Vehicle{
    int wheels =2;
    int pedals =2;
  
}


public class Main{
    public static void main(String[] args){

        Car car = new Car();
        car.go();
        Bike bike = new Bike();
        bike.stop();
        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }
}

////method overiding
///declaring a method in sub class which is already present in the parent class
///done so that the child class give its own implementation
public class Tier{

    void speak(){
        System.out.println("peep");

    }
}
public class Dog extends Tier{
    @overiding
    void speak(){
        System.out.println("Bark");

}

public class Main{
    public static void main(String[] args){
        Dog dogo = new Dog();
        dogo.speak();//bark
        Tier ani = new Tier();
        ani.speak();//peep

    }

///Super keyword

public class Main{
    public static void main(String[] args){
        Hero hero1 = new Hero("abtman",42,"$$$");
        System.out.println(hero1.toString());
    }

public class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.ahe =age;
    }

    public String toString(){
        return this.name + this.age;
    }
}


public class Hero extends Person{
    String power;
    Hero(String name,int age,String power){
        super(name,age);
        this.power = power;
    }
    public String toString(){
        return super.toString() + this.power;
    }
}

//Abstract
// abstract classes cannot be instantiated, but they can have a subclass
// abstract methods are declared without an implementation
public class Main{
    public static void main(String[] args){

        //Vehical vehicle = new Vehicle();
        Car car = new Car();
    }


public abstract class Vehicle{
    abstract void go();
}

public class Car extends Vehicle{
    @Overiding
    void go(){
            System.out.println("Diving");
    }

}

//access modifier:public protected private default

public class C{
        String defaultMessage = "This is the default";
        public String publicmessgae ="beep";
        private String privatemessage ="ccee";
        protected String protectedmessage ="pp";
        
}

//Encapuslattion
// attributes of a class will be hidden or private
// can be accessed only thru methods(getters & setters)

public class Main{
    public static void main(String[] args){

    Car popo = new Car("Testla","T3",1234);
    System.out.println(car.getModel());

    car.setYear(2022);
    

    }

public class Car{
    private String make;
    private String model;
    private int year;

    Car(String make,String make,String make){
        //this.make = make;
        //this.model = model;
        //this.year =year;
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake(){
        return make;
    }


    public String getModel(){
        return model;
    }


    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make =make;
    }

    public void setModel(String model){
        this.model =model;
    }

    public void setYear(int year){
        this.year =year;
    }

}