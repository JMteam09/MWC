package com.estimote.notification;

import android.view.Window;

/**
 * Created by reloa on 2-2-2017.
 */

public class WindowInitializer {
    private final Runnable onopen;
    private WindowInitializer provious;
    public WindowInitializer(Runnable on_open)n
    {
        this.onopen = on_open;
        this.provious = MainActivity.current;
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
        MainActivity.current = this;
        onopen.run();
        return this;
    }
}
