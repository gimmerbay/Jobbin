package com.example.jobbin.ui.jobs

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
import com.example.jobbin.DetailStatusActivity
import com.example.jobbin.R
import com.example.jobbin.adapter.AdapterCardJobs
import com.example.jobbin.adapter.AdapterCardStatus
import com.example.jobbin.databinding.FragmentJobsBinding
import com.example.jobbin.model.ModelJobs
import com.example.jobbin.model.ModelStatus

class JobsFragment : Fragment() {

    private var binding: FragmentJobsBinding? = null
    lateinit var rvJobs : RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_jobs, container, false)

        // Recycleview
        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.VERTICAL

        rvJobs = view.findViewById(R.id.rv_jobs_status)



        val adapterJobs = AdapterCardStatus(ArrayStatus,activity)
        rvJobs.setHasFixedSize(true)
        rvJobs.layoutManager = lm
        rvJobs.adapter = adapterJobs

        adapterJobs.onItemClick ={
            val intent = Intent(activity, DetailStatusActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    val ArrayStatus : ArrayList<ModelStatus>get(){
        val arraystatus = ArrayList<ModelStatus>()

        val jobs1 = ModelStatus()
        jobs1.judulStatus = "Telkom"
        jobs1.keteranganStatus = "UI / UX Desaing"
        jobs1.statusStatus = "Shortlisted"
        jobs1.waktuStatus = "12 hous ago"
        jobs1.alamatStatus = "Jl.Arjuna No 1"
        jobs1.imageStatus = R.drawable.telkom

        val jobs2 = ModelStatus()
        jobs2.judulStatus = "Aqua"
        jobs2.keteranganStatus = "Marketing"
        jobs2.statusStatus = "Interview"
        jobs2.waktuStatus = "14 hous ago"
        jobs2.alamatStatus = "Jl.Nakula No 1"
        jobs2.imageStatus = R.drawable.aqua

        val jobs3 = ModelStatus()
        jobs3.judulStatus = "BMW"
        jobs3.keteranganStatus = "Sales"
        jobs3.statusStatus = "Hired"
        jobs3.waktuStatus = "16 hous ago"
        jobs3.alamatStatus = "Jl.Sadewa No 1"
        jobs3.imageStatus = R.drawable.bmw

        val jobs4 = ModelStatus()
        jobs4.judulStatus = "Pertamina"
        jobs4.keteranganStatus = "Android Developer"
        jobs4.statusStatus = "Decline"
        jobs4.waktuStatus = "18 hous ago"
        jobs4.alamatStatus = "Jl.Bima No 1"
        jobs4.imageStatus = R.drawable.pertamina

        arraystatus.add(jobs1)
        arraystatus.add(jobs2)
        arraystatus.add(jobs3)
        arraystatus.add(jobs4)


        return arraystatus
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}