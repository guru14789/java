public class Number_To_Word {

    private static final String[] units = {
        "", "one", "two", "three", "four", "five", "six",
        "seven", "eight", "nine", "ten", "eleven", "twelve",
        "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int number) {
        if (number == 0) return "zero";
        if (number < 0) return "minus " + convert(-number);

        String words = "";

        if (number / 1000 > 0) {
            words += units[number / 1000] + " thousand ";
            number %= 1000;
        }

        if (number / 100 > 0) {
            words += units[number / 100] + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (!words.isEmpty()) words += "and ";

            if (number < 20) {
                words += units[number];
            } else {
                words += tens[number / 10];
                if (number % 10 > 0) {
                    words += "-" + units[number % 10];
                }
            }
        }

        return words;
    }

    public static void main(String[] args) {
        int number = 7698;
        System.out.println("Number in words: " + convert(number));
    }
}
