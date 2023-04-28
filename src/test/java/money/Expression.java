package money;

interface Expression {
  Expression times(int multiplier);
  Expression plus(Expression addednd);
  Money reduce(Bank bank, String to);
}
