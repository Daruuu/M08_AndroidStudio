package com.dasalaza.magicgame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.dasalaza.magicgame.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    private int life01 = 20;
    private int life02 = 20;
    private int poison01 = 0;
    private int poison02 = 0;

    public FirstFragment() {
    }

    public void incrementLife01() {
        life01++;
    }

    public void incrementLife02() {
        life02++;
    }

    public void decrementLife01() {
        life01--;
    }

    public void decrementLife02() {
        life02--;
    }

    //  POSION FUNCTIONS INCREMENT
    public void incrementPoison01() {
        poison01++;
    }

    public void incrementPoison02() {
        poison02++;
    }

    //  POSION FUNCTIONS DECREMENT
    public void decrementPoison01() {
        poison01++;
    }

    public void decrementPoison02() {
        poison02++;
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        /* binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot(); */
        // here add the calls to different findViewById
        View view = inflater.inflate(R.layout.activity_main, container, false);
//        IMAGEBUTTON TOP FAV ICON
        ImageButton life01ToLife02_left_top = view.findViewById(R.id.imageButtonP1_moreLife_top);
        ImageButton removeLife_right_top = view.findViewById(R.id.imageButtonP1_lessLife_top);
//        IMAGEBUTTON BOTTOM FAV ICON
        ImageButton p2moreLife_left_bottom = view.findViewById(R.id.imageButtonP2_moreLife_bottom);
        ImageButton p1removeLife_right_bottom = view.findViewById(R.id.imageButtonP2_lessLife_bottom);

//        TOP BUTTON POISON
        Button p1_poison_more_leftTop = view.findViewById(R.id.button_more_poison_top);
        Button p1_poison_less_rightTop = view.findViewById(R.id.button_less_poison_top);
//        BOTTOM BUTTON POISON
        Button p2_poison_more_leftBottom = view.findViewById(R.id.button_more_poison_bottom);
        Button p2_poison_less_rightBottom = view.findViewById(R.id.button_less_poison_bottom);
//        MIDDLE BUTTON ARROWS UP AND DOWN
        ImageButton imageButton_middle_top = view.findViewById(R.id.imageButton_arrow_middle01);
        ImageButton imageButton_middle_bottom = view.findViewById(R.id.imageButton_arrow_middle02);

        life01ToLife02_left_top.setOnClickListener((View newView) -> {
            decrementLife01();
            incrementLife02();
        });
        removeLife_right_top.setOnClickListener((View newView) -> {
            incrementLife01();
            decrementLife02();
        });

        p1_poison_more_leftTop.setOnClickListener((View newView) -> {
            incrementPoison01();
        });
        p1_poison_less_rightTop.setOnClickListener((View newView) -> {
            decrementPoison01();
        });
        p2_poison_more_leftBottom.setOnClickListener((View newView) -> {
            incrementPoison02();
        });
        p2_poison_less_rightBottom.setOnClickListener((View newView) -> {
            decrementPoison02();
        });
        return view;
    }

    View.OnClickListener listener = (View view) -> {
        switch (view.getId()) {
            case R.id.imageButtonP1_moreLife_top:
                decrementLife01();
                incrementLife02();
                break;
            case R.id.imageButtonP2_lessLife_bottom:
                decrementLife02();
                incrementLife01();
                break;
//            case R.id.
            default:

        }
    };

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

/*
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
*/
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}