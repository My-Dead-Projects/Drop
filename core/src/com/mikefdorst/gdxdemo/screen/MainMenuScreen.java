package com.mikefdorst.gdxdemo.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.mikefdorst.gdxdemo.Drop;

public class MainMenuScreen implements Screen {
  
  final Drop game;
  
  private OrthographicCamera camera;
  
  public MainMenuScreen(final Drop game) {
    this.game = game;

    camera = new OrthographicCamera();
    camera.setToOrtho(false, 800, 450);
  }

  @Override
  public void render(float delta) {
    Gdx.gl.glClearColor(0, 0, 0.2f, 1);
    Gdx.gl.glClear(Gdx.gl.GL_COLOR_BUFFER_BIT);
    
    camera.update();
    game.batch.setProjectionMatrix(camera.combined);
    
    game.batch.begin();
    game.font.draw(game.batch, "Welcome to Drop!", 100, 150);
    game.font.draw(game.batch, "Tap anywhere to begin.", 100, 100);
    game.batch.end();
    
    if (Gdx.input.isTouched()) {
      game.setScreen(new GameScreen(game));
      dispose();
    }
  }

  @Override
  public void show() {

  }

  @Override
  public void resize(int width, int height) {

  }

  @Override
  public void pause() {

  }

  @Override
  public void resume() {

  }

  @Override
  public void hide() {

  }

  @Override
  public void dispose() {

  }
}
