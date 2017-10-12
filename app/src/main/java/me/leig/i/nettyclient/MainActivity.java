package me.leig.i.nettyclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnServer, btnClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnServer = (Button) findViewById(R.id.btn_server);
        btnServer.setOnClickListener(this);
        btnClient = (Button) findViewById(R.id.btn_client);
        btnClient.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_server:
                Intent server = new Intent(this, NettyServerActivity.class);
                this.startActivity(server);
                break;
            case R.id.btn_client:
                Intent client = new Intent(this, NettyServerActivity.class);
                this.startActivity(client);
                break;
        }
    }
}
