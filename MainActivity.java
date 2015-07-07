package com.example.likai.getmyphonenumber;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {
    private ListView lv;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetNum.getContact(this);
        init();
    }
    public void init() {
        lv = (ListView) findViewById(R.id.listView);
        myAdapter = new MyAdapter(this, GetNum.lists);
        lv.setAdapter(myAdapter);
    }
}
