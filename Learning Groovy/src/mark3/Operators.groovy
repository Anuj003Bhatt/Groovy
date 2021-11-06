package mark3

/**
 *  Groovy supports below list of operators
 *  1. Arithematic Operators:
 *      a. +   : Add two operands
 *      b. -   : Subtract two operands
 *      c. *   : Multiply two operands
 *      d. /   : Divide two operands
 *      e. %   : Remainder of division of two operands
 *      f. ++  : Increment value by one (post and pre)
 *      g. --  : Decrement value by one (post and pre)
 *  2. Relational Operators:
 *      a. a==b  : is a equal to b
 *      b. a!=b  : is a not equal to b
 *      c. a<b   : is a less than b
 *      d. a<=b  : is a less than or equal to b
 *      e. a>b   : is a greater than b
 *      f. a>=b  : is a greater than or equal to b
 *
 *  3. Logical Operators:
 *      a. && : AND (SHORT CIRCUIT AND)
 *      b. || : OR (SHORT CIRCUIT OR)
 *      c: !  : NOT (NEGATE)
 *  4. Bitwise Operator:
 *      a. & : Bitwise AND
 *      b. | : Bitwise OR
 *      c. ^ : Bitwise Ex-OR
 *      d. ~ : Bitwise NEGATE
 *
 *  5. Assignment Operator
 *      a. += : [a+=b => a=a+b]
 *      b. -= : [a-=b => a=a-b]
 *      c. *= : [a*=b => a=a*b]
 *      d. /= : [a/=b => a=a/b]
 *      e. %= : [a%=b => a=a%b]
 *
 *  6. Range Operator:
 *      a. .. : 0..5 = [0,1,2,3,4,5]
 *
 */
class Operators {
    static void main(String[] args){

        int  a = 10;
        byte b = 127;
        println("+: " + (a+b))
        println("-: " + (a-b))
        println("*: " + (a*b))
        println("/: " + (b/a))
        println("%: " + (b%a))
        println("++ pre: " + ++a)  // Incremented then put in println // a=11 and prints 11
        println("++ post: " + a++) // First value put in println then incremented // a=12 but prints 11
        println("-- post: " + a--) // First value put in println then decremented // a=11 but prints 12
        println("-- pre: " + --a)  // Decremented then put in println // a=10 and prints 10

        println(1==1);println(1!=1)
        println(1>2);println(2>1)
        println(1>=2);println(1>=1)
        println(2<1);println(1<2)
        println(1<=2);println(1<=1)



    }
}
