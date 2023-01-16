package controller;

import java.util.Arrays;

/**
 *
 * @author prithivi
 */
public class BinarySearch {
    

    public int searchStringValuse(String[] arr, int low, int high, String searchKey){
        if(high>=low){
            int mid = (low + high)/2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid].equals(searchKey))
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid].compareTo(searchKey)>0)
                return searchStringValuse(arr, low, mid - 1, searchKey);
 
            // Else the element can only be present
            // in right subarray
            return searchStringValuse(arr, mid + 1, high, searchKey);
        }
        return -1;
    }

    public int searchByID(int[] arr, int low, int high, int searchKey){
        if(high>=low){
            int mid = (low + high)/2;
                           

            // If the element is present at the
            // middle itself
            if (arr[mid] == searchKey)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > searchKey){
                                
                return searchByID(arr, low, mid - 1, searchKey);
            }
            // Else the element can only be present
            // in right subarray
            return searchByID(arr, mid + 1, high, searchKey);
        }
        return -1;
    }

}

