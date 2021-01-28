package com.example.cyclingclub.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cyclingclub.Adapters.CustomRecyclerviewAdapter;
import com.example.cyclingclub.R;
import com.example.cyclingclub.pojo.NewsItem;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //Our Trending News List
        RecyclerView recyclerView = view.findViewById(R.id.trendingList);

        //Storing News and their Title in an ArrayList
        ArrayList<NewsItem> newsItemArrayList = new ArrayList<>();

        //Adding items to arrayList
        newsItemArrayList.add(new NewsItem(R.drawable.news_1, "New Trail Opening Soon!"));
        newsItemArrayList.add(new NewsItem(R.drawable.news_2, "April 2021 Will Be A Sunny Month!"));
        newsItemArrayList.add(new NewsItem(R.drawable.news_3, "New High Tech Bicycles Coming Soon!"));
        newsItemArrayList.add(new NewsItem(R.drawable.news_4, "How much money do pro cyclists make?"));
        newsItemArrayList.add(new NewsItem(R.drawable.news_5, "Is cycling better than running?"));

        //Recyclerview Layout
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //Set an Adapter
        recyclerView.setAdapter(new CustomRecyclerviewAdapter(newsItemArrayList));

        return view;
    }
}