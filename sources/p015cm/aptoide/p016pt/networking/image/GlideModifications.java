package p015cm.aptoide.p016pt.networking.image;

import android.content.Context;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.C5875d;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C5902b;
import com.bumptech.glide.load.engine.p144a0.C5925g;
import com.bumptech.glide.load.engine.p144a0.C5926h;
import com.bumptech.glide.load.engine.p144a0.C5928i;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.engine.p147z.C6013k;
import com.bumptech.glide.p160n.C6253b;
import com.bumptech.glide.p162p.C6273h;

/* renamed from: cm.aptoide.pt.networking.image.GlideModifications */
public class GlideModifications implements C6253b {
    public void applyOptions(Context context, C5875d dVar) {
        dVar.mo19970a(C6273h.m12844b(C5902b.PREFER_RGB_565));
        C5928i a = new C5928i.C5929a(context).mo20116a();
        dVar.mo19968a((C5926h) new C5925g((long) a.mo20115c()));
        dVar.mo19969a((C6004e) new C6013k((long) a.mo20114b()));
    }

    public void registerComponents(Context context, C5874c cVar, Registry registry) {
    }
}
