// example feature bitwise operations
public class bitwise_ops {
    public static void main(String args[]) {
        String bin[] = { "0000","0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100",
                "1101", "1110", "1111" };

        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println("        a = " + bin[a]);
        System.out.println("        b = " + bin[b]);
        System.out.println("       a|b = " + bin[c]);
        System.out.println("       a&b = " + bin[d]);
        System.out.println("        a^b = " + bin[e]);
        System.out.println("        ~a&b|a&~b = " + bin[f]);
        System.out.println("        ~a = " + bin[g]);

    }
}

/*
The Left Shift
The left shift operator, <<, shifts all of the bits in a value to the left a specified
number of times.. For each shift left, the high-order bit is shifted out (and
lost), and a zero is brought in on the right.
(rigth shift is similar to left shift)


If you are coming from a C/C++ background, please note the following. In
C/C++, these types of statements are very common:
if(!done) || if (done);
they dont work in java

in java:
if(done==0) || if (done != 0);

In C/C++, true is any nonzero value and false is zero. In Java, true and false are
nonnumeric values that do not relate to zero or nonzero. Therefore, to test for zero or
nonzero, you must explicitly employ one or more of the relational operators.



Short-Circuit Logical Operators:

Java provides two interesting Boolean operators not found in some other computer
languages. These are secondary versions of the Boolean AND and OR operators, and
are commonly known as short-circuit logical operators.

if (denom !=0 && num / denom >10)
If this line of code were written using the single
& version of AND, both sides would be evaluated, causing a run-time exception
when denom is zero.

if(c==1 & e++ < 100)
d = 100;

Here, using a single & ensures that the increment operation will be applied to e
whether c is equal to 1 or not.

The ? Operator
ration = denom==0?0:num/denom;


*/