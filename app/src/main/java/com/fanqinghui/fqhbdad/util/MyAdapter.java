package com.fanqinghui.fqhbdad.util;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.androidquery.AQuery;
import com.baidu.mobad.feeds.NativeResponse;
import com.fanqinghui.fqhbdad.R;

/*
class MyAdapter extends BaseAdapter {
        LayoutInflater inflater;

        public MyAdapter(Context context) {
            super();
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return nrAdList.size();
        }

        @Override
        public NativeResponse getItem(int position) {
            return nrAdList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            NativeResponse nrAd = getItem(position);
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.native_ad_row, null);
            }
            AQuery aq = new AQuery(convertView);
            aq.id(R.id.native_icon_image).image(nrAd.getIconUrl(), false, true);
            aq.id(R.id.native_main_image).image(nrAd.getImageUrl(), false, true);
            aq.id(R.id.native_text).text(nrAd.getDesc());
            aq.id(R.id.native_title).text(nrAd.getTitle());
            aq.id(R.id.native_brand_name).text(nrAd.getBrandName());
            String text = nrAd.isDownloadApp() ? "下载" : "查看";
            aq.id(R.id.native_cta).text(text);
            nrAd.recordImpression(convertView);
            return convertView;
        }
}*/
