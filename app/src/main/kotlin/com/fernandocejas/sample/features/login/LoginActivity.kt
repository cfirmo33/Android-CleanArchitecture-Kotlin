package com.fernandocejas.sample.features.users

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.fernandocejas.sample.BaseActivity

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addFragment(savedInstanceState, LoginFragment())
    }

    companion object {
        @JvmStatic fun callingIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }
}
