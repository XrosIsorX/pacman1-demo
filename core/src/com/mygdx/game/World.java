package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	public Pacman pacman;
	
	public World()
	{
		pacman = new Pacman(100,100);
	}
	
	void update(float delta)
	{
		
		if(Gdx.input.isKeyPressed(Keys.UP))
		{
			pacman.move(Pacman.DIRECTION_UP);
		}
		else if(Gdx.input.isKeyPressed(Keys.DOWN))
		{
			pacman.move(Pacman.DIRECTION_DOWN);
		}
		else if(Gdx.input.isKeyPressed(Keys.LEFT))
		{
			pacman.move(Pacman.DIRECTION_LEFT);
		}
		else if(Gdx.input.isKeyPressed(Keys.RIGHT))
		{
			pacman.move(Pacman.DIRECTION_RIGHT);
		}
	}
}
