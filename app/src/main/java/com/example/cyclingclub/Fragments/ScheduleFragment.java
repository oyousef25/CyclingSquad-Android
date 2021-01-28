package com.example.cyclingclub.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cyclingclub.Adapters.CustomRecyclerviewAdapter;
import com.example.cyclingclub.Adapters.CustomScheduleAdapter;
import com.example.cyclingclub.R;
import com.example.cyclingclub.pojo.NewsItem;
import com.example.cyclingclub.pojo.ScheduleItem;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScheduleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScheduleFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ScheduleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScheduleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScheduleFragment newInstance(String param1, String param2) {
        ScheduleFragment fragment = new ScheduleFragment();
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
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        //Our Trending News List
        RecyclerView recyclerView = view.findViewById(R.id.scheduleList);

        //Storing News and their Title in an ArrayList
        ArrayList<ScheduleItem> scheduleItems = new ArrayList<>();

        //Adding items to arrayList
        scheduleItems.add(new ScheduleItem(getString(R.string.day_monday), getString(R.string.time_monday)));
        scheduleItems.add(new ScheduleItem(getString(R.string.day_tuesday), getString(R.string.time_tuesday)));
        scheduleItems.add(new ScheduleItem(getString(R.string.day_wednesday), getString(R.string.time_wednesday)));
        scheduleItems.add(new ScheduleItem(getString(R.string.day_thursday), getString(R.string.time_thursday)));
        scheduleItems.add(new ScheduleItem(getString(R.string.day_friday), getString(R.string.time_friday)));

        //Recyclerview Layout
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //Set an Adapter
        recyclerView.setAdapter(new CustomScheduleAdapter(scheduleItems));

        return view;
    }
}