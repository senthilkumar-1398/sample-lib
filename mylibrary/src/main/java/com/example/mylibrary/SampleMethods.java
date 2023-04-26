package com.example.mylibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class SampleMethods {

    public void showLog() {
        Log.e( "Tag", "showLog" );
    }

    public void showToast(Context context,String msg) {
        Toast.makeText( context, msg, Toast.LENGTH_SHORT ).show();
    }
}
