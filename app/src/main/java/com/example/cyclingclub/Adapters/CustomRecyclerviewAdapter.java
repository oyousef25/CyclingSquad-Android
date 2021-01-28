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

import java.util.ArrayList;

/**
 * Building a Custom RecyclerView Adapter Class to use the XML layout file's design for the recyclerView
 * @author Omar Yousef
 * @version 1.0
 */
public class CustomRecyclerviewAdapter extends RecyclerView.Adapter<CustomRecyclerviewAdapter.CustomViewHolder> {
    private ArrayList<NewsItem> newsItems;

    public CustomRecyclerviewAdapter(ArrayList<NewsItem> newsItems) {
        this.newsItems = newsItems;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_home_recyclerview, null);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        NewsItem newsItem = newsItems.get(position);

        //Retrieving the NewsItem properties data by getting the current Object's position
        holder.image.setImageResource(newsItem.getImage());
        holder.title.setText(newsItem.getTitle());
    }

    @Override
    public int getItemCount() {
        if (newsItems != null){
            return newsItems.size();
        }else{
            return 0;
        }
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        protected ImageView image;
        protected TextView title;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.image = itemView.findViewById(R.id.newsImage);
            this.title = itemView.findViewById(R.id.newsTitle);
        }
    }
}
