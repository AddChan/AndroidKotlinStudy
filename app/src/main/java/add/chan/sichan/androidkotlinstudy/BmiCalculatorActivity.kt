package add.chan.sichan.androidkotlinstudy

//import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmi_calculator.*
import org.jetbrains.anko.startActivity

/**
 https://github.com/kotlin/anko  : anko 라이브러리 사용방법 나와있음


 anko 라이브러리 사용하니까 intent 코드 확실히 줄었네.. 자주 사용해야겠다!
 */
class BmiCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)


        resultButton.setOnClickListener {
//            val startIntent = Intent(this, BmiResultActivity::class.java)
//            startIntent.putExtra("weight",weightEditText.text.toString())
//            startIntent.putExtra("height",heightEditText.text.toString())
//            startActivity(startIntent)
            startActivity<BmiResultActivity>(
                    "weight" to weightEditText.text.toString(),
                    "height" to heightEditText.text.toString()

            ) //anko 라이브러리
            weightEditText.setText("")
            heightEditText.setText("")
        }
    }
}
