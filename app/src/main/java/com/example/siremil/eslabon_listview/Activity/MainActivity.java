package com.example.siremil.eslabon_listview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.siremil.eslabon_listview.Adapter.CustomAdapter;
import com.example.siremil.eslabon_listview.Model.College;
import com.example.siremil.eslabon_listview.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] colleges;
    ListView usteColleges;
    CustomAdapter adapter;
    List<College> listColleges;
    String[] year;
    int[] logos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colleges = getResources().getStringArray(R.array.Colleges);
        usteColleges = (ListView) findViewById(R.id.ustColleges);
        listColleges = new ArrayList<College>();
        year = getResources().getStringArray(R.array.Year);

        logos = new int[] {
                R.drawable.busad, R.drawable.engg, R.drawable.iics, R.drawable.nursing, R.drawable.pharmacy};

        for ( int i = 0; i < colleges.length; i++ ) {
            listColleges.add( new College( logos[i], year[i], colleges[i] ) );
        }

        adapter = new CustomAdapter(this, listColleges);
        usteColleges.setAdapter(adapter);
        usteColleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + colleges[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
