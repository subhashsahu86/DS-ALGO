# Java Collections Framework - 150 Practice Problems

## Table of Contents
1. [ArrayList Problems (10)](#arraylist)
2. [LinkedList Problems (10)](#linkedlist)
3. [Vector Problems (10)](#vector)
4. [Stack Problems (10)](#stack)
5. [HashSet Problems (10)](#hashset)
6. [LinkedHashSet Problems (10)](#linkedhashset)
7. [TreeSet Problems (10)](#treeset)
8. [HashMap Problems (10)](#hashmap)
9. [LinkedHashMap Problems (10)](#linkedhashmap)
10. [TreeMap Problems (10)](#treemap)
11. [Hashtable Problems (10)](#hashtable)
12. [PriorityQueue Problems (10)](#priorityqueue)
13. [ArrayDeque Problems (10)](#arraydeque)
14. [Mixed Collections Problems (20)](#mixed)

**Difficulty Levels**: 🟢 Easy | 🟡 Medium | 🔴 Hard

---

## ArrayList Problems {#arraylist}

### Problem 1: Remove Even Numbers 🟢
**Difficulty**: Easy  
**Description**: Given an ArrayList of integers, remove all even numbers from the list.  
**Input**: `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`  
**Output**: `[1, 3, 5, 7, 9]`  
**Hint**: Use Iterator or removeIf() method

---

### Problem 2: Find Second Largest Element 🟡
**Difficulty**: Medium  
**Description**: Find the second largest element in an ArrayList without sorting.  
**Input**: `[5, 2, 8, 1, 9, 3, 9]`  
**Output**: `8`  
**Hint**: Maintain two variables for largest and second largest

---

### Problem 3: Rotate ArrayList 🟡
**Difficulty**: Medium  
**Description**: Rotate an ArrayList to the right by k positions.  
**Input**: `list = [1, 2, 3, 4, 5], k = 2`  
**Output**: `[4, 5, 1, 2, 3]`  
**Hint**: Use Collections.rotate() or manual reversal

---

### Problem 4: Merge Two Sorted ArrayLists 🟡
**Difficulty**: Medium  
**Description**: Merge two sorted ArrayLists into a single sorted ArrayList.  
**Input**: `list1 = [1, 3, 5, 7], list2 = [2, 4, 6, 8]`  
**Output**: `[1, 2, 3, 4, 5, 6, 7, 8]`  
**Hint**: Use two pointers approach

---

### Problem 5: Find All Duplicates 🟡
**Difficulty**: Medium  
**Description**: Find all duplicate elements in an ArrayList.  
**Input**: `[1, 2, 3, 2, 4, 5, 1, 6, 3]`  
**Output**: `[1, 2, 3]`  
**Hint**: Use HashSet to track seen elements

---

### Problem 6: Remove Duplicates Maintaining Order 🟢
**Difficulty**: Easy  
**Description**: Remove all duplicate elements while maintaining the original order.  
**Input**: `[1, 2, 3, 2, 4, 1, 5]`  
**Output**: `[1, 2, 3, 4, 5]`  
**Hint**: Use LinkedHashSet

---

### Problem 7: ArrayList Partition 🟡
**Difficulty**: Medium  
**Description**: Partition an ArrayList into two lists - one with even numbers and one with odd numbers.  
**Input**: `[1, 2, 3, 4, 5, 6, 7, 8]`  
**Output**: `even = [2, 4, 6, 8], odd = [1, 3, 5, 7]`  
**Hint**: Iterate and add to respective lists

---

### Problem 8: Find Missing Number 🟢
**Difficulty**: Easy  
**Description**: Given an ArrayList containing n distinct numbers from 0 to n, find the missing number.  
**Input**: `[0, 1, 3, 4, 5]` (n = 5)  
**Output**: `2`  
**Hint**: Use sum formula or XOR approach

---

### Problem 9: Move Zeros to End 🟡
**Difficulty**: Medium  
**Description**: Move all zeros in an ArrayList to the end while maintaining the order of other elements.  
**Input**: `[0, 1, 0, 3, 12]`  
**Output**: `[1, 3, 12, 0, 0]`  
**Hint**: Use two pointers or count non-zero elements

---

### Problem 10: Find Intersection of Two ArrayLists 🔴
**Difficulty**: Hard  
**Description**: Find intersection of two ArrayLists where duplicates in the result should appear as many times as they appear in both lists.  
**Input**: `list1 = [1, 2, 2, 3, 4], list2 = [2, 2, 3, 5]`  
**Output**: `[2, 2, 3]`  
**Hint**: Use HashMap to count frequencies

---

## LinkedList Problems {#linkedlist}

### Problem 11: Reverse LinkedList 🟢
**Difficulty**: Easy  
**Description**: Reverse a LinkedList in-place.  
**Input**: `[1, 2, 3, 4, 5]`  
**Output**: `[5, 4, 3, 2, 1]`  
**Hint**: Use Collections.reverse() or iterate backwards

---

### Problem 12: Find Middle Element 🟡
**Difficulty**: Medium  
**Description**: Find the middle element of a LinkedList. If there are two middle elements, return the second one.  
**Input**: `[1, 2, 3, 4, 5]`  
**Output**: `3`  
**Hint**: Use two pointers (slow and fast)

---

### Problem 13: Remove Nth Node from End 🟡
**Difficulty**: Medium  
**Description**: Remove the nth node from the end of a LinkedList.  
**Input**: `list = [1, 2, 3, 4, 5], n = 2`  
**Output**: `[1, 2, 3, 5]`  
**Hint**: Use two pointers with n gap

---

### Problem 14: Detect Cycle (Custom Implementation) 🔴
**Difficulty**: Hard  
**Description**: Create a custom LinkedList class and implement cycle detection.  
**Input**: Custom LinkedList with cycle  
**Output**: `true/false`  
**Hint**: Use Floyd's cycle detection algorithm

---

### Problem 15: Palindrome Check 🟡
**Difficulty**: Medium  
**Description**: Check if a LinkedList is a palindrome.  
**Input**: `[1, 2, 3, 2, 1]`  
**Output**: `true`  
**Hint**: Use stack or find middle and reverse second half

---

### Problem 16: Swap Adjacent Nodes 🟡
**Difficulty**: Medium  
**Description**: Swap every two adjacent nodes in a LinkedList.  
**Input**: `[1, 2, 3, 4, 5]`  
**Output**: `[2, 1, 4, 3, 5]`  
**Hint**: Swap elements pairwise

---

### Problem 17: Add Two Numbers as LinkedList 🔴
**Difficulty**: Hard  
**Description**: Two numbers are represented as LinkedList where each node contains a single digit. Add the two numbers.  
**Input**: `list1 = [2, 4, 3] (342), list2 = [5, 6, 4] (465)`  
**Output**: `[7, 0, 8] (807)`  
**Hint**: Add digit by digit with carry

---

### Problem 18: Merge Two Sorted LinkedLists 🟡
**Difficulty**: Medium  
**Description**: Merge two sorted LinkedLists into one sorted LinkedList.  
**Input**: `list1 = [1, 3, 5], list2 = [2, 4, 6]`  
**Output**: `[1, 2, 3, 4, 5, 6]`  
**Hint**: Compare elements and merge

---

### Problem 19: Remove Duplicates from Sorted LinkedList 🟢
**Difficulty**: Easy  
**Description**: Remove duplicates from a sorted LinkedList.  
**Input**: `[1, 1, 2, 3, 3, 4]`  
**Output**: `[1, 2, 3, 4]`  
**Hint**: Compare current with next

---

### Problem 20: Rotate LinkedList 🔴
**Difficulty**: Hard  
**Description**: Rotate a LinkedList to the right by k places.  
**Input**: `list = [1, 2, 3, 4, 5], k = 2`  
**Output**: `[4, 5, 1, 2, 3]`  
**Hint**: Find length, connect tail to head, break at new head

---

## Vector Problems {#vector}

### Problem 21: Thread-Safe Counter 🟢
**Difficulty**: Easy  
**Description**: Implement a thread-safe counter using Vector that multiple threads can increment.  
**Input**: Multiple threads incrementing  
**Output**: Correct final count  
**Hint**: Vector methods are synchronized

---

### Problem 22: Find Capacity vs Size 🟢
**Difficulty**: Easy  
**Description**: Demonstrate the difference between capacity() and size() in Vector.  
**Input**: Add 15 elements to Vector with default capacity  
**Output**: Show capacity and size at each step  
**Hint**: Print capacity() and size() after additions

---

### Problem 23: Convert Vector to Array 🟢
**Difficulty**: Easy  
**Description**: Convert a Vector to an array and vice versa.  
**Input**: `Vector [1, 2, 3, 4, 5]`  
**Output**: `Array {1, 2, 3, 4, 5}`  
**Hint**: Use toArray() and Arrays.asList()

---

### Problem 24: Synchronized Iteration 🟡
**Difficulty**: Medium  
**Description**: Safely iterate over a Vector while other threads are modifying it.  
**Input**: Vector being modified by multiple threads  
**Output**: Safe iteration without ConcurrentModificationException  
**Hint**: Synchronize on vector during iteration

---

### Problem 25: Remove Elements While Iterating 🟡
**Difficulty**: Medium  
**Description**: Remove all elements greater than a threshold from Vector while iterating.  
**Input**: `Vector [1, 5, 2, 8, 3, 9], threshold = 4`  
**Output**: `[1, 2, 3]`  
**Hint**: Use Iterator.remove() or iterate backwards

---

### Problem 26: Clone vs Copy 🟢
**Difficulty**: Easy  
**Description**: Demonstrate the difference between clone() and creating a new Vector with copy constructor.  
**Input**: `Vector [1, 2, 3]`  
**Output**: Show shallow vs deep copy behavior  
**Hint**: Modify cloned vector and observe original

---

### Problem 27: Bulk Operations 🟡
**Difficulty**: Medium  
**Description**: Perform bulk operations (addAll, removeAll, retainAll) on Vector.  
**Input**: `v1 = [1, 2, 3, 4], v2 = [3, 4, 5, 6]`  
**Output**: Show results of all operations  
**Hint**: Use Collection bulk methods

---

### Problem 28: Ensure Capacity Optimization 🟡
**Difficulty**: Medium  
**Description**: Optimize Vector performance by setting appropriate initial capacity.  
**Input**: Need to add 1000 elements  
**Output**: Compare time with and without ensureCapacity()  
**Hint**: Measure time for both approaches

---

### Problem 29: Replace All Elements 🟢
**Difficulty**: Easy  
**Description**: Replace all occurrences of a value in Vector with another value.  
**Input**: `Vector [1, 2, 3, 2, 4], replace 2 with 10`  
**Output**: `[1, 10, 3, 10, 4]`  
**Hint**: Use replaceAll() with UnaryOperator

---

### Problem 30: First and Last Occurrence 🟢
**Difficulty**: Easy  
**Description**: Find the first and last occurrence of an element in Vector.  
**Input**: `Vector [1, 2, 3, 2, 4, 2], find 2`  
**Output**: `first = 1, last = 5`  
**Hint**: Use indexOf() and lastIndexOf()

---

## Stack Problems {#stack}

### Problem 31: Balanced Parentheses 🟡
**Difficulty**: Medium  
**Description**: Check if parentheses in a string are balanced using Stack.  
**Input**: `"{[()]}"`  
**Output**: `true`  
**Hint**: Push opening brackets, pop for closing brackets

---

### Problem 32: Reverse String Using Stack 🟢
**Difficulty**: Easy  
**Description**: Reverse a string using Stack.  
**Input**: `"Hello"`  
**Output**: `"olleH"`  
**Hint**: Push all characters, then pop

---

### Problem 33: Implement Min Stack 🔴
**Difficulty**: Hard  
**Description**: Implement a stack that supports push, pop, top, and retrieving minimum element in O(1).  
**Input**: `push(3), push(5), push(2), getMin() = 2, pop(), getMin() = 3`  
**Output**: Minimum in O(1)  
**Hint**: Use auxiliary stack to track minimums

---

### Problem 34: Evaluate Postfix Expression 🟡
**Difficulty**: Medium  
**Description**: Evaluate a postfix expression using Stack.  
**Input**: `"2 3 1 * + 9 -"` (represents (2 + (3 * 1)) - 9)  
**Output**: `-4`  
**Hint**: Push operands, pop for operators

---

### Problem 35: Next Greater Element 🟡
**Difficulty**: Medium  
**Description**: For each element in array, find the next greater element using Stack.  
**Input**: `[4, 5, 2, 25]`  
**Output**: `[5, 25, 25, -1]`  
**Hint**: Iterate from right, maintain stack of potential candidates

---

### Problem 36: Valid Stack Sequences 🔴
**Difficulty**: Hard  
**Description**: Given push and pop sequences, check if they are valid.  
**Input**: `pushed = [1,2,3,4,5], popped = [4,5,3,2,1]`  
**Output**: `true`  
**Hint**: Simulate the operations

---

### Problem 37: Sort Stack 🔴
**Difficulty**: Hard  
**Description**: Sort a stack using only one additional stack.  
**Input**: `Stack [3, 1, 4, 2]`  
**Output**: `Stack [1, 2, 3, 4]` (top to bottom)  
**Hint**: Use temporary stack for sorting

---

### Problem 38: Implement Queue Using Two Stacks 🟡
**Difficulty**: Medium  
**Description**: Implement a queue using only two stacks.  
**Input**: `enqueue(1), enqueue(2), dequeue() = 1`  
**Output**: Queue behavior  
**Hint**: Use one stack for enqueue, one for dequeue

---

### Problem 39: Remove Adjacent Duplicates 🟡
**Difficulty**: Medium  
**Description**: Remove all adjacent duplicate characters from string using Stack.  
**Input**: `"abbaca"`  
**Output**: `"ca"`  
**Hint**: Push if different from top, pop if same

---

### Problem 40: Decode String 🔴
**Difficulty**: Hard  
**Description**: Decode string using Stack. Pattern: number[string] means repeat string.  
**Input**: `"3[a2[c]]"` means `"accaccacc"`  
**Output**: Decoded string  
**Hint**: Use stack for numbers and strings

---

## HashSet Problems {#hashset}

### Problem 41: Remove Duplicates from Array 🟢
**Difficulty**: Easy  
**Description**: Remove duplicates from an array using HashSet.  
**Input**: `[1, 2, 3, 2, 4, 1, 5]`  
**Output**: `[1, 2, 3, 4, 5]`  
**Hint**: Add all to HashSet

---

### Problem 42: Find First Repeating Element 🟡
**Difficulty**: Medium  
**Description**: Find the first element that repeats in an array.  
**Input**: `[10, 5, 3, 4, 3, 5, 6]`  
**Output**: `5` (first to repeat)  
**Hint**: Track seen elements in HashSet

---

### Problem 43: Longest Substring Without Repeating 🔴
**Difficulty**: Hard  
**Description**: Find length of longest substring without repeating characters.  
**Input**: `"abcabcbb"`  
**Output**: `3` ("abc")  
**Hint**: Sliding window with HashSet

---

### Problem 44: Check if Two Arrays are Disjoint 🟢
**Difficulty**: Easy  
**Description**: Check if two arrays have no common elements.  
**Input**: `arr1 = [1, 2, 3], arr2 = [4, 5, 6]`  
**Output**: `true`  
**Hint**: Add one to HashSet, check other

---

### Problem 45: Count Distinct Elements 🟢
**Difficulty**: Easy  
**Description**: Count number of distinct elements in an array.  
**Input**: `[1, 2, 2, 3, 3, 3, 4]`  
**Output**: `4`  
**Hint**: HashSet size

---

### Problem 46: Pair with Given Sum 🟡
**Difficulty**: Medium  
**Description**: Find if there exists a pair with given sum in array.  
**Input**: `arr = [1, 4, 45, 6, 10], sum = 16`  
**Output**: `true` (6 + 10)  
**Hint**: Store complements in HashSet

---

### Problem 47: Union and Intersection 🟢
**Difficulty**: Easy  
**Description**: Find union and intersection of two arrays.  
**Input**: `arr1 = [1, 2, 3], arr2 = [2, 3, 4]`  
**Output**: `union = [1, 2, 3, 4], intersection = [2, 3]`  
**Hint**: Use HashSet operations

---

### Problem 48: Subarray with Zero Sum 🟡
**Difficulty**: Medium  
**Description**: Check if array has a subarray with sum = 0.  
**Input**: `[4, 2, -3, 1, 6]`  
**Output**: `true` (2 + (-3) + 1 = 0)  
**Hint**: Store cumulative sums in HashSet

---

### Problem 49: Find All Missing Numbers 🟡
**Difficulty**: Medium  
**Description**: Find all missing numbers from 1 to N in an array.  
**Input**: `[1, 2, 4, 6], N = 6`  
**Output**: `[3, 5]`  
**Hint**: Add all to HashSet, check 1 to N

---

### Problem 50: Check Sudoku Validity 🔴
**Difficulty**: Hard  
**Description**: Check if a Sudoku board is valid using HashSet.  
**Input**: 9x9 Sudoku board  
**Output**: `true/false`  
**Hint**: Use HashSet for each row, column, and box

---

## LinkedHashSet Problems {#linkedhashset}

### Problem 51: Remove Duplicates Maintaining Order 🟢
**Difficulty**: Easy  
**Description**: Remove duplicates from array while maintaining insertion order.  
**Input**: `[1, 2, 3, 2, 4, 1, 5]`  
**Output**: `[1, 2, 3, 4, 5]`  
**Hint**: Use LinkedHashSet directly

---

### Problem 52: First Unique Character 🟡
**Difficulty**: Medium  
**Description**: Find the first unique character that appears only once, maintaining order.  
**Input**: `"leetcode"`  
**Output**: `'l'`  
**Hint**: Use LinkedHashSet with frequency map

---

### Problem 53: Print Elements in Insertion Order 🟢
**Difficulty**: Easy  
**Description**: Demonstrate that LinkedHashSet maintains insertion order.  
**Input**: Add elements: `[3, 1, 4, 1, 5, 9, 2, 6]`  
**Output**: `[3, 1, 4, 5, 9, 2, 6]`  
**Hint**: Simply iterate

---

### Problem 54: Remove First Occurrence 🟢
**Difficulty**: Easy  
**Description**: Remove the first occurrence of duplicates in an array.  
**Input**: `[1, 2, 3, 2, 4, 3, 5]`  
**Output**: `[1, 2, 3, 4, 5]`  
**Hint**: LinkedHashSet automatically handles this

---

### Problem 55: Maintain Order of Operations 🟡
**Difficulty**: Medium  
**Description**: Track order of unique operations performed by a user.  
**Input**: `["login", "view", "logout", "login", "view", "purchase"]`  
**Output**: `["login", "view", "logout", "purchase"]`  
**Hint**: Add to LinkedHashSet

---

### Problem 56: Stream of Characters 🟡
**Difficulty**: Medium  
**Description**: Process a stream of characters and report unique characters in order.  
**Input**: Stream `"programming"`  
**Output**: `[p, r, o, g, a, m, i, n]`  
**Hint**: Add each to LinkedHashSet

---

### Problem 57: Ordered Set Operations 🟡
**Difficulty**: Medium  
**Description**: Perform union maintaining the order from first set, then second.  
**Input**: `set1 = [1, 2, 3], set2 = [3, 4, 5]`  
**Output**: `[1, 2, 3, 4, 5]`  
**Hint**: Add set1, then set2 to LinkedHashSet

---

### Problem 58: Cache with Insertion Order 🟡
**Difficulty**: Medium  
**Description**: Implement a simple cache that remembers insertion order.  
**Input**: Cache URLs as visited  
**Output**: URLs in visit order without duplicates  
**Hint**: Use LinkedHashSet

---

### Problem 59: Filter Duplicates in Log File 🟡
**Difficulty**: Medium  
**Description**: Read a log file and keep only first occurrence of each log entry.  
**Input**: Log entries with duplicates  
**Output**: Unique entries in order  
**Hint**: Process line by line into LinkedHashSet

---

### Problem 60: Preserve Order of Tags 🟢
**Difficulty**: Easy  
**Description**: Given tags with duplicates, keep unique tags in order they appear.  
**Input**: `["java", "python", "java", "c++", "python", "go"]`  
**Output**: `["java", "python", "c++", "go"]`  
**Hint**: LinkedHashSet

---

## TreeSet Problems {#treeset}

### Problem 61: Sort Array Using TreeSet 🟢
**Difficulty**: Easy  
**Description**: Sort an array using TreeSet.  
**Input**: `[5, 2, 8, 1, 9, 3]`  
**Output**: `[1, 2, 3, 5, 8, 9]`  
**Hint**: Add all to TreeSet

---

### Problem 62: Find Kth Smallest Element 🟡
**Difficulty**: Medium  
**Description**: Find the kth smallest element using TreeSet.  
**Input**: `arr = [7, 10, 4, 3, 20, 15], k = 3`  
**Output**: `7`  
**Hint**: Use TreeSet iterator or convert to list

---

### Problem 63: Range Query 🟡
**Difficulty**: Medium  
**Description**: Find all elements in a range [low, high] using TreeSet.  
**Input**: `set = [1, 3, 5, 7, 9, 11], low = 4, high = 10`  
**Output**: `[5, 7, 9]`  
**Hint**: Use subSet()

---

### Problem 64: Ceiling and Floor 🟡
**Difficulty**: Medium  
**Description**: For given number, find ceiling and floor in TreeSet.  
**Input**: `set = [1, 3, 5, 7, 9], num = 6`  
**Output**: `ceiling = 7, floor = 5`  
**Hint**: Use ceiling() and floor() methods

---

### Problem 65: Custom Comparator 🟡
**Difficulty**: Medium  
**Description**: Create TreeSet with custom comparator for strings by length.  
**Input**: `["apple", "pie", "banana", "cat"]`  
**Output**: Sorted by length `["pie", "cat", "apple", "banana"]`  
**Hint**: Comparator.comparingInt(String::length)

---

### Problem 66: Top K Frequent Elements 🔴
**Difficulty**: Hard  
**Description**: Find top k frequent elements maintaining sorted order.  
**Input**: `arr = [1,1,1,2,2,3], k = 2`  
**Output**: `[1, 2]`  
**Hint**: Use TreeSet with custom comparator

---

### Problem 67: Merge Intervals 🔴
**Difficulty**: Hard  
**Description**: Merge overlapping intervals using TreeSet.  
**Input**: `[[1,3], [2,6], [8,10], [15,18]]`  
**Output**: `[[1,6], [8,10], [15,18]]`  
**Hint**: TreeSet with interval comparator

---

### Problem 68: Closest Elements to Target 🟡
**Difficulty**: Medium  
**Description**: Find k closest elements to a target.  
**Input**: `set = [1, 3, 5, 7, 9], target = 6, k = 2`  
**Output**: `[5, 7]`  
**Hint**: Use higher() and lower()

---

### Problem 69: Remove Elements Outside Range 🟢
**Difficulty**: Easy  
**Description**: Remove all elements outside a given range.  
**Input**: `set = [1, 3, 5, 7, 9, 11], low = 3, high = 9`  
**Output**: `[3, 5, 7, 9]`  
**Hint**: Use headSet() and tailSet() with removeAll()

---

### Problem 70: Leaderboard System 🔴
**Difficulty**: Hard  
**Description**: Implement a leaderboard with player scores using TreeSet.  
**Input**: Player score updates  
**Output**: Top k players at any time  
**Hint**: TreeSet with custom Player comparator

---

## HashMap Problems {#hashmap}

### Problem 71: Character Frequency Count 🟢
**Difficulty**: Easy  
**Description**: Count frequency of each character in a string.  
**Input**: `"hello world"`  
**Output**: `{h=1, e=1, l=3, o=2, w=1, r=1, d=1}`  
**Hint**: Use getOrDefault()

---

### Problem 72: Two Sum Problem 🟡
**Difficulty**: Medium  
**Description**: Find two numbers that add up to target.  
**Input**: `arr = [2, 7, 11, 15], target = 9`  
**Output**: `[0, 1]` (indices)  
**Hint**: Store value and index in map

---

### Problem 73: Group Anagrams 🔴
**Difficulty**: Hard  
**Description**: Group strings that are anagrams of each other.  
**Input**: `["eat", "tea", "tan", "ate", "nat", "bat"]`  
**Output**: `[["eat","tea","ate"], ["tan","nat"], ["bat"]]`  
**Hint**: Use sorted string as key

---

### Problem 74: First Non-Repeating Character 🟡
**Difficulty**: Medium  
**Description**: Find first character that appears only once.  
**Input**: `"leetcode"`  
**Output**: `'l'`  
**Hint**: Two passes - count, then find

---

### Problem 75: Isomorphic Strings 🟡
**Difficulty**: Medium  
**Description**: Check if two strings are isomorphic.  
**Input**: `s = "egg", t = "add"`  
**Output**: `true`  
**Hint**: Map characters from s to t

---

### Problem 76: Subarray Sum Equals K 🔴
**Difficulty**: Hard  
**Description**: Count subarrays with sum equal to k.  
**Input**: `arr = [1, 1, 1], k = 2`  
**Output**: `2` (subarrays [1,1] appear twice)  
**Hint**: Store cumulative sum frequencies

---

### Problem 77: Word Pattern 🟡
**Difficulty**: Medium  
**Description**: Check if string follows a pattern.  
**Input**: `pattern = "abba", s = "dog cat cat dog"`  
**Output**: `true`  
**Hint**: Map pattern chars to words

---

### Problem 78: Longest Consecutive Sequence 🔴
**Difficulty**: Hard  
**Description**: Find length of longest consecutive sequence.  
**Input**: `[100, 4, 200, 1, 3, 2]`  
**Output**: `4` (sequence [1, 2, 3, 4])  
**Hint**: Use HashSet and check sequences

---

### Problem 79: Contains Duplicate II 🟡
**Difficulty**: Medium  
**Description**: Find if duplicate exists within k distance.  
**Input**: `arr = [1,2,3,1], k = 3`  
**Output**: `true`  
**Hint**: Store value and index

---

### Problem 80: Copy List with Random Pointer 🔴
**Difficulty**: Hard  
**Description**: Deep copy a linked list with random pointers using HashMap.  
**Input**: Custom LinkedList with random pointers  
**Output**: Deep copy  
**Hint**: Map original nodes to copied nodes

---

## LinkedHashMap Problems {#linkedhashmap}

### Problem 81: LRU Cache 🔴
**Difficulty**: Hard  
**Description**: Implement LRU (Least Recently Used) cache.  
**Input**: Capacity = 2, operations: put(1,1), put(2,2), get(1), put(3,3), get(2)  
**Output**: get(1)=1, get(2)=-1 (evicted)  
**Hint**: Use LinkedHashMap with accessOrder=true

---

### Problem 82: Maintain Insertion Order 🟢
**Difficulty**: Easy  
**Description**: Store and retrieve key-value pairs in insertion order.  
**Input**: Put (3,30), (1,10), (2,20)  
**Output**: Iteration order: 3=30, 1=10, 2=20  
**Hint**: Default LinkedHashMap behavior

---

### Problem 83: Access Order vs Insertion Order 🟡
**Difficulty**: Medium  
**Description**: Demonstrate difference between access and insertion order.  
**Input**: Same puts and gets on both types  
**Output**: Show different iteration orders  
**Hint**: accessOrder parameter in constructor

---

### Problem 84: Most Recently Used Items 🟡
**Difficulty**: Medium  
**Description**: Keep track of most recently accessed items.  
**Input**: Access sequence: A, B, C, A, D  
**Output**: Order after: D, A, C, B (if using access order)  
**Hint**: LinkedHashMap with accessOrder=true

---

### Problem 85: Remove Eldest Entry 🟡
**Difficulty**: Medium  
**Description**: Override removeEldestEntry() to limit map size.  
**Input**: Max size = 3, add 5 elements  
**Output**: Only last 3 remain  
**Hint**: Override removeEldestEntry()

---

### Problem 86: Browser History 🟡
**Difficulty**: Medium  
**Description**: Implement browser history with limited size.  
**Input**: Visit URLs, maintain last N URLs  
**Output**: N most recent URLs in order  
**Hint**: LinkedHashMap with size limit

---

### Problem 87: Command History 🟡
**Difficulty**: Medium  
**Description**: Implement command-line history maintaining order.  
**Input**: Commands executed  
**Output**: History in execution order  
**Hint**: LinkedHashMap

---

### Problem 88: Preserve Order in JSON 🟢
**Difficulty**: Easy  
**Description**: Parse JSON maintaining field order.  
**Input**: JSON string  
**Output**: LinkedHashMap preserving order  
**Hint**: Use LinkedHashMap for JSON parsing

---

### Problem 89: FIFO Cache 🟡
**Difficulty**: Medium  
**Description**: Implement FIFO cache using LinkedHashMap.  
**Input**: Fixed capacity, evict first inserted  
**Output**: Proper FIFO behavior  
**Hint**: Insertion order with removeEldestEntry()

---

### Problem 90: Replay Actions in Order 🟡
**Difficulty**: Medium  
**Description**: Record and replay user actions in order.  
**Input**: User actions with timestamps  
**Output**: Actions in order they occurred  
**Hint**: LinkedHashMap with action as key

---

## TreeMap Problems {#treemap}

### Problem 91: Sort HashMap by Keys 🟢
**Difficulty**: Easy  
**Description**: Sort a HashMap by keys using TreeMap.  
**Input**: `{3="three", 1="one", 2="two"}`  
**Output**: `{1="one", 2="two", 3="three"}`  
**Hint**: New TreeMap(hashMap)

---

### Problem 92: Range Sum Query 🟡
**Difficulty**: Medium  
**Description**: Find sum of values for keys in range [low, high].  
**Input**: `map = {1=10, 2=20, 3=30, 4=40}, low=2, high=4`  
**Output**: `90` (20+30+40)  
**Hint**: Use subMap()

---

### Problem 93: Find Closest Key 🟡
**Difficulty**: Medium  
**Description**: Find closest key to a given value.  
**Input**: `map keys = [1, 5, 10, 15], target = 8`  
**Output**: `10` or `5` (closest)  
**Hint**: Use floorKey() and ceilingKey()

---

### Problem 94: K Closest Keys to Target 🔴
**Difficulty**: Hard  
**Description**: Find k keys closest to target value.  
**Input**: `map keys = [1, 3, 5, 7, 9], target = 6, k = 2`  
**Output**: `[5, 7]`  
**Hint**: Use floorKey(), ceilingKey() and iterate

---

### Problem 95: Count Words in Range 🟡
**Difficulty**: Medium  
**Description**: Count words alphabetically in range [start, end].  
**Input**: `words, start = "apple", end = "cherry"`  
**Output**: Count of words in range  
**Hint**: TreeMap with subMap()

---

### Problem 96: Top K Frequent Words 🔴
**Difficulty**: Hard  
**Description**: Return k most frequent words in lexicographic order.  
**Input**: `["i","love","leetcode","i","love","coding"], k=2`  
**Output**: `["i", "love"]`  
**Hint**: TreeMap with custom comparator

---

### Problem 97: Implement Phone Directory 🔴
**Difficulty**: Hard  
**Description**: Implement phone directory with range search.  
**Input**: Names and phone numbers  
**Output**: Search by name prefix  
**Hint**: TreeMap with subMap() for prefix search

---

### Problem 98: Merge Overlapping Intervals 🔴
**Difficulty**: Hard  
**Description**: Merge overlapping intervals using TreeMap.  
**Input**: `[[1,3], [2,6], [8,10], [15,18]]`  
**Output**: `[[1,6], [8,10], [15,18]]`  
**Hint**: TreeMap sorted by start time

---

### Problem 99: Custom Comparator 🟡
**Difficulty**: Medium  
**Description**: Create TreeMap sorted by string length.  
**Input**: `{"a"=1, "bbb"=2, "cc"=3}`  
**Output**: Sorted by key length  
**Hint**: Comparator.comparingInt(String::length)

---

### Problem 100: Calendar Booking 🔴
**Difficulty**: Hard  
**Description**: Implement calendar that doesn't allow double bookings.  
**Input**: Book intervals  
**Output**: true/false for each booking  
**Hint**: TreeMap to check overlaps

---

## Hashtable Problems {#hashtable}

### Problem 101: Thread-Safe Counter 🟢
**Difficulty**: Easy  
**Description**: Implement thread-safe word counter using Hashtable.  
**Input**: Multiple threads counting words  
**Output**: Accurate word count  
**Hint**: Hashtable is synchronized

---

### Problem 102: Compare with HashMap 🟢
**Difficulty**: Easy  
**Description**: Demonstrate synchronization difference between HashMap and Hashtable.  
**Input**: Concurrent modifications  
**Output**: Show thread-safety of Hashtable  
**Hint**: Run concurrent threads

---

### Problem 103: Null Key/Value Handling 🟢
**Difficulty**: Easy  
**Description**: Show that Hashtable doesn't allow null keys or values.  
**Input**: Try to put null key and null value  
**Output**: NullPointerException  
**Hint**: Try-catch the exceptions

---

### Problem 104: Legacy Code Migration 🟡
**Difficulty**: Medium  
**Description**: Convert Hashtable code to use ConcurrentHashMap.  
**Input**: Code using Hashtable  
**Output**: Equivalent code with ConcurrentHashMap  
**Hint**: Replace and test

---

### Problem 105: Synchronized Operations 🟡
**Difficulty**: Medium  
**Description**: Perform compound operations safely on Hashtable.  
**Input**: Check-then-put operations  
**Output**: Thread-safe execution  
**Hint**: Synchronize on hashtable

---

### Problem 106: Enumeration vs Iterator 🟢
**Difficulty**: Easy  
**Description**: Show difference between Enumeration and Iterator on Hashtable.  
**Input**: Hashtable with elements  
**Output**: Different iteration behaviors  
**Hint**: Use elements() vs entrySet()

---

### Problem 107: Properties File Reader 🟡
**Difficulty**: Medium  
**Description**: Read properties file into Hashtable (Properties extends Hashtable).  
**Input**: .properties file  
**Output**: Key-value pairs  
**Hint**: Use Properties class

---

### Problem 108: Clone Hashtable 🟢
**Difficulty**: Easy  
**Description**: Clone a Hashtable and verify independence.  
**Input**: Hashtable with entries  
**Output**: Cloned hashtable  
**Hint**: Use clone() method

---

### Problem 109: Concurrent Read-Write 🟡
**Difficulty**: Medium  
**Description**: Demonstrate that Hashtable handles concurrent reads and writes.  
**Input**: Multiple reader and writer threads  
**Output**: No corruption  
**Hint**: Create reader and writer threads

---

### Problem 110: Migration to Modern Collections 🟡
**Difficulty**: Medium  
**Description**: Refactor code from Hashtable to modern alternatives.  
**Input**: Legacy Hashtable code  
**Output**: Modern equivalent code  
**Hint**: Use ConcurrentHashMap or synchronizedMap

---

## PriorityQueue Problems {#priorityqueue}

### Problem 111: Kth Largest Element 🟡
**Difficulty**: Medium  
**Description**: Find kth largest element in array using PriorityQueue.  
**Input**: `arr = [3, 2, 1, 5, 6, 4], k = 2`  
**Output**: `5`  
**Hint**: Min-heap of size k

---

### Problem 112: Merge K Sorted Lists 🔴
**Difficulty**: Hard  
**Description**: Merge k sorted linked lists using PriorityQueue.  
**Input**: `[[1,4,5], [1,3,4], [2,6]]`  
**Output**: `[1,1,2,3,4,4,5,6]`  
**Hint**: PriorityQueue with list heads

---

### Problem 113: Task Scheduler 🟡
**Difficulty**: Medium  
**Description**: Schedule tasks by priority using PriorityQueue.  
**Input**: Tasks with priorities  
**Output**: Execution order  
**Hint**: Max-heap with priority

---

### Problem 114: Top K Frequent Elements 🟡
**Difficulty**: Medium  
**Description**: Find k most frequent elements.  
**Input**: `nums = [1,1,1,2,2,3], k = 2`  
**Output**: `[1, 2]`  
**Hint**: Frequency map + min-heap

---

### Problem 115: Median from Data Stream 🔴
**Difficulty**: Hard  
**Description**: Find median of a stream of numbers.  
**Input**: Stream [5, 15, 1, 3]  
**Output**: Median after each number  
**Hint**: Two heaps (max-heap and min-heap)

---

### Problem 116: K Closest Points to Origin 🟡
**Difficulty**: Medium  
**Description**: Find k closest points to origin (0,0).  
**Input**: `points = [[1,3], [-2,2]], k = 1`  
**Output**: `[[-2,2]]`  
**Hint**: Max-heap of size k by distance

---

### Problem 117: Reorganize String 🔴
**Difficulty**: Hard  
**Description**: Reorganize string so no two adjacent chars are same.  
**Input**: `"aab"`  
**Output**: `"aba"`  
**Hint**: Max-heap by frequency

---

### Problem 118: Kth Smallest in Sorted Matrix 🔴
**Difficulty**: Hard  
**Description**: Find kth smallest element in sorted matrix.  
**Input**: `matrix = [[1,5,9], [10,11,13], [12,13,15]], k = 8`  
**Output**: `13`  
**Hint**: Min-heap with matrix elements

---

### Problem 119: Meeting Rooms II 🔴
**Difficulty**: Hard  
**Description**: Find minimum meeting rooms required.  
**Input**: `intervals = [[0,30], [5,10], [15,20]]`  
**Output**: `2`  
**Hint**: Min-heap for end times

---

### Problem 120: Ugly Number II 🔴
**Difficulty**: Hard  
**Description**: Find nth ugly number (divisible only by 2, 3, 5).  
**Input**: `n = 10`  
**Output**: `12` (sequence: 1,2,3,4,5,6,8,9,10,12)  
**Hint**: Min-heap generating multiples

---

## ArrayDeque Problems {#arraydeque}

### Problem 121: Implement Stack 🟢
**Difficulty**: Easy  
**Description**: Implement stack using ArrayDeque.  
**Input**: push(1), push(2), pop(), push(3), pop()  
**Output**: 2, 3  
**Hint**: Use push() and pop()

---

### Problem 122: Implement Queue 🟢
**Difficulty**: Easy  
**Description**: Implement queue using ArrayDeque.  
**Input**: offer(1), offer(2), poll(), offer(3), poll()  
**Output**: 1, 2  
**Hint**: Use offerLast() and pollFirst()

---

### Problem 123: Sliding Window Maximum 🔴
**Difficulty**: Hard  
**Description**: Find maximum in each sliding window of size k.  
**Input**: `arr = [1,3,-1,-3,5,3,6,7], k = 3`  
**Output**: `[3, 3, 5, 5, 6, 7]`  
**Hint**: Deque to store indices

---

### Problem 124: Valid Parentheses 🟢
**Difficulty**: Easy  
**Description**: Check balanced parentheses using ArrayDeque as stack.  
**Input**: `"()[]{}"`  
**Output**: `true`  
**Hint**: Push/pop brackets

---

### Problem 125: Reverse First K Elements 🟡
**Difficulty**: Medium  
**Description**: Reverse first k elements of queue.  
**Input**: `queue = [1,2,3,4,5], k = 3`  
**Output**: `[3,2,1,4,5]`  
**Hint**: Use stack (ArrayDeque)

---

### Problem 126: Generate Binary Numbers 🟡
**Difficulty**: Medium  
**Description**: Generate binary numbers from 1 to n.  
**Input**: `n = 5`  
**Output**: `["1", "10", "11", "100", "101"]`  
**Hint**: Queue, append 0 and 1

---

### Problem 127: First Non-Repeating in Stream 🟡
**Difficulty**: Medium  
**Description**: Find first non-repeating character in stream.  
**Input**: Stream "aabc"  
**Output**: After each char: a, -1, -1, b  
**Hint**: Queue + frequency map

---

### Problem 128: Implement Circular Queue 🟡
**Difficulty**: Medium  
**Description**: Implement circular queue using ArrayDeque.  
**Input**: Fixed size operations  
**Output**: Circular behavior  
**Hint**: Check size before operations

---

### Problem 129: Palindrome Check 🟢
**Difficulty**: Easy  
**Description**: Check if string is palindrome using deque.  
**Input**: `"racecar"`  
**Output**: `true`  
**Hint**: Compare from both ends

---

### Problem 130: Max of All Subarrays 🔴
**Difficulty**: Hard  
**Description**: Find max of all subarrays of size k using deque.  
**Input**: `arr = [1,2,3,1,4,5], k = 3`  
**Output**: `[3, 3, 4, 5]`  
**Hint**: Deque stores indices of useful elements

---

## Mixed Collections Problems {#mixed}

### Problem 131: LFU Cache 🔴
**Difficulty**: Hard  
**Description**: Implement LFU (Least Frequently Used) cache using HashMap + LinkedHashSet.  
**Input**: Capacity = 2, operations  
**Output**: Proper LFU eviction  
**Hint**: HashMap<key, value>, HashMap<frequency, LinkedHashSet<key>>

---

### Problem 132: Design Twitter 🔴
**Difficulty**: Hard  
**Description**: Design simplified Twitter using HashMap + PriorityQueue.  
**Input**: postTweet, getNewsFeed, follow, unfollow  
**Output**: Proper timeline  
**Hint**: HashMap<userId, Set<followeeId>>, HashMap<userId, List<tweetId>>

---

### Problem 133: Word Ladder 🔴
**Difficulty**: Hard  
**Description**: Find shortest transformation sequence using Queue + HashSet.  
**Input**: `beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]`  
**Output**: `5` (hit -> hot -> dot -> dog -> cog)  
**Hint**: BFS with queue, visited set

---

### Problem 134: Find Itinerary 🔴
**Difficulty**: Hard  
**Description**: Reconstruct itinerary using HashMap + PriorityQueue.  
**Input**: `tickets = [["JFK","SFO"], ["JFK","ATL"], ["SFO","ATL"]]`  
**Output**: `["JFK","ATL","SFO","ATL"]`  
**Hint**: HashMap<from, PriorityQueue<to>>

---

### Problem 135: Alien Dictionary 🔴
**Difficulty**: Hard  
**Description**: Derive order of alien language using HashMap + Stack/Queue.  
**Input**: `words = ["wrt","wrf","er","ett","rftt"]`  
**Output**: `"wertf"`  
**Hint**: Topological sort with graph (HashMap)

---

### Problem 136: Design Search Autocomplete 🔴
**Difficulty**: Hard  
**Description**: Design autocomplete using Trie (HashMap) + PriorityQueue.  
**Input**: Sentences and their frequencies  
**Output**: Top 3 matches for prefix  
**Hint**: Trie with frequency, PriorityQueue for top k

---

### Problem 137: Course Schedule 🔴
**Difficulty**: Hard  
**Description**: Check if courses can be finished using HashMap + Queue.  
**Input**: `numCourses = 2, prerequisites = [[1,0]]`  
**Output**: `true`  
**Hint**: Topological sort (Kahn's algorithm)

---

### Problem 138: Design File System 🔴
**Difficulty**: Hard  
**Description**: Design file system using HashMap + TreeMap.  
**Input**: Create, get paths  
**Output**: Proper path operations  
**Hint**: HashMap for paths, TreeMap for sorted subdirectories

---

### Problem 139: Time-Based Key-Value Store 🔴
**Difficulty**: Hard  
**Description**: Implement time-based store using HashMap + TreeMap.  
**Input**: `set(key, value, timestamp), get(key, timestamp)`  
**Output**: Value at or before timestamp  
**Hint**: HashMap<key, TreeMap<timestamp, value>>

---

### Problem 140: Design In-Memory File System 🔴
**Difficulty**: Hard  
**Description**: Design file system with ls, mkdir, addContentToFile using HashMap + TreeSet.  
**Input**: File operations  
**Output**: Proper directory structure  
**Hint**: HashMap for structure, TreeSet for sorted listing

---

### Problem 141: Snapshot Array 🔴
**Difficulty**: Hard  
**Description**: Implement array with snapshot using ArrayList + HashMap.  
**Input**: set(index, val), snap(), get(index, snap_id)  
**Output**: Value at snapshot  
**Hint**: ArrayList<HashMap<index, value>>

---

### Problem 142: Design Browser History 🔴
**Difficulty**: Hard  
**Description**: Design browser history using ArrayDeque + ArrayList.  
**Input**: visit(url), back(steps), forward(steps)  
**Output**: Current URL  
**Hint**: Two stacks or ArrayList with pointer

---

### Problem 143: Design Excel Sum Formula 🔴
**Difficulty**: Hard  
**Description**: Design Excel with formulas using HashMap + TopologicalSort.  
**Input**: set(row, col, val), get(row, col), sum(row, col, range)  
**Output**: Cell values with dependencies  
**Hint**: HashMap for cells, track dependencies

---

### Problem 144: Range Module 🔴
**Difficulty**: Hard  
**Description**: Track ranges using TreeMap + merge intervals.  
**Input**: addRange, removeRange, queryRange  
**Output**: Whether range tracked  
**Hint**: TreeMap to store merged intervals

---

### Problem 145: Design Hit Counter 🟡
**Difficulty**: Medium  
**Description**: Count hits in last 5 minutes using Queue + HashMap.  
**Input**: hit(timestamp), getHits(timestamp)  
**Output**: Hits in last 300 seconds  
**Hint**: Queue for timestamps or HashMap<timestamp, count>

---

### Problem 146: My Calendar III 🔴
**Difficulty**: Hard  
**Description**: Find max k-booking using TreeMap.  
**Input**: book(start, end) calls  
**Output**: Max overlapping bookings  
**Hint**: TreeMap for event counts, sweep line

---

### Problem 147: Design Phone Directory 🟡
**Difficulty**: Medium  
**Description**: Design phone directory using HashSet + Queue.  
**Input**: get(), check(number), release(number)  
**Output**: Proper number management  
**Hint**: HashSet for available, Queue for released

---

### Problem 148: Design Underground System 🟡
**Difficulty**: Medium  
**Description**: Track metro times using nested HashMap.  
**Input**: checkIn, checkOut, getAverageTime  
**Output**: Average travel time  
**Hint**: HashMap<id, checkInData>, HashMap<route, timeData>

---

### Problem 149: Design Parking System 🟢
**Difficulty**: Easy  
**Description**: Design parking lot using HashMap or simple counter.  
**Input**: addCar(carType)  
**Output**: true/false based on availability  
**Hint**: HashMap<carType, availableSpots>

---

### Problem 150: Design Logger Rate Limiter 🟢
**Difficulty**: Easy  
**Description**: Limit message logging using HashMap.  
**Input**: shouldPrintMessage(timestamp, message)  
**Output**: true if 10 seconds passed since last print  
**Hint**: HashMap<message, lastTimestamp>

---

## Summary

**Total Problems**: 150
- **Easy**: 40 problems 🟢
- **Medium**: 65 problems 🟡
- **Hard**: 45 problems 🔴

**Topics Covered**:
1. ArrayList (10)
2. LinkedList (10)
3. Vector (10)
4. Stack (10)
5. HashSet (10)
6. LinkedHashSet (10)
7. TreeSet (10)
8. HashMap (10)
9. LinkedHashMap (10)
10. TreeMap (10)
11. Hashtable (10)
12. PriorityQueue (10)
13. ArrayDeque (10)
14. Mixed Collections (20)

**Study Plan**:
1. Master concepts first (read the concepts file)
2. Start with Easy problems in each section
3. Move to Medium problems
4. Attempt Hard problems
5. Practice Mixed problems to combine knowledge

**Tips**:
- Understand time complexity of each collection
- Know when to use which collection
- Practice with real-world scenarios
- Implement solutions from scratch
- Test edge cases thoroughly

Good luck with your Java Collections journey! 🚀
