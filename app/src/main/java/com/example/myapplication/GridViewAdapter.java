package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    List<String> lstSource;
    Context mContext;

    public GridViewAdapter(List<String> lstSource, Context mContext) {
        this.lstSource = lstSource;
        this.mContext = mContext;
    }//esto es un cambio para prueba github

    @Override
    public int getCount() {
        return lstSource.size();
    }

    @Override
    public Object getItem(int position) {
        return lstSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView texto;
       // if(convertView== null){
            texto = new TextView(mContext);
            texto.setLayoutParams(new GridView.LayoutParams(85,85));
            texto.setPadding(8,8,8,8);
            texto.setText(lstSource.get(position));
            texto.setTextColor(Color.BLACK);

       /* }else{
            texto = (TextView)convertView;

        }
        */
        return texto;
    }
}
