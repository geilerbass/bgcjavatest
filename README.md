# Array Finder Java Test
I first wrote some JUnit tests, covering a couple of boundary conditions - i.e. larger array contains the smaller array, does not contain the array.
I decided that the logic would be carried out in a static method, taking the two arrays as arguments, returning an int that would give the first (and only the first) instance of the array to find.
If the array could not be found, then the method would return -1.
The method is called findArrayInArray().

I felt the question did not specify what type of arrays should be handled, so I assumed that it could be any class that inherits from Object.
However, to limit time, I only focused on Integer arrays (as per the example) and threw in a test for String arrays.

While I think there is a recursive solution to this problem, I opted for an iterative method.

I felt there were two principle operations - finding the starting position (if it existed) and checking to see if an object was in the next position in the array, given a starting position.
These two operations were implemented in their respectively-named methods.

I then created the main structure of the logic, using a for loop to iterate through the target array
If the first item in the array to find was located within the target array, another for loop would iterate through the array to find, checking that the remaining items were present, in correct order, using the isObjectInNextPosition.
If the full array could not be found, the outer loop would start trying to find the array again, starting from where it left off in the target array.

If the array could not be found, the method would return -1.