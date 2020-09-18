package se.ofranzen.apotekethjartat;

class FindMiddleOfString {
    /**
     * Return middle character of provided String if uneven number of characters in String. Return
     * to middle two characters of provided String if even number of characters in String.
     * @param str String
     * @return String
     */

    public static String getMiddle( String str ) {

        String output = "";

        if(isEvenNumberOfCharacters(str)){
            output = str.substring(str.length()/2-1, str.length()/2+1);
        } else {
            // substring middle as (length-1)/2 to round down as starting index
            output = str.substring((str.length()-1)/2, (str.length()-1)/2+1);
        }
        return output;
    }

    private static boolean isEvenNumberOfCharacters(String str){
        return str.length() % 2 == 0;
    }
}

