package com.example.wwk.thetokyo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelListFragment extends Fragment {


    public HotelListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.field_list, container, false);

        // add words about contents (an array)
        final ArrayList<Contents> Spots = new ArrayList<Contents>();

        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.hotel1_name),
                getString(R.string.hotel1_address), R.drawable.ic_launcher_round));

        ContentsAdapter itemsAdapter = new ContentsAdapter(getActivity(), Spots, R.color.category_hotel);
        // android框架预定义了一个xml文件，叫做simple_list_item_1，我们可以直接使用
        // 最后一个参数是对象列表，既ArrayAdapter的数据来源
        // 需要传入两个列表参数，因为需要一个日语和一个中文翻译
        // 所以创建我们自己的对象 words类，并通过它来创建words对象

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
