package com.capstone.pakigsabotbusinessowner;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ReservationsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReservationsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ReservationsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ReservationsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReservationsFragment newInstance(String param1, String param2) {
        ReservationsFragment fragment = new ReservationsFragment();
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
        View view = inflater.inflate(R.layout.fragment_reservations, container, false);

        //References:
        ImageButton profileBtn = (ImageButton) view.findViewById(R.id.profileBtnReservations);
        ImageButton signOutBtn = (ImageButton) view.findViewById(R.id.signoutReservationsBtn);
        ImageView infoJan11 = (ImageView) view.findViewById(R.id.infoJan11);

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profileScreen();
            }
        });

        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOutApp();
            }
        });

        infoJan11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reservationDetails();
                /*FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                // Create and show the dialog.
                ReservationDetails newFragment = new ReservationDetails ();
                newFragment.show(ft, "ReservationDetails");*/

              /*  ReservationDetails dialog = new ReservationDetails();
                dialog.show(getActivity().getSupportFragmentManager(), "ReservationDetails");*/
            }
        });
        return view;


    }

    public void profileScreen(){
        Intent in = new Intent(getActivity(), Profile.class);
        in.putExtra("profile", "profile");
        startActivity(in);
    }

    public void signOutApp(){
        Intent in = new Intent(getActivity(), SignIn.class);
        in.putExtra("signin", "signin");
        startActivity(in);
    }

    public void reservationDetails(){
        Intent in = new Intent(getActivity(), ReservationDetails.class);
        in.putExtra("rd", "rd");
        startActivity(in);
    }
}

