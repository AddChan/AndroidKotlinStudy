package add.chan.sichan.androidkotlinstudy.Tutorial2_BmiCalculator

import add.chan.sichan.androidkotlinstudy.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_bmi_calculator.*
import org.jetbrains.anko.startActivity

/**
https://github.com/kotlin/anko  : anko 라이브러리 사용방법 나와있음

anko 라이브러리 사용하니까 intent 코드 확실히 줄었네.. 자주 사용해야겠다!

간단한 데이터를 임시저장 할때는 SharedPreference를 사용한다. <- 문자에서 임시저장 같은 느낌
 */
class BmiCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        loadData()

        resultButton.setOnClickListener {
            saveData(heightEditText.text.toString().toInt(),
                    weightEditText.text.toString().toInt())

            startActivity<BmiResultActivity>(
                    "weight" to weightEditText.text.toString(),
                    "height" to heightEditText.text.toString()
            ) //anko 라이브러리
        }
    }

    private fun saveData(height: Int, weight: Int) {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()

        editor.putInt("KEY_HEIGHT", height)
                .putInt("KEY_WEIGHT", weight)
                .apply()
    }

    private fun loadData() {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val height = pref.getInt("KEY_HEIGHT", 0)
        val weight = pref.getInt("KEY_WEIGHT", 0)

        if (height != 0 && weight != 0) {
            heightEditText.setText(height.toString())
            weightEditText.setText(weight.toString())
        }
    }

}
