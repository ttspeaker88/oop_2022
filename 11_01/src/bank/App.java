package bank;

import exception.InsufficientFundsException;

public class App {

	public static void main(String[] args) {
		Bankszamla bankszamala = new Bankszamla("0011122");

		System.out.println(bankszamala);
		bankszamala.penzBerak(3000);

		System.out.println(bankszamala);

		try {
			bankszamala.penzKivesz(200);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}

		System.out.println(bankszamala);

		try {
			bankszamala.penzKivesz(5200);
		} catch (InsufficientFundsException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println(bankszamala);
		}
	}
}