package com.mykeyboardutilslibrary

import android.app.Activity
import android.content.Context
import android.os.IBinder
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

object KeyboardUtils {

    fun hideKeyboard(activity: Activity) {
        try {
            val view = activity.window.currentFocus ?: return
            val inputManager = activity
                .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(
                view.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS
            )
        } catch (e: Exception) {

        }
    }

    fun closeKeyboard(c: Context, windowToken: IBinder?) {
        val mgr = c.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        mgr.hideSoftInputFromWindow(windowToken, 0)
    }

    fun openKeyboardWhenFocus(context: Context, editable: EditText) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editable, InputMethodManager.SHOW_IMPLICIT)
    }

    fun setupKeyboardDone(context: Context, editText: EditText?,cursorVisible: Boolean=true) {
        editText!!.setOnEditorActionListener { v, actionId, event ->
            if (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER || actionId == EditorInfo.IME_ACTION_DONE) {
                val imm = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
                editText.isCursorVisible = cursorVisible
            }
            false
        }
    }
}