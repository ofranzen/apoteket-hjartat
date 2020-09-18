package se.ofranzen.apotekethjartat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTests {

    @Test
    void testValid1() { assertTrue(BraceChecker.isBracesClosedProperly("()")); }

    @Test
    void testValid2() { assertTrue(BraceChecker.isBracesClosedProperly("(){}[]")); }

    @Test
    void testValid3() { assertTrue(BraceChecker.isBracesClosedProperly("([{{}}])")); }

    @Test
    void testInvalid1() { assertFalse(BraceChecker.isBracesClosedProperly("[(])")); }

    @Test
    void testInvalid2() { assertFalse(BraceChecker.isBracesClosedProperly(")))")); }

    @Test
    void testInvalid3() { assertFalse(BraceChecker.isBracesClosedProperly("(()))")); }

}

