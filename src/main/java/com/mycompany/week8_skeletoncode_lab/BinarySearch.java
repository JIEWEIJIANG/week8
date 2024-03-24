/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    public static void main(String[] args){
        int[] sortedArray = {2,4,6,8,10};
        int key = 6;
        int low = 0;
        int high = sortedArray.length - 1;
        int result = runBinarySearchIteratively(sortedArray, key, low, high);
        if(result != Integer.MAX_VALUE){
            System.out.println(key + " found at index " + result + ".");
        }else{
            System.out.println(key + " not found.");
        }
    }

}

