package p015cm.aptoide.p016pt.comments.view;

import android.view.View;
import androidx.fragment.app.C0462h;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.p016pt.comments.view.StoreLatestCommentsWidget;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.comments.view.k1 */
/* compiled from: lambda */
public final /* synthetic */ class C1994k1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ StoreLatestCommentsWidget.CommentListAdapter f4620f;

    /* renamed from: g */
    private final /* synthetic */ long f4621g;

    /* renamed from: h */
    private final /* synthetic */ Comment f4622h;

    /* renamed from: i */
    private final /* synthetic */ String f4623i;

    /* renamed from: j */
    private final /* synthetic */ C0462h f4624j;

    /* renamed from: k */
    private final /* synthetic */ C5368e f4625k;

    /* renamed from: l */
    private final /* synthetic */ View f4626l;

    public /* synthetic */ C1994k1(StoreLatestCommentsWidget.CommentListAdapter commentListAdapter, long j, Comment comment, String str, C0462h hVar, C5368e eVar, View view) {
        this.f4620f = commentListAdapter;
        this.f4621g = j;
        this.f4622h = comment;
        this.f4623i = str;
        this.f4624j = hVar;
        this.f4625k = eVar;
        this.f4626l = view;
    }

    public final Object call(Object obj) {
        return this.f4620f.mo7981a(this.f4621g, this.f4622h, this.f4623i, this.f4624j, this.f4625k, this.f4626l, (Account) obj);
    }
}
