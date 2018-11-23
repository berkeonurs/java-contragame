/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.collision.Collision;
import com.mygdx.game.collision.playerCollision;
import com.mygdx.game.gameobject.GameWorld;
import com.mygdx.game.gameobject.Player;
import com.mygdx.game.handler.ScoreDrawer;
import com.mygdx.game.imageloader.ImageLoader;
import com.mygdx.game.inputhandler.PlayStateInput;
import static java.awt.event.KeyEvent.VK_UP;

/**
 *
 * @author Onur
 */
public class PlayState extends State{
    
    private GameWorld gm;
    private OrthographicCamera cam;
    private ScoreDrawer scoreDrawer;
    private GameWorld gameWorld;
    
    public PlayState(StateManager sm){
        
        super(sm);
        scoreDrawer = new ScoreDrawer(this);
        cam = camera;
        gm = new GameWorld(this);
        Gdx.input.setInputProcessor(new PlayStateInput(this));
    }

    @Override
    public void render(SpriteBatch sb) {
        
        sb.setProjectionMatrix(camera.combined);
        
       
        
        gm.render(sb);
        scoreDrawer.render(sb);
        
    }

    @Override
    public void update(float delta) {
       gm.update(delta);
       updateCamera();
       
       
    }
    
    public void updateCamera(){
        
        if(gm.getPlayer().getxKord()>camera.position.x-Gdx.graphics.getWidth()/5){
            camera.position.x+=gm.getPlayer().getSpeed();
        }
       
        
        camera.update();
    }
    
    
    

    @Override
    public void handleInput() {
        
    }
    
    public GameWorld getGameWorld(){
        return gm;
    }
   

    public StateManager getSm() {
        return sm;
    }
    
    public OrthographicCamera getCam(){
        return cam;
    }
    
}
