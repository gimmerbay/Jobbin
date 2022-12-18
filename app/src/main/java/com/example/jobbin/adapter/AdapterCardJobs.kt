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
import java.util.ArrayList

class AdapterCardJobs (var data : ArrayList<ModelJobs>, var context: Activity?) : RecyclerView.Adapter<AdapterCardJobs.ViewHolderJobs>(){

//    private lateinit var mListener: onItemClikListener

    var onItemClick : ((ModelJobs) -> Unit)? = null

    class ViewHolderJobs(view: View) : RecyclerView.ViewHolder(view) {
        val judulJobs = view.findViewById<TextView>(R.id.tv_judul_jobs)
        val keteranganJobs = view.findViewById<TextView>(R.id.tv_keterangan_jobs)
        val alamatJobs = view.findViewById<TextView>(R.id.tv_alamat_jobs)
        val jamJobs = view.findViewById<TextView>(R.id.tv_jam_jobs)
        val waktuJobs = view.findViewById<TextView>(R.id.tv_waktu_jobs)
        val gambarJobs = view.findViewById<ImageView>(R.id.iv_logo_jobs)
//        init {
//            itemView.setOnClickListener{
//                listener.onItemClick(adapterPosition)
//            }
//        }
    }

//    interface onItemClikListener{
//        fun onItemClick(position: Int)
//    }

//    fun setOnItemClickListener(listener: onItemClikListener){
//        mListener = listener
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderJobs {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_job, parent, false)
        return ViewHolderJobs(view)
    }

    override fun onBindViewHolder(holder: ViewHolderJobs, position: Int) {
        val jobs = data[position]
        holder.judulJobs.text = jobs.judulJobs
        holder.keteranganJobs.text = jobs.keteranganJobs
        holder.alamatJobs.text = jobs.alamatJobs
        holder.jamJobs.text = jobs.jamJobs
        holder.waktuJobs.text = jobs.waktuJobs
        holder.gambarJobs.setImageResource(jobs.imageJobs)
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(jobs)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}