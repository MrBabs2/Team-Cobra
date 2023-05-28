package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {

    /* renamed from: f */
    private AbstractWindowedCursor f14245f;

    @KeepForSdk
    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.f14245f.fillWindow(i, cursorWindow);
    }

    @KeepForSdk
    public CursorWindow getWindow() {
        return this.f14245f.getWindow();
    }

    public /* synthetic */ Cursor getWrappedCursor() {
        return this.f14245f;
    }

    public boolean onMove(int i, int i2) {
        return this.f14245f.onMove(i, i2);
    }
}
