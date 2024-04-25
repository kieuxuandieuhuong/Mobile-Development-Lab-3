package com.example.bt_android3_lab3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[16];

    int i = 0;

    public GraphicsView(Context context){
        super(context);
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.image2);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.image1);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.image4);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.image3);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.image6);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.image5);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.image8);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.image7);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.image10);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.image9);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.image12);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.image11);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.image14);
        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.image13);
        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.image16);
        frames[15] = BitmapFactory.decodeResource(getResources(), R.drawable.image15);

    }

    protected void onDraw(Canvas canvas){
        // drawing command
        if(i < 16){
            canvas.drawBitmap(frames[i], 40, 40, new Paint());
        }
        else {
            i = 0;
        }
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent event){
        //
        i++;
        return true;

    }
}
