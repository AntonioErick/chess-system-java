package Chess;

import Boardgame.BoardException;

public class ChessExcepetion extends BoardException {
	
	private static final long serialVersionUID = 1L;

	public ChessExcepetion(String msg) {
		super(msg);
	}
}
