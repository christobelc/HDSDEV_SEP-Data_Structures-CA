# HDSDEV_SEP-Data_Structures-CA

Problem 1
Implement a Function in Java which accepts a List of Integer values and
outputs the frequency of each.
For Example:
11, 22, 14, 15, 11, 31, 22
Output:
22 occurs 2 times.
11 occurs 2 times.
14 occurs 1 times.
15 occurs 1 times.
31 occurs 1 times.


Problem 2
Given a binary tree of integers, write the method SumOfLeafNodes that takes a TNode as an
argument and returns the sum of the values stored in the leaf nodes. For example, given the
binary tree below, the returned value should be 53 which is the sum of -9+6+9+13+15+19.

                    11
                /       \
               2         15
              / \       /   \
           -9     7    13   17
                 /  \       / \
                2    9    15    19
                \
                 6
                 
                 
Problem 3
Declare and initialise an unsorted Array. Implement a Recursive Function (which
accepts the Array and sum as parameters) to check if it contains four elements
having the given sum.
For Example:
int[] intArray = { 12, 17, 14, 0, 6, 5, 1, 3 };
sum = 35
Output:
Quadruplet exists.
Below Quadruplet gives a sum of 35
(1, 5, 12, 17) 


Problem 4
Implement the method DeletePairs() in the MyArrayList class which takes an
ArrayList of integers and removes all pairs where the left element is larger than the
right element. For example, suppose our ArrayList has the following elements:
[2,6,5,8,9,3,7,4,1,2]. You can think of this list as a sequence of pairs: (2,6), (5,8),
(9,3), (7,4) and (1,2). The pairs (9,3) and (7,4) should be removed since the left
element is larger than the right element. After executing DeletePairs(), the ArrayList
should look like: [2,6,5,8,1,2].
Note: In the case where the size of the ArrayList is odd, delete the last element
as it is not part of a pair.
