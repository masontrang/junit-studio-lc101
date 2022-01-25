package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void brackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[]"));
    }

    @Test
    public void bracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[test]"));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("nobrackets"));
    }

    @Test
    public void opposingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void extraBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void singleLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[singlebracket"));
    }

    @Test
    public void singleRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("singlebracket]"));
    }

    @Test
    public void doubleLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[singlebracket]"));
    }

    @Test
    public void doubleRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[singlebracket]]"));
    }

    @Test
    public void notNull() {
        assertNotNull(BalancedBrackets.hasBalancedBrackets(""));
    }






}
