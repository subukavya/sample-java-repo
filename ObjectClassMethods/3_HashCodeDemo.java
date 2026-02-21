
/*
 * hashCode()
 * ----------
 * Returns integer hash value of object.
 * Used in hashing-based collections like HashMap.
 * If equals() is overridden, hashCode() should also be overridden.
 */

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Employee e = new Employee(101);
        System.out.println(e.hashCode());
    }
}
