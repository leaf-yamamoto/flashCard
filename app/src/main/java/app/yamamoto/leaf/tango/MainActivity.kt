package app.yamamoto.leaf.tango

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.size
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val apple = Word(R.drawable.apple_icon, "りんご")
    val banana = Word(R.drawable.banana_icon, "バナナ")
    val orange = Word(R.drawable.orange_icon, "オレンジ")
    val strawberry = Word(R.drawable.strawberry_icon, "いちご")


    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//りんご
        tango (word = apple)
//バナナ
        tango (word = banana)
//オレンジ
        tango (word = orange)
//いちご
        tango (word = strawberry)
    }

    fun tango (word: Word = apple) {
        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        word.resId?.let { imageView.setImageResource(it) }
        layout.addView(imageView)
        layout.addView(nameTextView)
        container.addView(layout)

    }

}