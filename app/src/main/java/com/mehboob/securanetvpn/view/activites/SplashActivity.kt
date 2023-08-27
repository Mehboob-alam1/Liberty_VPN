package com.mehboob.securanetvpn.view.activites

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.MobileAds
import com.mehboob.securanetvpn.AppSettings
import com.mehboob.securanetvpn.databinding.ActivitySplashBinding
import com.onesignal.OneSignal


class SplashActivity : AppCompatActivity() {

    private var binding: ActivitySplashBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        initGoogleAds()
        initOneSignal()
startMainActivity()
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

    private fun initGoogleAds() {
        MobileAds.initialize(
            this
        ) { }
    }

    private fun initOneSignal() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(AppSettings.oneSignalId);
    }



    private fun startMainActivity() {
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this@SplashActivity, ControllerActivity::class.java))
            finish()
        }, 2000)
    }


    }


