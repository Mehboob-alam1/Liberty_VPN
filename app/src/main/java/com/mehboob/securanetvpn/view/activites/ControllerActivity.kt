package com.mehboob.securanetvpn.view.activites

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.mehboob.securanetvpn.R

import com.mehboob.securanetvpn.databinding.ActivityControllerBinding

class ControllerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityControllerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityControllerBinding.inflate(layoutInflater)

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(binding.root)


        setupNavigation()

    }

    /*
    * Controller activity control the Navigation behaviour of the Fragments
    * */
    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val popupMenu = PopupMenu(this, null)
        popupMenu.inflate(R.menu.main_nav_menu)
        val menu = popupMenu.menu
        binding.mainBottomNav.setupWithNavController(menu, navHostFragment.navController)
    }

}