package p015cm.aptoide.p016pt.social.data;

import android.view.View;

/* renamed from: cm.aptoide.pt.social.data.AdResponse */
public class AdResponse {
    private final Status status;
    private final View view;

    /* renamed from: cm.aptoide.pt.social.data.AdResponse$Status */
    public enum Status {
        error,
        ok
    }

    public AdResponse(View view2, Status status2) {
        this.view = view2;
        this.status = status2;
    }

    public Status getStatus() {
        return this.status;
    }

    public View getView() {
        return this.view;
    }
}
