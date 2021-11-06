package mark2

/**
 *  Groovy supports 9 built-in data type.
 *  1. byte      : 8 bits      :  wrapper class- java.lang.Byte
 *  2. short     : 16 bits     :  wrapper class- java.lang.Short
 *  3. int       : 32 bits     :  wrapper class- java.lang.Integer
 *  4. long      : 64 bits     :  wrapper class- java.lang.Long
 *  5. float     : 32 bits     :  wrapper class- java.lang.Float
 *  6. double    : 64 bits     :  wrapper class- java.lang.Double
 *  7. char      : 16 bits     :  wrapper class- java.lang.Character
 *  8. boolean   : undefined
 *  9. String    : Depends on length of string stored
 */
class DataTypes {

    public static void main(String[] args){
        boolean val = true;//Example of a boolean datatype (valid values true/false)
        char c = 'a';//Example of a char datatype
        int x = 21;//Example of a int datatype
        long y = 100;//Example of a long datatype
        float a = 10.56f;//Example of a floating point datatype
        double b = 10.5e40;//Example of a double datatype
        BigInteger bInt = 30g;//Example of a BigInteger datatype
        BigDecimal bDec = 3.5g;//Example of a BigDecimal datatype
        String abc = "abc";//Example of a String datatype
        println(val); println(c); println(x); println(y); println(a); println(b);
        println(bInt); println(bDec);println(abc);
    }
}
