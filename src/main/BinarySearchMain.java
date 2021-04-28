package main;
public class BinarySearchMain {
    private int[] arr;

    public BinarySearchMain(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        BinarySearchMain obj = new BinarySearchMain(arr);
        int searchElement = 45;
        int low = 0;
        int high = arr.length -1;
        System.out.println("search element = " +searchElement +
                " is found = " + obj.recursiveBinarySearch(searchElement, low, high));

    }
    public boolean recursiveBinarySearch(int searchElement, int low, int high){
        if(low > high){
            return false;
        }
        else{
            int mid = (low + high) / 2;
            if(searchElement == arr[mid]){
                return true;
            }
            else if(searchElement < arr[mid]){
                return recursiveBinarySearch(searchElement, low, mid -1);
            }
            else{
                return recursiveBinarySearch(searchElement,mid + 1, high);
            }
        }
    }
}
