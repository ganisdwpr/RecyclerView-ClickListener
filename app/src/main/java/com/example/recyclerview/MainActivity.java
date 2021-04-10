package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Godzilla vs. Kong");
        m.setDescription("2021");
        m.setImg(R.drawable.godzilla);
        models.add(m);

        m = new Model();
        m.setTitle("Nobody");
        m.setDescription("2021");
        m.setImg(R.drawable.nobody);
        models.add(m);

        m = new Model();
        m.setTitle("Soul");
        m.setDescription("2020");
        m.setImg(R.drawable.soul);
        models.add(m);

        m = new Model();
        m.setTitle("The Father");
        m.setDescription("2021");
        m.setImg(R.drawable.thefather);
        models.add(m);

        m = new Model();
        m.setTitle("Seaspiracy");
        m.setDescription("2021");
        m.setImg(R.drawable.godzilla);
        models.add(m);

        m = new Model();
        m.setTitle("Wrath Of Man");
        m.setDescription("2020");
        m.setImg(R.drawable.wrathofman);
        models.add(m);

        m = new Model();
        m.setTitle("Mortal Kombat");
        m.setDescription("2021");
        m.setImg(R.drawable.mortalkombat);
        models.add(m);

        return models;
    }
}