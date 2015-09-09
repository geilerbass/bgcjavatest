package javatest;

public class ArrayFinder {
	
    public static int findArrayInArray(Object[] targetArray, Object[] arrayToFind) {

        int startPosition = -1;

        for (int currentPosition = 0; currentPosition < targetArray.length - arrayToFind.length; currentPosition++) {
            
        	startPosition = findStartPositionOfArray(targetArray, currentPosition, arrayToFind[0]);

            if (startPosition >= 0) {
            	int pos = currentPosition;
                for (Object obj : arrayToFind) {
                    if (isObjectInNextPosition(targetArray, pos, obj)) {
                        pos++;
                        continue;
                    }
                    else {
                        startPosition = -1;
                        break;
                    }
                }
            }
            else {
                break;
            }
            if (startPosition > -1) {
            	break;
            }
        }
        return startPosition;
    }

    public static int findStartPositionOfArray(Object[] targetArray, int start, Object objToFind) {
        for (int i = start; i < targetArray.length; i++) {
            if (targetArray[i].equals(objToFind)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isObjectInNextPosition(Object[] targetArray, int start, Object objToFind) {
        if (targetArray[start + 1].equals(objToFind)) {
            return true;
        }
        return false;
    }
}
