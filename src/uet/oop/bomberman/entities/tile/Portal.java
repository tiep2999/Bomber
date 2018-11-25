package uet.oop.bomberman.entities.tile;

import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Sprite;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.character.Bomber;

public class Portal extends Tile {
	protected Board _board;

	public Portal(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}
	
	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý khi Bomber đi vào
		if(e instanceof Bomber ) {
			if (_board.detectNoEnemies()) {
				if (e.getXTile() == getX() && e.getYTile() == getY()) {
					if (_board.detectNoEnemies())
						_board.nextLevel();
				}
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
