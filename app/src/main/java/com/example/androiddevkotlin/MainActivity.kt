package com.example.androiddevkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // navFragmentContainerViewの設定
        setNavViewEvent()
    }

    private fun setNavViewEvent(){
        // bottomNavViewのアイテムのIDを取得する。
        val bottomNavView: BottomNavigationView = findViewById(R.id.bottom_nav)
        // 設置したnavigationLayoutのフラグメントを取得する。
//        val navController = findNavController(R.id.navFragmentContainerView)

//        NavigationUI.setupWithNavController(bottomNavView, navController)
    }
}