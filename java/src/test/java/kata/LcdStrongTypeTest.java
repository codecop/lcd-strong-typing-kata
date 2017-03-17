package kata;

import org.junit.Test;

public class LcdStrongTypeTest {

//   @Test(expected=NullPointerException.class)
//   public void negative_number_is_not_accepted() {
//     Lcd lcd = new Lcd();
//     lcd.displayDigitList(-1);
//   }
  
   @Test(expected=NullPointerException.class)
   public void null_is_not_accepted() {
     Lcd lcd = new Lcd();
     lcd.displayDigitList(null);
   }
  
   @Test(expected=NullPointerException.class)
   public void digitsFormChars_should_not_accept_null(){
     Lcd lcd = new Lcd();
     lcd.getDigitsFormChars(null);
   }

//   @Test
//  public void digitsFormChars_should_not_accept_empty_chars(){
//     Lcd lcd = new Lcd();
//     lcd.getDigitsFormChars(new char[0]);
//  }
//
//  @Test
//  public void digitsFormChars_should_only_accept_digit_0_to_9(){
//    Lcd lcd = new Lcd();
//    lcd.getDigitsFormChars("A".toCharArray());
//  }
}
