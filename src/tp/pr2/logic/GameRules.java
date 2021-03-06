package tp.pr2.logic;
  
public interface GameRules {

	// Build a board that is to be used in the game, according to the rules of that game.
	public Board newBoard();

	// Consulta si hay empate. tablas(Ficha ultimoEnPoner, Tablero t) 
	public boolean isDraw(Counter lastMove, Board b);
	
	// Checks whether or not, with the current board, one of the players has won and, if so, returns the colour of the winner
	public Counter winningMove(Move lastMove, Board b);
	
	//jugadorInicial()
	public Counter initialPLayer();
	
	// Returns the colour of the player whose turn it is.
	public Counter nextTurn(Counter lastMove, Board b);
	
}
