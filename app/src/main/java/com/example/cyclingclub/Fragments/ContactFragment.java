package com.example.cyclingclub.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.cyclingclub.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
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
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

//        //Call Button
//        Button callButton = view.findViewById(R.id.callButton);
//        callButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri number = Uri.parse("tel:+12997765743");
//                Intent intent = new Intent(Intent.ACTION_DIAL, number);
//                if (intent.resolveActivity(getActivity().getPackageManager()) != null){
//                    startActivity(intent);
//                }else{
//                    Toast.makeText(getContext(), "No app installed", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


//        //E-mail Button
//        Button emailButton = view.findViewById(R.id.emailButton);
//        emailButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String[] emailAddress = {"mailto:w0753671@myscc.ca"};
//                String[] ccEmail = {"techsupport@omarYousef.com"};
//                Intent intent = new Intent(Intent.ACTION_SENDTO);
//                intent.setData(Uri.parse("mailto:"));
//
//                //Adding extra email, cc, subject and email body
//                intent.putExtra(Intent.EXTRA_EMAIL, emailAddress);
//                intent.putExtra(Intent.EXTRA_CC, ccEmail);
//                intent.putExtra(Intent.EXTRA_SUBJECT, "I'm Looking to contact CyclingSquad':");
//                intent.putExtra(Intent.EXTRA_TEXT, "I like your professional looking app");
//
//                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
//                    startActivity(intent);
//                }else{
//                    Toast.makeText(getContext(), "No app installed", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

//        //Location Button
//        Button locationButton = view.findViewById(R.id.mapButton);
//        locationButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri location = Uri.parse("geo:22.27307,-63.0512688&q=business");
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                if (intent.resolveActivity(getActivity().getPackageManager()) != null){
//                    startActivity(intent);
//                }else{
//                    Toast.makeText(getContext(), "No app installed", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        return view;
    }
}