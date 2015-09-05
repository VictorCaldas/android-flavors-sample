package com.github.flavors.sample.application.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.flavors.sample.R;
import com.github.flavors.sample.domain.model.Greetings;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        String greetings = new Greetings().raw();
        Toast.makeText(this, greetings,Toast.LENGTH_LONG).show();
    }
}
