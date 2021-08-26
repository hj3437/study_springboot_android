package com.hurdle.testnetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

// https://desolate-gorge-14146.herokuapp.com/user/readUserList
val BASE_URL = "https://desolate-gorge-14146.herokuapp.com/"

interface RoroService {
    @GET("user/readUserList")
    fun listRepos(): Call<List<User>>
}

class MainActivity : AppCompatActivity() {
    private lateinit var pororoTextview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pororoTextview = findViewById(R.id.pororo_text_view)

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        CoroutineScope(IO).launch {
            val body: List<User>? =
                retrofit.create(RoroService::class.java).listRepos().execute().body()

            CoroutineScope(Main).launch {
                pororoTextview.text = ""
                body?.forEach {
                    pororoTextview.append("${it.name} ${it.msg}\n")
                }
            }
        }
    }
}




