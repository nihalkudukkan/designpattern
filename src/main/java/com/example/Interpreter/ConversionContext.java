package com.example.Interpreter;

import java.util.Locale;

public class ConversionContext {
    String conversionQues;
    String conversionResponse;
    String fromConversion;
    String toConversion;
    double quantity;
    String[] partsOfQues;

    public ConversionContext(String input) {
        conversionQues = input;
        partsOfQues = getInput().split(" ");
        fromConversion = getCapitalized(partsOfQues[0]);
        toConversion = getLowerCase(partsOfQues[3]);
        quantity = Double.valueOf(partsOfQues[0]);

        conversionResponse = partsOfQues[0] + " " + partsOfQues[1] + " equals ";
    }

    public String getFromConversion() {
        return fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public String getResponse() {
        return conversionResponse;
    }

    public double getQuantity() {
        return quantity;
    }

    private String getLowerCase(String wordToLowercase) {
        return wordToLowercase.toLowerCase();
    }

    public String getCapitalized(String wordToCapitalize) {
        wordToCapitalize = wordToCapitalize.toLowerCase();
        wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);
        int lengthOfWord = wordToCapitalize.length();
        if (wordToCapitalize.charAt(lengthOfWord-1) != 's') {
            wordToCapitalize = new StringBuffer(wordToCapitalize).insert(lengthOfWord, "s").toString();
        }
        return wordToCapitalize;
    }

    public String getInput() {return conversionQues;};
}
