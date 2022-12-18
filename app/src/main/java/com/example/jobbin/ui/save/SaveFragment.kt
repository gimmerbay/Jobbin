package com.example.jobbin.ui.save

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobbin.DetailJobsActivity
import com.example.jobbin.R
import com.example.jobbin.adapter.AdapterCardJobs
import com.example.jobbin.adapter.AdapterCardStatus
import com.example.jobbin.databinding.FragmentSaveBinding
import com.example.jobbin.model.ModelJobs
import com.example.jobbin.model.ModelStatus

class SaveFragment : Fragment() {

    private var binding: FragmentSaveBinding? = null
    lateinit var rvJobs : RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_save, container, false)

        // Recycleview
        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.VERTICAL

        rvJobs = view.findViewById(R.id.rv_jobs_saved)

        val adapterJobs = AdapterCardJobs(ArrayJobs,activity)
        rvJobs.setHasFixedSize(true)
        rvJobs.layoutManager = lm
        rvJobs.adapter = adapterJobs

        adapterJobs.onItemClick ={
            val intent = Intent(activity, DetailJobsActivity::class.java)
            startActivity(intent)
        }
        return view
    }

    val ArrayJobs : ArrayList<ModelJobs>get(){
        val arrayjobs = ArrayList<ModelJobs>()

        val jobs1 = ModelJobs()
        jobs1.judulJobs = "Telkom"
        jobs1.keteranganJobs = "UI / UX Desaing"
        jobs1.jamJobs = "5 hr works"
        jobs1.waktuJobs = "12 hous ago"
        jobs1.alamatJobs = "Jl.Arjuna No 1"
        jobs1.imageJobs = R.drawable.telkom

        val jobs2 = ModelJobs()
        jobs2.judulJobs = "Aqua"
        jobs2.keteranganJobs = "Marketing"
        jobs2.jamJobs = "6 hr works"
        jobs2.waktuJobs = "14 hous ago"
        jobs2.alamatJobs = "Jl.Nakula No 1"
        jobs2.imageJobs = R.drawable.aqua

        val jobs3 = ModelJobs()
        jobs3.judulJobs = "BMW"
        jobs3.keteranganJobs = "Sales"
        jobs3.jamJobs = "5 hr works"
        jobs3.waktuJobs = "16 hous ago"
        jobs3.alamatJobs = "Jl.Sadewa No 1"
        jobs3.imageJobs = R.drawable.bmw

        val jobs4 = ModelJobs()
        jobs4.judulJobs = "Pertamina"
        jobs4.keteranganJobs = "Android Developer"
        jobs4.jamJobs = "5 hr works"
        jobs4.waktuJobs = "18 hous ago"
        jobs4.alamatJobs = "Jl.Bima No 1"
        jobs4.imageJobs = R.drawable.pertamina

        val jobs5 = ModelJobs()
        jobs5.judulJobs = "Tokopedia"
        jobs5.keteranganJobs = "UI / UX Desaing"
        jobs5.jamJobs = "5 hr works"
        jobs5.waktuJobs = "20 hous ago"
        jobs5.alamatJobs = "Jl.Gatot No 1"
        jobs5.imageJobs = R.drawable.tokped

        arrayjobs.add(jobs1)
        arrayjobs.add(jobs2)
        arrayjobs.add(jobs3)
        arrayjobs.add(jobs4)
        arrayjobs.add(jobs5)


        return arrayjobs
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}