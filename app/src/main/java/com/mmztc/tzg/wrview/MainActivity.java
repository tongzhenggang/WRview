package com.mmztc.tzg.wrview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mmztc.tzg.wrview.R;
import com.tzg.wheelrecyclerView.WRView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WRView wheelMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wheelMain = (WRView) this.findViewById(R.id.wheel_main);
        init();
    }

    private void init() {


        List<String> mData = new ArrayList<>();
        mData.add("中号收纳箱，加大加厚，破损包赔，不变形，轻松收纳，精彩生活，每个家庭总少不了2三个收纳箱，家庭好帮手，赶紧秒起来吧。");
        mData.add("中号收纳箱，加大加厚，破损包赔，不变形，轻松收纳，精彩生活，每个家庭总少不了2三个收纳箱，家庭好帮手，赶紧秒起来吧。");
        mData.add("中号收纳箱，加大加厚，破损包赔，不变形，轻松收纳，精彩生活，每个家庭总少不了2三个收纳箱，家庭好帮手，赶紧秒起来吧。");
        wheelMain.setData(mData);
        wheelMain.setPosition(1);//默认选中第二个

        wheelMain.setOnSelectListener(new WRView.OnSelectListener() {
            @Override
            public void onSelect(int position, String data) {
                Log.d("setOnSelectListener", "onSelect>>>position=" + position + " data=" + data);
            }
        });
    }
}
