package se.ofranzen.apotekethjartat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AddMultiplesTests {
    @Test
    void testValid1() { assertEquals(23, AddMultiples.addMultiplesOfThreeOrFive(10)); }

    @Test
    void testValid2() { assertEquals(8, AddMultiples.addMultiplesOfThreeOrFive(6)); }

    @Test
    void testValid3() { assertEquals(9168, AddMultiples.addMultiplesOfThreeOrFive(200)); }

    @Test
    void testInvalid1() { assertNotEquals(25, AddMultiples.addMultiplesOfThreeOrFive(10)); }

    @Test
    void testInvalid2() { assertNotEquals(11, AddMultiples.addMultiplesOfThreeOrFive(6)); }

    @Test
    void testInvalid3() { assertNotEquals(19168, AddMultiples.addMultiplesOfThreeOrFive(200)); }

}
