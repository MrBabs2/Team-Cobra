package p015cm.aptoide.p016pt.comments.view;

import android.view.View;
import android.widget.TextView;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListCommentsRequest;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.comments.view.CommentsReadMoreWidget */
public class CommentsReadMoreWidget extends Widget<CommentsReadMoreDisplayable> {
    private TextView readMoreButton;

    public CommentsReadMoreWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    static /* synthetic */ C5368e m5118a(C5368e eVar, Void voidR) {
        return eVar;
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.readMoreButton = (TextView) view.findViewById(C1086R.C1088id.read_more_button);
    }

    public void bindView(CommentsReadMoreDisplayable commentsReadMoreDisplayable, int i) {
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.readMoreButton).mo18687f(new C1972d0(ListCommentsRequest.m5259of(commentsReadMoreDisplayable.getResourceId(), commentsReadMoreDisplayable.getNext(), 100, commentsReadMoreDisplayable.isReview(), ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient(), WebService.getDefaultConverter(), ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).observe())).mo18675c(new C1969c0(commentsReadMoreDisplayable)));
    }
}
