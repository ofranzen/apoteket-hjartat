package se.ofranzen.apotekethjartat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FindMiddleOfStringTests {
    @Test
    void findMiddleOfStringValid1() { assertEquals("A", FindMiddleOfString.getMiddle("A")); }
    @Test
    void findMiddleOfStringValid2() { assertEquals("es", FindMiddleOfString.getMiddle("test")); }
    @Test
    void findMiddleOfStringValid3() { assertEquals("t", FindMiddleOfString.getMiddle("testing")); }
    @Test
    void findMiddleOfStringValid4() { assertEquals("dd", FindMiddleOfString.getMiddle("middle")); }
    @Test
    void findMiddleOfStringValid5() { assertEquals("dd", FindMiddleOfString.getMiddle("qwemiddleqwe")); }
    @Test
    void findMiddleOfStringValid6() { assertEquals("t", FindMiddleOfString.getMiddle("qwetestingqwe")); }

    @Test
    void findMiddleOfStringInvalid1() { assertNotEquals("B", FindMiddleOfString.getMiddle("A")); }
    @Test
    void findMiddleOfStringInvalid2() { assertNotEquals("se", FindMiddleOfString.getMiddle("test")); }
    @Test
    void findMiddleOfStringInvalid3() { assertNotEquals("y", FindMiddleOfString.getMiddle("testing")); }
    @Test
    void findMiddleOfStringInvalid4() { assertNotEquals("aa", FindMiddleOfString.getMiddle("middle")); }
    @Test
    void findMiddleOfStringInvalid5() { assertNotEquals("bb", FindMiddleOfString.getMiddle("qwemiddleqwe")); }
    @Test
    void findMiddleOfStringInvalid6() { assertNotEquals("qwe", FindMiddleOfString.getMiddle("qwetestingqwe")); }

}
