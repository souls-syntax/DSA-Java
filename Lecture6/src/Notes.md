# Data Structure
The way of storing data in a specific format.

# Arrays
* Collection of homogeneous data types.
* It is a continuous and linear data structure.
* Inside java array is a class.
* It is non-primitive so will be made in heap memory.
* Functions are made in stack memory
* It's default value is 0 when no value is given for a integer array, in character will be blank in boolean false in in float will be 0.0.
* The variable arr will be stored in stack memory.
* JVM reads from right to left so will read new int[5] first.

To initialise the array
```java
int a;
int[] arr1; //1D array
int[] arr = new int[5]; //To make an array of size 5 of int data type
int[][] arr2; //2D array and so on
int [] other = arr; // Here other is refrencing to arr itself so no copy will be formed
a = arr.length // will be used to find the length of the arr.
```
**Why is 0 based indexing used instead of just using 1 ?** 
* It is used so when you access the index you can access the 0th block by putting i=0 otherwise the oth block will be left behind.

```java
int[] arr = new int[5]; // Bothe same type
int arr[] = new int[5]; // It's just C type declaration used in C
```
```java
// How to take input for array
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
    }
```

## Ways to take array and display it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Display(arr);
    }

    public static void Display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```
When you call the array from a function a new array is not formed instead a new variable is formed who too just reads the same array.
<br>Analogy would be there being a poplular girl(array) in college but have many admirers(variablea/pointers)

## Java: Call by value or Call by reference ?

```java
public class second {
    public static void main(String[] args) {
//        int[] arr0 = new int[]{10,20,30,40};
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[0] + " " + arr[1]);
        Swap(, arr[0], arr[1]);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
```
Here there will be no swap as array is not accessed it's just change in the local values of that method/function.

```java
public class second {
    public static void main(String[] args) {
//        int[] arr0 = new int[]{10,20,30,40}; // This too is valid method just different syntax
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr, other);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```

Here Swap will be performed as we accessd the array and then changed it instead of just doing local swap.<br>
Analogy being you enter someone home and then do the thing instead of just doing it from outside which will not cause any effect.   

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Display(arr);
    }

    public static void Display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```
Here too the swap will not occur as the change in the refrences are occuring only on local level.
<br> as the changes only occur when you change it after accessing each elements

<br> Too swap you have to access each elements and then swap it.

### This proves that Java is call by value instead of call by reference.
