public class FizzBuzzTranslate {
    public static String translateFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return FizzBuzzTranslate.translateFB(number);
    }
    public static String translateFB(int number){
        String tensArray[] = {"zero", "one", "two", "Fizz", "four", "Buzz", "six",
                "seven", "eight", "nine"};
        String words = "";
        if (number == 0) {
            return "zero";
        }
        if ((number / 1000) > 0) {
            words += translateFB(number / 1000) + "-";
            number %= 1000;
        }
        // check if number is divisible by 1 hundred
        if ((number / 100) > 0) {
            words += translateFB(number / 100) + "-";
            number %= 100;
        }
        if ((number / 10) > 0) {
            words += translateFB(number / 10) + "-";
            number %= 10;
        }
        words += tensArray[number];

        return words;
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzzTranslate.translateFB(3552));
    }
}
