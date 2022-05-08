package com.example.majorproject_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private Context context;
    private ArrayList<MyListData> listdata;

    public MyAdapter(ArrayList<MyListData> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.single_bus_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {

        //final MyListData myListData = listdata.get(position);
        holder.route_number.setText(listdata.get(position).getRoute_number());
        holder.from_address.setText(listdata.get(position).getFrom_address());
        holder.to_address.setText(listdata.get(position).getTo_address());
        holder.via_location.setText(listdata.get(position).getVia_location());


    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView route_number;
        public TextView from_address;
        public TextView to_address;
        public TextView via_location;
        public Button btn_Route;
        public RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           route_number=(TextView) itemView.findViewById(R.id.routenumber);
           from_address=(TextView)itemView.findViewById(R.id.from);
            to_address=(TextView)itemView.findViewById(R.id.to);
            via_location=(TextView)itemView.findViewById(R.id.via);


        }


    }



}
