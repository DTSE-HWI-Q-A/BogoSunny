package com.sandoval.bogosunny.ui

import android.app.Dialog
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import com.sandoval.bogosunny.utils.ThemeUtils

open class BaseActivity : AppCompatActivity() {
    private var progrssDialog: Dialog? = null

    override fun getTheme(): Resources.Theme {
        val theme = super.getTheme()
        return ThemeUtils.getTheme(theme)
    }
}