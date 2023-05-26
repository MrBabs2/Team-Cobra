package p015cm.aptoide.p016pt.home.apps.list.models;

import android.widget.TextView;
import com.airbnb.epoxy.C5635t;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p218e0.C9132c;
import p015cm.aptoide.p016pt.C1086R;
import p112n.p272c.p273a.p274a.p275a.p276a.C10557a;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/TitleModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/home/apps/list/models/TitleModel$Holder;", "()V", "eventSubject", "Lrx/subjects/PublishSubject;", "Ljava/lang/Void;", "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "shouldShowButton", "", "getShouldShowButton", "()Z", "setShouldShowButton", "(Z)V", "title", "", "getTitle", "()Ljava/lang/Integer;", "setTitle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bind", "", "holder", "Holder", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.TitleModel */
/* compiled from: TitleModel.kt */
public abstract class TitleModel extends C5635t<Holder> {
    private C12871b<Void> eventSubject;
    private boolean shouldShowButton;
    private Integer title;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/models/TitleModel$Holder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "button", "Landroid/widget/TextView;", "getButton", "()Landroid/widget/TextView;", "button$delegate", "Lkotlin/properties/ReadOnlyProperty;", "title", "getTitle", "title$delegate", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.apps.list.models.TitleModel$Holder */
    /* compiled from: TitleModel.kt */
    public static final class Holder extends C10557a {
        static final /* synthetic */ C9168l[] $$delegatedProperties;
        private final C9132c button$delegate = bind(C1086R.C1088id.apps_header_button);
        private final C9132c title$delegate = bind(C1086R.C1088id.apps_header_title);

        static {
            Class<Holder> cls = Holder.class;
            $$delegatedProperties = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "title", "getTitle()Landroid/widget/TextView;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "button", "getButton()Landroid/widget/TextView;"))};
        }

        public final TextView getButton() {
            return (TextView) this.button$delegate.mo33478a(this, $$delegatedProperties[1]);
        }

        public final TextView getTitle() {
            return (TextView) this.title$delegate.mo33478a(this, $$delegatedProperties[0]);
        }
    }

    public final C12871b<Void> getEventSubject() {
        return this.eventSubject;
    }

    public final boolean getShouldShowButton() {
        return this.shouldShowButton;
    }

    public final Integer getTitle() {
        return this.title;
    }

    public final void setEventSubject(C12871b<Void> bVar) {
        this.eventSubject = bVar;
    }

    public final void setShouldShowButton(boolean z) {
        this.shouldShowButton = z;
    }

    public final void setTitle(Integer num) {
        this.title = num;
    }

    public void bind(Holder holder) {
        C10202j.m34178b(holder, "holder");
        Integer num = this.title;
        if (num != null) {
            holder.getTitle().setText(holder.getItemView().getContext().getString(num.intValue()));
        }
        if (this.shouldShowButton) {
            holder.getButton().setVisibility(0);
        } else {
            holder.getButton().setVisibility(8);
        }
        holder.getButton().setOnClickListener(new TitleModel$bind$2(this));
    }
}
