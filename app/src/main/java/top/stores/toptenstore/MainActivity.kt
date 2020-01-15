package top.stores.toptenstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_view.*
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import top.stores.toptenstore.model.Data
import java.lang.reflect.Method

class MainActivity : AppCompatActivity() {

    private lateinit var mRecyclerView : RecyclerView
    private lateinit var mExampleAdapter : StoreAdapter
    private lateinit var mExampleList : ArrayList<ExampleItem>
    private lateinit var mRequestQue : RequestQueue







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mRecyclerView = findViewById(R.id.recycler_view)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        mExampleList = ArrayList<ExampleItem>()

        mRequestQue = Volley.newRequestQueue(this)

        mExampleList.add(ExampleItem("http://sandbox.bottlerocketapps.com/BR_Android_CodingExam_2015_Server/images/neimanmarcus.jpeg", "Tree"))
        mExampleList.add(ExampleItem("http://sandbox.bottlerocketapps.com/BR_Android_CodingExam_2015_Server/images/neimanmarcus.jpeg", "See"))
        mExampleAdapter = StoreAdapter(this, mExampleList)
        mRecyclerView.adapter = mExampleAdapter


        //parseJason()


    }


     fun parseJason(){
          val url = "http://sandbox.bottlerocketapps.com/BR_Android_CodingExam_2015_Server/stores.json"
         val urlB = "https://api.flickr.com/services/feeds/photos_public.gne?tags=kitten&format=json"

         val request = JsonObjectRequest(Request.Method.GET, urlB, null,
             Response.Listener<JSONObject>(){
                 response ->
                 try {
                     val jsonArray : JSONArray = response.getJSONArray("title")

                     for( i in 0 until jsonArray.length()){
                         val hit : JSONObject = jsonArray.getJSONObject(i)

                         val name : String = hit.getString("title")
                         val imageUrl = hit.getString("src")

                         mExampleList.add(ExampleItem(imageUrl, name))
                     }

                     mExampleAdapter = StoreAdapter(this, mExampleList)
                     mRecyclerView.adapter = mExampleAdapter


                 }catch (e : JSONException){
                     e.printStackTrace()
                 }
             }, Response.ErrorListener {
                 error -> error.printStackTrace()
             })
         mRequestQue.add(request)
     }


}
