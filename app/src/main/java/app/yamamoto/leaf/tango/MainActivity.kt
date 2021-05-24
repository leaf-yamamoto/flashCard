package app.yamamoto.leaf.tango

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.size
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = Word(R.drawable.apple_icon, "りんご")
        val banana = Word(R.drawable.banana_icon, "バナナ")
        val orange = Word(R.drawable.orange_icon, "オレンジ")
        val strawberry = Word(R.drawable.strawberry_icon, "いちご")
//りんご
        val nameTextView = TextView(this)
        nameTextView.text = apple.name
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL
        val imageView = ImageView(this)
        imageView.setImageResource(apple.resId)
        layout.addView(imageView)
        layout.addView(nameTextView)
        container.addView(layout)
//バナナ
        val nameTextView2 = TextView(this)
        nameTextView2.text = banana.name
        val layout2 = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView2 = ImageView(this)
        imageView2.setImageResource(banana.resId)
        layout2.addView(imageView2)
        layout2.addView(nameTextView2)
        container.addView(layout2)
//オレンジ
        val nameTextView3 = TextView(this)
        nameTextView3.text = orange.name
        val layout3 = LinearLayout(this)
        layout3.orientation = LinearLayout.HORIZONTAL
        val imageView3 = ImageView(this)
        imageView3.setImageResource(orange.resId)
        layout3.addView(imageView3)
        layout3.addView(nameTextView3)
        container.addView(layout3)
//いちご
        val nameTextView4 = TextView(this)
        nameTextView4.text = strawberry.name
        val layout4 = LinearLayout(this)
        layout4.orientation = LinearLayout.HORIZONTAL
        val imageView4 = ImageView(this)
        imageView4.setImageResource(strawberry.resId)
        layout4.addView(imageView4)
        layout4.addView(nameTextView4)
        container.addView(layout4)
    }
}