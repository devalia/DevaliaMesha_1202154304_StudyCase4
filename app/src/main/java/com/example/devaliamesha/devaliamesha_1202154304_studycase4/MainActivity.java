package com.example.devaliamesha.devaliamesha_1202154304_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Memanggil activity ListMahasiswa dengan Intent
    public void allList(View view) {
        Intent x = new Intent(this, ListMahasiswa.class);
        startActivity(x);
    }
    //Memanggil activity LihatGambar dengan Intent
    public void lihatGambar(View view) {
        Intent y = new Intent(this, LihatGambar.class);
        startActivity(y);
    }
}
