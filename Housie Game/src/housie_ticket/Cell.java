package housie_ticket;

public class Cell {

	int cell[][] ;
	int noOfRows, noOfColumn;
	
	public  Cell(int noOfRows, int noOfCplumn) {
		int cell [][] = new int[noOfRows][noOfColumn];
		this.cell = cell;
		this.noOfColumn= noOfColumn;
		this.noOfRows = noOfRows;
	}
	
}
