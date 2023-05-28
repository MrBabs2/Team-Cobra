package p015cm.aptoide.p016pt.navigator;

import android.content.Intent;

/* renamed from: cm.aptoide.pt.navigator.Result */
public class Result {
    private final Intent data;
    private final int requestCode;
    private final int resultCode;

    public Result(int i, int i2, Intent intent) {
        this.requestCode = i;
        this.resultCode = i2;
        this.data = intent;
    }

    public Intent getData() {
        return this.data;
    }

    public int getRequestCode() {
        return this.requestCode;
    }

    public int getResultCode() {
        return this.resultCode;
    }
}
