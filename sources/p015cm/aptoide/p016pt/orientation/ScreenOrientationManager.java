package p015cm.aptoide.p016pt.orientation;

import android.app.Activity;
import android.view.WindowManager;

/* renamed from: cm.aptoide.pt.orientation.ScreenOrientationManager */
public class ScreenOrientationManager {
    private final Activity activity;
    private final WindowManager windowManager;

    public ScreenOrientationManager(Activity activity2, WindowManager windowManager2) {
        this.activity = activity2;
        this.windowManager = windowManager2;
    }

    public void lock() {
        int rotation = this.windowManager.getDefaultDisplay().getRotation();
        int i = 1;
        if (rotation == 1) {
            i = 0;
        } else if (rotation == 2) {
            i = 9;
        } else if (rotation == 3) {
            i = 8;
        }
        this.activity.setRequestedOrientation(i);
    }

    public void unlock() {
        this.activity.setRequestedOrientation(-1);
    }
}
