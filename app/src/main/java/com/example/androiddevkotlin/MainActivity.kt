package com.example.androiddevkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottom_nav: BottomNavigationView = findViewById(R.id.bottom_nav)
        // navFragmentContainerViewの設定
        val navController = findNavController(R.id.navFragmentContainerView)
        setupActionBarWithNavController(
            navController, AppBarConfiguration(
                setOf(
                    /**
                     * 新しい画面追加するとき、以下に追加すること。
                     */
                    R.id.homeFragment,
                    R.id.searchFragment,
                    R.id.notificationFragment,
                    R.id.messageFragment
                )
            )
        )
        bottom_nav.setupWithNavController(navController)
    }
}