package com.ftninformatika.cao;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class MyApp extends Application {

    public static final String CHANNEL_ID="my_channel_id";


    @Override
    public void onCreate() {
        super.onCreate();
        createNotChannel();
    }

    private void createNotChannel(){
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel=new NotificationChannel(
                    CHANNEL_ID,
                    "My_notif_Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            channel.setDescription("Description");
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }
}
