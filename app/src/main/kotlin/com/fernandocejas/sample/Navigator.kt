package com.fernandocejas.sample

import android.content.Context
import com.fernandocejas.sample.features.login.Authenticator
import com.fernandocejas.sample.features.users.LoginActivity
import com.fernandocejas.sample.features.users.UsersActivity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Navigator @Inject constructor(private val authenticator: Authenticator) {

    fun showMainScreen(context: Context) {
        when (authenticator.userLoggedIn()) {
            true -> handleLoggedInUser(context)
            false -> showLoginScreen(context)
        }
    }

    private fun handleLoggedInUser(context: Context) {
        context.startActivity(UsersActivity.callingIntent(context))
    }

    private fun showLoginScreen(context: Context) {
        context.startActivity(LoginActivity.callingIntent(context))
    }
}

