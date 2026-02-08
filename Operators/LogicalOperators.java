public class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true, y = false;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y: " + (x && y));  // false
        System.out.println("x || y: " + (x || y));  // true
        System.out.println("!x: " + (!x));          // false
        System.out.println("!(x && y): " + (!(x && y)));  // true
    }
}
