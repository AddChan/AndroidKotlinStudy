package add.chan.sichan.androidkotlinstudy

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_kotlin_tutorial1.setOnClickListener {
            val intentTutorial = Intent(this,TutorialActivity::class.java)
            startActivity(intentTutorial)
        }

        // 단축키
        // Ctrl+E 화면전환 단축키

    }
}
