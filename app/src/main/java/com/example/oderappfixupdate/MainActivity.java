package com.example.oderappfixupdate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";
    ImageView imageView1,imageView2;
    RelativeLayout relativeLayout;
    int d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = findViewById(R.id.giohang);
        imageView1 = findViewById(R.id.menufood);
        imageView2 = findViewById(R.id.login);

        getFragment(MenuFragment.newInstance());

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(MenuFragment.newInstance());
                imageView1.setBackgroundResource(R.drawable.bodercontroll);
                relativeLayout.setBackgroundResource(R.drawable.nobody);
                imageView2.setBackgroundResource(R.drawable.nobody);

            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(LoginFragment.newInstance());
                imageView1.setBackgroundResource(R.drawable.nobody);
                relativeLayout.setBackgroundResource(R.drawable.nobody);
                imageView2.setBackgroundResource(R.drawable.bodercontroll);

            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(supermaket.newInstance());
                imageView1.setBackgroundResource(R.drawable.nobody);
                relativeLayout.setBackgroundResource(R.drawable.bodercontroll);
                imageView2.setBackgroundResource(R.drawable.nobody);
            }
        });
    }
    public void getFragment(Fragment fragment) {
        try {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment, fragment)
                    .commit();
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG,"getFragment"+e.getMessage());
        }
    }

}