# WRview
2018-09-05 首次提交

''
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

	dependencies {
	        implementation 'com.github.tongzhenggang:WRview:1.0'
	}
''


''
    <com.tzg.wheelrecyclerView.WRView
        android:id="@+id/wheel_main"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#ffffff"
        android:layout_margin="10dp"
        android:overScrollMode="never"
        android:scrollbars="none"
        app:selectTextColor="#707070"
        app:selectTextSize="16sp"
        app:itemHeight="95dp"
        app:dividerColor="#dddddd"
        app:unselectTextColor="#9a9a9a"
        app:unselectTextSize="14sp"
        app:dividerWidth="80dp"/>
''

''
        wheelMain = (WRView) this.findViewById(R.id.wheel_main);

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
''