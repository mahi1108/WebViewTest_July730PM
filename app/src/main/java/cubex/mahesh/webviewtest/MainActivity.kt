package cubex.mahesh.webviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wview.webViewClient = WebViewClient()
    }
    fun load(v:View){
        when(v.id){
            R.id.srch ->wview.loadUrl(et1.text.toString())
            R.id.fb -> wview.loadUrl("http://www.facebook.com")
            R.id.google -> wview.loadUrl("http://www.google.com")
            R.id.ytube -> wview.loadUrl("http://www.youtube.com")
            R.id.html -> wview.loadUrl("")
        }
    }

}
