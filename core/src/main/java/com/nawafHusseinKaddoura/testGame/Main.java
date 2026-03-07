package com.nawafHusseinKaddoura.testGame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

import java.util.Random;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private FitViewport viewport;
    //public float deltaTime;
    public static Random random = new Random();

    @Override
    public void create() {

        //deltaTime = Gdx.graphics.getDeltaTime();

        viewport = new FitViewport(10, 10);

        batch = new SpriteBatch();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void render() {

        logic();
        input();
        draw();

    }

    void draw() {

        ScreenUtils.clear(Color.BLACK);
        viewport.apply();
        batch.setProjectionMatrix(viewport.getCamera().combined);

        //ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();

        batch.end();

    }

    void logic() {

    }

    void input() {

        if(Gdx.input.isKeyPressed(Input.Keys.W)) {
            viewport.getCamera().translate(0, 0.1f, 0);
            viewport.getCamera().update();
        } else if(Gdx.input.isKeyPressed(Input.Keys.S)) {
            viewport.getCamera().translate(0, -0.1f, 0);
            viewport.getCamera().update();
        }

        if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            viewport.getCamera().translate(0.1f, 0, 0);
            viewport.getCamera().update();
        } else if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            viewport.getCamera().translate(-0.1f, 0, 0);
            viewport.getCamera().update();
        }

    }

    @Override
    public void dispose() {

    }
}
