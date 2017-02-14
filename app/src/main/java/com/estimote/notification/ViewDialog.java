package com.estimote.notification;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewDialog extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int minorId = intent.getIntExtra("beaconMinor", 0);
        showDialog();
    }

    /* int layoutId = getResources().getIdentifier(String layoutname, "layout", getPackageName());
    dialog.setContentView(layoutId); */

    private void showDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);

        ImageView imageView = (ImageView) dialog.findViewById(R.id.header_img);
        TextView textViewTitle = (TextView) dialog.findViewById(R.id.title_dialog);
        TextView textViewMessage = (TextView) dialog.findViewById(R.id.text_dialog);
        Button buttonClose = (Button) dialog.findViewById(R.id.btn_dialog_close);
        Button buttonOpen = (Button) dialog.findViewById(R.id.btn_dialog_open);

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        dialog.show();
    }
}