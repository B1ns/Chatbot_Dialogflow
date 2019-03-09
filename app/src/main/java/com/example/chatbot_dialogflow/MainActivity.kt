package com.example.chatbot_dialogflow

import ai.api.AIListener
import ai.api.android.AIService
import ai.api.android.AIConfiguration
import ai.api.model.AIError
import ai.api.model.AIResponse
import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , AIListener {

    private var aiService: AIService? = null
    lateinit var ref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.RECORD_AUDIO), 1)

        recyclerView.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.stackFromEnd = true
        recyclerView.layoutManager = linearLayoutManager

        ref = FirebaseDatabase.getInstance().reference
        ref.keepSynced(true)

        val config = AIConfiguration(
            "0c01e159babc4349b38eca698bd2f107",
            AIConfiguration.SupportedLanguages.Korean,
            AIConfiguration.RecognitionEngine.System
        )


    }

    override fun onResult(result: AIResponse?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onListeningStarted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAudioLevel(level: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(error: AIError?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onListeningCanceled() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onListeningFinished() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
