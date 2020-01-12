package top.stores.toptenstore

import android.content.Context
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import it.sephiroth.android.library.picasso.Picasso
import kotlinx.android.synthetic.main.item_view.view.*
import top.stores.toptenstore.model.Data

class StoreAdapter (private val datalist : MutableList<Data>) : RecyclerView.Adapter<StoreAdapter.StoreViewHolder>(){

  private lateinit var context : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
      context = parent.context
      val view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        return StoreViewHolder(view)
    }

    override fun getItemCount(): Int {
      return datalist.size

    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
      val data = datalist[position]

      val storeFullName = holder.itemView.store_name
      val storeImageView = holder.itemView.user_store_image


      //Picasso.get()


    }



    class StoreViewHolder (itemView : View): RecyclerView.ViewHolder (itemView){

    }
}