package com.subh.collection_framwork;

import java.util.*;

/**
 * Java Collections Framework - Complete Solutions to 150 Problems
 * 
 * Author: Practice Solutions
 * Total Problems: 150
 * Organization: By Collection Type
 * 
 * TABLE OF CONTENTS:
 * =================
 * 1. ArrayList Solutions (Problems 1-10)
 * 2. LinkedList Solutions (Problems 11-20)
 * 3. Vector Solutions (Problems 21-30)
 * 4. Stack Solutions (Problems 31-40)
 * 5. HashSet Solutions (Problems 41-50)
 * 6. LinkedHashSet Solutions (Problems 51-60)
 * 7. TreeSet Solutions (Problems 61-70)
 * 8. HashMap Solutions (Problems 71-80)
 * 9. LinkedHashMap Solutions (Problems 81-90)
 * 10. TreeMap Solutions (Problems 91-100)
 * 11. Hashtable Solutions (Problems 101-110)
 * 12. PriorityQueue Solutions (Problems 111-120)
 * 13. ArrayDeque Solutions (Problems 121-130)
 * 14. Mixed Collections Solutions (Problems 131-150)
 */

public class JavaCollections_Solutions {

    // ============================================================================
    // ARRAYLIST SOLUTIONS (Problems 1-10)
    // ============================================================================

    /**
     * Problem 1: Remove Even Numbers
     * Difficulty: Easy
     * Time: O(n), Space: O(1)
     */
    public static List<Integer> removeEvenNumbers(List<Integer> list) {
        // Using removeIf - most elegant solution
        list.removeIf(num -> num % 2 == 0);
        return list;
        
        /* Alternative 1: Using Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        return list;
        */
        
        /* Alternative 2: Create new list
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;
        */
    }

    /**
     * Problem 2: Find Second Largest Element
     * Difficulty: Medium
     * Time: O(n), Space: O(1)
     */
    public static int findSecondLargest(List<Integer> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must have at least 2 elements");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }
        
        return secondLargest;
    }

    /**
     * Problem 3: Rotate ArrayList
     * Difficulty: Medium
     * Time: O(n), Space: O(1)
     */
    public static void rotateArrayList(List<Integer> list, int k) {
        if (list == null || list.isEmpty() || k == 0) {
            return;
        }
        
        int n = list.size();
        k = k % n; // Handle k > n
        
        // Using Collections.rotate
        Collections.rotate(list, k);
        
        /* Alternative: Manual rotation using reversal
        // Step 1: Reverse entire list
        Collections.reverse(list);
        // Step 2: Reverse first k elements
        Collections.reverse(list.subList(0, k));
        // Step 3: Reverse remaining elements
        Collections.reverse(list.subList(k, n));
        */
    }

