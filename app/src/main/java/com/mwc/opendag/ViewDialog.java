package com.mwc.opendag;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.net.Uri;

import com.estimote.notification.R;

public class ViewDialog extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int minorId = intent.getIntExtra("minorId", 0);

        switch (minorId) {
            case 58703:
                show58703Dialog();
                break;
            case 31953:
                show31953Dialog();
                break;
            case 36037:
                show36037Dialog();
                break;
            case 12181:
                show12181Dialog();
                break;
            case 42906:
                show42906Dialog();
                break;
        }
    }

    private void show58703Dialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog58703);
        Button buttonClose = (Button) dialog.findViewById(R.id.btn_dialog_close);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        dialog.show();
    }

    private void show31953Dialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog31953);
        Button buttonClose = (Button) dialog.findViewById(R.id.btn_dialog_close);
        Button buttonOpen = (Button) dialog.findViewById(R.id.btn_dialog_open);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        buttonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
                webOpen.setData(Uri.parse("http://www.wonakademie.nl/"));
                startActivity(webOpen);
            }
        });
        dialog.show();
    }

    private void show36037Dialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog36037);
        Button buttonClose = (Button) dialog.findViewById(R.id.btn_dialog_close);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        dialog.show();
    }

    private void show12181Dialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog12181);
        Button buttonClose = (Button) dialog.findViewById(R.id.btn_dialog_close);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        dialog.show();
    }

    private void show42906Dialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog42906);
        Button buttonClose = (Button) dialog.findViewById(R.id.btn_dialog_close);
        Button buttonOpen = (Button) dialog.findViewById(R.id.btn_dialog_open);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        buttonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webOpen = new Intent(android.content.Intent.ACTION_VIEW);
                webOpen.setData(Uri.parse("https://forms.office.com/Pages/ResponsePage.aspx?id=flgqeTZ2OUOmnRloFHmBZbt4zQ4BMvdErqZX5T7aGWZURERQREtSMUNTRU9YWE5PNUhKRTBaSThOSy4u"));
                startActivity(webOpen);
            }
        });
        dialog.show();
    }
}