package com.example.cisc.arkanoid2; /**
 * Created by cisc on 5/16/2017.
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;


public class Blocks {
    protected GameActivity game;
    protected Paint paint = new Paint();
    protected Rect shape;
    private int soundID;

    public Blocks(GameActivity game, int color, /*int soundID,*/ int x, int y, int width, int length){
        this.game = game;
        paint.setColor(color);
        shape = new Rect(x, y, x + width, y + length);
        //this.soundID = soundID;
    }

    public void draw(Canvas canvas){
        canvas.drawRect(shape, paint);
    }


}







/*    public void playSound(){
        game.playSound(soundID)
    }*/