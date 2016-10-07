package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter{
	private PacmanGame pacmanGame;
	private Texture pacmanImg;
	
	World world;
	WorldRenderer renderer;
	
	public GameScreen(PacmanGame pacmanGame){
		this.pacmanGame = pacmanGame;
		pacmanImg = new Texture("pacman.png");
		
		world = new World();
		renderer = new WorldRenderer(pacmanGame);
	}
	
	@Override
	public void render(float delta){
		SpriteBatch batch  = pacmanGame.batch;
		world.update(delta);
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
        batch.begin();
        Vector2 pos = world.pacman.getPosition();
        batch.draw(pacmanImg, pos.x, pos.y);
        batch.end();
	}
	
}
