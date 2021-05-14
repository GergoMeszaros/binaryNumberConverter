public class BinaryConverter {

    public int binaryToIntConverter(int binaryNumber) {
        int decimal = 0;
        int base = 1;

        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;
            decimal += lastDigit * base;
            base *= 2;
            binaryNumber = binaryNumber / 10;
        }
        return decimal;
    }

    public int integerToBinaryConverter(int number){
        if(number == 0){
            return number;
        }

        StringBuilder sb = new StringBuilder();
        int quotient = number;

        while(quotient > 0){
            int remainder = quotient % 2;
            sb.append(remainder);
            quotient /= 2;
        }
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
