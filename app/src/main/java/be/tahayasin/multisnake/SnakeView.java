package be.tahayasin.multisnake;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import be.tahayasin.multisnake.Objects.Snake;

public class SnakeView extends View {
    private Context context;

    private Snake snake;

    private int width;
    private int blocks;
    private int blockSize;

    public SnakeView(Context context) {
        super(context);

        init(context, null);
    }

    public SnakeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs);
    }

    public SnakeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs);
    }

    public SnakeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        this.getWidth();

        init(context, attrs);
    }

    private void init(Context context, @Nullable AttributeSet attrs){
        this.context = context;
        snake = new Snake(blockSize);
    }

    public void Init(){

    }

    @Override
    protected void onDraw(Canvas canvas){
        width = getWidth();
        Toast.makeText(context, String.valueOf(width), Toast.LENGTH_LONG).show();
        blocks = 20;
        blockSize = width / blocks;

        snake.setize(blockSize);

        snake.Draw(canvas);
    }
}