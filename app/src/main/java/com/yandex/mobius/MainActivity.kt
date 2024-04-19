package com.yandex.mobius

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.yandex.mobius.animation.YaAnimationDrawable
import com.yandex.mobius.animation.YaAnimationParser
import com.yandex.mobius.animation.YaAnimationView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)
        findViewById<YaAnimationView>(R.id.ya_animation_view).apply {
            loadAnimation("10.txt")
        }

//        findViewById<ImageView>(R.id.ya_image_view).apply {
//            setImageDrawable(YaAnimationDrawable.inflate(this@MainActivity, "10.txt").also {
//                it.start()
//            })
//        }
    }
}
