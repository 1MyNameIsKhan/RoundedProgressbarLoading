package com.example.myprogressbar_library

import android.app.Activity
import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.WindowManager




class ProgressBarDialog(val mActivity: Activity) {
    private lateinit var mDialog: AlertDialog

    fun startLoading() {
        val inflater = mActivity.layoutInflater
        val progressView = inflater.inflate(R.layout.loading_progress,null)

        val builder = AlertDialog.Builder(mActivity/*,AlertDialog.THEME_HOLO_LIGHT*/)
        builder.setView(progressView)
        builder.setCancelable(false)

        mDialog = builder.create()
        mDialog.show()
        //mDialog.getWindow()!!.setLayout(400, 400)
        val lp = WindowManager.LayoutParams()

        lp.copyFrom(mDialog.getWindow()!!.getAttributes())
        lp.width = 400
        lp.height = 400

        //lp.x = 100
        //lp.y = 100
        mDialog.getWindow()!!.setAttributes(lp)
        mDialog.getWindow()!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))


    }

    fun dismissDialog() {
        mDialog.dismiss()
    }
}