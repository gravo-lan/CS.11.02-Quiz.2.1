public class Main {
    public static void main(String[] args) {
        int sum2 = add(1,2);
        String greetJesus = greeting("Jesus");
        int sum4 = add(1,2,3,4);
        System.out.println(sum2);
        System.out.println(greetJesus);
        System.out.println(sum4);
        printMe("Hi Mr Ewing can I do the Unit 1 Assessment on Wednesday in EL? Thanks");
    }

    public static int add(int numOne, int numTwo) {
        return numOne+numTwo;
    }

    public static String greeting(String name) {
        return "Bonjour " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(numOne,numTwo),add(numThree,numFour));
    }

    public static void printMe(Object toBePrinted) {
        System.out.println(toBePrinted);
    }
}
