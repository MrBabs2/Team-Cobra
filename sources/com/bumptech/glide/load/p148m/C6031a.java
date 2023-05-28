package com.bumptech.glide.load.p148m;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.m.a */
/* compiled from: AssetFileDescriptorLocalUriFetcher */
public final class C6031a extends C6049l<AssetFileDescriptor> {
    public C6031a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AssetFileDescriptor m12079a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20325a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* renamed from: a */
    public Class<AssetFileDescriptor> mo20323a() {
        return AssetFileDescriptor.class;
    }
}
