package Day28_literals;

public class basicliteral {
    public static void main(String[] args) {
        int i1 = 123456;
        int i2 = 123_456;
        System.out.println(i1 == i2); 
        byte color = 1_2_3;
        short yearsAnnoDomini= 2_016;
        int socialSecurtyNumber = 999_99_9999;
        long creditCardNumber = 1234_5678_9012_3456L;
        float piFourDecimals = 3.14_15F;
        double piTenDecimals = 3.14_15_92_65_35;
        short binary= 0b0_1_0_1;
        int octal = 07_7_7_7_7_7_7_7_0;
        long hexBytes = 0xFF_EC_DE_5E;
        // There are a few rules about underscores which forbid their placement in the following places:
        // At the beginning or end of a number (e.g. _123 or 123_ are not valid)
        // Adjacent to a decimal point in a floating point literal (e.g. 1._23 or 1_.23 are not valid)
        // Prior to an F or L suffix (e.g. 1.23_F or 9999999_L are not valid)
        // In positions where a string of digits is expected (e.g. 0_xFFFF is not valid)
    }
}
