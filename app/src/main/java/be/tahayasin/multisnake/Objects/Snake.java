package be.tahayasin.multisnake.Objects;

import android.graphics.Canvas;

import java.util.ArrayList;

public class Snake {
    private int startPoint = 150;

    private ArrayList<Block> blocks;

    public Snake(int size){
        blocks = new ArrayList<>();
        blocks.add(new Block(startPoint, startPoint, size));
        blocks.add(new Block(startPoint + size + 5, startPoint, size));
        blocks.add(new Block(startPoint + size + 5 + size + 5, startPoint, size));
    }

    public void Draw(Canvas canvas, int scale){
        for(Block block: blocks){
            block.Draw(canvas);
        }
    }
}
