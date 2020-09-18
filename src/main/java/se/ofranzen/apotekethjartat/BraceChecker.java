package se.ofranzen.apotekethjartat;

import java.util.ArrayDeque;
import java.util.Deque;

class BraceChecker {

    private static Deque<String> validClosingBraces;

    static boolean isBracesClosedProperly(String braces) {
        validClosingBraces = new ArrayDeque<>();
        for (char ch : braces.toCharArray()) {
            String str = String.valueOf(ch);
            if (isOpeningBrace(str)) {
                addCorrectClosingBrace(str);
            }
            if (isClosingBrace(str)) {
                if (isCorrectClosingBrace(str)) {
                    validClosingBraces.removeLast();
                } else {
                    return false;
                }
            }
        }
        return allBracesCorrectlyClosed();
    }

    private static boolean isOpeningBrace(String str){
        return "({[".contains(str);
    }

    private static boolean isClosingBrace(String str){
        return ")}]".contains(str);
    }

    private static void addCorrectClosingBrace(String str){
        if(str.equalsIgnoreCase("(")){ validClosingBraces.addLast(")"); }
        if(str.equalsIgnoreCase("{")){ validClosingBraces.addLast("}"); }
        if(str.equalsIgnoreCase("[")){ validClosingBraces.addLast("]"); }
    }

    private static boolean isCorrectClosingBrace(String str){
        return str.equalsIgnoreCase(validClosingBraces.peekLast());
    }

    private static boolean allBracesCorrectlyClosed(){
        return validClosingBraces.isEmpty();
    }

}