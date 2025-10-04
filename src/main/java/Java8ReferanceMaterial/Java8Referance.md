
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


6.**reduce**
In Java 8, the reduce() method is part of the Stream API and can be used to reduce a stream of elements to a single value.. The first parameter of reduce is the initial value while the second parameter is the aggregation operation 

![image](https://user-images.githubusercontent.com/52998083/212305999-cfbd24b1-d345-4e2f-bddf-2b066518f870.png)

![image](https://user-images.githubusercontent.com/52998083/212311755-6fa02727-ed34-4fce-af2d-ad01928db9c1.png)

7.**Optional class**

Optional Class was introduced in Java 8 and was basically added to avoid likelihood of NullPointerException. There can be instances where value of Object can be present or not present.To handle cases where the value of Object is Null, Optional class was introduced to handle such cases.

Optional Class is added in Java 8. There are scenarios when the value of Object can be either present or not present,So value can be null. In that case its tricky to write lot of checks and those checks are not readable. Optional can handle these scenario when the value is present or when the value is not present. You can create an optional object with **Optional.of(object)** and **Optional.ofNullable(object)** . If you are very sure that value of object would not be null only then use **Optional.of** . Else it is always better to use **Optional.ofNullable** . To get the value we need to call get method of Optional


**Declare a variable of Type String and create an Optional out of it.**

![image](https://user-images.githubusercontent.com/52998083/212684551-7623349d-bc52-47d0-b111-d3dfc8e65f19.png)

**Declare a variable of Type String which has null and create an Optional out of it. Ensure that there is no NullPointer Exception.Return a default value if
 the value is null**

1.isPresent - checks whether there are values in Optional.
2.orElse - checks whether the value is present else it returns the default value

![image](https://user-images.githubusercontent.com/52998083/212687868-cd3edfe6-3105-40ae-b110-51cb52bd702a.png)

we would get NullPointerException if we try to perform the same operation with Optional.of as shown in below screenshot

![image](https://user-images.githubusercontent.com/52998083/212688351-ad208c75-7ec7-4459-9222-650e1f785329.png)


# Java 8 Optional Class Explained by ChatGPT

The Java 8 Optional class is a container object that may or may not contain a non-null value. It is used to avoid `NullPointerExceptions` and make the code more robust, especially when dealing with null values or unknown results. Optional is a useful class for handling cases where a value may or may not be present, reducing the likelihood of null pointer exceptions and making your code more robust.

## Example

```java
public class Person {
    private String name;
    private Optional<Integer> age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = Optional.ofNullable(age);
    }

    public String getName() {
        return name;
    }

    public Optional<Integer> getAge() {
        return age;
    }
}
```

In this example, the `Person` class has a `name` and an `age` which is an `Optional`. The `age` variable can either contain an integer value or it can be `null`. Using the Optional class allows us to avoid null checks and handle the case where there is no age value assigned to the person.

To get the age value of a person, we can call the `getAge()` method which returns an `Optional`. We can then use methods provided by the Optional class to handle the case where there is no age value assigned.

```java
Person john = new Person("John Doe", null);

//using Optional.ifPresent() to print the age value only if it exists
john.getAge().ifPresent(age -> System.out.println("Age: " + age));

//using Optional.orElse() to assign a default value if the age is not present
int defaultAge = 18;
int age = john.getAge().orElse(defaultAge);
System.out.println("Age: " + age);

//using Optional.map() to perform operations on the age value if it exists
int incrementedAge = john.getAge().map(age -> age + 1).orElse(defaultAge);
System.out.println("Incremented Age: " + incrementedAge);
```

In the first example, we use the `ifPresent()` method to print the age value only if it exists. In the second example, we use the `orElse()` method to assign a default value of 18 if there is no age value assigned to the person. In the third example, we use the `map()` method to increment the age value by 1 if it exists, and assign the result to a new variable. If the age value is not present, the `orElse()` method assigns the default age value of 18 to the `incrementedAge` variable.


**Java 8 Stream Sample for referance**

https://iamvickyav.medium.com/java-8-stream-samples-for-your-reference-f6cee5066c77




















