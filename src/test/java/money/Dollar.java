package money;

public class Dollar {

  int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    // NullpointerExceptionが返却されるため修正
    return new Dollar(amount *= multiplier);
  }
}
