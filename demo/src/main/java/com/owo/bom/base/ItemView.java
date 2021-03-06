package com.owo.bom.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.owo.bom.R;

/**
 * Created by wangli on 16-10-20.
 */
public class ItemView extends LinearLayout {
  private FrameLayout mCover;
  private TextView mTitle;
  private TextView mDescription;

  public ItemView(Context context) {
    super(context);
    LayoutInflater.from(context).inflate(R.layout.grid_item, this, true);
    mCover = (FrameLayout) findViewById(R.id.cover);
    mTitle = (TextView) findViewById(R.id.title);
    mDescription = (TextView) findViewById(R.id.desc);
  }

  public void update(DataItem item) {
    mTitle.setText(item.getTitle());
    mDescription.setText(item.getDescription());
    mCover.removeAllViews();
    //  ViewUtil.clearParent(item.getCover());
    mCover.addView(new View(item.getCover().getContext()),
                   new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                                                FrameLayout.LayoutParams.MATCH_PARENT));
  }
}
