package gameobject.Props;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import gameobject.MainCharacter;

public class Flower extends Friend {
	
	//public static final int Y_LAND = 125;
    public static final int Y_LAND = 70;
	
	private int posX;
	private int width;
	private int height;
	private int type;

	private BufferedImage image;
	private MainCharacter mainCharacter;
	
	private Rectangle rectBound;
	
	public Flower(MainCharacter mainCharacter, int posX, int width, int height, BufferedImage image, int type) {
		this.mainCharacter = mainCharacter;
		this.posX = posX;
		this.width = width;
		this.height = height;
		this.image = image;
		this.type = type;
	}
	
	public void update() {
		posX -= mainCharacter.getSpeedX();
	}
	
	public void draw(Graphics g) {
		g.drawImage(image, posX, Y_LAND - image.getHeight(), null);
		g.setColor(Color.red);
//		Rectangle bound = getBound();
//		g.drawRect(bound.x, bound.y, bound.width, bound.height);
	}
	
	public int getType() {
		return type;
	}
	public Rectangle getBound() {
		rectBound = new Rectangle();
		rectBound.x = (int) posX + (image.getWidth() - width)/2;
		rectBound.y = Y_LAND - image.getHeight() + (image.getHeight() - height)/2;
		rectBound.width = width;
		rectBound.height = height;
		return rectBound;
	}

	@Override
	public boolean isOutOfScreen() {
		if(posX < -image.getWidth()) {
			return true;
		}
		return false;
	}
	
}
