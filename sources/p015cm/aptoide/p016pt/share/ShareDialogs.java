package p015cm.aptoide.p016pt.share;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.C0074c;
import com.bumptech.glide.p162p.p163l.C6285g;
import com.bumptech.glide.p162p.p164m.C6296d;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p128t.C12889e;

/* renamed from: cm.aptoide.pt.share.ShareDialogs */
public class ShareDialogs {

    /* renamed from: cm.aptoide.pt.share.ShareDialogs$ShareResponse */
    public enum ShareResponse {
        USING
    }

    /* renamed from: a */
    static /* synthetic */ void m7265a(Context context, String str, String str2, C12475j jVar) {
        C0074c.C0075a aVar = new C0074c.C0075a(context);
        aVar.mo230b((CharSequence) str);
        aVar.mo213a((int) C1086R.array.store_share_options_array, (DialogInterface.OnClickListener) new C4236a(jVar));
        final C0074c a = aVar.mo225a();
        ImageLoader.with(context).loadIntoTarget(str2, new C6285g<Drawable>() {
            public void onResourceReady(Drawable drawable, C6296d<? super Drawable> dVar) {
                C0074c.this.mo205a(drawable);
            }
        });
        jVar.add(C12889e.m41501a(new C4238c(a)));
        a.show();
    }

    public static C5368e<ShareResponse> createStoreShareDialog(Context context, String str, String str2) {
        return C5368e.m10241a(new C4237b(context, str, str2));
    }

    /* renamed from: a */
    static /* synthetic */ void m7267a(C12475j jVar, DialogInterface dialogInterface, int i) {
        if (!jVar.isUnsubscribed() && i == 0) {
            jVar.onNext(ShareResponse.USING);
            jVar.onCompleted();
        }
    }
}
