# Java Collections Framework - Complete Concepts Guide

## Table of Contents
1. [Introduction to Collections Framework](#introduction)
2. [Collection Interface Hierarchy](#hierarchy)
3. [List Interface & Implementations](#list-interface)
4. [Set Interface & Implementations](#set-interface)
5. [Queue Interface & Implementations](#queue-interface)
6. [Map Interface & Implementations](#map-interface)
7. [Legacy Classes](#legacy-classes)
8. [Time Complexity Comparison](#time-complexity)
9. [When to Use Which Collection](#decision-guide)

---

## Introduction to Collections Framework {#introduction}

The Java Collections Framework is a unified architecture for representing and manipulating collections of objects. It provides:

- **Interfaces**: Abstract data types representing collections
- **Implementations**: Concrete classes implementing collection interfaces
- **Algorithms**: Static methods for sorting, searching, shuffling, etc.

### Benefits
- Reduces programming effort
- Increases performance
- Provides interoperability
- Reduces effort to learn new APIs

### Core Interfaces
```
Collection (root interface)
├── List (ordered, allows duplicates)
├── Set (no duplicates)
└── Queue (FIFO or priority-based)

Map (separate hierarchy, key-value pairs)
```

---

## Collection Interface Hierarchy {#hierarchy}

```
                    Iterable
                       ↓
                  Collection
                   /   |   \
                  /    |    \
               List   Set   Queue
              / | \    |     / | \
            AL LL V   HS   PQ LL AD
                      |
                    SortedSet
                      |
                   TreeSet

Map (Separate Hierarchy)
  |
  ├── HashMap
  ├── LinkedHashMap
  ├── Hashtable
  └── SortedMap
        ↓
      TreeMap

Legend:
AL = ArrayList, LL = LinkedList, V = Vector
HS = HashSet, PQ = PriorityQueue, AD = ArrayDeque
```

---

## List Interface & Implementations {#list-interface}

**Characteristics**: 
- Ordered collection (insertion order maintained)
- Allows duplicate elements
- Allows null elements
- Index-based access (0-based indexing)

### 1. ArrayList

**Internal Structure**: Dynamic resizable array

**When to Use**:
- Frequent random access by index
- More reads than writes
- Unknown size that grows over time

**Characteristics**:
- Fast random access: O(1)
- Slow insertion/deletion in middle: O(n)
- Default capacity: 10
- Growth: 50% of current size (capacity * 1.5)
- Thread-safe: No
- Null elements: Yes (multiple)

**Example**:
```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");           // O(1) - add at end
list.add(0, "Banana");       // O(n) - shift elements
String fruit = list.get(1);  // O(1) - direct access
list.remove(0);              // O(n) - shift elements
list.contains("Apple");      // O(n) - linear search
```

**Key Methods**:
- `add(E element)` - Add at end
- `add(int index, E element)` - Insert at index
- `get(int index)` - Retrieve by index
- `set(int index, E element)` - Replace at index
- `remove(int index)` - Remove by index
- `size()` - Get size
- `isEmpty()` - Check if empty
- `clear()` - Remove all
- `contains(Object o)` - Search element
- `indexOf(Object o)` - Find first occurrence
- `lastIndexOf(Object o)` - Find last occurrence

**Internal Working**:
```java
// Initial capacity
Object[] elementData = new Object[10];

// When adding 11th element
int newCapacity = oldCapacity + (oldCapacity >> 1); // 15
elementData = Arrays.copyOf(elementData, newCapacity);
```

**Best Practices**:
- Specify initial capacity if size is known: `new ArrayList<>(100)`
- Use `ensureCapacity()` to minimize incremental reallocation
- Trim to size after insertions: `list.trimToSize()`

---

### 2. LinkedList

**Internal Structure**: Doubly-linked list (each node has data, prev, next)

**When to Use**:
- Frequent insertions/deletions at beginning or end
- Implementing Queue or Deque
- Memory is not a constraint (uses more memory than ArrayList)

**Characteristics**:
- Slow random access: O(n)
- Fast insertion/deletion at ends: O(1)
- Implements both List and Deque interfaces
- Thread-safe: No
- Null elements: Yes (multiple)

**Example**:
```java
LinkedList<String> list = new LinkedList<>();
list.addFirst("First");      // O(1)
list.addLast("Last");        // O(1)
list.add(1, "Middle");       // O(n) - traverse to position
String first = list.get(0);  // O(n) - traverse from head
list.removeFirst();          // O(1)
list.removeLast();           // O(1)
```

**Key Methods** (beyond List methods):
- `addFirst(E element)` - Add at beginning
- `addLast(E element)` - Add at end
- `getFirst()` - Get first element
- `getLast()` - Get last element
- `removeFirst()` - Remove first
- `removeLast()` - Remove last
- `offer(E element)` - Queue operation
- `poll()` - Retrieve and remove head
- `peek()` - Retrieve head without removal

**Internal Node Structure**:
```java
private static class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;
}
```

**ArrayList vs LinkedList**:
| Operation | ArrayList | LinkedList |
|-----------|-----------|------------|
| get(i) | O(1) | O(n) |
| add(element) | O(1) amortized | O(1) |
| add(i, element) | O(n) | O(n) |
| remove(i) | O(n) | O(n) |
| Iterator.remove() | O(n) | O(1) |
| ListIterator.add() | O(n) | O(1) |
| Memory | Less | More |

---

### 3. Vector (Legacy Class)

**Internal Structure**: Synchronized dynamic array

**When to Use**:
- Legacy code compatibility
- Thread-safe operations needed (though prefer Collections.synchronizedList() or CopyOnWriteArrayList)

**Characteristics**:
- Similar to ArrayList but synchronized
- Thread-safe: Yes (all methods synchronized)
- Default capacity: 10
- Growth: Doubles in size (100% growth)
- Performance: Slower than ArrayList due to synchronization

**Example**:
```java
Vector<Integer> vector = new Vector<>();
vector.addElement(10);       // Legacy method
vector.add(20);              // List method
vector.capacity();           // Current capacity
vector.ensureCapacity(50);   // Set minimum capacity
```

**Key Differences from ArrayList**:
- Synchronized (thread-safe but slower)
- Growth factor: 2x vs 1.5x
- Legacy methods: `addElement()`, `removeElement()`, `elementAt()`

**Why ArrayList is Preferred**:
- Better performance (no synchronization overhead)
- Use `Collections.synchronizedList()` when thread-safety needed
- More modern and flexible

---

## Set Interface & Implementations {#set-interface}

**Characteristics**:
- No duplicate elements
- At most one null element (except TreeSet)
- No guaranteed order (except TreeSet, LinkedHashSet)
- Models mathematical set abstraction

### 1. HashSet

**Internal Structure**: HashMap internally (elements stored as keys)

**When to Use**:
- Need to store unique elements
- Order doesn't matter
- Fast operations required

**Characteristics**:
- No duplicates allowed
- Allows one null element
- No ordering guarantee
- Fast operations: O(1) average
- Thread-safe: No
- Initial capacity: 16, Load factor: 0.75

**Example**:
```java
HashSet<String> set = new HashSet<>();
set.add("Apple");           // O(1) - returns true
set.add("Banana");          // O(1) - returns true
set.add("Apple");           // O(1) - returns false (duplicate)
set.contains("Apple");      // O(1) - fast lookup
set.remove("Banana");       // O(1)
set.size();                 // Number of elements
```

**Key Methods**:
- `add(E element)` - Add element
- `remove(Object o)` - Remove element
- `contains(Object o)` - Check membership
- `size()` - Get size
- `clear()` - Remove all
- `isEmpty()` - Check if empty

**Internal Working**:
```java
// HashSet uses HashMap internally
private transient HashMap<E,Object> map;
private static final Object PRESENT = new Object();

public boolean add(E e) {
    return map.put(e, PRESENT) == null;
}
```

**Load Factor & Rehashing**:
- Load factor = n/k (n = elements, k = buckets)
- Default load factor: 0.75
- When load factor exceeded, capacity doubles
- Rehashing: All elements repositioned

**Best Practices**:
- Override `hashCode()` and `equals()` for custom objects
- Specify initial capacity if size known: `new HashSet<>(100)`
- Immutable objects work best as elements

---

### 2. LinkedHashSet

**Internal Structure**: Hash table + Linked list

**When to Use**:
- Need unique elements
- Want to maintain insertion order
- Iteration order matters

**Characteristics**:
- Maintains insertion order
- Slightly slower than HashSet
- Allows one null element
- Predictable iteration order
- Thread-safe: No

**Example**:
```java
LinkedHashSet<String> set = new LinkedHashSet<>();
set.add("C");
set.add("A");
set.add("B");
// Iteration order: C, A, B (insertion order)

for (String s : set) {
    System.out.println(s); // C, A, B
}
```

**HashSet vs LinkedHashSet**:
| Feature | HashSet | LinkedHashSet |
|---------|---------|---------------|
| Ordering | No order | Insertion order |
| Performance | Fastest | Slightly slower |
| Memory | Less | More (stores links) |
| Use case | Unique elements | Ordered unique elements |

---

### 3. TreeSet

**Internal Structure**: Red-Black Tree (self-balancing BST)

**When to Use**:
- Need sorted unique elements
- Range operations required
- Want natural ordering or custom ordering

**Characteristics**:
- Sorted order (natural or custom)
- No null elements (causes NullPointerException)
- Slower than HashSet: O(log n)
- Thread-safe: No
- Implements NavigableSet interface

**Example**:
```java
TreeSet<Integer> set = new TreeSet<>();
set.add(5);
set.add(2);
set.add(8);
set.add(1);
// Iteration order: 1, 2, 5, 8 (sorted)

// NavigableSet operations
set.first();              // 1
set.last();               // 8
set.lower(5);             // 2 (greatest element < 5)
set.higher(5);            // 8 (smallest element > 5)
set.headSet(5);           // [1, 2] (elements < 5)
set.tailSet(5);           // [5, 8] (elements >= 5)
set.subSet(2, 8);         // [2, 5] (2 inclusive, 8 exclusive)
```

**Custom Comparator**:
```java
// Reverse order
TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

// Custom comparator
TreeSet<String> set = new TreeSet<>((s1, s2) -> s1.length() - s2.length());

// For custom objects
class Person implements Comparable<Person> {
    String name;
    int age;
    
    public int compareTo(Person other) {
        return this.age - other.age;
    }
}
```

**Key Methods** (beyond Set):
- `first()` - Lowest element
- `last()` - Highest element
- `lower(E element)` - Greatest element < E
- `higher(E element)` - Smallest element > E
- `floor(E element)` - Greatest element <= E
- `ceiling(E element)` - Smallest element >= E
- `headSet(E toElement)` - Elements < toElement
- `tailSet(E fromElement)` - Elements >= fromElement
- `subSet(E from, E to)` - Elements in range
- `pollFirst()` - Retrieve and remove first
- `pollLast()` - Retrieve and remove last

**Set Comparison**:
| Operation | HashSet | LinkedHashSet | TreeSet |
|-----------|---------|---------------|---------|
| add() | O(1) | O(1) | O(log n) |
| contains() | O(1) | O(1) | O(log n) |
| remove() | O(1) | O(1) | O(log n) |
| Ordering | None | Insertion | Sorted |
| Null | One | One | No |

---

## Queue Interface & Implementations {#queue-interface}

**Characteristics**:
- FIFO (First-In-First-Out) or priority-based
- Elements inserted at tail, removed from head
- Two forms of methods: throwing exception vs returning special value

### Method Types:
| Operation | Throws Exception | Returns Special Value |
|-----------|-----------------|----------------------|
| Insert | add(e) | offer(e) |
| Remove | remove() | poll() |
| Examine | element() | peek() |

### 1. PriorityQueue

**Internal Structure**: Binary heap (min-heap by default)

**When to Use**:
- Process elements by priority
- Need smallest/largest element quickly
- Implementing algorithms like Dijkstra's, Huffman coding

**Characteristics**:
- Elements ordered by natural ordering or comparator
- Head is smallest element (min-heap)
- No null elements
- Not thread-safe
- Unbounded queue

**Example**:
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(2);
pq.offer(8);
pq.offer(1);

pq.peek();    // 1 (smallest, doesn't remove)
pq.poll();    // 1 (removes and returns)
pq.poll();    // 2
pq.poll();    // 5
pq.poll();    // 8

// Max-heap (reverse order)
PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

// Custom comparator
PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> a.length() - b.length());
```

**Key Methods**:
- `offer(E element)` - Insert element
- `poll()` - Remove and return head
- `peek()` - Return head without removal
- `add(E element)` - Insert (throws exception if fails)
- `remove()` - Remove head (throws exception if empty)
- `element()` - Get head (throws exception if empty)

**Time Complexity**:
- offer(): O(log n)
- poll(): O(log n)
- peek(): O(1)
- remove(Object): O(n)
- contains(Object): O(n)

**Internal Heap Operations**:
```java
// When adding element, it "bubbles up"
// When removing element, last element moves to top and "bubbles down"
```

---

### 2. ArrayDeque (Double-Ended Queue)

**Internal Structure**: Resizable array

**When to Use**:
- Implement stack or queue
- Fast insertion/deletion at both ends
- Better alternative to Stack class

**Characteristics**:
- Faster than LinkedList for queue/stack operations
- No capacity restrictions
- Not thread-safe
- No null elements
- Can be used as FIFO queue or LIFO stack

**Example**:
```java
ArrayDeque<String> deque = new ArrayDeque<>();

// Queue operations (FIFO)
deque.offerLast("First");    // Add at tail
deque.offerLast("Second");
deque.pollFirst();           // Remove from head - "First"

// Stack operations (LIFO)
deque.offerFirst("Top");     // Add at head
deque.offerFirst("New Top");
deque.pollFirst();           // Remove from head - "New Top"

// Or use push/pop for stack
deque.push("A");             // Same as offerFirst()
deque.push("B");
deque.pop();                 // Same as pollFirst() - "B"
```

**Key Methods**:
- `offerFirst(E element)` - Insert at head
- `offerLast(E element)` - Insert at tail
- `pollFirst()` - Remove from head
- `pollLast()` - Remove from tail
- `peekFirst()` - Get head
- `peekLast()` - Get tail
- `push(E element)` - Stack push
- `pop()` - Stack pop

**ArrayDeque vs LinkedList**:
| Feature | ArrayDeque | LinkedList |
|---------|-----------|------------|
| Structure | Array | Doubly-linked list |
| Memory | Less | More (node overhead) |
| Cache locality | Better | Worse |
| Random access | No | No |
| Best use | Stack/Queue | List operations |

---

## Map Interface & Implementations {#map-interface}

**Characteristics**:
- Key-value pairs
- No duplicate keys (values can be duplicate)
- Each key maps to at most one value
- Not part of Collection hierarchy

**Key Methods**:
- `put(K key, V value)` - Insert/update
- `get(Object key)` - Retrieve value
- `remove(Object key)` - Remove mapping
- `containsKey(Object key)` - Check key exists
- `containsValue(Object value)` - Check value exists
- `keySet()` - Get all keys
- `values()` - Get all values
- `entrySet()` - Get all key-value pairs

### 1. HashMap

**Internal Structure**: Array of buckets (linked lists/trees)

**When to Use**:
- Need fast key-value lookup
- Order doesn't matter
- Most common Map implementation

**Characteristics**:
- Allows one null key, multiple null values
- No ordering guarantee
- Fast operations: O(1) average
- Thread-safe: No
- Default capacity: 16, Load factor: 0.75

**Example**:
```java
HashMap<String, Integer> map = new HashMap<>();
map.put("Apple", 10);        // O(1)
map.put("Banana", 20);       // O(1)
map.put("Apple", 15);        // Update value
Integer val = map.get("Apple"); // 15
map.containsKey("Banana");   // true
map.remove("Apple");         // Remove entry
map.size();                  // 1

// Iteration
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

// Java 8+ methods
map.putIfAbsent("Orange", 30);
map.getOrDefault("Grape", 0);
map.computeIfAbsent("Mango", k -> 40);
map.merge("Apple", 5, (oldVal, newVal) -> oldVal + newVal);
```

**Internal Working**:
```java
// Hash function
int hash = hash(key.hashCode());
int index = hash & (table.length - 1);

// Collision handling (before Java 8)
// Each bucket is a linked list

// Collision handling (Java 8+)
// When bucket has > 8 entries, linked list converts to Red-Black tree
// When < 6 entries, converts back to linked list
```

**HashMap Internals**:
1. **Hash Calculation**: `hashCode()` → hash function → index
2. **Bucket Selection**: `index = hash & (n-1)` where n = table length
3. **Collision Resolution**: Linked list or tree in bucket
4. **Rehashing**: When load factor exceeded, capacity doubles

**Best Practices**:
- Override `hashCode()` and `equals()` for custom keys
- Use immutable objects as keys
- Specify initial capacity: `new HashMap<>(100)`
- For thread-safety: `ConcurrentHashMap` or `Collections.synchronizedMap()`

---

### 2. LinkedHashMap

**Internal Structure**: HashMap + Doubly-linked list

**When to Use**:
- Need predictable iteration order
- Implementing LRU cache
- Want insertion or access order

**Characteristics**:
- Maintains insertion order (or access order)
- Slightly slower than HashMap
- Allows one null key, multiple null values
- Thread-safe: No

**Example**:
```java
// Insertion order (default)
LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
map.put("C", 3);
map.put("A", 1);
map.put("B", 2);
// Iteration: C=3, A=1, B=2

// Access order (useful for LRU cache)
LinkedHashMap<String, Integer> lruMap = new LinkedHashMap<>(16, 0.75f, true);
lruMap.put("A", 1);
lruMap.put("B", 2);
lruMap.put("C", 3);
lruMap.get("A");  // Access A
// Order now: B, C, A (A moved to end)
```

**LRU Cache Implementation**:
```java
class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;
    
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
```

---

### 3. TreeMap

**Internal Structure**: Red-Black Tree

**When to Use**:
- Need sorted keys
- Range operations required
- Natural or custom ordering needed

**Characteristics**:
- Sorted by keys (natural or custom order)
- No null keys (but allows null values)
- Slower than HashMap: O(log n)
- Thread-safe: No
- Implements NavigableMap interface

**Example**:
```java
TreeMap<Integer, String> map = new TreeMap<>();
map.put(3, "Three");
map.put(1, "One");
map.put(2, "Two");
// Iteration: 1=One, 2=Two, 3=Three (sorted by key)

// NavigableMap operations
map.firstKey();              // 1
map.lastKey();               // 3
map.lowerKey(2);             // 1
map.higherKey(2);            // 3
map.headMap(2);              // {1=One}
map.tailMap(2);              // {2=Two, 3=Three}
map.subMap(1, 3);            // {1=One, 2=Two}

// Custom comparator
TreeMap<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
```

**Key Methods** (beyond Map):
- `firstKey()` / `firstEntry()` - Lowest key/entry
- `lastKey()` / `lastEntry()` - Highest key/entry
- `lowerKey(K key)` - Greatest key < K
- `higherKey(K key)` - Smallest key > K
- `floorKey(K key)` - Greatest key <= K
- `ceilingKey(K key)` - Smallest key >= K
- `headMap(K toKey)` - Keys < toKey
- `tailMap(K fromKey)` - Keys >= fromKey
- `subMap(K from, K to)` - Keys in range
- `pollFirstEntry()` - Remove first entry
- `pollLastEntry()` - Remove last entry

---

### 4. Hashtable (Legacy Class)

**Internal Structure**: Hash table (similar to HashMap)

**When to Use**:
- Legacy code compatibility
- Thread-safe operations (though ConcurrentHashMap is better)

**Characteristics**:
- Synchronized (thread-safe)
- No null keys or values
- Slower than HashMap
- Default capacity: 11, Load factor: 0.75

**Example**:
```java
Hashtable<String, Integer> table = new Hashtable<>();
table.put("A", 1);           // Synchronized
table.put("B", 2);
// table.put(null, 3);       // NullPointerException
// table.put("C", null);     // NullPointerException
```

**HashMap vs Hashtable**:
| Feature | HashMap | Hashtable |
|---------|---------|-----------|
| Null key | One allowed | Not allowed |
| Null value | Allowed | Not allowed |
| Thread-safe | No | Yes |
| Performance | Fast | Slow (synchronized) |
| Legacy | No | Yes |
| Iterator | Fail-fast | Fail-fast |

**Modern Alternative**:
```java
// Instead of Hashtable, use:
Map<String, Integer> map = new ConcurrentHashMap<>();
// or
Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());
```

---

## Legacy Classes {#legacy-classes}

### Stack (Legacy Class)

**Internal Structure**: Extends Vector (synchronized array)

**Why Legacy**:
- Extends Vector (unwanted baggage)
- ArrayDeque is better alternative

**Example**:
```java
Stack<Integer> stack = new Stack<>();
stack.push(1);              // Add to top
stack.push(2);
stack.push(3);
stack.peek();               // 3 (top element)
stack.pop();                // 3 (remove and return)
stack.isEmpty();            // false
stack.search(1);            // Distance from top (3)

// Better alternative: ArrayDeque
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);
stack.pop();
```

**Methods**:
- `push(E item)` - Add to top
- `pop()` - Remove and return top
- `peek()` - Return top without removal
- `empty()` - Check if empty
- `search(Object o)` - Position from top (1-based)

---

## Time Complexity Comparison {#time-complexity}

### List Operations
| Operation | ArrayList | LinkedList | Vector |
|-----------|-----------|------------|--------|
| get(i) | O(1) | O(n) | O(1) |
| add(e) | O(1)* | O(1) | O(1)* |
| add(i, e) | O(n) | O(n)** | O(n) |
| remove(i) | O(n) | O(n)** | O(n) |
| contains(e) | O(n) | O(n) | O(n) |
| Iterator.remove() | O(n) | O(1) | O(n) |

*Amortized, **O(1) if at beginning/end

### Set Operations
| Operation | HashSet | LinkedHashSet | TreeSet |
|-----------|---------|---------------|---------|
| add(e) | O(1) | O(1) | O(log n) |
| remove(e) | O(1) | O(1) | O(log n) |
| contains(e) | O(1) | O(1) | O(log n) |
| Iteration | O(capacity) | O(n) | O(n) |

### Map Operations
| Operation | HashMap | LinkedHashMap | TreeMap | Hashtable |
|-----------|---------|---------------|---------|-----------|
| put(k, v) | O(1) | O(1) | O(log n) | O(1) |
| get(k) | O(1) | O(1) | O(log n) | O(1) |
| remove(k) | O(1) | O(1) | O(log n) | O(1) |
| containsKey(k) | O(1) | O(1) | O(log n) | O(1) |

### Queue Operations
| Operation | PriorityQueue | ArrayDeque | LinkedList |
|-----------|--------------|------------|------------|
| offer(e) | O(log n) | O(1)* | O(1) |
| poll() | O(log n) | O(1) | O(1) |
| peek() | O(1) | O(1) | O(1) |

*Amortized

---

## When to Use Which Collection {#decision-guide}

### Decision Tree

```
Need key-value pairs?
├─ Yes → Map
│  ├─ Need sorted keys? → TreeMap
│  ├─ Need insertion order? → LinkedHashMap
│  ├─ Thread-safe? → ConcurrentHashMap
│  └─ Default choice → HashMap
│
└─ No → Collection
   ├─ Need unique elements? → Set
   │  ├─ Need sorted? → TreeSet
   │  ├─ Need insertion order? → LinkedHashSet
   │  └─ Default → HashSet
   │
   ├─ Need FIFO/LIFO? → Queue/Deque
   │  ├─ Priority-based? → PriorityQueue
   │  └─ Stack/Queue → ArrayDeque
   │
   └─ Indexed access? → List
      ├─ More reads? → ArrayList
      ├─ More insertions at ends? → LinkedList
      └─ Thread-safe? → Vector (or Collections.synchronizedList)
```

### Common Use Cases

**ArrayList**: 
- Shopping cart items
- Student list in a class
- File paths
- Any ordered collection with frequent reads

**LinkedList**:
- Implementing queue
- Playlist (frequent add/remove at ends)
- Browser history (back/forward)

**HashSet**:
- Unique email addresses
- Unique user IDs
- Removing duplicates
- Membership testing

**TreeSet**:
- Leaderboard (sorted scores)
- Scheduled tasks (sorted by time)
- Range queries

**HashMap**:
- Cache (URL → Page content)
- Frequency counter
- Configuration properties
- Phone book (Name → Number)

**TreeMap**:
- Dictionary (sorted keys)
- Sorted configuration
- Range queries on keys

**PriorityQueue**:
- Task scheduling by priority
- Dijkstra's shortest path
- Merge K sorted lists
- Finding median in stream

**ArrayDeque**:
- Implementing stack
- Implementing queue
- Undo/Redo functionality

---

## Important equals() and hashCode() Contract

For custom objects used in HashSet, HashMap:

```java
class Person {
    String name;
    int age;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && 
               Objects.equals(name, person.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```

**Contract Rules**:
1. If `a.equals(b)` is true, then `a.hashCode() == b.hashCode()`
2. If `a.hashCode() == b.hashCode()`, `a.equals(b)` may or may not be true
3. If you override `equals()`, you MUST override `hashCode()`

---

## Thread-Safe Collections

**Legacy** (Synchronized):
- Vector
- Stack
- Hashtable

**Modern** (Recommended):
```java
// Wrap existing collection
List<String> list = Collections.synchronizedList(new ArrayList<>());
Set<String> set = Collections.synchronizedSet(new HashSet<>());
Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());

// Concurrent collections (better performance)
ConcurrentHashMap<String, Integer>
CopyOnWriteArrayList<String>
ConcurrentSkipListSet<String>
```

---

## Collections Utility Class

Useful methods:
```java
// Sorting
Collections.sort(list);
Collections.sort(list, comparator);
Collections.reverse(list);

// Searching
int index = Collections.binarySearch(list, key);

// Min/Max
Collections.max(collection);
Collections.min(collection);

// Filling
Collections.fill(list, object);

// Frequency
int count = Collections.frequency(collection, object);

// Disjoint
boolean noCommon = Collections.disjoint(c1, c2);

// Shuffling
Collections.shuffle(list);

// Rotation
Collections.rotate(list, distance);

// Replacing
Collections.replaceAll(list, oldVal, newVal);

// Immutable collections
List<String> immutable = Collections.unmodifiableList(list);
Set<String> immutable = Collections.unmodifiableSet(set);
Map<String, Integer> immutable = Collections.unmodifiableMap(map);

// Empty collections
List<String> empty = Collections.emptyList();
Set<String> empty = Collections.emptySet();
Map<String, Integer> empty = Collections.emptyMap();

// Singleton
Set<String> singleton = Collections.singleton("element");
```

---

## Java 8+ Enhancements

### Stream API with Collections
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

numbers.stream()
       .filter(n -> n % 2 == 0)
       .map(n -> n * n)
       .forEach(System.out::println);

// Collectors
Map<Boolean, List<Integer>> partitioned = 
    numbers.stream()
           .collect(Collectors.partitioningBy(n -> n % 2 == 0));

Map<Integer, Long> frequency = 
    numbers.stream()
           .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
```

### Enhanced Map Methods
```java
Map<String, Integer> map = new HashMap<>();

// putIfAbsent
map.putIfAbsent("A", 1);

// computeIfAbsent
map.computeIfAbsent("B", k -> k.length());

// computeIfPresent
map.computeIfPresent("A", (k, v) -> v + 1);

// merge
map.merge("C", 1, (oldVal, newVal) -> oldVal + newVal);

// forEach
map.forEach((k, v) -> System.out.println(k + "=" + v));

// replaceAll
map.replaceAll((k, v) -> v * 2);
```

---

## Performance Tips

1. **Choose the right collection** based on use case
2. **Specify initial capacity** when size is known
3. **Use primitives** with specialized libraries (e.g., Trove) for better memory
4. **Minimize autoboxing** overhead
5. **Use StringBuilder** for string concatenation in loops
6. **Prefer ArrayList** over LinkedList unless specific needs
7. **Use EnumSet/EnumMap** for enum keys
8. **Consider memory vs speed** tradeoffs
9. **Use bulk operations** when possible
10. **Profile before optimizing**

---

This completes the comprehensive concepts guide. Study each collection's characteristics, time complexities, and use cases before attempting the problems!
