package com.estimote.notification;

import android.view.Window;

/**
 * Created by reloa on 2-2-2017.
 */

public class WindowInitializer {
    private final Runnable onopen;
    private WindowInitializer provious;
    public WindowInitializer(Runnable on_open, WindowInitializer provious_window)
    {
        this.onopen = on_open;
        this.provious = provious_window;
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
            this.provious.onopen.run();
        }
        return this;
    }
    public WindowInitializer Open()
    {
        onopen.run();
        return this;
    }
}
