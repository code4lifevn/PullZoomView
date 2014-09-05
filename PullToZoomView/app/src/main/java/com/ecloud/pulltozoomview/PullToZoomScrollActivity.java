package com.ecloud.pulltozoomview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2014/9/4  17:30.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2014/9/4        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class PullToZoomScrollActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_to_zoom_scroll_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        } else if (id == R.id.action_settings) {
            loadViewForCode();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void loadViewForCode() {
        PullToZoomScrollView scrollView = (PullToZoomScrollView) findViewById(R.id.scroll_view);
        View headView = LayoutInflater.from(this).inflate(R.layout.profile_head_view, null, false);
        View zoomView = LayoutInflater.from(this).inflate(R.layout.profile_zoom_view, null, false);
        View contentView = LayoutInflater.from(this).inflate(R.layout.profile_content_view, null, false);
        scrollView.setHeaderContainer(headView);
        scrollView.setZoomView(zoomView);
        scrollView.setContentContainerView(contentView);
    }
}
