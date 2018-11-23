/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Stack;

/**
 *
 * @author Onur
 */
public class StateManager {
    
    private Stack<State> states;
    
    public StateManager(){
        states = new Stack<State>();
    }
    
    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
    
    public void update(float delta){
        
        states.peek().update(delta);
        states.peek().handleInput();
        
    }
    public void pushState(State state){
        states.push(state);
    }
    
    public void popState(){
        states.pop();
    }
}
