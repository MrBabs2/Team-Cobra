package p015cm.aptoide.p016pt.store.view;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.dataprovider.util.CommentType;
import p015cm.aptoide.p016pt.store.view.StoreGridHeaderDisplayable;
import p015cm.aptoide.p016pt.view.Translator;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;

/* renamed from: cm.aptoide.pt.store.view.StoreGridHeaderWidget */
public class StoreGridHeaderWidget extends Widget<StoreGridHeaderDisplayable> {
    private Button more;
    private TextView title;

    public StoreGridHeaderWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    static /* synthetic */ void m7347a(GetStoreWidgets.WSWidget wSWidget, StoreGridHeaderDisplayable.Model model, SharedPreferences sharedPreferences, StoreGridHeaderDisplayable storeGridHeaderDisplayable, Void voidR) {
        Event event = wSWidget.getActions().get(0).getEvent();
        String storeTheme = model.getStoreTheme();
        String tag = model.getTag();
        StoreContext storeContext = model.getStoreContext();
        String title2 = wSWidget.getTitle();
        if (event.getName() == Event.Name.listComments) {
            String action = event.getAction();
            storeGridHeaderDisplayable.getStoreTabNavigator().navigateToCommentGridRecyclerView(CommentType.STORE, action != null ? action.replace(C2185V7.getHost(sharedPreferences), "") : null, "View Comments", storeContext);
            return;
        }
        storeGridHeaderDisplayable.getStoreTabNavigator().navigateToStoreTabGridRecyclerView(event, title2, storeTheme, tag, storeContext, true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.title = (TextView) view.findViewById(C1086R.C1088id.title);
        this.more = (Button) view.findViewById(C1086R.C1088id.more);
    }

    public void bindView(StoreGridHeaderDisplayable storeGridHeaderDisplayable, int i) {
        GetStoreWidgets.WSWidget wsWidget = storeGridHeaderDisplayable.getWsWidget();
        boolean hasActions = wsWidget.hasActions();
        String marketName = storeGridHeaderDisplayable.getMarketName();
        SharedPreferences defaultSharedPreferences = ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences();
        this.title.setText(Translator.translate(wsWidget.getTitle(), getContext().getApplicationContext(), marketName));
        StoreGridHeaderDisplayable.Model model = storeGridHeaderDisplayable.getModel();
        this.more.setTextColor(storeGridHeaderDisplayable.getTextColor());
        this.more.setVisibility((!hasActions || !model.isMoreVisible()) ? 8 : 0);
        if (hasActions) {
            this.compositeSubscription.mo18721a(C10695a.m36221a(this.more).mo18675c(new C4349q1(wsWidget, model, defaultSharedPreferences, storeGridHeaderDisplayable)));
        }
    }
}
