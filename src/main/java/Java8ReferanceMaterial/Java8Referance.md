
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

foreach method of Stream is used for Iteration. Also we can use foreach method without Stream API on Collection classes

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

filter method is used to filter data within streams based on some condition

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

sorted method is used to sort streams, If we want to sort stream in descending order we need to use **stream.sorted(Collections.reverseOrder())**

