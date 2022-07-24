## Understanding Priority Queue

## What is Priority Queue
By Default In Queue, Element is First IN and First Out. But with the help of Priority Queue we can set the priority, Priority Queue works on Priority.
By default First Priority is given to smaller elements in Priority Queue. But this default behavior can be changed.

## Functions in Priority Queue

add - Adds element in Priority Queue.

remove - Removes element from Priority Queue. We do not need to pass any element to remove function. It automatically
removes the first element based on Priority.

peek - Displays the first element based on priority.

size - Gives the size of priority queue.

poll - It is used to fetch and remove the first element of Queue.

## Declaring Priority Queue

PriorityQueue<Integer> pq = new PriorityQueue<>(); -------- Default declaration with priority given to smaller elements
  
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); --------Priority given to Larger elements  

## Complexity
Time Complexity of adding an element to Priority Queue in n(logn).Also removing an 
element form Priority Queue is also of n(logn) complexity

## Referance

 https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/heaps-intro/video


