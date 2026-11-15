public class Addition {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        int additionResult = add(2, 3);
        int subtractionResult = subtract(10, 5);

        System.out.println("Addition result: " + additionResult);
        System.out.println("Subtraction result: " + subtractionResult);
    }
}
// Testing automatic Jenkins trigger