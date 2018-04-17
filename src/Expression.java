
public interface Expression {
	Money reduce(Bank bank, String to);
	Expression plus(Expression append);
	Expression times(int multiplier);
}
