package com.bumptech.glide.load.p150n;

import android.util.Log;
import com.bumptech.glide.load.C5904d;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.p166r.C6302a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.n.c */
/* compiled from: ByteBufferEncoder */
public class C6070c implements C5904d<ByteBuffer> {
    /* renamed from: a */
    public boolean mo20068a(ByteBuffer byteBuffer, File file, C6027i iVar) {
        try {
            C6302a.m12950a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
