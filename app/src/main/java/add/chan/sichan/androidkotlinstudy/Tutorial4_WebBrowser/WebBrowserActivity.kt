package add.chan.sichan.androidkotlinstudy.Tutorial4_WebBrowser

import add.chan.sichan.androidkotlinstudy.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_browser.*
import org.jetbrains.anko.*

/**
 * anko 라이브러리
 * 전화걸기 : makeCall(전화번호)
 * 문자보내기 : sendSms(전화번호, [문자열])
 * 웹 브라우저 열기 : browse(url)
 * 문자열 공유 : share(문자열,[제목])
 * 이메일 보내기 : email(받는 메일주소,[제목],[내용])
 */
class WebBrowserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_browser)
        // 웹뷰 기본 설정
        webView.apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }

        webView.loadUrl("http://www.google.com")

        urlEditText.setOnEditorActionListener { _, actionid, event ->
            if (actionid == EditorInfo.IME_ACTION_SEARCH) {
                webView.loadUrl(urlEditText.text.toString())
                true
            } else {
                false
            }
        }

        // 컨텍스트 메뉴 등록
        registerForContextMenu(webView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {

        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_google, R.id.action_home -> {
                webView.loadUrl("http://www.google.com")
                return true
            }
            R.id.action_naver -> {
                webView.loadUrl("http://www.naver.com")
                return true
            }
            R.id.action_daum -> {
                webView.loadUrl("http://www.daum.net")
                return true
            }
            R.id.action_call -> {
                makeCall("02-123-4567")// anko라이브러리 활용

//                val intent = Intent(Intent.ACTION_DIAL)
//                intent.data = Uri.parse("tel : 02-123-4567")
//                if (intent.resolveActivity(packageManager) != null) {
//                    startActivity(intent)
//                }

                return true

            }
            R.id.action_send_text -> {
                sendSMS("02-123-4567", webView.url)
                return true
            }
            R.id.action_email -> {
                // 이메일 보내기
                email("test@example.com", "좋은 사이트", webView.url)
                return true
            }


        }
        return super.onOptionsItemSelected(item)

    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {

            R.id.action_share -> {
                // 페이지 공유
                share(webView.url)
                return true
            }
            R.id.action_browser -> {
                // 기본 웹 브라우저에서 열기
                browse(webView.url)
                return true
            }
        }
        return super.onContextItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
