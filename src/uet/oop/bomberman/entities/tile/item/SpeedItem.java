package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Sprite;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.Game;

public class SpeedItem extends Item {


    public SpeedItem(int x, int y, int level, Sprite sprite) {
        super(x, y, level, sprite);
    }

    @Override
    public boolean collide(Entity e) {
        // TODO: xử lý Bomber ăn Item
        if (e instanceof Bomber) {
            ((Bomber) e).addItem(this);
            remove();
            return true;
        }
        return false;
    }

    @Override
    public void setValues() {
        _active = true;
        Game.addBomberSpeed(0.1);
    }
}
