package com.lorenzofelletti.simpleblescanner.blescanner.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lorenzofelletti.simpleblescanner.R
import com.lorenzofelletti.simpleblescanner.blescanner.model.BleDevice

private const val TAG = "TBS: BleDeviceAdapter"

/**
 * Adapter for the RecyclerView that shows the found BLE devices.
 */
class BleDeviceAdapter(private val devices: List<BleDevice>) : RecyclerView.Adapter<BleDeviceAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val deviceNameTextView: TextView = itemView.findViewById(R.id.device_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(TAG, "onCreateViewHolder")

        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val deviceView = inflater.inflate(R.layout.device_row_layout, parent, false)

        return ViewHolder(deviceView)
    }

    override fun onBindViewHolder(holder: BleDeviceAdapter.ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder")

        val device = devices[position]
        val textView = holder.deviceNameTextView
        textView.text = device.name
    }

    override fun getItemCount(): Int {
        val count = devices.size

        Log.d(TAG, "getItemCount: count=[$count]")

        return count
    }
}
