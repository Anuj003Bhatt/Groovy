package mark6

class Optionals {
    static void main(String[]  args){
        // Example of an Integer using def
        def a = 100;
        println(a);

        // Example of an float using def
        def b = 100.10F;
        println(b);

        // Example of an Double using def
        def c = 100.101D;
        println(c);

        def d = 100.01
        println(d.multiply(2))
        println(d);


        // Example of an String using def
        def e = "HelloWorld";
        println(e);

        String sample = "Hello world";
        def sample2 = sample + " !!"
        println(sample)
        println(sample2)
        println(sample[4]); // Print the 5th character in the string

        //Print the 1st character in the string starting from the back
        println(sample[-1]);
        println(sample[1..2]);//Prints a string starting from Index 1 to 2
        println(sample[4..2]);//Prints a string starting from Index 4 back to 2
    }
}
