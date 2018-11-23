/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.collision.Collision;
import com.mygdx.game.collision.bossCollision;
import com.mygdx.game.collision.playerCollision;
import com.mygdx.game.collision.playerCollision2;
import com.mygdx.game.collision.playerCollision3;
import com.mygdx.game.handler.BgHandler;
import com.mygdx.game.handler.ScoreDrawer;
import com.mygdx.game.imageloader.ImageLoader;
import com.mygdx.game.states.GameOverState;
import com.mygdx.game.states.MenuState;
import com.mygdx.game.states.PlayState;
import com.mygdx.game.states.WinState;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Onur
 */
public class GameWorld implements GameObject{
    
    private Player player;
    
    private GameWorld gameWorld;
    
    
    
    private Boss boss;
    private ScoreDrawer scoreDrawer;
    private PlayState playState;
    private MenuState menuState;
    private Fire fire;
    private int bossHealth=0;
    private int  playerHealth=5;
    private int scorePoint=0;
    private BgHandler bgHandler;
    private List<Fire> fireList;
    private double counter=0;
    private double counter2=0;
    private List<Bot> botList;
    private List<Boss> bossList;
    private List<BossFire> bossFireList;
    private List<BossFire2> bossFireList2;
    public GameWorld(PlayState playState){
        //scoreDrawer = new ScoreDrawer(playState, gameWorld);
        player = new Player(0,500,100,175);
        bgHandler = new BgHandler(player,gameWorld);
        fireList = new ArrayList<Fire>();
        bossList = new ArrayList<Boss>();
        bossFireList = new ArrayList<BossFire>();
        bossFireList2 = new ArrayList<BossFire2>();
        
        bossList.add(new Boss());
        
        this.playState=playState;
        
        
        botList = new ArrayList<Bot>();
        botList.add(new Bot(player));
        
        
       
        
      
    }
   
    

    @Override
    public void render(SpriteBatch sb) {
        bgHandler.render(sb);
        player.render(sb);
        //scoreDrawer.render(sb);
      
        
          for(int i=0; i<fireList.size();i++){
            fireList.get(i).render(sb);
            
           
        }  
          for(int i=0; i<bossFireList.size();i++){
            bossFireList.get(i).render(sb);
            
           
        }  
          
          for(int i=0; i<bossFireList2.size();i++){
            bossFireList2.get(i).render(sb);
            
           
        }   
          
          for(int i=0; i<botList.size();i++){
            botList.get(i).render(sb);
        }
          
        for(int i=0; i<bossList.size();i++){
            bossList.get(i).render(sb);
        }
        
        
        
        
    }

    @Override
    public void update(float delta) {
        bgHandler.update(delta);
        player.update(delta);
       counter+=delta;
       counter2+=delta;
       if(counter>=1.1){
           counter=0;
           botList.add(new Bot(player));   
           bossFireList.add(new BossFire());
       }
       if(counter2>=2.2){
           counter2=0;   
           bossFireList2.add(new BossFire2());
           
       }
         for(int i=0; i<botList.size();i++){
            botList.get(i).update(delta);
            
        }
         for(int i=0; i<bossFireList.size();i++){
            bossFireList.get(i).update(delta);
            
        }
         for(int i=0; i<bossFireList2.size();i++){
            bossFireList2.get(i).update(delta);
            
        }
        
        for(int i=0; i<fireList.size();i++){
            fireList.get(i).update(delta);
           
        }
        
        for(int i=0; i<bossList.size();i++){
            bossList.get(i).update(delta);
           
        }
        Bot tempBot=null;
        Fire tempFire=null;
        Boss tempBoss=null;
        BossFire tempBossFire=null;
        BossFire2 tempBossFire2=null;
        for(int i=0;i<fireList.size();i++){
            for(int j=0;j<botList.size();j++){
                if(Collision.isThereCollision(botList.get(j), fireList.get(i))){
                    tempBot=botList.get(j);
                    tempFire=fireList.get(i);
                    scorePoint+=10;
                }
               
            }
        }
        
        for(int i=0; i<fireList.size();i++){
            for(int j=0;j<bossList.size();j++){
                if(bossCollision.isThereCollision(bossList.get(j), fireList.get(i))){
                    tempBoss = bossList.get(j);
                    tempFire=fireList.get(i);
                    bossHealth++;
                    scorePoint+=20;
                }
            }
        }
        for(int i=0;i<bossFireList.size();i++)
        {
            if(playerCollision.isThereCollision(player, bossFireList.get(i)))
            {
                tempBossFire=bossFireList.get(i);
                bossFireList.remove(tempBossFire);
                playerHealth--;
                System.out.println("Kalan can sayısı: "+playerHealth);
                
                
            }
        }
        
        for(int i=0;i<bossFireList2.size();i++)
        {
            if(playerCollision2.isThereCollision(player, bossFireList2.get(i)))
            {
                
                tempBossFire2=bossFireList2.get(i);
                bossFireList2.remove(tempBossFire2);
                playerHealth--;
                System.out.println("Kalan can sayısı: "+playerHealth);
                
                
            }
            
        }
        
        for(int i=0;i<botList.size();i++)
        {
            if(playerCollision3.isThereCollision(player, botList.get(i)))
            {
                tempBot=botList.get(i);
                botList.remove(tempBot);
                playerHealth--;
                System.out.println("Kalan can sayısı: "+playerHealth);
                
                
            }
        }
       
        
        
        
        if(tempFire!=null){
        fireList.remove(tempFire);
        }
        if(tempBot!=null){
        botList.remove(tempBot);
        }
         if(bossHealth==70){
        //bossList.remove(tempBoss);
        playState.getSm().pushState(new WinState(playState.getSm()));
        }
         if(playerHealth==0)
         {
            playState.getSm().pushState(new GameOverState(playState.getSm()));
             System.out.println("öldün");
         }
        
    }
    
    public Player getPlayer(){
        return player;
    }
    
    
    public Fire shoot(){
  
        fireList.add(new Fire(player));
         return fire;
    }
    
    public int getScorePoint(){
        return scorePoint;
    }
    
    
    public void setScorePoint(int scorePoint){
        this.scorePoint = scorePoint;
    }
    
    public int getPlayerHealth(){
        return playerHealth;
    }
    
    public void setPlayerHealth(int playerHealth){
        this.playerHealth = playerHealth;
    }
    
   
   
  
    
    
    
}
