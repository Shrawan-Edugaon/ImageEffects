package com.example.imageeffects

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var img:ImageView
    lateinit var bitmap:Bitmap
    lateinit var bitmapOperation:Bitmap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img =findViewById(R.id.imageView)
        val bitmapDrawable:BitmapDrawable = img.drawable as BitmapDrawable
        bitmap = bitmapDrawable.bitmap
    }
    fun imageDark(view:View){
        bitmapOperation =Bitmap.createBitmap(bitmap.width,bitmap.height,bitmap.config)

        for (i in 0 until bitmap.width)
        {
            for (j in 0 until bitmap.height)
            {
                val pixel = bitmap.getPixel(i,j)
                var redPixel = Color.red(pixel)
                var bluePixel =Color.blue(pixel)
                var greenPixel = Color.green(pixel)
                var alpha = Color.alpha(pixel)

                redPixel -=50
                bluePixel -=50
                greenPixel -=50
                alpha -=50

                bitmapOperation.setPixel(i,j,Color.argb(Color.alpha(pixel),redPixel,greenPixel,bluePixel))
            }
        }

        img.setImageBitmap(bitmapOperation)
    }
    fun imageBright(view: View){
        bitmapOperation = Bitmap.createBitmap(bitmap.width,bitmap.height,bitmap.config)
        for (i in 0 until bitmap.width)
        {
            for (j in 0 until bitmap.height)
            {
                val pixel = bitmap.getPixel(i,j)
                var redPixel = Color.red(pixel)
                var bluePixel = Color.blue(pixel)
                var greenPixel = Color.green(pixel)
                var alpha = Color.alpha(pixel)

                redPixel +=100
                bluePixel +=100
                greenPixel +=100
                alpha +=100

                bitmapOperation.setPixel(i,j,Color.argb(alpha,redPixel,greenPixel,bluePixel))
            }
        }
        img.setImageBitmap(bitmapOperation)
    }
    fun imageGray(view: View){
        bitmapOperation = Bitmap.createBitmap(bitmap.width,bitmap.height,bitmap.config)

        val red =0.13
        val blue = 0.11
        val green = 0.19

        for (i in 0 until bitmap.width)
        {
            for (j in 0 until bitmap.height)
            {
                val pixel = bitmap.getPixel(i,j)
                var redPixel = Color.red(pixel)
                var bluePixel = Color.blue(pixel)
                var greenPixel = Color.green(pixel)

                redPixel = (red * redPixel).toInt()
                bluePixel = (blue * bluePixel).toInt()
                greenPixel = (green * greenPixel).toInt()

                bitmapOperation.setPixel(i,j,Color.argb(Color.alpha(pixel),redPixel,greenPixel,bluePixel))
            }
        }
        img.setImageBitmap(bitmapOperation)
    }
    fun imageRed(view: View){
        bitmapOperation = Bitmap.createBitmap(bitmap.width,bitmap.height,bitmap.config)
        for (i in 0 until bitmap.width)
        {
            for (j in 0 until bitmap.height)
            {
                val pixel = bitmap.getPixel(i,j)
                var redPixel = Color.red(pixel)
                var bluePixel = Color.blue(pixel)
                var greenPixel = Color.green(pixel)
                var alpha = Color.alpha(pixel)

                redPixel +=150
                bluePixel =0
                greenPixel =0
                alpha = 0

                bitmapOperation.setPixel(i,j,Color.argb(Color.alpha(pixel),redPixel,greenPixel,bluePixel))
            }
        }
        img.setImageBitmap(bitmapOperation)
    }
    fun imageGreen(view: View){
        bitmapOperation = Bitmap.createBitmap(bitmap.width,bitmap.height,bitmap.config)
        for (i in 0 until bitmap.width)
        {
            for (j in 0 until bitmap.height)
            {
                var pixel = bitmap.getPixel(i,j)
                var redPixel =Color.red(pixel)
                var bluePixel =Color.blue(pixel)
                var greenPixel = Color.green(pixel)
                var alpha = Color.alpha(pixel)

                redPixel = 0
                bluePixel = 0
                greenPixel +=150
                alpha = 0

                bitmapOperation.setPixel(i,j,Color.argb(Color.alpha(pixel),redPixel,greenPixel,bluePixel))
            }
        }
        img.setImageBitmap(bitmapOperation)
    }
    fun imageBlue(view: View){
        bitmapOperation = Bitmap.createBitmap(bitmap.width,bitmap.height,bitmap.config)
        for (i in 0 until bitmap.width)
        {
            for (j in 0 until bitmap.height)
            {
                var pixel = bitmap.getPixel(i,j)
                var redPixel =Color.red(pixel)
                var bluePixel =Color.blue(pixel)
                var greenPixel = Color.green(pixel)
                var alpha = Color.alpha(pixel)

                redPixel = 0
                bluePixel = 0
                greenPixel +=150
                alpha = 0

                bitmapOperation.setPixel(i,j,Color.argb(Color.alpha(pixel),redPixel,greenPixel,bluePixel))
            }
        }
        img.setImageBitmap(bitmapOperation)
    }
    fun imageReset(view: View)
    {
        img.setImageResource(R.drawable.abc)
    }

}