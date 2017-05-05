package com.example.wwk.thetokyo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class spotListFragment extends Fragment {


    public spotListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.field_list, container, false);

        // add words about contents (an array)
        final ArrayList<contents> Spots = new ArrayList<contents>();

        // I use icon as placeholder instead of real image
        // 〒100-8111
        Spots.add(new contents(getString(R.string.spot1_name),
                getString(R.string.spot1_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot2_name),
                getString(R.string.spot2_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot3_name),
                getString(R.string.spot3_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot4_name),
                getString(R.string.spot4_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot5_name),
                getString(R.string.spot5_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot6_name),
                getString(R.string.spot6_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot7_name),
                getString(R.string.spot7_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot8_name),
                getString(R.string.spot8_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot9_name),
                getString(R.string.spot9_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot10_name),
                getString(R.string.spot10_address), R.drawable.ic_launcher_round));
        Spots.add(new contents(getString(R.string.spot11_name),
                getString(R.string.spot11_address), R.drawable.ic_launcher_round));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list, using the
         * layout resource defined in the Android framework.
         * This list item layout contains a single {@link TextView}, which the adapter will set to
         * display a single word.
         */
        contentsAdapter itemsAdapter = new contentsAdapter(getActivity(), Spots, R.color.category_spot);
        // android框架预定义了一个xml文件，叫做simple_list_item_1，我们可以直接使用
        // 最后一个参数是对象列表，既ArrayAdapter的数据来源
        // 需要传入两个列表参数，因为需要一个日语和一个中文翻译
        // 所以创建我们自己的对象 words类，并通过它来创建words对象

        /**
         * Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         * There should be a {@link ListView} with the view ID called list, which is declared in the
         * word_list.xml file.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**
         * Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
         * {@link ListView} will display list items for each word in the list of words.
         * Do this by calling the setAdapter method on the {@link ListView} object and pass in
         * 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
         */
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
