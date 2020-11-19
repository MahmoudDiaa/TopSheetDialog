package com.diaa.topsheetdialogTest

import android.app.Dialog
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.diaa.topSheetDialog.topSheetKt.TopSheetBehavior
import com.diaa.topSheetDialog.topSheetKt.TopSheetDialog
import com.diaa.topSheetDialog.topSheetKt.TopSheetDialogFragment

class TopDialogTest:TopSheetDialogFragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dial = super.onCreateDialog(savedInstanceState) as TopSheetDialog
        dial.setOnShowListener { dialog ->
            val d = dialog as TopSheetDialog
            val topSheet = d.findViewById<View>(R.id.design_top_sheet)
            TopSheetBehavior.from(topSheet!!).setState(TopSheetBehavior.STATE_EXPANDED)
            topSheet.minimumHeight = Resources.getSystem().displayMetrics.heightPixels / 3

        }
        // Do something with your dialog like setContentView() or whatever
        return dial
    }

    private fun init() {
        try {
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}