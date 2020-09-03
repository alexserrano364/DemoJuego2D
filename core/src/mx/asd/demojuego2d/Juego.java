package mx.asd.demojuego2d;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/*
El juego principal (aplicación)
Autor: Alex Serrano
 */

public class Juego extends Game {

	@Override
	public void create () {
		// La primer ventana
		setScreen(new PantallaMenu(this)); 	// Pasamos el controlador

	}

	@Override
	public void render () {
		super.render();
	}
	

}
