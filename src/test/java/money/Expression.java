package money;

interface Expression {
  Expression plus(Expression addednd);
  Money reduce(Bank bank, String to);
}
