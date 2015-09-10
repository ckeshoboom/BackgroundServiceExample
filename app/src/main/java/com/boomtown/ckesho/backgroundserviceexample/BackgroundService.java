package com.boomtown.ckesho.backgroundserviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class BackgroundService extends Service {
    public BackgroundService() {
    }
private String TAG= "chris";
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(getApplicationContext(), "Servicestarted", Toast.LENGTH_LONG)
            .show();
        Log.i(TAG, "Service created toast");
        ServiceHandlerThread thread = new ServiceHandlerThread("ned");
        Handler handler;

        thread.start();

        /*thread.run();*/
        //incorrect call, you should never call run directly

        handler=new Handler(thread.getLooper());
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "Run executed by runnable");
            }
        };
        handler.post(runnable);



    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
