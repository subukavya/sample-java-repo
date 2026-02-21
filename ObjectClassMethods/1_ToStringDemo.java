
/*
 * toString()
 * ----------
 * Used to return a string representation of an object.
 * It is automatically called when we print an object.
 * Default: prints class name + hashcode.
 * We override it to print meaningful data.
 */

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Ravi");
        System.out.println(s);  // Calls toString()
    }
}
