package top.stores.toptenstore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_view.view.*
import top.stores.toptenstore.model.Data

class StoreAdapter (val context : Context, val mExampleList : ArrayList<ExampleItem> ): RecyclerView.Adapter<StoreAdapter.StoreViewHolder>(){

//  private lateinit var contextM : Context
//  private lateinit var mExampleList : ArrayList<ExampleItem>



  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
      //context = parent.context
      val view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        return StoreViewHolder(view)
    }

    override fun getItemCount(): Int {
      return mExampleList.size

    }



    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
      val data = mExampleList[position]

      val storeFullName = data.getmCreater()
      val storeUrl = data.getImageUrl()

      holder.mTextViewCreater.text = data.getmCreater()
      Picasso.get().load(storeUrl).fit().centerInside().into(holder.mImageView)



      //Picasso.get().load(url).into(view)


    }



    class StoreViewHolder (itemView : View): RecyclerView.ViewHolder (itemView){

      lateinit var mImageView : ImageView
      lateinit var mTextViewCreater : TextView

      init {
          mImageView = itemView.findViewById(R.id.user_store_image)
          mTextViewCreater = itemView.findViewById(R.id.store_name)
      }

    }
}