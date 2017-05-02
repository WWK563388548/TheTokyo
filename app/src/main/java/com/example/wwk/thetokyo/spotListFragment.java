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
        Spots.add(new contents("东京铁塔",
                "4 Chome-2-8 Shibakoen, Minato, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("浅草寺",
                "2 Chome-3-1 Asakusa, Taito, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("筑地市场",
                "5 Chome-2-1 Tsukiji, Chuo, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("东京国立博物馆",
                "13-9 Uenokoen, Taito, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("歌舞伎町",
                "1-1, Shinjuku, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("江户城",
                "1−1, Chiyoda, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("皇居",
                "1-1, Chiyoda, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("新宿御苑",
                "11 Naitomachi, Shinjuku, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("明治神宫",
                "1-1 Yoyogikamizonocho, Shibuya, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("国立科学博物馆",
                "7-20 Uenokoen, Taito, Tokyo", R.drawable.ic_launcher_round));
        Spots.add(new contents("国立新美术馆",
                "7 Chome-22-2 Roppongi, Minato, Toky", R.drawable.ic_launcher_round));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list, using the
         * simple_list_item_1.xml layout resource defined in the Android framework.
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
