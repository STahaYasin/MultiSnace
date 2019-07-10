package be.tahayasin.multisnake.Objects;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class Block {
    private int x;
    private int y;
    private int size;

    Rect destinationRect;
    Paint paint;

    public Block(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;

        paint = new Paint();
        paint.setColor(Color.GREEN);

        destinationRect = new Rect();
        destinationRect.left = x - (size / 2);
        destinationRect.top = y - (size / 2);
        destinationRect.right = x + (size / 2);
        destinationRect.bottom = y + (size / 2);
    }

    public void Draw(Canvas canvas){
        canvas.drawRect(destinationRect, paint);
    }
}
