package com.boomtown.ckesho.backgroundserviceexample;

import android.os.HandlerThread;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ckesho on 9/1/2015.
 */
public class ServiceHandlerThread extends HandlerThread {
    //Benefits of Thread type HandlerThread is it has its own looper built in.
    //The Looper is the like the infrastructure for communicating.
    private String TAG="chris";
    //Required: Create general constructor
    public ServiceHandlerThread(String name) {
        super(name);
        Log.i(TAG, "thread constructor made");
    }

    //You need override run
    @Override
    public void run() {
        super.run();
        //Toast.makeText(, "Run executed", Toast.LENGTH_SHORT)
        //        .show();
        Log.i(TAG, "For Heaven sakes please Run executed");
    }
}
