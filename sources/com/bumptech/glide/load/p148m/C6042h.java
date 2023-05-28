package com.bumptech.glide.load.p148m;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.m.h */
/* compiled from: FileDescriptorAssetPathFetcher */
public class C6042h extends C6032b<ParcelFileDescriptor> {
    public C6042h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor m12108a(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20328a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo20323a() {
        return ParcelFileDescriptor.class;
    }
}
