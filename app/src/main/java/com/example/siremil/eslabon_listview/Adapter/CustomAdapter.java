package com.example.siremil.eslabon_listview.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.siremil.eslabon_listview.Model.College;
import com.example.siremil.eslabon_listview.R;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context c;
    private List<College> colleges;
    ImageView iv_Logo;
    TextView tv_Name, tv_Year;

    public CustomAdapter( Context c, List<College> colleges) {
        this.c = c;
        this.colleges = colleges;
    }

    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View v = View.inflate(c, R.layout.row_layout, null);
        iv_Logo = (ImageView) v.findViewById(R.id.logo);
        tv_Name = (TextView)  v.findViewById(R.id.tvcollege);
        tv_Year = (TextView)  v.findViewById(R.id.tvYear);

        tv_Name.setText(colleges.get(i).getCollege());
        tv_Year.setText(colleges.get(i).getYear());
        iv_Logo.setImageResource(colleges.get(i).getLogo());
        return v;
    }

}
