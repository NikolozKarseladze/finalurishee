package btu.ge.finalurishee

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class qaliActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qali)
        val fileeName = "video"

        val filePlace = "android.resource://" + packageName + "/raw/" + R.raw.sss

        val videoView = findViewById<View>(R.id.gaxsnili) as VideoView

        videoView.setVideoURI(Uri.parse(filePlace))
        videoView.setMediaController(MediaController(this))
        videoView.start()

    }


}
