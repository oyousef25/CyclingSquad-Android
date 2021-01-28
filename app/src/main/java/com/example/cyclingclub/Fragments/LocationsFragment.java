package com.example.cyclingclub.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cyclingclub.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LocationsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocationsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private Integer mParam1;
    private String mParam2;

    public LocationsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LocationsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LocationsFragment newInstance(Integer param1, String param2) {
        LocationsFragment fragment = new LocationsFragment();
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
        final View view = inflater.inflate(R.layout.fragment_locations, container, false);

        CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(getChildFragmentManager());
        ViewPager viewPager = view.findViewById(R.id.locationsPager);
        viewPager.setAdapter(adapter);

        return view;
    }

    public class CustomViewPagerAdapter extends FragmentPagerAdapter{


        public CustomViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return LocationsViewpagerFragment.newInstance(R.drawable.devonwood, getString(R.string.locations_first));
                case 1: return LocationsViewpagerFragment.newInstance(R.drawable.malden, getString(R.string.locations_second));
                case 2: return LocationsViewpagerFragment.newInstance(R.drawable.little_river, getString(R.string.locations_third));
                case 3: return LocationsViewpagerFragment.newInstance(R.drawable.lasalle, getString(R.string.locations_fourth));
                case 4: return LocationsViewpagerFragment.newInstance(R.drawable.riverside, getString(R.string.locations_fifth));
                default: return null;
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}