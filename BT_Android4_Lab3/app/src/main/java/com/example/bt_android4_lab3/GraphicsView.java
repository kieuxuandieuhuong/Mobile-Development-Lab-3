package com.example.bt_android4_lab3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GraphicsView extends View {

    Bitmap[] frames = new Bitmap[16]; // 16 frames
    int i = 0;
    long last_tick = 0;
    long period=200;
    Context ctext;
    MediaPlayer mediaPlayer;

    public GraphicsView(Context context) {
        super(context);

        ctext=context;

        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.image1);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.image2);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.image3);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.image4);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.image5);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.image6);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.image7);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.image8);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.image9);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.image10);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.image11);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.image12);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.image13);
        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.image14);
        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.image15);
        frames[15] = BitmapFactory.decodeResource(getResources(), R.drawable.image16);

        mediaPlayer = MediaPlayer.create(context, R.raw.gangnam);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 16)
        {
            long time = (System.currentTimeMillis() - last_tick);
            if (time >= period)
            {
                last_tick = System.currentTimeMillis();
                canvas.drawBitmap(frames[i], 40, 40, new Paint());
                i ++;
                postInvalidate();
            }
            else
            {
                canvas.drawBitmap(frames[i],40,40, new Paint());
                postInvalidate();
            }
        }
        else {
            i=0;
            postInvalidate();
        }
    }
}
