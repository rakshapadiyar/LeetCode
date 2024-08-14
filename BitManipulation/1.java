Bitwise Operators:

AND (&): Sets each bit to 1 if both bits are 1.
OR (|): Sets each bit to 1 if at least one of the bits is 1.
XOR (^): Sets each bit to 1 if only one of the bits is 1.
NOT (~): Inverts all bits.
Left Shift (<<): Shifts bits to the left, filling with zeros (multiplies by 2).
Right Shift (>>): Shifts bits to the right, filling with the sign bit (divides by 2).
Set and Clear Bits:

Set a bit: Use the OR operator (num | (1 << k)).

Clear a bit: Use the AND operator with NOT (num & ~(1 << k)).

Toggle a bit: Use the XOR operator (num ^ (1 << k)).

Checking Bits:

To check if a bit is set: (num & (1 << k)) != 0.

-----------------------------------------------------------------------------------------------------------------------------------------------------
To count the number of set bits (Hamming weight): Use Brian Kernighan’s algorithm or a simple loop.

simple loop
 static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

Brian Kernighan’s algorithm

Brian Kernighan’s algorithm is used to find the number of set bits in a number. The idea behind the algorithm is that when we subtract one from an integer,
all the bits following the rightmost set of bits are inverted, turning 1 to 0 and 0 to 1. The rightmost set bit also gets inverted with the bits right to it.

  while (n > 0) {
            count ++;
            n=n& (n-1);
        }
-----------------------------------------------------------------------------------------------------------------------------------------------------

Power of Two: A number is a power of two if it has exactly one bit set: (n & (n - 1)) == 0 (for n > 0).

Swapping Numbers:
a = a ^ b
b = a ^ b
a = a ^ b
