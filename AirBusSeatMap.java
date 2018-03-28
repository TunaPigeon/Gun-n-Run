package reservations;

/**
 * AirBusSeatMap, the number of total rows is 12, the number of total columns is 9,
 * the number of total first class row is 6.
 * @author Takashi Gori
 *
 */
public class AirBusSeatMap extends SeatMap {
	public AirBusSeatMap()
	{
		super(12, 9, 6);
		initialiseSeatMap();
	}
	/**
	 * initialise seat map
	 */
	@Override
	public void initialiseSeatMap()
	{
		//Seat.SeatType for every column
		Seat.SeatType seattypes[] = {Seat.SeatType.WINDOW, Seat.SeatType.MIDDLE, Seat.SeatType.AISLE,
				Seat.SeatType.AISLE,Seat.SeatType.MIDDLE, Seat.SeatType.AISLE,
				Seat.SeatType.AISLE, Seat.SeatType.MIDDLE, Seat.SeatType.WINDOW};
		
		for (int row = 0; row<rows; row++)
		{
			for(int column = 0; column < columns; column++)
			{
				//when row is smaller than firstClassRows, is first class seat
				boolean inFirstClass = row < firstClassRows;
			SeatPosition seatposition = new SeatPosition(row, column);
			Seat.SeatType seattype = seattypes[column];
			seatList[row][column] = new Seat(seattype, seatposition, inFirstClass);
			}
		}
	}
}
