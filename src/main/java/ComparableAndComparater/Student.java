package ComparableAndComparater;

public class Student implements Comparable<Student> {


    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student o) {

       /* The given logic sort in ascending order based on marks
       * and if marks are equal then it sorts based on name in ascending order
       *
       *
       * */
        if(Integer.compare(this.marks,o.marks) == 0){
            return this.name.compareTo(o.name);
        }
        return Integer.compare(this.marks,o.marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
