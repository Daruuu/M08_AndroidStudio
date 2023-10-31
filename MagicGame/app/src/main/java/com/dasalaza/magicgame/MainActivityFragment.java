package com.dasalaza.magicgame;

import androidx.fragment.app.Fragment;

public class MainActivityFragment extends Fragment {
    private int life01 = 20;
    private int life02 = 20;
    private int poison01 = 0;
    private int poison02 = 0;

    public MainActivityFragment() {
    }

    public MainActivityFragment(int contentLayoutId, int life01, int life02, int poison01, int poison02) {
        super(contentLayoutId);
        this.life01 = life01;
        this.life02 = life02;
        this.poison01 = poison01;
        this.poison02 = poison02;
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
}
