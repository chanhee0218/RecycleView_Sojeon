package com.chanhee.project1115;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String>data=new ArrayList<>();
        data.add("Seoul");
        data.add("Busan");
        data.add("Daugu");
        data.add("Incheon");
        RecyclerView recyclerView=findViewById(R.id.Recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SimpleTextAdapter simpleTextAdapter=new SimpleTextAdapter(data);
        recyclerView.setAdapter(simpleTextAdapter);
    }
}
