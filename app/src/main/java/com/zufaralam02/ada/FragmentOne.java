package com.zufaralam02.ada;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
    ImageView img1;
    Button btn1;
    TextView txt1_1, txt1_2, txt1_3;

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);

        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);

        img1 = (ImageView) view.findViewById(R.id.img1);
        txt1_1 = (TextView) view.findViewById(R.id.txt1_1);
        txt1_2 = (TextView) view.findViewById(R.id.txt1_2);
        txt1_3 = (TextView) view.findViewById(R.id.txt1_3);
        btn1 = (Button) view.findViewById(R.id.btn1);

        img1.startAnimation(animation);
        txt1_1.startAnimation(animation);
        txt1_2.startAnimation(animation);
        txt1_3.startAnimation(animation);
        btn1.startAnimation(animation);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                addFragment(new FragmentTwo(), true, "two");

                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, new FragmentTwo());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        return view;
    }

//    private void addFragment(Fragment fragment, boolean addToBackStack, String tag) {
//        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        if (addToBackStack) {
//            fragmentTransaction.addToBackStack(tag);
//        }
//
//        fragmentTransaction.replace(R.id.container, fragment, tag);
//        fragmentTransaction.commitAllowingStateLoss();
//
//    }

}
