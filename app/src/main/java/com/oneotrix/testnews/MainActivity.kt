package com.oneotrix.testnews

import android.os.Bundle
import android.text.Html
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.oneotrix.testnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
//        val str = Html.fromHtml("<p>Полный текст новости <b>с жирным текстом</b>, <i>курсивом</i> и <a href=\\\"http://testtask.sebbia.com/swagger-ui.html\\\">одной ссылкой</a></p><p>Кроме того, в тексте два параграфа</p>", Html.FROM_HTML_MODE_LEGACY)
//        Log.e("MainActivity", str.toString())



    }
}