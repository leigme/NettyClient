package me.leig.i.nettyclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NettyClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netty_client);
        int port = 8099;
        NettyClient nc = new NettyClient("192.168.5.105", port);
        try {
            nc.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
