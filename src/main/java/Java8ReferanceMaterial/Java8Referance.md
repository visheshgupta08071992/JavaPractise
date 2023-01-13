
## Understanding Java 8

### What is stream in Java

1.Stream API's are used to perform aggregate operation on data returned from Collection classes which drastically reduces the complexity of code.</br>
2.A Stream is not a data structure instead it takes input from Collections,Arrays or I/O channesl and provides the result as per the pipelined methods.</br>
3.We cannot directly apply stream and its methods on Map, We first need to convert Map into entryset as shown below

```js
Map<String,Integer> map = new HashMap<>();

        map.put("Akshay",100);
        map.put("Chandan",150);
        map.put("Nihal",200);

        //Filtering Map whose Key starts with A
        map.entrySet().stream()
                .filter(e -> e.getKey().startsWith("A"))
                .forEach(e -> System.out.println(e));

```

### What is Lamda in Java

Lambda is denoted by -> in Java. The left side of lambda represents the parameter required by expression,it can be empty if there are no parameter required while the right side represents the actions performed by the expression.

### Stream methods

1.**foreach**

foreach method of Stream is used for Iteration. It is a Terminal Operation  .Also we can use foreach method without Stream API on Collection classes. 

```js
@Test
    public void understandingforEach(){
        List<Integer> list = Arrays.asList(1,2,3,4);

        //Using forEach without using Stream
        list.forEach(e-> System.out.println(e));

        System.out.println("------------------------");

        //Using forEach with Stream
        list.stream().forEach(e-> System.out.println(e));

        Map<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);

        //Using forEach without using Stream
        map.forEach((key,value) -> System.out.println( key + "-" + value ));

        System.out.println("------------------------");

        //Using forEach with Stream

        map.entrySet().stream().forEach(e -> System.out.println(e));
    }

```

2.**filter**

filter method is used to filter data within streams based on some condition. It is an intermediate operation.

```js

List<Integer> list = Arrays.asList(1,2,3,4,5);

        //Filtering values which are greater then a particular value
        list.stream().filter(e -> e>3).forEach(e -> System.out.println(e));

        System.out.println("---------------------------------------------");

        List<String> list1 = Arrays.asList("Akshay","Aashu","Chandan","anurag");
        
        //Filtering names which starts with A
        list1.stream().filter(e -> e.startsWith("A")).forEach(e -> System.out.println(e));

        System.out.println("---------------------------------------------");


        Map<String,Integer> map = new HashMap<>();

        map.put("Akshay",100);
        map.put("Chandan",150);
        map.put("Nihal",200);

        //Filtering Map whose Key starts with A
        map.entrySet().stream()
                .filter(e -> e.getKey().startsWith("A"))
                .forEach(e -> System.out.println(e));

        System.out.println("---------------------------------------------");

        //Filtering Map whose value is greater then 100
        map.entrySet().stream()
                .filter(e -> e.getValue() > 100)
                .forEach(e -> System.out.println(e));


```

3.**sorted**

sorted method is used to sort streams, If we want to sort stream in descending order we need to use **stream.sorted(Collections.reverseOrder())** . It is an intermediate operation.

4.**collect**

collect method is used to collect your result and convert it back into List/Set/Map. It is a Terminal Operation.

5.**Map and flatMap** (Explanation - https://www.youtube.com/watch?v=CwvlS3ViGFQ&list=PLVz2XdJiJQxzrdrpglCv_nWIO5CDIqOVj&index=6)

1.map method is used when we want to manipulate or transform the stream. It is an intermediate operation.</br>
2.flat map method is used when we want to tansform and flattern the Stream. It is also an intermediate operation. </br>
3.So to better understand whenever we want to flatten nested List like List<List<String>> we could flatten it with flatmap. We could further transform this
flattened Stream with the help of map function. </br>
4.flatMap always takes stream as input.       

![image](https://user-images.githubusercontent.com/52998083/212278202-399b0925-47f6-4858-9faa-70e791fa27ef.png)

![image](https://user-images.githubusercontent.com/52998083/212280291-0409d9e7-9c61-4501-9861-346fc29cb470.png)

![image](https://user-images.githubusercontent.com/52998083/212285165-1b9b6cba-edb5-4b47-b8b1-445369f88f8d.png)







