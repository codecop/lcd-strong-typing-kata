package kata;

public enum PositiveInteger {

  _0 (new NonEmptyList<>(CharZeroToNine._0)),
  _1 (new NonEmptyList<>(CharZeroToNine._1)),
  _2 (new NonEmptyList<>(CharZeroToNine._2)),
  _3 (new NonEmptyList<>(CharZeroToNine._3)),
  _4 (new NonEmptyList<>(CharZeroToNine._4)),
  _5 (new NonEmptyList<>(CharZeroToNine._5)),
  _6 (new NonEmptyList<>(CharZeroToNine._6)),
  _7 (new NonEmptyList<>(CharZeroToNine._7)),
  _8 (new NonEmptyList<>(CharZeroToNine._8)),
  _9 (new NonEmptyList<>(CharZeroToNine._9)),
  _10 (new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _11(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _12(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _13(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _14(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _15(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _16(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _17(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _18(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _19(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _20(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _21(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _22(new NonEmptyList<>(CharZeroToNine._2).add(CharZeroToNine._2)),
  _23(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _24(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _25(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _26(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _27(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _28(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _29(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _30(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _31(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _32(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _33(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _34(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _35(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _36(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _37(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _38(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _39(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)),
  _40(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._0)), 
  _77(new NonEmptyList<>(CharZeroToNine._7).add(CharZeroToNine._7)), 
  _172(new NonEmptyList<>(CharZeroToNine._1).add(CharZeroToNine._7).add(CharZeroToNine._2));

  private NonEmptyList<CharZeroToNine> digits;

  PositiveInteger(NonEmptyList<CharZeroToNine> digits) {
    this.digits = digits;
  }

  public NonEmptyList<CharZeroToNine> asDigits() {
    return digits;
  }
  
//  public NonEmptyList<CharZeroToNine> asDigits() {
//    char[] digits = name().substring(1).toCharArray();
//    
//    CharZeroToNine first = convert(digits[0]); // we know it is not empty
//    NonEmptyList<CharZeroToNine> list = new NonEmptyList<CharZeroToNine>(first);
//    
//    for (int i = 1; i < digits.length; i++) {
//      list.add(convert(digits[i]));
//    }
//    
//    return list;
//    
//    // other approach: create builder and add elements. after first add we get back a 
//    // new builder interface which has the build method on it. call it on return.
//  }
//
//  private CharZeroToNine convert(/* c must be 0 to 9 */ char c) {
//    return CharZeroToNine.valueOf("_" + c);
//  }

}
