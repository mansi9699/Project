package asquero.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Ended extends AppCompatActivity {

    private int arrSize;
    private String[] subs;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter EndedListAdapter;

    private List<EndedList> listEnded;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ended);

        getSupportActionBar().setTitle("Ended");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = getIntent();
        subs = intent.getStringArrayExtra("subs");

        arrSize = subs.length;

        listEnded = new ArrayList<>();

        for (int i = 0; i< arrSize ; i++){
            EndedList EndedLists = new EndedList("DummyCode"+i,subs[i],"0","0","DummyName"+i);
            listEnded.add(EndedLists);
        }

        EndedListAdapter = new EndedListAdapter(listEnded,Ended.this);
        recyclerView.setAdapter(EndedListAdapter);
    }
}
