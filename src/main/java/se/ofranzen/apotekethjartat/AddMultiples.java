package se.ofranzen.apotekethjartat;

class AddMultiples {

    /**
     * Iterate over the numbers from 0 to number and add the numbers that are
     * mulitples of 3 or 5. Do not add multiple of five if it was already a multiple
     * of three. E.g. "15".
     * @param number int
     * @return int
     */
    public static int addMultiplesOfThreeOrFive(int number) {
        int output = 0;
        for(int i = 0; i < number; i++){
            if(isMultipleOfThree(i)){ output += i; continue; }
            if(isMultipleOfFive(i)){ output += i; }
        }
        return output;
    }

    private static boolean isMultipleOfThree(int i){
        return i % 3 == 0;
    }

    private static boolean isMultipleOfFive(int i){
        return i % 5 == 0;
    }

}