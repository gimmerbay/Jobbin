package com.example.jobbin.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.jobbin.DetailJobsActivity
import com.example.jobbin.model.ModelJobs
import com.example.jobbin.R
import com.example.jobbin.model.ModelStatus
import java.util.ArrayList

class AdapterCardStatus (var data : ArrayList<ModelStatus>, var context: Activity?) : RecyclerView.Adapter<AdapterCardStatus.ViewHolderJobs>(){

//    private lateinit var mListener: onItemClikListener

    var onItemClick : ((ModelStatus) -> Unit)? = null

    class ViewHolderJobs(view: View) : RecyclerView.ViewHolder(view) {
        val judulStatus = view.findViewById<TextView>(R.id.tv_judul_status)
        val keteranganStatus = view.findViewById<TextView>(R.id.tv_keterangan_status)
        val alamatStatus = view.findViewById<TextView>(R.id.tv_alamat_status)
        val statusStatus = view.findViewById<TextView>(R.id.tv_status_status)
        val waktuStatus = view.findViewById<TextView>(R.id.tv_waktu_status)
        val gambarStatus = view.findViewById<ImageView>(R.id.iv_logo_status)
//        init {
//            itemView.setOnClickListener{
//                listener.onItemClick(adapterPosition)
//            }
//        }
    }

//    interface onItemClikListener{
//        fun onItemClick(position: Int)
//    }
//
//    fun setOnItemClickListener(listener: onItemClikListener){
//        mListener = listener
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderJobs {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_status, parent, false)
        return ViewHolderJobs(view)
    }

    override fun onBindViewHolder(holder: ViewHolderJobs, position: Int) {
        val jobs = data[position]
        holder.judulStatus.text = jobs.judulStatus
        holder.keteranganStatus.text = jobs.keteranganStatus
        holder.alamatStatus.text = jobs.alamatStatus
        holder.statusStatus.text = jobs.statusStatus
        holder.waktuStatus.text = jobs.waktuStatus
        holder.gambarStatus.setImageResource(jobs.imageStatus)
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(jobs)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}