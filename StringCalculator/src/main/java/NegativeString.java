public class NegativeString extends StringCalculator{
    public static int add(String numbers) {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    int i = Integer.parseInt(number.trim()); // If it is not a number, parseInt will throw an exception
                    if (i < 0) throw new IllegalArgumentException("negative number " + Integer.parseInt(number.trim()) + " was entered."); //
                    else returnValue += i;
                }
            }
        }
        return returnValue%1000;
    }
}
