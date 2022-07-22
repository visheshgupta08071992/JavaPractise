# Understanding Comparable and Comparater

### So where do we need Comparable and Comparater?

We can easily sort list of integer,string or float. But what if we are required to sort an Employee Object having properties like name and marks. So here is where Comparable
and Comparater interfaces are used.

### Comparable Interface

Comparable interface enables the class which is implementiong it to sort the its object based on the implementation provided in compareTo Method. We are able to sort list 
of Integer,Float, String as all these classes have implemented compareTo method of Comparable Interface. So if we want to sort Employee class then we require to implement 
compareTo Method of Comparable interface within Employee class.


### Comparater Interface

Comparater helps us to give our implementation at runtime irrespective whether the class has implemented compareTo method of Comparable Class.

### Referance
https://www.youtube.com/watch?v=7CwmelNxxBI
