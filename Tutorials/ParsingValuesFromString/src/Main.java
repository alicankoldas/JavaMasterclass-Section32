public class Main {
    public static void main(String[] args) {
        //String numberAsString = "2018a"; // interpreted as String and not as a number
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        //int number = Integer.parseInt(numberAsString);
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}