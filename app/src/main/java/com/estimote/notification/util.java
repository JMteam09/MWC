package com.estimote.notification;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by reloa on 19-1-2017.
 */

public class util {
    public static void showdialog(Activity target, String text, String button){
        showdialog(target,text,button,-1);
    }
    public static void showdialog(Activity target, String text, String button, int id){
        final Dialog d = new Dialog(target);
        d.setCancelable(false);
        try {
            d.requestWindowFeature(Window.FEATURE_NO_TITLE);
            d.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(100,255,255,255)));
        } catch (Exception e){}
        View v =  MainActivity.ME.getLayoutInflater().inflate(R.layout.dialog, null);
        d.setContentView(v);
        d.show();
        Button b = (Button) d.findViewById(R.id.Dialog_button);
        TextView message = (TextView) d.findViewById(R.id.Dialog_Text);
        ImageView img = (ImageView) d.findViewById(R.id.Dialog_Image);
        b.setText(button);
        message.setText(text);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.setCancelable(true);
                d.cancel();
            }
        });
    }
}
