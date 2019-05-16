package add.chan.sichan.androidkotlinstudy

import add.chan.sichan.androidkotlinstudy.Tutorial1.ApplicationActivity
import add.chan.sichan.androidkotlinstudy.Tutorial2_BmiCalculator.BmiCalculatorActivity
import add.chan.sichan.androidkotlinstudy.Tutorial3_StopWatch.StopWatchActivity
import add.chan.sichan.androidkotlinstudy.Tutorial4_WebBrowser.WebBrowserActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_kotlin_tutorial1.setOnClickListener {
            startActivity<ApplicationActivity>()
        }

        btn_kotlin_tutorial2.setOnClickListener {
           startActivity<BmiCalculatorActivity>()
        }

        btn_kotlin_tutorial3.setOnClickListener {
            startActivity<StopWatchActivity>()
        }

        btn_kotlin_tutorial4.setOnClickListener {
            startActivity<WebBrowserActivity>()
        }

        // Ctrl+E 화면전환 단축키
        //TODO 책 97쪽 scratch 사용법 익히기

    }
}
