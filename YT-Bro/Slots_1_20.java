import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
            System.out.print("Popp");
    }
}

//Datatypes
// declaration + assigment = initialization
 public class Main{

    public static void main(String[] args){
        int x =123;
        long y =12398745L;
        float z = 3.1234f;
        boolean f = false;
        char symbol = '@';
        String name = "Bro" ;


        System.out.println(x);
    }

// swap var
    public static void main(String[] args){
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp =x;
        x =y;
        y = temp;

        System.out.println("x: " + x);

    }


// User input
    //import java.util.Scanner
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you ? ");
        int age = scanner.nextInt();
        

    }


//Expressions
// operands + operators
    public static void main (String[] args){
        int friend = 10;
        friend = friend /2;
        System.out.println(friend);


        double donots = 11;
        donots = (double)donots /3;

    }

// GUI
    //import javax.swing.JOptionPane;
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter you name: ");
        JOptionPane.showMessageDialog(null,"Hello "+ name);

    }
    
//Math

    double x = 3.14;

    double y = -10;
    double z = Math.min(x,y);
    //min max abs sqrt power ceil floor

//Generate Random Values

// import java.util.Random
    Random random = new Random();

    int x= random.nextInt(6);
    double y = random.nextDouble();
    boolean z = random.nextBoolean();



// if statement

    int age = 18;

    if (age > 18){
        System.out.println("You Loser ");
    }
    else if (age >75){

    }
    else{
        System.out.println("Loser zwei");

    }


//switch
    String day ="Friday";
    switch(day){
        case "Sunday" : System.out.println("It is sunday");
        break;
        case "OO" : System.out.println("It is OO");
        break;
        default: System.out.println("not a day");

    }

//logical expressions
// && || !

    int k = 12;
    int l = 13;
    if ((!k==12) && (!l==13)){

    }


// while loop

public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    String name ="";
    while (name.isBlank()){
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
    }

    // do
    do{
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
    }while(name.isBlank());

    System.out.println("Hello" + name)}


//for loop

for (int i = 10;i >= 0; i--){
    System.out.println(i);
}

// Nested Loop

int rows = 13;
int cols = 15;

for(int i =1; i <=rows; i++){
    System.out.println("OK");
    for (int j =1; j <= cols; j++){
        System.out.println("OKDO");
    }
}

// Arrays -- store multiple values in a single variable
String[] cars = {"Camero","Corvette","Tesla"};
cars[0] = "Mustang";
System.out.println(cars[3]);


String[] carrs = new String[3];

carrs[0] ="Camero";
carrs[1] ="Corvette";
carrs[2]="Tesla";

for (int i =0; i <carrs.length; i++){
    System.out.println(carrs[i]);
}


//2D Arrays
String[][] anos = new String [3][3];
anos[0][0] = "PIPI";
anos[0][1] = "PIPI";
anos[0][2] = "PIPI";
anos[1][0] = "PIPI";
anos[1][1] = "PIPI";

for (int i =0; i<anos.length;i ++){
    System.out.println();
    for (int j =0; j< anos.length, j++){
        System.out.print(anos[i][j]);
    }
}


// 2D array can also be written as
String [][] anos = {{"pipi-1","pipi-2","pipi-3"},
                    {"pipi-1","pipi-2","pipi-3"},
                    {"pipi-1","pipi-2","pipi-3"}};



// String method

String name = "Bro";
boolean result = name.equals("Bro");
boolean result = name.equalsIgnoreCase("bro");
char result = name.charAt(0);
int result = name.indexOf('o');
boolean result = name.isEmpty();
String result = name.toUpperCase();
String result = name.toLowerCase();
String result = name.trim();

System.out.println(result);



// Wrapper class
// primative and reference data type converting
// some type of the data has specific method to be used
// autoboxing and unboxing

Boolean a = true;
Character b = '@';
Integer c =123;
Double d = 3.14;
String e = "Bro";



// Arraylist -- a resizable array
// elements can be added and removed after compilation phase
// only store reference data types


ArrayList<String> food = new ArrayList<String>();

food.add("Pizza");
food.add("Hotdog");
food.add("HotPot");

food.set(0, "sushi");
food.remove(2);
food.clear();

for (int i=0; i < food.size(); i++){
    System.out.println(food.get(i));
}


// 2D ArrayList


ArrayList<ArrayList<String>> grocerylist = new Arraylist();

ArrayList<String> food_1 = new ArrayList();

food_1.add("Pizza");
food_1.add("Hotdog");
food_1.add("HotPot");

ArrayList<String> food_2 = new ArrayList();

food_2.add("Pizza");
food_2.add("Hotdog");
food_2.add("HotPot");

ArrayList<String> food_3 = new ArrayList();

food_3.add("Pizza");
food_3.add("Hotdog");
food_3.add("HotPot");


grocerylist.add(food_1);
grocerylist.add(food_2);
grocerylist.add(food_3);

//[[food_1],[food_2],[food_3]];

System.out.println(grocerylist.get(2).get(1));


 }




