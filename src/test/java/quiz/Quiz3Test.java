package quiz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Quiz3Test {

    @Test
    void testPrimeNumbers() {
        Quiz3 quiz3 = new Quiz3();

        assertTrue(quiz3.checkPrime(2), "2는 소수여야 합니다.");
        assertTrue(quiz3.checkPrime(3), "3는 소수여야 합니다.");
        assertTrue(quiz3.checkPrime(5), "5는 소수여야 합니다.");
        assertTrue(quiz3.checkPrime(7), "7는 소수여야 합니다.");
        assertTrue(quiz3.checkPrime(11), "11는 소수여야 합니다.");
    }

    @Test
    void testNonPrimeNumbers() {
        Quiz3 quiz3 = new Quiz3();

        assertFalse(quiz3.checkPrime(1), "1은 소수가 아닙니다.");
        assertFalse(quiz3.checkPrime(4), "4는 소수가 아닙니다.");
        assertFalse(quiz3.checkPrime(6), "6는 소수가 아닙니다.");
        assertFalse(quiz3.checkPrime(8), "8는 소수가 아닙니다.");
        assertFalse(quiz3.checkPrime(9), "9는 소수가 아닙니다.");
        assertFalse(quiz3.checkPrime(10), "10는 소수가 아닙니다.");
    }
}
