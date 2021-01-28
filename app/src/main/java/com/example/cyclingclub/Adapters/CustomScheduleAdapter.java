package com.example.cyclingclub.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cyclingclub.R;
import com.example.cyclingclub.pojo.NewsItem;
import com.example.cyclingclub.pojo.ScheduleItem;

import java.util.ArrayList;

/**
 * Custom Adapter for the schedule
 * @author Omar Yousef
 * @version 1.0
 */
public class CustomScheduleAdapter extends RecyclerView.Adapter<CustomScheduleAdapter.CustomViewHolder> {
    private ArrayList<ScheduleItem> scheduleItems;

    public CustomScheduleAdapter(ArrayList<ScheduleItem> scheduleItems) {
        this.scheduleItems = scheduleItems;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_schedule_recyclerview, null);
        return new CustomScheduleAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        ScheduleItem scheduleItem = scheduleItems.get(position);

        //Retrieving the NewsItem properties data by getting the current Object's position
        holder.day.setText(scheduleItem.getDay());
        holder.time.setText(scheduleItem.getTime());

    }

    @Override
    public int getItemCount() {
        if (scheduleItems != null){
            return scheduleItems.size();
        }else{
            return 0;
        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        /*
            Properties
         */
        protected TextView day;
        protected TextView time;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.day = itemView.findViewById(R.id.scheduleDay);
            this.time = itemView.findViewById(R.id.scheduleTime);
        }
    }
}
