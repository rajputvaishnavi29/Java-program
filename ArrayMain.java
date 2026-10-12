import java.until.Scanner;

class ArrayDemo {
    int arr[];
    int size;
    
    ArrayDemo(int n) {
        size=n;
        arr=new int[size];
    }
    void acceptArray(){
        scanner sc =new scanner (System.in);
        System.out.println("Enter "+ size+ " elements:");
        for (int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
    } 
    void displayArray() {
        System.out.print("Array Elements: ");
        for (int i=0;i < size;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    void insertElemement(int pos,int value) {
        if(pos <0 || pos > size) {
            System.out.println("Invalid position!");
            return;
        }
        int newArr[]= new int[size + 1];
        for(int i=0,j=0; i< newArr.length; i++) {
            if (i == pos) {
                newArr[i] = value;
            }else {
                newArr[i] = arr[j++];
            }
        }
        arr=newArr;
        size++;
    }
    void deleteElement(int pos) {
        if (pos <0 || pos >= size) {
            System.out.println("Invalind positional!");
            return;
        }
        int newArr[]=new int[size -1];
        for (int i=0,j=0;i< size; i++) {
            if (i !=pos) {
                newArr[j++] = arr[i];
            }
        }
        arr= newArr;
        size--;
    }
    void linearsearch( int key) {
        boolean found =falase
        for (int i=0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key +"found at position" + i);
                found = true;
                break;
            }
        }
        if(! found)
            System.out.println("Element" + key +" not found.");
    }
    void bubblesort() {
        for (int i=0;i< size -1; i++) {
            for (int j=0; j< size - i - 1; j++) {
                if (arr [j] > arr [j + 1]){

                    int tem = arr [j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.println("Array after Bubble sort:");
        displayArray();
    }
}
public class ArrayMain {
    public static void main ( String [] args) {
        ArrayDemo obj = new ArrayDemo(5);
        obj.acceptArray();

        obj.displayArray();

        obj.insertElement (2,99);
        System.out.println("After Inseration:");
        onj.dispiayArray();

        obj.deleteElement(3)
        System.out.println("After Delection :");
        obj.displayArray();

        obj.linearsearch(50);
        obj.bubblesort();
    }
}
