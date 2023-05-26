package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzctp implements zzcva<zzcto> {

    /* renamed from: a */
    private final zzbbl f20936a;

    /* renamed from: b */
    private final zzcxv f20937b;

    /* renamed from: c */
    private final PackageInfo f20938c;

    /* renamed from: d */
    private final zzaxb f20939d;

    public zzctp(zzbbl zzbbl, zzcxv zzcxv, PackageInfo packageInfo, zzaxb zzaxb) {
        this.f20936a = zzbbl;
        this.f20937b = zzcxv;
        this.f20938c = packageInfo;
        this.f20939d = zzaxb;
    }

    /* renamed from: a */
    public final zzbbh<zzcto> mo25785a() {
        return this.f20936a.mo27892a(new C7665ko(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcto mo28791b() throws Exception {
        ArrayList<String> arrayList = this.f20937b.f21170g;
        if (arrayList == null) {
            return C7702lo.f16177a;
        }
        if (arrayList.isEmpty()) {
            return C7739mo.f16253a;
        }
        return new C7776no(this, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28790a(ArrayList arrayList, Bundle bundle) {
        int i;
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.f20937b.f21171h);
        String str = "landscape";
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17795F1)).booleanValue() && this.f20937b.f21172i.f18042f > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i2 = this.f20937b.f21172i.f18049m;
            String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "square" : "portrait" : str : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i3 = this.f20937b.f21172i.f18044h;
        if (i3 == 0) {
            str = "any";
        } else if (i3 == 1) {
            str = "portrait";
        } else if (i3 != 2) {
            str = "unknown";
        }
        if (!"unknown".equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.f20937b.f21172i.f18045i);
        bundle.putBoolean("use_custom_mute", this.f20937b.f21172i.f18048l);
        PackageInfo packageInfo = this.f20938c;
        if (packageInfo == null) {
            i = 0;
        } else {
            i = packageInfo.versionCode;
        }
        if (i > this.f20939d.mo27788k()) {
            this.f20939d.mo27790m();
            this.f20939d.mo27766a(i);
        }
        JSONObject c = this.f20939d.mo27777c();
        String jSONArray = (c == null || (optJSONArray = c.optJSONArray(this.f20937b.f21169f)) == null) ? null : optJSONArray.toString();
        if (!TextUtils.isEmpty(jSONArray)) {
            bundle.putString("native_advanced_settings", jSONArray);
        }
        int i4 = this.f20937b.f21175l;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzaiy zzaiy = this.f20937b.f21166c;
        if (zzaiy != null) {
            int i5 = zzaiy.f18144f;
            String str3 = "l";
            if (i5 != 1) {
                if (i5 != 2) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Instream ad video aspect ratio ");
                    sb.append(i5);
                    sb.append(" is wrong.");
                    zzbad.m20519b(sb.toString());
                } else {
                    str3 = "p";
                }
            }
            bundle.putString("ia_var", str3);
            bundle.putBoolean("instr", true);
        }
        if (this.f20937b.mo28816a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }
}
