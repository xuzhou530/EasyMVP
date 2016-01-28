package com.example.zane.demo.presenter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.zane.demo.R;
import com.example.zane.demo.view.MainView2;
import com.example.zane.easymvp.presenter.BaseActivityPresenter;

/**
 * Created by Zane on 16/1/27.
 */
public class MainActivity2 extends BaseActivityPresenter<MainView2>{

    public String test;

    @Override
    public Class<MainView2> getRootViewClass() {
        return MainView2.class;
    }

    @Override
    public void inCreat(Bundle bundle) {

        if (bundle == null) {
            test = "haha";
        } else {
            test = bundle.getString("test");
        }

        Log.i("MainActivity2", test);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        }, R.id.button);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("test", "hehe");
    }

    @Override
    public void inDestory() {

    }
}