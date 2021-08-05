package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chatapp.Fragments.ChatsFragment;
import com.example.chatapp.Fragments.UsersFragment;

public class PageAdapter extends FragmentPagerAdapter {

    int tabCount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new ChatsFragment();
        }
        if(position == 1){
            return new UsersFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
