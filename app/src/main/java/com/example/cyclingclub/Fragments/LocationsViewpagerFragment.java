package com.example.cyclingclub.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cyclingclub.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LocationsViewpagerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocationsViewpagerFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private Integer mParam1;
    private String mParam2;

    public LocationsViewpagerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LocationsViewpagerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LocationsViewpagerFragment newInstance(Integer param1, String param2) {
        LocationsViewpagerFragment fragment = new LocationsViewpagerFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_locations_viewpager, container, false);

        //If the parameters are not empty. set the texts and imageView to the passed value
        if (mParam1 != null){
            ImageView locationImage = view.findViewById(R.id.locationImage);
            locationImage.setImageResource(mParam1);
        }
        if (mParam2 != null){
            TextView locationTitle = view.findViewById(R.id.locationTitle);
            locationTitle.setText(mParam2);
        }

        return view;
    }
}