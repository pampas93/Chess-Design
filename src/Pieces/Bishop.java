/**
 * 
 */
package Pieces;
import ChessDesign.Player;

/**
 * @author Abhijit
 *
 */
public class Bishop extends Piece{

	/***
	 * Refer constructor of Piece
	 * @param player
	 * @param x
	 * @param y
	 */
	public Bishop(Player player, int x, int y) {
		super(Type.BISHOP, player, x, y);
		
		this.displayText += "B";
	}

	@Override
	public boolean movement_type(int fx, int fy) {
		// TODO Auto-generated method stub
		
		return true;
	}

}
