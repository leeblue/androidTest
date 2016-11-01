package com.example.dell.myapplication;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {

    private FrameLayout fragmentTest;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("tag","ActivityOnCreate");
        fragmentManager = getFragmentManager();
        fragmentTest = (FrameLayout) findViewById(R.id.fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment,new Fragment1());
        transaction.commit();
        //
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","ActivityOnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","ActivityOnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","ActivityOnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","ActivityOnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","ActivityOnResume");
    }
}
