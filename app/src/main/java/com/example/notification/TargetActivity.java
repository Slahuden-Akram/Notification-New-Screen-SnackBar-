package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.concurrent.atomic.AtomicInteger;

public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.constraintLayout);
        Integer id = getIntent().getIntExtra("Key",0);
        Snackbar sb = Snackbar.make(cl,"SnackBar",Snackbar.LENGTH_LONG).setAction("Click Me", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), id.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        sb.show();


        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(id);
    }
}