package com.lorenzofelletti.simpleblescanner.blescanner.model

import android.util.Log

private const val TAG = "TBS: BleDevice"

/**
 * A class that represents a BLE device.
 */
data class BleDevice(val name: String) {
    companion object {
        fun createBleDevicesList(): MutableList<BleDevice> {
            Log.d(TAG, "createBleDevicesList")

            return mutableListOf()
        }
    }
}

