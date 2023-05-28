package com.bumptech.glide.load.p148m;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.m.m */
/* compiled from: StreamAssetPathFetcher */
public class C6050m extends C6032b<InputStream> {
    public C6050m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m12139a(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20328a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: a */
    public Class<InputStream> mo20323a() {
        return InputStream.class;
    }
}
