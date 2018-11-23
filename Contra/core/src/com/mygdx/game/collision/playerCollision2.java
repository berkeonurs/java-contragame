/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.collision;

import com.mygdx.game.gameobject.Boss;
import com.mygdx.game.gameobject.BossFire;
import com.mygdx.game.gameobject.BossFire2;
import com.mygdx.game.gameobject.Fire;
import com.mygdx.game.gameobject.Player;

/**
 *
 * @author Onur
 */
public class playerCollision2 {
    
    public static boolean isThereCollision(Player player, BossFire2 bossfire2){
        
        if(player.getCollisionRect().overlaps(bossfire2.getCollisionRect())){
          
            return true;
        }
        
        
         
        
        return false;
    }

    public static boolean isThereCollision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
