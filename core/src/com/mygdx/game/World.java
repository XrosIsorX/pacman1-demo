package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
	private Pacman pacman;
	PacmanGame pacmanGame;
	private Maze maze;
	private int score;
	
	public World(PacmanGame pacmanGame)
	{
		this.pacmanGame = pacmanGame;
		maze = new Maze();
		pacman = new Pacman(60,60,this);
		registerDotEattenListener();
		score =0;
	}
	
	private void registerDotEattenListener()
	{
		pacman.registerDotEattenListener(new Pacman.DotEattenListener()
		{
			@Override
			public void notifyDotEatten()
			{
				score++;
			}
		});
	}

	public void increaseScore()
	{
		score++;
	}
	
	public int getScore()
	{
		return score;
	}
	
	void update(float delta)
	{
		updatePacmanDirection();
		
		pacman.update();
	}
	
	public void updatePacmanDirection()
	{
		if(Gdx.input.isKeyPressed(Keys.UP))
		{
			pacman.setNextDirection(Pacman.DIRECTION_UP);
		}
		else if(Gdx.input.isKeyPressed(Keys.DOWN))
		{
			pacman.setNextDirection(Pacman.DIRECTION_DOWN);
		}
		else if(Gdx.input.isKeyPressed(Keys.LEFT))
		{
			pacman.setNextDirection(Pacman.DIRECTION_LEFT);
		}
		else if(Gdx.input.isKeyPressed(Keys.RIGHT))
		{
			pacman.setNextDirection(Pacman.DIRECTION_RIGHT);
		}
		else
		{
			pacman.setNextDirection(Pacman.DIRECTION_STILL);
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
