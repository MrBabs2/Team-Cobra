package p015cm.aptoide.p016pt.view.feedback;

import android.content.Intent;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.feedback.c */
/* compiled from: lambda */
public final /* synthetic */ class C4624c implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ SendFeedbackFragment f7879f;

    /* renamed from: g */
    private final /* synthetic */ Intent f7880g;

    /* renamed from: h */
    private final /* synthetic */ String f7881h;

    public /* synthetic */ C4624c(SendFeedbackFragment sendFeedbackFragment, Intent intent, String str) {
        this.f7879f = sendFeedbackFragment;
        this.f7880g = intent;
        this.f7881h = str;
    }

    public final void call(Object obj) {
        this.f7879f.mo15583a(this.f7880g, this.f7881h, (RoomInstalled) obj);
    }
}
