package com.example.seccion02;

import android.content.Context;
import android.os.Debug;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> names;

    public  MyAdapter(Context context, int layout, List<String> names){

        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //View Holder Pattern
        ViewHolder holder;

        if (convertView == null)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(layout, null);

            holder = new ViewHolder();
            //Referenciamos el elemento a modificar y lo rellenamos
            holder.nameTextView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        //Traemos el valor actual dependiendo la posicion
        String currentName = names.get(position);
        //currentName = (String) getItem(position);

        holder.nameTextView.setText(currentName);

        //Devolvemos el view modificado
        return  convertView;
    }

    static class ViewHolder{
        private TextView nameTextView;



    }
}
