package kata;

import static org.fest.assertions.api.Assertions.assertThat;

import org.fest.assertions.api.Assertions;
import org.junit.Test;

public class LcdTest {

    private static final String NL = "\n";

    @Test
    public void for_one() {
        Lcd lcd = new Lcd();
        String result = lcd.displayDigitList(PositiveInteger._1);
        Assertions.assertThat(result).isEqualTo(
        		"   \n" +
        		"  |\n" +
        		"  |\n" );

    }
    @Test
    public void for_7() {
        Lcd lcd = new Lcd();
        String result = lcd.displayDigitList(PositiveInteger._7);
        Assertions.assertThat(result).isEqualTo(
            " _ " + NL +
            "  |" + NL +
            "  |" + NL );
    }

    @Test
    public void for_22() {
        Lcd lcd = new Lcd();
        String result = lcd.displayDigitList(PositiveInteger._22);
        Assertions.assertThat(result).isEqualTo(
            " _ " + " _ " + NL +
            " _|" + " _|" + NL +
            "|_ " + "|_ " + NL );
    }

    @Test
    public void for_77() {
        Lcd lcd = new Lcd();
        String result = lcd.displayDigitList(PositiveInteger._77);
        Assertions.assertThat(result).isEqualTo(
            " _ " + " _ " + NL +
            "  |" + "  |" + NL +
            "  |" + "  |" + NL );
    }

    @Test
    public void for_172() {
        Lcd lcd = new Lcd();
        String result = lcd.displayDigitList(PositiveInteger._172);
        Assertions.assertThat(result).isEqualTo(
            "   " + " _ " + " _ " + NL +
            "  |" + "  |" + " _|" + NL +
            "  |" + "  |" + "|_ " + NL );
    }
}
