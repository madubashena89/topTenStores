package top.stores.toptenstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.interfaces.JSONObjectRequestListener
import com.androidnetworking.interfaces.ParsedRequestListener
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.Response
import top.stores.toptenstore.model.Data
import top.stores.toptenstore.model.Request

class MainActivity : AppCompatActivity() {

    private val datalist : MutableList<Data> = mutableListOf()
    private lateinit var myAdapter : StoreAdapter
    private val url = "http://sandbox.bottlerocketapps.com/BR_Android_CodingExam_2015_Server/stores.json"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup Adapter
        myAdapter = StoreAdapter((datalist))

        //setup recyclerview
        my_recycler_view.layoutManager = LinearLayoutManager(this)
        my_recycler_view.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))
        my_recycler_view.adapter = myAdapter


//        AndroidNetworking.initialize(this)
//
//        AndroidNetworking.get("http://sandbox.bottlerocketapps.com/BR_Android_CodingExam_2015_Server/stores.json")
//            .build()
//            .getAsObject(Data::class.java, object : ParsedRequestListener<Request>)

       val que = Volley.newRequestQueue(this)
        //val req = JsonObjectRequest(Request.Method.



    }





}
