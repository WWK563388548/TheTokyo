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
public class SpotListFragment extends Fragment {


    public SpotListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.field_list, container, false);

        // add words about contents (an array)
        final ArrayList<Contents> Spots = new ArrayList<Contents>();

        // I use icon as placeholder instead of real image
        // 〒100-8111
        Spots.add(new Contents(getString(R.string.spot1_name),
                getString(R.string.spot1_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot2_name),
                getString(R.string.spot2_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot3_name),
                getString(R.string.spot3_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot4_name),
                getString(R.string.spot4_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot5_name),
                getString(R.string.spot5_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot6_name),
                getString(R.string.spot6_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot7_name),
                getString(R.string.spot7_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot8_name),
                getString(R.string.spot8_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot9_name),
                getString(R.string.spot9_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot10_name),
                getString(R.string.spot10_address), R.drawable.ic_launcher_round));
        Spots.add(new Contents(getString(R.string.spot11_name),
                getString(R.string.spot11_address), R.drawable.ic_launcher_round));

        ContentsAdapter itemsAdapter = new ContentsAdapter(getActivity(), Spots, R.color.category_spot);
        // android框架预定义了一个xml文件，叫做simple_list_item_1，我们可以直接使用
        // 最后一个参数是对象列表，既ArrayAdapter的数据来源
        // 需要传入两个列表参数，因为需要一个日语和一个中文翻译
        // 所以创建我们自己的对象 words类，并通过它来创建words对象

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
