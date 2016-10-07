
public interface iAccount {
	public void deposit(float sum);
	public void withdraw(float sum) throws IsufficiantSumException;
	public float getBalance();
}
