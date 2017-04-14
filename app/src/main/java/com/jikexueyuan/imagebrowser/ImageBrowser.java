package com.jikexueyuan.imagebrowser;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageBrowser extends Activity {

    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_browser);

        imgView = new ImageView(this);
        imgView.setImageURI(getIntent().getData());
        setContentView(imgView);

    }
}
