package add.chan.sichan.androidkotlinstudy.Tutorial1

import add.chan.sichan.androidkotlinstudy.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_application.*

class ApplicationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application)

        clickButton.setOnClickListener {
            textView.text="버튼을 눌렀습니다."
        }

    }
}
