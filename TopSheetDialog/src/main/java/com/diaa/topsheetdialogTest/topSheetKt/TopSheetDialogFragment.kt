package com.diaa.topsheetdialogTest.topSheetKt

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import java.util.*

open class TopSheetDialogFragment : AppCompatDialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return TopSheetDialog(
            Objects.requireNonNull(context!!),
            theme
        )
    }
}
