package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.view.app.FlagsVote;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.d7 */
/* compiled from: lambda */
public final /* synthetic */ class C1504d7 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AppViewPresenter f4019f;

    /* renamed from: g */
    private final /* synthetic */ FlagsVote.VoteType f4020g;

    public /* synthetic */ C1504d7(AppViewPresenter appViewPresenter, FlagsVote.VoteType voteType) {
        this.f4019f = appViewPresenter;
        this.f4020g = voteType;
    }

    public final Object call(Object obj) {
        return this.f4019f.mo7333a(this.f4020g, (AppModel) obj);
    }
}
