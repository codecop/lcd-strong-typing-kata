package kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lcd {

    @SuppressWarnings("serial")
    private Map<CharZeroToNine, Digit> possibleDigits = new HashMap<CharZeroToNine, Digit>() {{
        put(CharZeroToNine._1, new Digit("   ", "  |", "  |"));
        put(CharZeroToNine._2, new Digit(" _ ", " _|", "|_ "));
        put(CharZeroToNine._7, new Digit(" _ ", "  |", "  |"));
    }};

    private static final Integer[] lineNumbers = { 0, 1, 2 };
    private static final String NL = "\n";

    /**
     * Accept only and integer, so we're sure that from here we have only valid input
     */
    public String displayDigitList(PositiveInteger number) {
        NonEmptyList<CharZeroToNine> inputChars = number.asDigits();
        List<Digit> digits = getDigitsFormChars(inputChars);
        return displayDigitList(digits);
    }

    /**
     * switch to domain objects (instead of primitives ASAP
     */
    protected List<Digit> getDigitsFormChars(NonEmptyList<CharZeroToNine> inputChars) {
        List<Digit> digits = new ArrayList<>();
        for (CharZeroToNine charDigit : inputChars) {
            digits.add(possibleDigits.get(charDigit));
        }
        return digits;
    }

    private String displayDigitList(List<Digit> digitDigits) {
        StringBuilder s = new StringBuilder();
        for (int lineNumber : lineNumbers) {
            for (Digit digit : digitDigits) {
                s.append(digit.forLine(lineNumber));
            }
            s.append(NL);
        }
        return s.toString();
    }

}
