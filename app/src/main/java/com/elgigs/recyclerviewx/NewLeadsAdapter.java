package com.elgigs.recyclerviewx;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NewLeadsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<NewLeads> meraList;
    private LayoutInflater meraLayoutInflater;
    private NewLeads newLeads;

    public NewLeadsAdapter(Context context, List<NewLeads> list) {
        mContext = context;
        meraList = list;
        meraLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = meraLayoutInflater.inflate(R.layout.item_new_leads, viewGroup, false);
        return new NewLeadsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        NewLeadsViewHolder newLeadsViewHolder = (NewLeadsViewHolder)viewHolder;
        newLeads = meraList.get(i);

        newLeadsViewHolder.servicename.setText(newLeads.serviceKaName);
        newLeadsViewHolder.customername.setText(newLeads.customerKaName);
        newLeadsViewHolder.servicetime.setText(newLeads.serviceKaTime);

    }

    @Override
    public int getItemCount() {
        return meraList.size();
    }

    class NewLeadsViewHolder extends RecyclerView.ViewHolder {
        TextView servicename, customername, servicetime;
        public NewLeadsViewHolder(@NonNull View itemView) {
            super(itemView);
            servicename = itemView.findViewById(R.id.service_name_tv);
            customername  = itemView.findViewById(R.id.customer_name_tv);
            servicetime = itemView.findViewById(R.id.time_tv);
        }
    }
}
