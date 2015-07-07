package com.example.likai.getmyphonenumber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by likai on 15/7/7.
 */

public class MyAdapter extends BaseAdapter {
    private List<PhoneInfo> lists;
    private Context context;
    private LinearLayout layout;

    public MyAdapter(Context context, List<PhoneInfo> lists) {
        this.context = context;
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = LayoutInflater.from(context);
//        layout = (LinearLayout) inflater.inflate(R.layout.cell, null);
//        TextView tv1 = (TextView) layout.findViewById(R.id.name);
//        TextView tv2 = (TextView) layout.findViewById(R.id.number);
//        tv1.setText(lists.get(position).getPhoneName());
//        tv2.setText(lists.get(position).getPhoneNum());
//        return layout;
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.cell, null);
            viewHolder = new ViewHolder();
            viewHolder.tv1 = (TextView) convertView.findViewById(R.id.name);
            viewHolder.tv2 = (TextView) convertView.findViewById(R.id.number);
            viewHolder.tv1.setText(lists.get(position).getPhoneName());
            viewHolder.tv2.setText(lists.get(position).getPhoneNum());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.tv1.setText(lists.get(position).getPhoneName());
            viewHolder.tv2.setText(lists.get(position).getPhoneNum());
        }
        return convertView;
    }
    public static class ViewHolder {
        TextView tv1;
        TextView tv2;
    }
}
