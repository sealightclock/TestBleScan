package com.lorenzofelletti.simpleblescanner.blescanner.model

import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.util.Log

private const val TAG = "TBS: BleScanCallback"

class BleScanCallback(
    private val onScanResultAction: (ScanResult?) -> Unit = {},
    private val onBatchScanResultAction: (MutableList<ScanResult>?) -> Unit = {},
    private val onScanFailedAction: (Int) -> Unit = {}
) : ScanCallback() {
    override fun onScanResult(callbackType: Int, result: ScanResult?) {
        Log.d(TAG, "onScanResult")

        super.onScanResult(callbackType, result)

        Log.v(TAG, "onScanResult: callbackType=[$callbackType], result=[$result]")

        onScanResultAction(result)
    }

    override fun onBatchScanResults(results: MutableList<ScanResult>?) {
        Log.d(TAG, "onBatchScanResults")

        super.onBatchScanResults(results)

        Log.v(TAG, "onBatchScanResults: results=[$results]")

        onBatchScanResultAction(results)
    }

    override fun onScanFailed(errorCode: Int) {
        Log.d(TAG, "onScanFailed")

        super.onScanFailed(errorCode)

        Log.v(TAG, "onScanFailed: errorCode=[$errorCode]")

        onScanFailedAction(errorCode)
    }
}
