# Sorting Algorithms
---
### Some common sorting algorithm :-
1. Bubble sort
2. Selection sort 
3. Insertion sort
4. Merge sort
5. Quick sort
6. Heap sort
7. Counting sort
8. DNF

## Bubble Sort

```text
we will need to edit n-1 times the outer loop as last element will auto correct,
due to deficiency of place.

And in inner loop we will reduce loop by one iteration as last element,
will be placed on it's correct place so no need to update this one.
```
#### Bubble Sort Algorithm

```java
public static void BubbleSort(int[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length-turn; i++) {
                if (arr[i]  > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
```
---
## Selection Sort

Algorithm of selection sort
```java
public static void SelectionSort(int[] arr) {
        for (int i = 0; i< arr.length;i++) {
            int idx = Minimum_Index(arr, i);
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int Minimum_Index(int[] arr, int idx) {
        int mini= idx;
        for (int i = idx + 1; i< arr.length;i++) {
            if (arr[i] < arr[mini]) {
                mini = i;
            }
        }
        return mini;
    }
```
---
## Insertion SOrt

In this sort we assume that only last index is unsorted and rest is sorted so we make an algo to put last index on it correct postion.  
and then we use it as by just using for index 1 and cause 0th index is left out so basically sorted due to being one we do the comparison and then increase the i and so on.  
We sort of make a box which takes one element per loop and then put that taken elemnt in it's correct position so at the end of each loop the box is sorted

{4,1,3,4,5,6,2}
{[4,1],3,4,5,6,2}
{[1,4,3],4,5,6,2}
....

```java
public static void Insertion_Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Insert_Last_Element(arr,i);
        }
    }

    public static void Insert_Last_Element(int[] arr, int i) {
        int item  = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            arr[j] = item;
            j--;
        }

    }
```
