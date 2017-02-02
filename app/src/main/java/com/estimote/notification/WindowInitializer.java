package com.estimote.notification;

import android.view.Window;

/**
 * Created by reloa on 2-2-2017.
 */

public class WindowInitializer {
    private final Runnable onopen;
    private WindowInitializer provious;
    public WindowInitializer(Runnable on_open)
    {
        this.onopen = on_open;
    }
    public WindowInitializer Provious(){
        return this.provious;
    }
    public WindowInitializer ForceProvious(WindowInitializer new_init){
        this.provious = new_init;
        return this;
    }
    public WindowInitializer Back()
    {
        if (this.provious != null) {
            this.provious.Open();
        }
        return this;
    }
    public WindowInitializer Open()
    {
        this.provious = MainActivity.current;
        MainActivity.current = this;
        onopen.run();
        return this;
    }
}
