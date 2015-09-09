package javatest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFinderTest {

    @Test
    public void testFindArrayInArrayArrayAppears() throws Exception {
        Integer[] arr1 = {2,3,4,5};
        Integer[] arr2 = {4,5};
        assertEquals(2, ArrayFinder.findArrayInArray(arr1, arr2));
    }

    @Test
    public void testFindArrayInArrayDoesNotAppear() {
        Integer[] arr1 = {2,3,4,5};
        Integer[] arr2 = {2,5};
        assertEquals(-1, ArrayFinder.findArrayInArray(arr1, arr2));
    }

    @Test
    public void testFindArrayInArrayMultipleStartingValues() {
        Integer[] arr1 = {2,3,4,2,3,4,5};
        Integer[] arr2 = {2,3,4,5};
        assertEquals(3, ArrayFinder.findArrayInArray(arr1, arr2));
    }
    
    @Test
    public void testFindArrayInArrayMultipleMatches() {
        Integer[] arr1 = {2,3,4,5,3,4,5};
        Integer[] arr2 = {4,5};
        assertEquals(2, ArrayFinder.findArrayInArray(arr1, arr2));
    }

    @Test
    public void testFindArrayInArrayMultipleDuplicateStartingValues() {
        Integer[] arr1 = {2,2,3,2,2,2,4,5,6,9};
        Integer[] arr2 = {2,2,4,5};
        assertEquals(3, ArrayFinder.findArrayInArray(arr1, arr2));
    }

    @Test
    public void testFindArrayInArrayNegativeValues() {
        Integer[] arr1 = {10,0,5,-8,65,254,1,3,54,-15,98,-153};
        Integer[] arr2 = {254,1,3,54,-15};
        assertEquals(5, ArrayFinder.findArrayInArray(arr1, arr2));
    }

    @Test
    public void testFindArrayInArrayStringValues() {
        String[] arr1 = {"this","is","a","test","array"};
        String[] arr2 = {new String("a"), new String("test"), new String("array")};
        assertEquals(2, ArrayFinder.findArrayInArray(arr1, arr2));
    }
    
    @Test
    public void testFindArrayInArraySmallerTargetArray() {
    	Integer[] arr1 = {1,2};
    	Integer[] arr2 = {1,2,3};
    	assertEquals(-1, ArrayFinder.findArrayInArray(arr1, arr2));
    }
}

