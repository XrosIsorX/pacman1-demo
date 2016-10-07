package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	private Pacman pacman;
	PacmanGame pacmanGame;
	private Maze maze;
	
	public World(PacmanGame pacmanGame)
	{
		this.pacmanGame = pacmanGame;
		pacman = new Pacman(100,100);
		maze = new Maze();
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
	
	Pacman getPacman()
	{
		return pacman;
	}
	
	Maze getMaze()
	{
		return maze;
	}
}
