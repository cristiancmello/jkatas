package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void factorial_recursive() {
        assertEquals(1, factr(0));
        assertEquals(1, factr(1));
        assertEquals(2, factr(2));
        assertEquals(6, factr(3));
        assertEquals(24, factr(4));
        assertEquals(120, factr(5));
        assertEquals(720, factr(6));
    }

    @Test
    public void factorial_iterative() {
        assertEquals(BigInteger.valueOf(1), facti(0));
        assertEquals(BigInteger.valueOf(1), facti(1));
        assertEquals(BigInteger.valueOf(2), facti(2));
        assertEquals(BigInteger.valueOf(6), facti(3));
        assertEquals(BigInteger.valueOf(24), facti(4));
        assertEquals(BigInteger.valueOf(120), facti(5));
    }

    private BigInteger facti(int n) {
        if (n == 0) return BigInteger.valueOf(1);
        if (n <= 2) return BigInteger.valueOf(n);

        var r = BigInteger.valueOf(1);

        for (int i = 0; i < n - 1; i++) {
            r = r.multiply(BigInteger.valueOf(n - i));
        }

//        if (r == 3) r = (n - 0) * (n - 1);
//        if (r == 4) r = (n - 0) * (n - 1) * (n - 2);
//        if (r == 5) r = (n - 0) * (n - 1) * (n - 2) * (n - 3);

        return r;
    }

    // TODO: fazer um fatorial cachead (memoization + recursivo)

    private int factr(int n) {
        if (n == 0) return 1;

        return n * factr(n - 1);
    }
}
