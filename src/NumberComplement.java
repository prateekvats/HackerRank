public class NumberComplement {

    public static void main(String args[]){
        int n=50;
        System.out.println(getIntegerComplement(50));
    }

    public static int getIntegerComplement(int number){
        // Convert Decimal to Binary
        char [] binary = Integer.toString(number,2).toCharArray();
        // Flip Bits
        invertTheBits(binary);
        return Integer.parseInt(String.valueOf(binary), 2);
    }

    private static void invertTheBits(char[] binaryNumber) {
        for (int i = 0; i < binaryNumber.length; i++) {
            if (binaryNumber[i]=='0')
                binaryNumber[i]='1';
            else
                binaryNumber[i]='0';
        }
    }
}


