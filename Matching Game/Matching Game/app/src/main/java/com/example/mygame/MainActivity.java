package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ImageView paw1, paw2, paw3, paw4, paw5, paw6, paw7, paw8, paw9, paw10, paw11, paw12, restart, home;
    private ArrayList<String> animals = new ArrayList<>();
    private ArrayList<String> paw_flip = new ArrayList<>();
    private int count = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        paw1 = findViewById(R.id.paw1);
        paw2 = findViewById(R.id.paw2);
        paw3 = findViewById(R.id.paw3);
        paw4 = findViewById(R.id.paw4);
        paw5 = findViewById(R.id.paw5);
        paw6 = findViewById(R.id.paw6);
        paw7 = findViewById(R.id.paw7);
        paw8 = findViewById(R.id.paw8);
        paw9 = findViewById(R.id.paw9);
        paw10 = findViewById(R.id.paw10);
        paw11 = findViewById(R.id.paw11);
        paw12 = findViewById(R.id.paw12);
        home = findViewById(R.id.home);
        restart = findViewById(R.id.restart);

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw1.setImageResource(R.drawable.backcard);
                paw2.setImageResource(R.drawable.backcard);
                paw3.setImageResource(R.drawable.backcard);
                paw4.setImageResource(R.drawable.backcard);
                paw5.setImageResource(R.drawable.backcard);
                paw6.setImageResource(R.drawable.backcard);
                paw7.setImageResource(R.drawable.backcard);
                paw8.setImageResource(R.drawable.backcard);
                paw9.setImageResource(R.drawable.backcard);
                paw10.setImageResource(R.drawable.backcard);
                paw11.setImageResource(R.drawable.backcard);
                paw12.setImageResource(R.drawable.backcard);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        paw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw1.setImageResource(R.drawable.bee);
                verify("bee", "paw1");
            }
        });

        paw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw2.setImageResource(R.drawable.chameleon);
                verify("chameleon", "paw2");
            }
        });

        paw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw3.setImageResource(R.drawable.crab);
                verify("crab", "paw3");
            }
        });

        paw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw4.setImageResource(R.drawable.chameleon);
                verify("chameleon", "paw4");
            }
        });

        paw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw5.setImageResource(R.drawable.koala);
                verify("koala", "paw5");
            }
        });

        paw6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw6.setImageResource(R.drawable.fox);
                verify("fox", "paw6");
            }
        });

        paw7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw7.setImageResource(R.drawable.fox);
                verify("fox", "paw7");
            }
        });

        paw8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw8.setImageResource(R.drawable.bee);
                verify("bee", "paw8");
            }
        });

        paw9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw9.setImageResource(R.drawable.dog);
                verify("dog", "paw9");
            }
        });

        paw10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw10.setImageResource(R.drawable.koala);
                verify("koala", "paw10");
            }
        });

        paw11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw11.setImageResource(R.drawable.dog);
                verify("dog", "paw11");
            }
        });

        paw12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paw12.setImageResource(R.drawable.crab);
                verify("crab", "paw12");
            }
        });

    }
    public void verify(String animal, String pawpaw){
        animals.add(animal);
        paw_flip.add(pawpaw);

        if (animals.size() == 2){
            if (animals.get(0) != animals.get(1)) {
                Toast.makeText(this, "Wrong Combination", Toast.LENGTH_SHORT).show();
                flip(paw_flip.get(0));
                flip(paw_flip.get(1));
                animals.clear();
                paw_flip.clear();

            } else if (animals.get(0) == animals.get(1)) {
                animals.clear();
                paw_flip.clear();

                count -= 1;
                if (count == 0){
                    Toast.makeText(this, "Congratulation!", Toast.LENGTH_SHORT).show();
                    count = 6;
                }
                else {
                    String message = count + " more left";
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
                }
            }
        }

    }

    public void flip(String paw){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (paw.equals("paw1")) {
                    paw1.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw2")) {
                    paw2.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw3")) {
                    paw3.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw4")) {
                    paw4.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw5")) {
                    paw5.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw6")) {
                    paw6.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw7")) {
                    paw7.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw8")) {
                    paw8.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw9")) {
                    paw9.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw10")) {
                    paw10.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw11")) {
                    paw11.setImageResource(R.drawable.backcard);
                } else if (paw.equals("paw12")) {
                    paw12.setImageResource(R.drawable.backcard);
                }
            }
        };
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(runnable, 1000);

    }

}