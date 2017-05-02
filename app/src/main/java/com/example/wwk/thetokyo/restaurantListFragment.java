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
public class restaurantListFragment extends Fragment {


    public restaurantListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.field_list, container, false);

        // add words about contents (an array)
        final ArrayList<contents> Spots = new ArrayList<contents>();


        Spots.add(new contents("鮨 さいとう",
                "東京都 港区 六本木 1-4-5 アークヒルズサウスタワー 1Ｆ", R.drawable.ic_launcher_round));
        Spots.add(new contents("松川",
                "東京都 港区 赤坂 1-11-6 赤坂テラスハウス １階", R.drawable.ic_launcher_round));
        Spots.add(new contents("カンテサンス",
                "東京都 品川区 北品川 6-7-29 ガーデンシティ品川 御殿山 1F", R.drawable.ic_launcher_round));
        Spots.add(new contents("すぎた",
                "東京都 中央区 日本橋蛎殻町 1-33-6 ビューハイツ日本橋 B1F", R.drawable.ic_launcher_round));
        Spots.add(new contents("しのはら",
                "東京都 中央区 銀座 2-8-17 ハビウル銀座2 B1", R.drawable.ic_launcher_round));
        Spots.add(new contents("と村",
                "東京都 港区 虎ノ門 1-11-14 第二ジェスペールビル　１Ｆ", R.drawable.ic_launcher_round));
        Spots.add(new contents("かぶと",
                "東京都 豊島区 池袋 2-53-2 池袋ESビル 1F", R.drawable.ic_launcher_round));
        Spots.add(new contents("SATOブリアン にごう",
                "東京都 杉並区 阿佐ヶ谷南2-17-2", R.drawable.ic_launcher_round));
        Spots.add(new contents("味満ん",
                "東京都 港区 六本木 3-8-8 ＷＯＯビル　１Ｆ", R.drawable.ic_launcher_round));
        Spots.add(new contents("鳥しき",
                "東京都 品川区 上大崎 2-14-12", R.drawable.ic_launcher_round));
        Spots.add(new contents("炭焼 金竜山",
                "東京都 港区 白金 3-14-1 第１マンション　１Ｆ", R.drawable.ic_launcher_round));

        /**
         * Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list, using the
         * simple_list_item_1.xml layout resource defined in the Android framework.
         * This list item layout contains a single {@link TextView}, which the adapter will set to
         * display a single word.
         */
        contentsAdapter itemsAdapter = new contentsAdapter(getActivity(), Spots, R.color.category_restaurant);
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
