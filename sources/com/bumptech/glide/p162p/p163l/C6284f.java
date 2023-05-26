package com.bumptech.glide.p162p.p163l;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bumptech.glide.p162p.p164m.C6296d;
import com.bumptech.glide.p166r.C6315j;

/* renamed from: com.bumptech.glide.p.l.f */
/* compiled from: NotificationTarget */
public class C6284f extends C6285g<Bitmap> {

    /* renamed from: f */
    private final RemoteViews f11518f;

    /* renamed from: g */
    private final Context f11519g;

    /* renamed from: h */
    private final int f11520h;

    /* renamed from: i */
    private final String f11521i;

    /* renamed from: j */
    private final Notification f11522j;

    /* renamed from: k */
    private final int f11523k;

    /* renamed from: b */
    private void m12912b() {
        NotificationManager notificationManager = (NotificationManager) this.f11519g.getSystemService("notification");
        C6315j.m12978a(notificationManager);
        notificationManager.notify(this.f11521i, this.f11520h, this.f11522j);
    }

    /* renamed from: a */
    public void onResourceReady(Bitmap bitmap, C6296d<? super Bitmap> dVar) {
        this.f11518f.setImageViewBitmap(this.f11523k, bitmap);
        m12912b();
    }
}
