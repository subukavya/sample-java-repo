/*
 * clone()
 * -------
 * Creates and returns a copy of the object.
 * Class must implement Cloneable interface.
 * Used when we want duplicate objects.
 */

class CloneDemo implements Cloneable {
    int x = 10;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        CloneDemo obj1 = new CloneDemo();
        CloneDemo obj2 = (CloneDemo) obj1.clone();
        System.out.println(obj2.x);
    }
}
