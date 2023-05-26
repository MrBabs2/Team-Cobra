package p015cm.aptoide.p016pt.app.view.screenshots;

import android.view.View;
import java.util.ArrayList;

/* renamed from: cm.aptoide.pt.app.view.screenshots.a */
/* compiled from: lambda */
public final /* synthetic */ class C1802a implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ ScreenshotViewHolder f4385f;

    /* renamed from: g */
    private final /* synthetic */ ArrayList f4386g;

    /* renamed from: h */
    private final /* synthetic */ int f4387h;

    public /* synthetic */ C1802a(ScreenshotViewHolder screenshotViewHolder, ArrayList arrayList, int i) {
        this.f4385f = screenshotViewHolder;
        this.f4386g = arrayList;
        this.f4387h = i;
    }

    public final void onClick(View view) {
        this.f4385f.mo7708a(this.f4386g, this.f4387h, view);
    }
}
