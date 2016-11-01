package com.example.dell.myapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dell on 2016/11/1.
 */

public class Fragment1 extends Fragment {
    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.d("tag","onAttachFragment");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("tag","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("tag","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("tag","onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("tag","onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("tag","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("tag","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("tag","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("tag","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("tag","onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("tag","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("tag","onDetach");
    }
}
