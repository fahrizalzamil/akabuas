/**
 * NIM : 10120005
 * NAMA : Fahrizal Zamil Maripatullah
 * KELAS : IF-1
 */
package com.uas.notes.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uas.notes.R;

public class AboutPage2 extends Fragment {


    public AboutPage2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_page2, container, false);
    }
}