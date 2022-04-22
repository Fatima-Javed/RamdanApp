package com.example.ramadan_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class iftar extends Fragment {
    View view;
    ArrayList<contact> Contacts=new ArrayList<>();
    private RecyclerView myrecyclerview;
    public iftar(){
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view  = inflater.inflate(R.layout.fragment_iftar, container, false);
        myrecyclerview=(RecyclerView) view.findViewById(R.id.recyclerContact);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(getContext(),Contacts);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Contacts = new ArrayList<>();
        Contacts.add(new contact("2 April,2022", "Ramadan 1 ", "4:27 AM", "6:32 PM"));
        Contacts.add(new contact("3 April,2022", "Ramadan 2 ", "4:26 AM", "6:33 PM"));
        Contacts.add(new contact("4 April,2022", "Ramadan 3 ", "4:25 AM", "6:34 PM"));
        Contacts.add(new contact("5 April,2022","Ramadan 4 ","4:24 AM","6:35 PM"));
        Contacts.add(new contact("6 April,2022","Ramadan 5 ","4:23 AM","6:36 PM"));
        Contacts.add(new contact("7 April,2022","Ramadan 6 ","4:22 AM","6:37 PM"));
        Contacts.add(new contact("8 April,2022","Ramadan 7 ","4:21 AM","6:38 PM"));
        Contacts.add(new contact("9 April,2022","Ramadan 8 ","4:20 AM","6:39 PM"));
        Contacts.add(new contact("10 April,2022","Ramadan 9 ","4:19 AM","6:39 PM"));
        Contacts.add(new contact("11 April,2022","Ramadan 10 ","4:18 AM","6:40 PM"));
        Contacts.add(new contact("12 April,2022","Ramadan 11 ","4:17 AM","6:40 PM"));
        Contacts.add(new contact("13 April,2022","Ramadan 12 ","4:16 AM","6:40 PM"));
        Contacts.add(new contact("14 April,2022","Ramadan 13 ","4:15 AM","6:41 PM"));
        Contacts.add(new contact("15 April,2022","Ramadan 14 ","4:14 AM","6:41 PM"));
        Contacts.add(new contact("16 April,2022","Ramadan 15 ","4:13 AM","6:42 PM"));
        Contacts.add(new contact("17 April,2022","Ramadan 16 ","4:12 AM","6:43 PM"));
        Contacts.add(new contact("18 April,2022","Ramadan 17 ","4:11 AM","6:44 PM"));
        Contacts.add(new contact("19 April,2022","Ramadan 18 ","4:10 AM","6:44 PM"));
        Contacts.add(new contact("20 April,2022","Ramadan 19 ","4:09 AM","6:45 PM"));
        Contacts.add(new contact("21 April,2022","Ramadan 20 ","4:08 AM","6:46 PM"));
        Contacts.add(new contact("22 April,2022","Ramadan 21 ","4:07 AM","6:47 PM"));
        Contacts.add(new contact("23 April,2022","Ramadan 22 ","4:06 AM","6:48 PM"));
        Contacts.add(new contact("24 April,2022","Ramadan 23 ","4:05 AM","6:48 PM"));
        Contacts.add(new contact("25 April,2022","Ramadan 24 ","3:59 AM","6:49 PM"));
        Contacts.add(new contact("26 April,2022","Ramadan 25 ","3:57 AM","6:50 PM"));
        Contacts.add(new contact("27 April,2022","Ramadan 26 ","3:56 AM","6:51 PM"));
        Contacts.add(new contact("28 April,2022","Ramadan 27 ","3:54 AM","6:51 PM"));
        Contacts.add(new contact("29 April,2022","Ramadan 28 ","3:51 AM","6:52 PM"));
        Contacts.add(new contact("30 April,2022","Ramadan 29 ","3:50 AM","6:53 PM"));
        Contacts.add(new contact("1 March,2022","Ramadan 30 ","3:49 AM","6:54 PM"));
    }
}
