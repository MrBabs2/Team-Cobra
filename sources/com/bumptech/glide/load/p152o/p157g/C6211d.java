package com.bumptech.glide.load.p152o.p157g;

import android.util.Log;
import com.bumptech.glide.load.C5903c;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6029k;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.p166r.C6302a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.o.g.d */
/* compiled from: GifDrawableEncoder */
public class C6211d implements C6029k<C6209c> {
    /* renamed from: a */
    public C5903c mo20321a(C6027i iVar) {
        return C5903c.SOURCE;
    }

    /* renamed from: a */
    public boolean mo20068a(C5992u<C6209c> uVar, File file, C6027i iVar) {
        try {
            C6302a.m12950a(uVar.get().mo20509b(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
