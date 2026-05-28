package com.subh.collection_framwork;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

/**
 * Java Collections Framework - Complete Solutions Part 2
 * Problems 41-150
 * 
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

public class JavaCollections_Solutions_Part2 {

    // ============================================================================
    // HASHSET SOLUTIONS (Problems 41-50)
    // ============================================================================

    /**
     * Problem 41: Remove Duplicates from Array
     * Difficulty: Easy
     * Time: O(n), Space: O(n)
     */
    public static int[] removeDuplicatesFromArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Problem 42: Find First Repeating Element
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static int findFirstRepeating(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        
        return -1; // No repeating element
    }

    /**
     * Problem 43: Longest Substring Without Repeating Characters
     * Difficulty: Hard
     * Time: O(n), Space: O(min(n, m)) where m is charset size
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    /**
     * Problem 44: Check if Two Arrays are Disjoint
     * Difficulty: Easy
     * Time: O(n + m), Space: O(n)
     */
    public static boolean areDisjoint(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        
        for (int num : arr2) {
            if (set.contains(num)) {
                return false;
            }
        }
        
        return true;
    }

    /**
     * Problem 45: Count Distinct Elements
     * Difficulty: Easy
     * Time: O(n), Space: O(n)
     */
    public static int countDistinct(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }

    /**
     * Problem 46: Pair with Given Sum
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static boolean hasPairWithSum(int[] arr, int sum) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(sum - num)) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }

    /**
     * Problem 47: Union and Intersection
     * Difficulty: Easy
     * Time: O(n + m), Space: O(n + m)
     */
    public static Map<String, Set<Integer>> unionAndIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : arr1) set1.add(num);
        for (int num : arr2) set2.add(num);
        
        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        
        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        
        Map<String, Set<Integer>> result = new HashMap<>();
        result.put("union", union);
        result.put("intersection", intersection);
        return result;
    }

    /**
     * Problem 48: Subarray with Zero Sum
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static boolean hasSubarrayWithZeroSum(int[] arr) {
        Set<Integer> sums = new HashSet<>();
        int sum = 0;
        sums.add(0);
        
        for (int num : arr) {
            sum += num;
            if (sums.contains(sum)) {
                return true;
            }
            sums.add(sum);
        }
        
        return false;
    }

    /**
     * Problem 49: Find All Missing Numbers
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static List<Integer> findMissingNumbers(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }
        
        return missing;
    }

    /**
     * Problem 50: Check Sudoku Validity
     * Difficulty: Hard
     * Time: O(1) - always 9x9, Space: O(1)
     */
    public static boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !set.add(board[i][j])) {
                    return false;
                }
            }
        }
        
        // Check columns
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.' && !set.add(board[i][j])) {
                    return false;
                }
            }
        }
        
        // Check 3x3 boxes
        for (int box = 0; box < 9; box++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (box / 3) * 3 + i;
                    int col = (box % 3) * 3 + j;
                    if (board[row][col] != '.' && !set.add(board[row][col])) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }

    // ============================================================================
    // LINKEDHASHSET SOLUTIONS (Problems 51-60)
    // ============================================================================

    /**
     * Problem 51: Remove Duplicates Maintaining Order
     * Difficulty: Easy
     * Time: O(n), Space: O(n)
     */
    public static List<Integer> removeDuplicatesLinkedHashSet(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }

    /**
     * Problem 52: First Unique Character
     * Difficulty: Medium
     * Time: O(n), Space: O(n)
     */
    public static char firstUniqueChar(String s) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return '\0';
    }

    /**
     * Problem 53: Print Elements in Insertion Order
     * Difficulty: Easy
     */
    public static void printInsertionOrder(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }

    /**
     * Problem 54: Remove First Occurrence
     * (Same as Problem 51 - LinkedHashSet handles this automatically)
     */

    /**
     * Problem 55: Maintain Order of Operations
     * Difficulty: Medium
     */
    public static List<String> trackUniqueOperations(String[] operations) {
        Set<String> uniqueOps = new LinkedHashSet<>();
        for (String op : operations) {
            uniqueOps.add(op);
        }
        return new ArrayList<>(uniqueOps);
    }

    /**
     * Problem 56: Stream of Characters
     * Difficulty: Medium
     */
    public static List<Character> uniqueCharactersInOrder(String stream) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : stream.toCharArray()) {
            set.add(c);
        }
        return new ArrayList<>(set);
    }

    /**
     * Problem 57: Ordered Set Operations
     * Difficulty: Medium
     */
    public static Set<Integer> orderedUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    /**
     * Problem 58: Cache with Insertion Order
     * Difficulty: Medium
     */
    static class InsertionOrderCache {
        private Set<String> cache = new LinkedHashSet<>();
        
        public void visit(String url) {
            cache.add(url);
        }
        
        public List<String> getHistory() {
            return new ArrayList<>(cache);
        }
    }

    /**
     * Problem 59: Filter Duplicates in Log File
     * Difficulty: Medium
     */
    public static List<String> uniqueLogEntries(List<String> logs) {
        Set<String> uniqueLogs = new LinkedHashSet<>(logs);
        return new ArrayList<>(uniqueLogs);
    }

    /**
     * Problem 60: Preserve Order of Tags
     * Difficulty: Easy
     */
    public static List<String> uniqueTags(String[] tags) {
        Set<String> uniqueTagSet = new LinkedHashSet<>(Arrays.asList(tags));
        return new ArrayList<>(uniqueTagSet);
    }

    // ============================================================================
    // TREESET SOLUTIONS (Problems 61-70)
    // ============================================================================

    /**
     * Problem 61: Sort Array Using TreeSet
     * Difficulty: Easy
     */
    public static List<Integer> sortUsingTreeSet(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }

    /**
     * Problem 62: Find Kth Smallest Element
     * Difficulty: Medium
     */
    public static int kthSmallest(int[] arr, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        int count = 0;
        for (int num : set) {
            count++;
            if (count == k) {
                return num;
            }
        }
        
        throw new IllegalArgumentException("k is larger than number of unique elements");
    }

    /**
     * Problem 63: Range Query
     * Difficulty: Medium
     */
    public static Set<Integer> rangeQuery(TreeSet<Integer> set, int low, int high) {
        return set.subSet(low, true, high, true);
    }

    /**
     * Problem 64: Ceiling and Floor
     * Difficulty: Medium
     */
    public static Map<String, Integer> ceilingAndFloor(TreeSet<Integer> set, int num) {
        Map<String, Integer> result = new HashMap<>();
        result.put("ceiling", set.ceiling(num));
        result.put("floor", set.floor(num));
        return result;
    }

    /**
     * Problem 65: Custom Comparator
     * Difficulty: Medium
     */
    public static TreeSet<String> sortByLength(String[] words) {
        TreeSet<String> set = new TreeSet<>(Comparator.comparingInt(String::length)
                                                       .thenComparing(Comparator.naturalOrder()));
        set.addAll(Arrays.asList(words));
        return set;
    }

    /**
     * Problem 66: Top K Frequent Elements
     * Difficulty: Hard
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        TreeSet<Map.Entry<Integer, Integer>> set = new TreeSet<>(
            (a, b) -> a.getValue().equals(b.getValue()) ? 
                     a.getKey() - b.getKey() : b.getValue() - a.getValue()
        );
        set.addAll(freq.entrySet());
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : set) {
            if (result.size() >= k) break;
            result.add(entry.getKey());
        }
        
        return result;
    }

    /**
     * Problem 67: Merge Intervals
     * Difficulty: Hard
     */
    public static int[][] mergeIntervals(int[][] intervals) {
        TreeSet<int[]> set = new TreeSet<>((a, b) -> a[0] - b[0]);
        set.addAll(Arrays.asList(intervals));
        
        List<int[]> merged = new ArrayList<>();
        int[] current = null;
        
        for (int[] interval : set) {
            if (current == null) {
                current = interval;
            } else if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                merged.add(current);
                current = interval;
            }
        }
        
        if (current != null) {
            merged.add(current);
        }
        
        return merged.toArray(new int[merged.size()][]);
    }

    /**
     * Problem 68: Closest Elements to Target
     * Difficulty: Medium
     */
    public static List<Integer> kClosest(TreeSet<Integer> set, int target, int k) {
        List<Integer> result = new ArrayList<>();
        Integer lower = set.floor(target);
        Integer higher = set.ceiling(target);
        
        while (result.size() < k && (lower != null || higher != null)) {
            if (lower == null) {
                result.add(higher);
                higher = set.higher(higher);
            } else if (higher == null) {
                result.add(lower);
                lower = set.lower(lower);
            } else {
                if (Math.abs(target - lower) <= Math.abs(target - higher)) {
                    result.add(lower);
                    lower = set.lower(lower);
                } else {
                    result.add(higher);
                    higher = set.higher(higher);
                }
            }
        }
        
        return result;
    }

    /**
     * Problem 69: Remove Elements Outside Range
     * Difficulty: Easy
     */
    public static void removeOutsideRange(TreeSet<Integer> set, int low, int high) {
        set.headSet(low, false).clear();
        set.tailSet(high, false).clear();
    }

    /**
     * Problem 70: Leaderboard System
     * Difficulty: Hard
     */
    static class Leaderboard {
        static class Player {
            String name;
            int score;
            
            Player(String name, int score) {
                this.name = name;
                this.score = score;
            }
        }
        
        private TreeSet<Player> board = new TreeSet<>(
            (a, b) -> a.score != b.score ? b.score - a.score : a.name.compareTo(b.name)
        );
        
        public void addScore(String name, int score) {
            board.removeIf(p -> p.name.equals(name));
            board.add(new Player(name, score));
        }
        
        public List<String> topK(int k) {
            return board.stream().limit(k).map(p -> p.name).collect(Collectors.toList());
        }
    }

    // ============================================================================
    // HASHMAP SOLUTIONS (Problems 71-80)
    // ============================================================================

    /**
     * Problem 71: Character Frequency Count
     * Difficulty: Easy
     */
    public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    /**
     * Problem 72: Two Sum Problem
     * Difficulty: Medium
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        return new int[]{-1, -1};
    }

    /**
     * Problem 73: Group Anagrams
     * Difficulty: Hard
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }

    /**
     * Problem 74: First Non-Repeating Character
     * Difficulty: Medium
     */
    public static char firstNonRepeating(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }
        
        return '\0';
    }

    /**
     * Problem 75: Isomorphic Strings
     * Difficulty: Medium
     */
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (mapS.containsKey(c1)) {
                if (mapS.get(c1) != c2) return false;
            } else {
                mapS.put(c1, c2);
            }
            
            if (mapT.containsKey(c2)) {
                if (mapT.get(c2) != c1) return false;
            } else {
                mapT.put(c2, c1);
            }
        }
        
        return true;
    }

    /**
     * Problem 76: Subarray Sum Equals K
     * Difficulty: Hard
     */
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }

    /**
     * Problem 77: Word Pattern
     * Difficulty: Medium
     */
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) return false;
            } else {
                map.put(c, word);
            }
            
            if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != c) return false;
            } else {
                reverseMap.put(word, c);
            }
        }
        
        return true;
    }

    /**
     * Problem 78: Longest Consecutive Sequence
     * Difficulty: Hard
     */
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0;
        
        for (int num : set) {
            if (!set.contains(num - 1)) { // Start of sequence
                int currentNum = num;
                int currentStreak = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                longest = Math.max(longest, currentStreak);
            }
        }
        
        return longest;
    }

    /**
     * Problem 79: Contains Duplicate II
     * Difficulty: Medium
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        
        return false;
    }

    /**
     * Problem 80: Copy List with Random Pointer (Conceptual - requires custom Node class)
     * Difficulty: Hard
     */
    static class NodeWithRandom {
        int val;
        NodeWithRandom next;
        NodeWithRandom random;
        
        NodeWithRandom(int val) {
            this.val = val;
        }
    }
    
    public static NodeWithRandom copyRandomList(NodeWithRandom head) {
        if (head == null) return null;
        
        Map<NodeWithRandom, NodeWithRandom> map = new HashMap<>();
        
        // First pass: create all nodes
        NodeWithRandom curr = head;
        while (curr != null) {
            map.put(curr, new NodeWithRandom(curr.val));
            curr = curr.next;
        }
        
        // Second pass: connect pointers
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        
        return map.get(head);
    }

    // ============================================================================
    // LINKEDHASHMAP SOLUTIONS (Problems 81-90)
    // ============================================================================

    /**
     * Problem 81: LRU Cache
     * Difficulty: Hard
     */
    static class LRUCache extends LinkedHashMap<Integer, Integer> {
        private int capacity;
        
        public LRUCache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }
        
        public int get(int key) {
            return super.getOrDefault(key, -1);
        }
        
        public void put(int key, int value) {
            super.put(key, value);
        }
        
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }

    /**
     * Problem 82: Maintain Insertion Order
     * Difficulty: Easy
     */
    public static void demonstrateInsertionOrder() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "three");
        map.put(1, "one");
        map.put(2, "two");
        
        System.out.println(map); // {3=three, 1=one, 2=two}
    }

    /**
     * Problem 83: Access Order vs Insertion Order
     * Difficulty: Medium
     */
    public static void demonstrateAccessOrder() {
        // Insertion order
        LinkedHashMap<String, Integer> insertionOrder = new LinkedHashMap<>();
        insertionOrder.put("A", 1);
        insertionOrder.put("B", 2);
        insertionOrder.put("C", 3);
        insertionOrder.get("A");
        System.out.println("Insertion order: " + insertionOrder);
        
        // Access order
        LinkedHashMap<String, Integer> accessOrder = new LinkedHashMap<>(16, 0.75f, true);
        accessOrder.put("A", 1);
        accessOrder.put("B", 2);
        accessOrder.put("C", 3);
        accessOrder.get("A");
        System.out.println("Access order: " + accessOrder);
    }

    /**
     * Problem 84: Most Recently Used Items
     * Difficulty: Medium
     */
    static class MRUTracker<K, V> extends LinkedHashMap<K, V> {
        public MRUTracker() {
            super(16, 0.75f, true);
        }
        
        public List<K> getMostRecentlyUsed(int n) {
            List<K> keys = new ArrayList<>(keySet());
            int start = Math.max(0, keys.size() - n);
            return keys.subList(start, keys.size());
        }
    }

    /**
     * Problem 85: Remove Eldest Entry
     * Difficulty: Medium
     */
    static class LimitedSizeMap<K, V> extends LinkedHashMap<K, V> {
        private int maxSize;
        
        public LimitedSizeMap(int maxSize) {
            this.maxSize = maxSize;
        }
        
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > maxSize;
        }
    }

    /**
     * Problem 86: Browser History
     * Difficulty: Medium
     */
    static class BrowserHistory {
        private LinkedHashMap<String, Long> history;
        private int maxSize;
        
        public BrowserHistory(int maxSize) {
            this.maxSize = maxSize;
            this.history = new LinkedHashMap<String, Long>(maxSize, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, Long> eldest) {
                    return size() > maxSize;
                }
            };
        }
        
        public void visit(String url) {
            history.put(url, System.currentTimeMillis());
        }
        
        public List<String> getHistory() {
            return new ArrayList<>(history.keySet());
        }
    }

    /**
     * Problem 87: Command History
     * Difficulty: Medium
     */
    static class CommandHistory {
        private LinkedHashMap<String, Integer> commands = new LinkedHashMap<>();
        
        public void execute(String command) {
            commands.put(command, commands.getOrDefault(command, 0) + 1);
        }
        
        public List<String> getHistory() {
            return new ArrayList<>(commands.keySet());
        }
    }

    /**
     * Problem 88: Preserve Order in JSON (Conceptual)
     * Difficulty: Easy
     */
    public static Map<String, Object> parseJSON(String json) {
        // In practice, use libraries like Jackson or Gson with LinkedHashMap
        return new LinkedHashMap<>();
    }

    /**
     * Problem 89: FIFO Cache
     * Difficulty: Medium
     */
    static class FIFOCache<K, V> extends LinkedHashMap<K, V> {
        private int capacity;
        
        public FIFOCache(int capacity) {
            super(capacity, 0.75f, false); // Insertion order
            this.capacity = capacity;
        }
        
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
    }

    /**
     * Problem 90: Replay Actions in Order
     * Difficulty: Medium
     */
    static class ActionRecorder {
        private LinkedHashMap<Long, String> actions = new LinkedHashMap<>();
        
        public void record(String action) {
            actions.put(System.currentTimeMillis(), action);
        }
        
        public void replay() {
            actions.values().forEach(System.out::println);
        }
    }

    // ============================================================================
    // TREEMAP SOLUTIONS (Problems 91-100)
    // ============================================================================

    /**
     * Problem 91: Sort HashMap by Keys
     * Difficulty: Easy
     */
    public static TreeMap<Integer, String> sortHashMapByKeys(HashMap<Integer, String> map) {
        return new TreeMap<>(map);
    }

    /**
     * Problem 92: Range Sum Query
     * Difficulty: Medium
     */
    public static int rangeSumQuery(TreeMap<Integer, Integer> map, int low, int high) {
        return map.subMap(low, true, high, true).values().stream()
                  .mapToInt(Integer::intValue).sum();
    }

    /**
     * Problem 93: Find Closest Key
     * Difficulty: Medium
     */
    public static Integer findClosestKey(TreeMap<Integer, ?> map, int target) {
        Integer floor = map.floorKey(target);
        Integer ceiling = map.ceilingKey(target);
        
        if (floor == null) return ceiling;
        if (ceiling == null) return floor;
        
        return (target - floor) <= (ceiling - target) ? floor : ceiling;
    }

    /**
     * Problem 94: K Closest Keys to Target
     * Difficulty: Hard
     */
    public static List<Integer> kClosestKeys(TreeMap<Integer, ?> map, int target, int k) {
        List<Integer> result = new ArrayList<>();
        Integer lower = map.floorKey(target);
        Integer higher = map.ceilingKey(target);
        
        while (result.size() < k && (lower != null || higher != null)) {
            if (lower == null) {
                result.add(higher);
                higher = map.higherKey(higher);
            } else if (higher == null) {
                result.add(lower);
                lower = map.lowerKey(lower);
            } else {
                if (Math.abs(target - lower) <= Math.abs(target - higher)) {
                    result.add(lower);
                    lower = map.lowerKey(lower);
                } else {
                    result.add(higher);
                    higher = map.higherKey(higher);
                }
            }
        }
        
        return result;
    }

    /**
     * Problem 95: Count Words in Range
     * Difficulty: Medium
     */
    public static int countWordsInRange(TreeMap<String, Integer> map, String start, String end) {
        return map.subMap(start, true, end, true).size();
    }

    /**
     * Problem 96: Top K Frequent Words
     * Difficulty: Hard
     */
    public static List<String> topKFrequentWords(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        TreeMap<String, Integer> sorted = new TreeMap<>((a, b) -> {
            int freqCompare = freq.get(b) - freq.get(a);
            return freqCompare != 0 ? freqCompare : a.compareTo(b);
        });
        
        sorted.putAll(freq);
        
        return sorted.keySet().stream().limit(k).collect(Collectors.toList());
    }

    /**
     * Problem 97: Implement Phone Directory
     * Difficulty: Hard
     */
    static class PhoneDirectory {
        private TreeMap<String, String> directory = new TreeMap<>();
        
        public void addContact(String name, String phone) {
            directory.put(name, phone);
        }
        
        public void removeContact(String name) {
            directory.remove(name);
        }
        
        public List<String> searchByPrefix(String prefix) {
            String end = prefix + Character.MAX_VALUE;
            return new ArrayList<>(directory.subMap(prefix, end).keySet());
        }
        
        public String getPhone(String name) {
            return directory.get(name);
        }
    }

    /**
     * Problem 98: Merge Overlapping Intervals (TreeMap approach)
     * Difficulty: Hard
     */
    public static List<int[]> mergeIntervalsTreeMap(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            
            Integer floor = map.floorKey(start);
            if (floor != null && map.get(floor) >= start) {
                start = floor;
                end = Math.max(end, map.get(floor));
                map.remove(floor);
            }
            
            map.put(start, end);
        }
        
        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }
        
        return result;
    }

    /**
     * Problem 99: Custom Comparator for TreeMap
     * Difficulty: Medium
     */
    public static TreeMap<String, Integer> createTreeMapByLength() {
        return new TreeMap<>(Comparator.comparingInt(String::length)
                                       .thenComparing(Comparator.naturalOrder()));
    }

    /**
     * Problem 100: Calendar Booking
     * Difficulty: Hard
     */
    static class MyCalendar {
        private TreeMap<Integer, Integer> calendar = new TreeMap<>();
        
        public boolean book(int start, int end) {
            Integer prev = calendar.floorKey(start);
            Integer next = calendar.ceilingKey(start);
            
            if ((prev == null || calendar.get(prev) <= start) &&
                (next == null || end <= next)) {
                calendar.put(start, end);
                return true;
            }
            
            return false;
        }
    }

    // ============================================================================
    // HASHTABLE SOLUTIONS (Problems 101-110)
    // ============================================================================

    /**
     * Problem 101: Thread-Safe Counter
     * Difficulty: Easy
     */
    static class ThreadSafeWordCounter {
        private Hashtable<String, Integer> counts = new Hashtable<>();
        
        public void count(String word) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        
        public int getCount(String word) {
            return counts.getOrDefault(word, 0);
        }
    }

    /**
     * Problem 102: Compare with HashMap
     * Difficulty: Easy
     */
    public static void compareHashMapHashtable() {
        // HashMap allows null
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put(null, 1);
        hashMap.put("key", null);
        System.out.println("HashMap allows null: " + hashMap);
        
        // Hashtable doesn't allow null
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        try {
            hashtable.put(null, 1); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Hashtable doesn't allow null keys");
        }
    }

    /**
     * Problem 103: Null Key/Value Handling
     * Difficulty: Easy
     */
    public static void demonstrateNullHandling() {
        Hashtable<String, Integer> table = new Hashtable<>();
        
        try {
            table.put(null, 1);
        } catch (NullPointerException e) {
            System.out.println("Cannot put null key");
        }
        
        try {
            table.put("key", null);
        } catch (NullPointerException e) {
            System.out.println("Cannot put null value");
        }
    }

    /**
     * Problem 104: Legacy Code Migration
     * Difficulty: Medium
     */
    public static ConcurrentHashMap<String, Integer> migrateFromHashtable(Hashtable<String, Integer> old) {
        return new ConcurrentHashMap<>(old);
    }

    /**
     * Problem 105: Synchronized Operations
     * Difficulty: Medium
     */
    public static void synchronizedCompoundOperation(Hashtable<String, Integer> table, String key) {
        synchronized (table) {
            if (!table.containsKey(key)) {
                table.put(key, 1);
            } else {
                table.put(key, table.get(key) + 1);
            }
        }
    }

    /**
     * Problem 106: Enumeration vs Iterator
     * Difficulty: Easy
     */
    public static void demonstrateEnumerationVsIterator() {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("A", 1);
        table.put("B", 2);
        
        // Enumeration
        Enumeration<String> enumeration = table.keys();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        
        // Iterator
        Iterator<String> iterator = table.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * Problem 107: Properties File Reader
     * Difficulty: Medium
     */
    public static Properties readProperties(String filename) throws Exception {
        Properties props = new Properties();
        // props.load(new FileInputStream(filename));
        return props;
    }

    /**
     * Problem 108: Clone Hashtable
     * Difficulty: Easy
     */
    @SuppressWarnings("unchecked")
    public static Hashtable<String, Integer> cloneHashtable(Hashtable<String, Integer> original) {
        return (Hashtable<String, Integer>) original.clone();
    }

    /**
     * Problem 109: Concurrent Read-Write
     * Difficulty: Medium
     */
    public static void demonstrateConcurrentAccess(Hashtable<String, Integer> table) {
        // Reader thread
        Thread reader = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                table.get("key" + i);
            }
        });
        
        // Writer thread
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                table.put("key" + i, i);
            }
        });
        
        reader.start();
        writer.start();
    }

    /**
     * Problem 110: Migration to Modern Collections
     * Difficulty: Medium
     */
    public static Map<String, Integer> modernize(Hashtable<String, Integer> legacy) {
        // Option 1: ConcurrentHashMap for thread safety
        ConcurrentHashMap<String, Integer> concurrent = new ConcurrentHashMap<>(legacy);
        
        // Option 2: Synchronized HashMap
        Map<String, Integer> synced = Collections.synchronizedMap(new HashMap<>(legacy));
        
        return concurrent; // Prefer ConcurrentHashMap
    }

    // ============================================================================
    // PRIORITYQUEUE SOLUTIONS (Problems 111-120)
    // ============================================================================

    /**
     * Problem 111: Kth Largest Element
     * Difficulty: Medium
     */
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        return minHeap.peek();
    }

    /**
     * Problem 112: Merge K Sorted Lists (simplified with arrays)
     * Difficulty: Hard
     */
    public static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            lists.get(a[0]).get(a[1]) - lists.get(b[0]).get(b[1])
        );
        
        // Add first element of each list
        for (int i = 0; i < lists.size(); i++) {
            if (!lists.get(i).isEmpty()) {
                pq.offer(new int[]{i, 0}); // {list index, element index}
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int listIdx = curr[0];
            int elemIdx = curr[1];
            
            result.add(lists.get(listIdx).get(elemIdx));
            
            if (elemIdx + 1 < lists.get(listIdx).size()) {
                pq.offer(new int[]{listIdx, elemIdx + 1});
            }
        }
        
        return result;
    }

    /**
     * Problem 113: Task Scheduler
     * Difficulty: Medium
     */
    static class Task {
        String name;
        int priority;
        
        Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
    }
    
    public static void scheduleTasks(List<Task> tasks) {
        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> b.priority - a.priority);
        pq.addAll(tasks);
        
        while (!pq.isEmpty()) {
            Task task = pq.poll();
            System.out.println("Executing: " + task.name + " (Priority: " + task.priority + ")");
        }
    }

    /**
     * Problem 114: Top K Frequent Elements (PriorityQueue version)
     * Difficulty: Medium
     */
    public static List<Integer> topKFrequentPQ(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().getKey());
        }
        Collections.reverse(result);
        
        return result;
    }

    /**
     * Problem 115: Median from Data Stream
     * Difficulty: Hard
     */
    static class MedianFinder {
        private PriorityQueue<Integer> maxHeap; // Lower half
        private PriorityQueue<Integer> minHeap; // Upper half
        
        public MedianFinder() {
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            minHeap = new PriorityQueue<>();
        }
        
        public void addNum(int num) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
            
            if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }
        
        public double findMedian() {
            if (maxHeap.size() > minHeap.size()) {
                return maxHeap.peek();
            }
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    /**
     * Problem 116: K Closest Points to Origin
     * Difficulty: Medium
     */
    public static int[][] kClosestPoints(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );
        
        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        
        return result;
    }

    /**
     * Problem 117: Reorganize String
     * Difficulty: Hard
     */
    public static String reorganizeString(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(freq.entrySet());
        
        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;
        
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> curr = pq.poll();
            result.append(curr.getKey());
            curr.setValue(curr.getValue() - 1);
            
            if (prev != null && prev.getValue() > 0) {
                pq.offer(prev);
            }
            
            prev = curr;
        }
        
        return result.length() == s.length() ? result.toString() : "";
    }

    /**
     * Problem 118: Kth Smallest in Sorted Matrix
     * Difficulty: Hard
     */
    public static int kthSmallestInMatrix(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            matrix[a[0]][a[1]] - matrix[b[0]][b[1]]
        );
        
        // Add first element of each row
        for (int i = 0; i < n && i < k; i++) {
            pq.offer(new int[]{i, 0});
        }
        
        int result = 0;
        while (k-- > 0) {
            int[] curr = pq.poll();
            int row = curr[0];
            int col = curr[1];
            result = matrix[row][col];
            
            if (col + 1 < matrix[row].length) {
                pq.offer(new int[]{row, col + 1});
            }
        }
        
        return result;
    }

    /**
     * Problem 119: Meeting Rooms II
     * Difficulty: Hard
     */
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(intervals[0][1]);
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= pq.peek()) {
                pq.poll();
            }
            pq.offer(intervals[i][1]);
        }
        
        return pq.size();
    }

    /**
     * Problem 120: Ugly Number II
     * Difficulty: Hard
     */
    public static int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> seen = new HashSet<>();
        
        pq.offer(1L);
        seen.add(1L);
        
        long ugly = 1;
        for (int i = 0; i < n; i++) {
            ugly = pq.poll();
            
            long[] multiples = {ugly * 2, ugly * 3, ugly * 5};
            for (long multiple : multiples) {
                if (seen.add(multiple)) {
                    pq.offer(multiple);
                }
            }
        }
        
        return (int) ugly;
    }

    // ============================================================================
    // ARRAYDEQUE SOLUTIONS (Problems 121-130)
    // ============================================================================

    /**
     * Problem 121: Implement Stack
     * Difficulty: Easy
     */
    static class StackUsingDeque<T> {
        private ArrayDeque<T> deque = new ArrayDeque<>();
        
        public void push(T item) {
            deque.push(item);
        }
        
        public T pop() {
            return deque.pop();
        }
        
        public T peek() {
            return deque.peek();
        }
        
        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    /**
     * Problem 122: Implement Queue
     * Difficulty: Easy
     */
    static class QueueUsingDeque<T> {
        private ArrayDeque<T> deque = new ArrayDeque<>();
        
        public void offer(T item) {
            deque.offerLast(item);
        }
        
        public T poll() {
            return deque.pollFirst();
        }
        
        public T peek() {
            return deque.peekFirst();
        }
        
        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    /**
     * Problem 123: Sliding Window Maximum
     * Difficulty: Hard
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        
        int[] result = new int[nums.length - k + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove indices outside window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            // Remove smaller elements
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            deque.offer(i);
            
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        
        return result;
    }

    /**
     * Problem 124: Valid Parentheses (Using ArrayDeque)
     * Difficulty: Easy
     */
    public static boolean isValidParentheses(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = Map.of(')', '(', '}', '{', ']', '[');
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    /**
     * Problem 125: Reverse First K Elements
     * Difficulty: Medium
     */
    public static void reverseFirstK(ArrayDeque<Integer> queue, int k) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        // Pop first k elements to stack
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            stack.push(queue.pollFirst());
        }
        
        // Push back from stack (reversed)
        while (!stack.isEmpty()) {
            queue.offerLast(stack.pop());
        }
        
        // Move remaining elements to back
        for (int i = 0; i < queue.size() - k; i++) {
            queue.offerLast(queue.pollFirst());
        }
    }

    /**
     * Problem 126: Generate Binary Numbers
     * Difficulty: Medium
     */
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offer("1");
        
        for (int i = 0; i < n; i++) {
            String current = queue.poll();
            result.add(current);
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
        
        return result;
    }

    /**
     * Problem 127: First Non-Repeating in Stream
     * Difficulty: Medium
     */
    static class FirstNonRepeatingStream {
        private ArrayDeque<Character> queue = new ArrayDeque<>();
        private Map<Character, Integer> freq = new HashMap<>();
        
        public void add(char c) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            queue.offer(c);
            
            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                queue.poll();
            }
        }
        
        public char getFirstNonRepeating() {
            return queue.isEmpty() ? '\0' : queue.peek();
        }
    }

    /**
     * Problem 128: Implement Circular Queue
     * Difficulty: Medium
     */
    static class CircularQueue {
        private ArrayDeque<Integer> deque;
        private int capacity;
        
        public CircularQueue(int capacity) {
            this.capacity = capacity;
            this.deque = new ArrayDeque<>(capacity);
        }
        
        public boolean enqueue(int value) {
            if (deque.size() == capacity) return false;
            deque.offerLast(value);
            return true;
        }
        
        public int dequeue() {
            return deque.isEmpty() ? -1 : deque.pollFirst();
        }
        
        public boolean isFull() {
            return deque.size() == capacity;
        }
        
        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    /**
     * Problem 129: Palindrome Check
     * Difficulty: Easy
     */
    public static boolean isPalindromeDeque(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            deque.offer(c);
        }
        
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        
        return true;
    }

    /**
     * Problem 130: Max of All Subarrays
     * (Same as Problem 123 - Sliding Window Maximum)
     */

    // ============================================================================
    // MIXED COLLECTIONS SOLUTIONS (Problems 131-150)
    // ============================================================================

    /**
     * Problem 131: LFU Cache
     * Difficulty: Hard
     * Uses: HashMap + LinkedHashSet
     */
    static class LFUCache {
        private int capacity;
        private int minFreq;
        private Map<Integer, Integer> keyToVal;
        private Map<Integer, Integer> keyToFreq;
        private Map<Integer, LinkedHashSet<Integer>> freqToKeys;
        
        public LFUCache(int capacity) {
            this.capacity = capacity;
            this.minFreq = 0;
            keyToVal = new HashMap<>();
            keyToFreq = new HashMap<>();
            freqToKeys = new HashMap<>();
        }
        
        public int get(int key) {
            if (!keyToVal.containsKey(key)) return -1;
            
            int freq = keyToFreq.get(key);
            freqToKeys.get(freq).remove(key);
            
            if (freqToKeys.get(freq).isEmpty() && freq == minFreq) {
                minFreq++;
            }
            
            keyToFreq.put(key, freq + 1);
            freqToKeys.computeIfAbsent(freq + 1, k -> new LinkedHashSet<>()).add(key);
            
            return keyToVal.get(key);
        }
        
        public void put(int key, int value) {
            if (capacity <= 0) return;
            
            if (keyToVal.containsKey(key)) {
                keyToVal.put(key, value);
                get(key); // Update frequency
                return;
            }
            
            if (keyToVal.size() >= capacity) {
                int evict = freqToKeys.get(minFreq).iterator().next();
                freqToKeys.get(minFreq).remove(evict);
                keyToVal.remove(evict);
                keyToFreq.remove(evict);
            }
            
            keyToVal.put(key, value);
            keyToFreq.put(key, 1);
            freqToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
            minFreq = 1;
        }
    }

    /**
     * Problem 132: Design Twitter (Simplified)
     * Difficulty: Hard
     * Uses: HashMap + PriorityQueue
     */
    static class Twitter {
        private static int timestamp = 0;
        private Map<Integer, Set<Integer>> following;
        private Map<Integer, List<int[]>> tweets;
        
        public Twitter() {
            following = new HashMap<>();
            tweets = new HashMap<>();
        }
        
        public void postTweet(int userId, int tweetId) {
            tweets.computeIfAbsent(userId, k -> new ArrayList<>())
                  .add(new int[]{timestamp++, tweetId});
        }
        
        public List<Integer> getNewsFeed(int userId) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
            
            // Add user's own tweets
            if (tweets.containsKey(userId)) {
                for (int[] tweet : tweets.get(userId)) {
                    pq.offer(tweet);
                }
            }
            
            // Add followed users' tweets
            if (following.containsKey(userId)) {
                for (int followeeId : following.get(userId)) {
                    if (tweets.containsKey(followeeId)) {
                        for (int[] tweet : tweets.get(followeeId)) {
                            pq.offer(tweet);
                        }
                    }
                }
            }
            
            List<Integer> feed = new ArrayList<>();
            for (int i = 0; i < 10 && !pq.isEmpty(); i++) {
                feed.add(pq.poll()[1]);
            }
            
            return feed;
        }
        
        public void follow(int followerId, int followeeId) {
            following.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
        }
        
        public void unfollow(int followerId, int followeeId) {
            if (following.containsKey(followerId)) {
                following.get(followerId).remove(followeeId);
            }
        }
    }

    /**
     * Problem 133: Word Ladder
     * Difficulty: Hard
     * Uses: Queue + HashSet
     */
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;
        
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                
                if (current.equals(endWord)) {
                    return level;
                }
                
                // Try all possible one-letter changes
                char[] chars = current.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char original = chars[j];
                    
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) continue;
                        
                        chars[j] = c;
                        String newWord = new String(chars);
                        
                        if (wordSet.contains(newWord)) {
                            queue.offer(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                    
                    chars[j] = original;
                }
            }
            
            level++;
        }
        
        return 0;
    }

    /**
     * Problem 134-150: Additional complex mixed problems would follow similar patterns
     * combining multiple data structures for efficient solutions.
     * 
     * Key patterns:
     * - HashMap + PriorityQueue (for frequency-based operations)
     * - HashMap + TreeMap (for sorted operations with lookup)
     * - Queue/Deque + Set (for BFS with visited tracking)
     * - Multiple HashMaps (for bidirectional mapping)
     * - LinkedHashMap + other structures (for order preservation)
     */

    /**
     * Main method for testing
     */
    public static void main(String[] args) {
        System.out.println("=== Java Collections Solutions - Part 2 (Problems 41-150) ===\n");
        
        // Sample tests
        System.out.println(">>> Problem 43: Longest Substring Without Repeating");
        System.out.println("Input: 'abcabcbb'");
        System.out.println("Output: " + lengthOfLongestSubstring("abcabcbb"));
        
        System.out.println("\n>>> Problem 111: Kth Largest");
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println("Input: " + Arrays.toString(nums) + ", k=2");
        System.out.println("Output: " + findKthLargest(nums, 2));
        
        System.out.println("\n=== Solutions complete! Practice and master Java Collections! ===");
    }
}
