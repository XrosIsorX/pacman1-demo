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

	
	World world;
	WorldRenderer renderer;
	
	public GameScreen(PacmanGame pacmanGame){
		this.pacmanGame = pacmanGame;
		
		world = new World(pacmanGame);
		renderer = new WorldRenderer(pacmanGame, world);
	}
	
	@Override
	public void render(float delta){
		SpriteBatch batch  = pacmanGame.batch;
		world.update(delta);
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
        renderer.render(delta);
	}
	
    private void update(float delta) {
        world.update(delta);
    }
	
}
