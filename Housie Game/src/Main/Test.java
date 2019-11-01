package Main;

import housie_ticket.Coupn;

public class Test {

	public static void main(String[] args) {

		Coupn ticket = new Coupn(3,9,5);
		int[][] tNumber = ticket.getTicket();
		ticket.showTicket(tNumber);

		Coupn ticket1 = new Coupn(3,9,5);
		int[][] tNumber1 = ticket1.getTicket();
		ticket.showTicket(tNumber1);


	}
}
