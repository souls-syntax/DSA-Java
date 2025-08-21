# Function/Method

JVM (Java virtual machine) is used to provide enviroment in which the java program will run.
It checks for a file with public static void(String[] args)

## Access Modifier

It defines the scope of the code. (Who can access what method and what)

    1. Public
    2. Private
    3. Protected
    4. Default

***Main** - It is the name of the function which OS calls*

***args** - We can only change the value of args as it is a variable*

***Static** - It allows the method to be called without the use of making new instance of the object*

***Void** - The return type of the function which is nill here*

## Types of Methods
    1. Parameterised - In which we require to pass a parameter
    2. Non-Parameterised - We don't pass the parameter.
<span style="color:aqua;">**Note**:- The function is stored in stack memory</span>

## There are two type of variable Local and Global
1. Local
2. Global

* You make a global variable by declaring it outside of all the methods
* Local get more priority than global if there is conflict due to name 
* In that case to refer to global var we use `Class_Name.var`. 


```java
public class Main {
    static int val = 100; // Here this is the global variable

    public static void main(String[] args) {
        int val = 20; // The local variable
        System.out.println("Hello");
        System.out.println(val);
        add();
        Main.val = Main.val + 10; // Accessing Global var using class name
        System.out.print(val);
        System.out.print("Bye");
        System.out.print(adde(9, 10));
    }
}
```