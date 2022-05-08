package com.example.majorproject_demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {


    private final MyListData[] listdata;

    public MyListAdapter(MyListData[] listdata) {
        this.listdata = listdata;
    }


    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.single_bus_view, parent, false);
        return new ViewHolder(listItem);

    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {

        final MyListData myListData = listdata[position];
        holder.route_number.setText(listdata[position].getRoute_number());
        holder.from_address.setText(listdata[position].getFrom_address());
        holder.to_address.setText(listdata[position].getTo_address());
        holder.via_location.setText(listdata[position].getVia_location());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getRoute_number(), Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView route_number;
        public TextView from_address;
        public TextView to_address;
        public TextView via_location;
        public RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.route_number = route_number;
            this.from_address = from_address;
            this.to_address = to_address;
            this.via_location = via_location;
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativelayout1);
        }
    }
}
