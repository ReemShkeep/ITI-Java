package mainclass;

public class MainClass {

    public static void main(String[] args) {
        TestExeption test = new TestExeption();
        
        try {
            test.isSmallerThan(5, 3);
        } catch (Exception e) {
            System.err.println("Error is catched");
        }
        try {
            test.isGreaterThan(5, 3);
        } catch (Exception e) {
            System.err.println("Error is catched");
        }
        try {
            test.isEqualtoZero(0);
        } catch (Exception e) {
            System.err.println("Error is catched");
        }
    }
    
}
