# About
This first project is intended to be an introduction to the Stack ADT, implemented in Java in two common forms: as an array, and as a linked list. 

## Phase A
Phase A requires implementing both methods discretely, and includes the following requirements:
* Both must implement the supplied DStack interface
* The array implementation must support resizing of the array when full
* The linkedlist solution must include a custom list node class (as opposed to importing a preexisting node class)
* Both solutions should throw an EmptyStackException if pop() or peek() is called when the stack is empty

## Phase B
Phase B requires implementing two moore array and linkedlist solutions, this time as generics. Phase B has the same requirements as Phase A, but the two classes must this time implement the supplied GStack<T> interface
  
## Testing
The supplied Reverse.java reads a .dat file, pushes the values to a stack (using the student-built stack implementations) and then pops those to produce a reversed .dat file. Stack implementations must be tested separately to confirmm that they are working as expected outside of the Reverse usage, and then additionally the Reverse results can be compared to expected values.
