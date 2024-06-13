package gameobject.Props;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Friend {
	public abstract int getType();
	public abstract void update();
	public abstract void draw(Graphics g);
	public abstract Rectangle getBound();
	public abstract boolean isOutOfScreen();
}