    /**
     * Problem 4: Merge Two Sorted ArrayLists
     * Difficulty: Medium
     * Time: O(n + m), Space: O(n + m)
     */
    public static List<Integer> mergeSortedArrayLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;
        
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }
        
        // Add remaining elements
        while (i < list1.size()) {
            merged.add(list1.get(i++));
        }
        
        while (j < list2.size()) {
            merged.add(list2.get(j++));
        }
        
        return merged;
    }

    /**
     * Problem 5: Find All Duplicates
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static List<Integer> findAllDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>(); // Maintain order
        
        for (int num : list) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        return new ArrayList<>(duplicates);
    }

    /**
     * Problem 6: Remove Duplicates Maintaining Order
     * Difficulty: Easy
     * Time: O(n), Space: O(n)
     */
    public static List<Integer> removeDuplicatesWithOrder(List<Integer> list) {
        // LinkedHashSet maintains insertion order
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    /**
     * Problem 7: ArrayList Partition
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static Map<String, List<Integer>> partitionArrayList(List<Integer> list) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for (int num : list) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("even", even);
        result.put("odd", odd);
        return result;
        
        /* Java 8 Stream alternative
        Map<Boolean, List<Integer>> partitioned = list.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("even", partitioned.get(true));
        result.put("odd", partitioned.get(false));
        return result;
        */
    }

    /**
     * Problem 8: Find Missing Number
     * Difficulty: Easy
     * Time: O(n), Space: O(1)
     */
    public static int findMissingNumber(List<Integer> list) {
        int n = list.size();
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : list) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
        
        /* Alternative: Using XOR
        int xor = n;
        for (int i = 0; i < n; i++) {
            xor ^= i ^ list.get(i);
        }
        return xor;
        */
    }

    /**
     * Problem 9: Move Zeros to End
     * Difficulty: Medium
     * Time: O(n), Space: O(1)
     */
    public static void moveZerosToEnd(List<Integer> list) {
        int nonZeroIndex = 0;
        
        // Move all non-zero elements to front
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(nonZeroIndex++, list.get(i));
            }
        }
        
        // Fill remaining with zeros
        while (nonZeroIndex < list.size()) {
            list.set(nonZeroIndex++, 0);
        }
    }

    /**
     * Problem 10: Find Intersection of Two ArrayLists (with duplicates)
     * Difficulty: Hard
     * Time: O(n + m), Space: O(min(n, m))
     */
    public static List<Integer> findIntersectionWithDuplicates(List<Integer> list1, List<Integer> list2) {
        Map<Integer, Integer> freq1 = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        // Count frequencies in list1
        for (int num : list1) {
            freq1.put(num, freq1.getOrDefault(num, 0) + 1);
        }
        
        // Find intersection with list2
        for (int num : list2) {
            if (freq1.getOrDefault(num, 0) > 0) {
                result.add(num);
                freq1.put(num, freq1.get(num) - 1);
            }
        }
        
        return result;
    }

    // ============================================================================
    // LINKEDLIST SOLUTIONS (Problems 11-20)
    // ============================================================================

    /**
     * Problem 11: Reverse LinkedList
     * Difficulty: Easy
     * Time: O(n), Space: O(1)
     */
    public static void reverseLinkedList(LinkedList<Integer> list) {
        Collections.reverse(list);
        
        /* Alternative: Manual reversal
        int left = 0, right = list.size() - 1;
        while (left < right) {
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        */
    }

    /**
     * Problem 12: Find Middle Element
     * Difficulty: Medium
     * Time: O(n), Space: O(1)
     */
    public static int findMiddleElement(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        
        return list.get(list.size() / 2);
        
        /* For singly linked list (custom implementation), use slow-fast pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
        */
    }

    /**
     * Problem 13: Remove Nth Node from End
     * Difficulty: Medium
     * Time: O(n), Space: O(1)
     */
    public static void removeNthFromEnd(LinkedList<Integer> list, int n) {
        if (n <= 0 || n > list.size()) {
            throw new IllegalArgumentException("Invalid n");
        }
        
        int indexToRemove = list.size() - n;
        list.remove(indexToRemove);
    }

    /**
     * Problem 14: Custom LinkedList with Cycle Detection
     * Difficulty: Hard
     */
    static class CustomLinkedList<T> {
        static class Node<T> {
            T data;
            Node<T> next;
            
            Node(T data) {
                this.data = data;
            }
        }
        
        Node<T> head;
        
        public boolean hasCycle() {
            if (head == null) return false;
            
            Node<T> slow = head;
            Node<T> fast = head;
            
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                
                if (slow == fast) {
                    return true;
                }
            }
            
            return false;
        }
    }

    /**
     * Problem 15: Palindrome Check
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static boolean isPalindromeLinkedList(LinkedList<Integer> list) {
        if (list.isEmpty()) return true;
        
        // Compare with reversed version
        LinkedList<Integer> reversed = new LinkedList<>(list);
        Collections.reverse(reversed);
        return list.equals(reversed);
        
        /* Space O(1) approach for custom linked list:
        1. Find middle
        2. Reverse second half
        3. Compare both halves
        4. Restore list (optional)
        */
    }

    /**
     * Problem 16: Swap Adjacent Nodes
     * Difficulty: Medium
     * Time: O(n), Space: O(1)
     */
    public static void swapAdjacentNodes(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            Integer temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    /**
     * Problem 17: Add Two Numbers as LinkedList
     * Difficulty: Hard
     * Time: O(max(m, n)), Space: O(max(m, n))
     */
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;
        int i = 0;
        
        while (i < l1.size() || i < l2.size() || carry > 0) {
            int digit1 = i < l1.size() ? l1.get(i) : 0;
            int digit2 = i < l2.size() ? l2.get(i) : 0;
            
            int sum = digit1 + digit2 + carry;
            result.add(sum % 10);
            carry = sum / 10;
            i++;
        }
        
        return result;
    }

    /**
     * Problem 18: Merge Two Sorted LinkedLists
     * Difficulty: Medium
     * Time: O(n + m), Space: O(n + m)
     */
    public static LinkedList<Integer> mergeSortedLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> merged = new LinkedList<>();
        int i = 0, j = 0;
        
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                merged.add(l1.get(i++));
            } else {
                merged.add(l2.get(j++));
            }
        }
        
        while (i < l1.size()) merged.add(l1.get(i++));
        while (j < l2.size()) merged.add(l2.get(j++));
        
        return merged;
    }

    /**
     * Problem 19: Remove Duplicates from Sorted LinkedList
     * Difficulty: Easy
     * Time: O(n), Space: O(1)
     */
    public static void removeDuplicatesFromSorted(LinkedList<Integer> list) {
        if (list.size() <= 1) return;
        
        Iterator<Integer> it = list.iterator();
        Integer prev = it.next();
        
        while (it.hasNext()) {
            Integer current = it.next();
            if (current.equals(prev)) {
                it.remove();
            } else {
                prev = current;
            }
        }
    }

    /**
     * Problem 20: Rotate LinkedList
     * Difficulty: Hard
     * Time: O(n), Space: O(1)
     */
    public static void rotateLinkedList(LinkedList<Integer> list, int k) {
        if (list.isEmpty() || k == 0) return;
        
        int n = list.size();
        k = k % n;
        if (k == 0) return;
        
        // Move last k elements to front
        for (int i = 0; i < k; i++) {
            list.addFirst(list.removeLast());
        }
    }

    // ============================================================================
    // VECTOR SOLUTIONS (Problems 21-30)
    // ============================================================================

    /**
     * Problem 21: Thread-Safe Counter
     * Difficulty: Easy
     */
    static class ThreadSafeCounter {
        private Vector<Integer> counts = new Vector<>();
        
        public synchronized void increment(int threadId) {
            // Ensure vector has space for this thread
            while (counts.size() <= threadId) {
                counts.add(0);
            }
            counts.set(threadId, counts.get(threadId) + 1);
        }
        
        public synchronized int getTotal() {
            return counts.stream().mapToInt(Integer::intValue).sum();
        }
    }

    /**
     * Problem 22: Find Capacity vs Size
     * Difficulty: Easy
     */
    public static void demonstrateCapacityVsSize() {
        Vector<Integer> vector = new Vector<>();
        System.out.println("Initial - Capacity: " + vector.capacity() + ", Size: " + vector.size());
        
        for (int i = 1; i <= 15; i++) {
            vector.add(i);
            System.out.println("After adding " + i + " - Capacity: " + vector.capacity() + ", Size: " + vector.size());
        }
    }

    /**
     * Problem 23: Convert Vector to Array
     * Difficulty: Easy
     */
    public static Object[] vectorToArray(Vector<Integer> vector) {
        return vector.toArray();
    }
    
    public static Vector<Integer> arrayToVector(Integer[] array) {
        return new Vector<>(Arrays.asList(array));
    }

    /**
     * Problem 24: Synchronized Iteration
     * Difficulty: Medium
     */
    public static void synchronizedIteration(Vector<Integer> vector) {
        synchronized (vector) {
            Iterator<Integer> it = vector.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
                // Safe to iterate while other threads modify
            }
        }
    }

    /**
     * Problem 25: Remove Elements While Iterating
     * Difficulty: Medium
     * Time: O(n), Space: O(1)
     */
    public static void removeElementsAboveThreshold(Vector<Integer> vector, int threshold) {
        vector.removeIf(num -> num > threshold);
        
        /* Alternative: Using Iterator
        Iterator<Integer> it = vector.iterator();
        while (it.hasNext()) {
            if (it.next() > threshold) {
                it.remove();
            }
        }
        */
    }

    /**
     * Problem 26: Clone vs Copy
     * Difficulty: Easy
     */
    public static void demonstrateCloneVsCopy() {
        Vector<Integer> original = new Vector<>(Arrays.asList(1, 2, 3));
        
        // Clone (shallow copy)
        @SuppressWarnings("unchecked")
        Vector<Integer> cloned = (Vector<Integer>) original.clone();
        
        // Copy constructor
        Vector<Integer> copied = new Vector<>(original);
        
        // Modify cloned
        cloned.set(0, 100);
        
        System.out.println("Original: " + original); // [1, 2, 3]
        System.out.println("Cloned: " + cloned);     // [100, 2, 3]
        System.out.println("Copied: " + copied);     // [1, 2, 3]
    }

    /**
     * Problem 27: Bulk Operations
     * Difficulty: Medium
     */
    public static void demonstrateBulkOperations(Vector<Integer> v1, Vector<Integer> v2) {
        // Union (addAll)
        Vector<Integer> union = new Vector<>(v1);
        union.addAll(v2);
        System.out.println("Union: " + union);
        
        // Intersection (retainAll)
        Vector<Integer> intersection = new Vector<>(v1);
        intersection.retainAll(v2);
        System.out.println("Intersection: " + intersection);
        
        // Difference (removeAll)
        Vector<Integer> difference = new Vector<>(v1);
        difference.removeAll(v2);
        System.out.println("Difference: " + difference);
    }

    /**
     * Problem 28: Ensure Capacity Optimization
     * Difficulty: Medium
     */
    public static void demonstrateEnsureCapacity() {
        int n = 1000;
        
        // Without ensureCapacity
        long start1 = System.nanoTime();
        Vector<Integer> v1 = new Vector<>();
        for (int i = 0; i < n; i++) {
            v1.add(i);
        }
        long time1 = System.nanoTime() - start1;
        
        // With ensureCapacity
        long start2 = System.nanoTime();
        Vector<Integer> v2 = new Vector<>();
        v2.ensureCapacity(n);
        for (int i = 0; i < n; i++) {
            v2.add(i);
        }
        long time2 = System.nanoTime() - start2;
        
        System.out.println("Without ensureCapacity: " + time1 + " ns");
        System.out.println("With ensureCapacity: " + time2 + " ns");
        System.out.println("Improvement: " + ((time1 - time2) * 100.0 / time1) + "%");
    }

    /**
     * Problem 29: Replace All Elements
     * Difficulty: Easy
     */
    public static void replaceAllOccurrences(Vector<Integer> vector, int oldVal, int newVal) {
        vector.replaceAll(n -> n == oldVal ? newVal : n);
        
        /* Alternative
        Collections.replaceAll(vector, oldVal, newVal);
        */
    }

    /**
     * Problem 30: First and Last Occurrence
     * Difficulty: Easy
     */
    public static int[] findFirstAndLastOccurrence(Vector<Integer> vector, int target) {
        int first = vector.indexOf(target);
        int last = vector.lastIndexOf(target);
        return new int[]{first, last};
    }

    // ============================================================================
    // STACK SOLUTIONS (Problems 31-40)
    // ============================================================================

    /**
     * Problem 31: Balanced Parentheses
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static boolean isBalancedParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = Map.of(')', '(', '}', '{', ']', '[');
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    /**
     * Problem 32: Reverse String Using Stack
     * Difficulty: Easy
     * Time: O(n), Space: O(n)
     */
    public static String reverseStringUsingStack(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Push all characters
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        
        // Pop to build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }

    /**
     * Problem 33: Implement Min Stack
     * Difficulty: Hard
     * Time: O(1) for all operations, Space: O(n)
     */
    static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;
        
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }
        
        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }
        
        public void pop() {
            int popped = stack.pop();
            if (popped == minStack.peek()) {
                minStack.pop();
            }
        }
        
        public int top() {
            return stack.peek();
        }
        
        public int getMin() {
            return minStack.peek();
        }
    }

    /**
     * Problem 34: Evaluate Postfix Expression
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(token, a, b);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
    
    private static int applyOperator(String op, int a, int b) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

    /**
     * Problem 35: Next Greater Element
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop smaller elements
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        
        return result;
    }

    /**
     * Problem 36: Valid Stack Sequences
     * Difficulty: Hard
     * Time: O(n), Space: O(n)
     */
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        
        for (int value : pushed) {
            stack.push(value);
            
            // Check if we can pop
            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        
        return stack.isEmpty();
    }

    /**
     * Problem 37: Sort Stack
     * Difficulty: Hard
     * Time: O(n²), Space: O(n)
     */
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            
            // Move elements from tempStack to stack while they're greater than temp
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(temp);
        }
        
        // Transfer sorted elements back to original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    /**
     * Problem 38: Implement Queue Using Two Stacks
     * Difficulty: Medium
     */
    static class QueueUsingStacks {
        private Stack<Integer> stack1; // For enqueue
        private Stack<Integer> stack2; // For dequeue
        
        public QueueUsingStacks() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }
        
        public void enqueue(int x) {
            stack1.push(x);
        }
        
        public int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
        
        public int peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }
        
        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }

    /**
     * Problem 39: Remove Adjacent Duplicates
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static String removeAdjacentDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // Remove duplicate
            } else {
                stack.push(c);
            }
        }
        
        // Build result
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();
    }

    /**
     * Problem 40: Decode String
     * Difficulty: Hard
     * Time: O(n), Space: O(n)
     */
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int k = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = "";
                k = 0;
            } else if (c == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();
            } else {
                currentString += c;
            }
        }
        
        return currentString;
    }

    // TO BE CONTINUED - File continues in Part 2...
    // This is Part 1 containing solutions 1-40
    // See JavaCollections_Solutions_Part2.java for problems 41-150

    /**
     * Main method to run example tests
     */
    public static void main(String[] args) {
        System.out.println("=== Java Collections Solutions - Part 1 (Problems 1-40) ===\n");
        
        // Test ArrayList Problems
        System.out.println(">>> ArrayList Problem 1: Remove Even Numbers");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Input: " + list1);
        System.out.println("Output: " + removeEvenNumbers(list1));
        
        // Test more problems...
        System.out.println("\n>>> ArrayList Problem 2: Second Largest");
        List<Integer> list2 = Arrays.asList(5, 2, 8, 1, 9, 3);
        System.out.println("Input: " + list2);
        System.out.println("Output: " + findSecondLargest(list2));
        
        System.out.println("\n>>> Stack Problem 31: Balanced Parentheses");
        String expr = "{[()]}";
        System.out.println("Input: " + expr);
        System.out.println("Output: " + isBalancedParentheses(expr));
        
        System.out.println("\n=== Run full test suite for complete validation ===");
    }
}
