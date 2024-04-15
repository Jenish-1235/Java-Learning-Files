public class objectOrientedProgramming {
    public static void main(String[] args) {
        pen p = new pen();
        p.color = "blue";
        p.type = "gel";

        p.write();

        p.printColor();
    }
}
/**
 * pen
 */
class pen {
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
    


}

// polymorphism

class Student{
    String name;
    String age;

    // this is example of polymorphism using function overloading.
    /*
     * the same named function is used multiple times along with either different return type or different parameters.
     * eithher different return type
     * either different argument data type
     * either different no. arguments.
     * 
     * if not followed above rules:- compile time error.
     */
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(String  name , int age){
        System.out.println(name + " " + age);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
}


// inherittance
// it means properties of one class is inherited by another class.
/*
 * the one whose properties is inherited is called base class and the inheritor is called subclass
 */
class Shape{
    String color;
}

class Triangle extends Shape{

}

/*
 * types of inheritance
 * 1. single level inheritance
 * 2. multilevel inheritance
 * 3. hierarchial inheritance
 * 4. hybrid inheritance
 */


// Encapsulation
// data and properties are encapsulated within one entity
/*
 * packages:- related code is stored in packages.
 * >>> built in packages and user defined packages.
 * 
 * access modifier :- it defines which information is available to whom.
 * >>> public - anyone can access
 * >>> private - only accesible in same class no where else. (we use getters and setters to modify this accessmodifier defined identifiers.)
 * >>> protected - in same package only in same class and other subclasses can access it
 * >>> default - if nothing mentioned this is used, only accessed in same package, not in other package.
 */
// data hiding is achieved using accessmodifier


//  abstraction
// to show important things to user and not showing non useful things to user
// abstract keyword is used. 
// gives runtime error when abstract class is used
/*
 * when you use the constructor of some derived class, first contructor of parent class  is called.
 */

//  interfaces:-
/*
 * pure abstractions is implemented using interfaces in java
 * 
 * interface keyword is used.
 * interface can't have constructors
 * interface can't have non abstract functions nor implementation
 * 
 * interface is not extended it is implemented using implements keyword.
 * properties are public static and final.
 * 
 * multiple interfaces can be used with one class. but multiple classes cant be used with single class.
 * 
 * static keyword:- sets the same common value for all the objects of one class.
 * static keyword can be used with properties, functions , blocks , nested classes. Memory is given only once to static objects.
 * 
 * 
 */