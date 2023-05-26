package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C7125R;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
public final class zzapu extends zzaqb {

    /* renamed from: c */
    private final Map<String, String> f18279c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f18280d;

    public zzapu(zzbgz zzbgz, Map<String, String> map) {
        super(zzbgz, "storePicture");
        this.f18279c = map;
        this.f18280d = zzbgz.mo25650a();
    }

    /* renamed from: a */
    public final void mo27546a() {
        if (this.f18280d == null) {
            mo27556a("Activity context is not available");
            return;
        }
        zzk.zzlg();
        if (!zzaxi.m20298e(this.f18280d).mo27151c()) {
            mo27556a("Feature is not supported by the device.");
            return;
        }
        String str = this.f18279c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo27556a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            mo27556a(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzk.zzlg();
            if (!zzaxi.m20296d(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                mo27556a(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources b = zzk.zzlk().mo27735b();
            zzk.zzlg();
            AlertDialog.Builder d = zzaxi.m20294d(this.f18280d);
            d.setTitle(b != null ? b.getString(C7125R.string.f13399s1) : "Save image");
            d.setMessage(b != null ? b.getString(C7125R.string.f13400s2) : "Allow Ad to store image in Picture gallery?");
            d.setPositiveButton(b != null ? b.getString(C7125R.string.f13401s3) : "Accept", new C7644k3(this, str, lastPathSegment));
            d.setNegativeButton(b != null ? b.getString(C7125R.string.f13402s4) : "Decline", new C7681l3(this));
            d.create().show();
        }
    }
}
