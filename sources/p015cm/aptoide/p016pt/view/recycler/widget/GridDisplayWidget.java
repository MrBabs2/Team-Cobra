package p015cm.aptoide.p016pt.view.recycler.widget;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreDisplays;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.store.view.GridDisplayDisplayable;
import p015cm.aptoide.p016pt.store.view.StoreTabFragmentChooser;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.recycler.widget.GridDisplayWidget */
public class GridDisplayWidget extends Widget<GridDisplayDisplayable> {
    private ImageView imageView;

    /* renamed from: cm.aptoide.pt.view.recycler.widget.GridDisplayWidget$1 */
    static /* synthetic */ class C46731 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.Event$Name[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name = r0
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.facebook     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.twitch     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.Event$Name r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.youtube     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.recycler.widget.GridDisplayWidget.C46731.<clinit>():void");
        }
    }

    public GridDisplayWidget(View view) {
        super(view);
    }

    private void sendActionEvent(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.itemView.getContext().startActivity(intent);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo15721a(GetStoreDisplays.EventImage eventImage, GridDisplayDisplayable gridDisplayDisplayable, Void voidR) {
        Event event = eventImage.getEvent();
        Event.Name name = event.getName();
        if (StoreTabFragmentChooser.validateAcceptedName(name)) {
            getFragmentNavigator().navigateTo(StoreTabGridRecyclerFragment.newInstance(event, eventImage.getLabel(), gridDisplayDisplayable.getStoreTheme(), gridDisplayDisplayable.getTag(), gridDisplayDisplayable.getStoreContext(), false), true);
            return;
        }
        int i = C46731.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[name.ordinal()];
        sendActionEvent(event.getAction());
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.imageView = (ImageView) view.findViewById(C1086R.C1088id.image_category);
    }

    public void bindView(GridDisplayDisplayable gridDisplayDisplayable, int i) {
        GetStoreDisplays.EventImage eventImage = (GetStoreDisplays.EventImage) gridDisplayDisplayable.getPojo();
        ImageLoader.with(getContext()).load(eventImage.getGraphic(), this.imageView);
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.imageView).mo18655a(new C4677d(this, eventImage, gridDisplayDisplayable), (C5378b<Throwable>) C4676c.f7952f));
    }
}
