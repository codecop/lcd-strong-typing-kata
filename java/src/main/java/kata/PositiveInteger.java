package kata;

public enum PositiveInteger {

  _0,
  _1,
  _2,
  _3,
  _4,
  _5,
  _6,
  _7,
  _8,
  _9,
  _10,
  _11,
  _12,
  _13,
  _14,
  _15,
  _16,
  _17,
  _18,
  _19,
  _20,
  _21,
  _22,
  _23,
  _24,
  _25,
  _26,
  _27,
  _28,
  _29,
  _30,
  _31,
  _32,
  _33,
  _34,
  _35,
  _36,
  _37,
  _38,
  _39,
  _40, 
  _77, 
  _172;

  public NonEmptyList<CharZeroToNine> asDigits() {
    char[] digits = name().substring(1).toCharArray();
    
    CharZeroToNine first = convert(digits[0]); // we know it is not empty
    NonEmptyList<CharZeroToNine> list = new NonEmptyList<CharZeroToNine>(first);
    
    for (int i = 1; i < digits.length; i++) {
      list.add(convert(digits[i]));
    }
    
    return list;
    
    // other approach: create builder and add elements. after first add we get back a 
    // new builder interface which has the build method on it. call it on return.
  }

  private CharZeroToNine convert(/* c must be 0 to 9 */ char c) {
    return CharZeroToNine.valueOf("_" + c);
  }
}
