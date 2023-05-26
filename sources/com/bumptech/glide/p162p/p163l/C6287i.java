package com.bumptech.glide.p162p.p163l;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p159m.C6240i;
import com.bumptech.glide.p162p.C6268d;
import com.bumptech.glide.p162p.p164m.C6296d;

/* renamed from: com.bumptech.glide.p.l.i */
/* compiled from: Target */
public interface C6287i<R> extends C6240i {
    C6268d getRequest();

    void getSize(C6286h hVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, C6296d<? super R> dVar);

    void removeCallback(C6286h hVar);

    void setRequest(C6268d dVar);
}
