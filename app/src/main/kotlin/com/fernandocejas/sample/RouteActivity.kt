package com.fernandocejas.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fernandocejas.sample.di.ApplicationComponent
import javax.inject.Inject

class RouteActivity : AppCompatActivity() {

    val appComponent: ApplicationComponent by lazy {
        (application as AndroidApplication).appComponent
    }

    @Inject internal lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        navigator.showMainScreen(this)
    }
}
