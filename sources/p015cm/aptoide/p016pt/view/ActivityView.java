package p015cm.aptoide.p016pt.view;

import com.trello.rxlifecycle.C4749b;
import com.trello.rxlifecycle.C4750c;
import com.trello.rxlifecycle.p209g.C9007a;
import p015cm.aptoide.p016pt.analytics.view.AnalyticsActivity;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.ActivityView */
public abstract class ActivityView extends AnalyticsActivity implements View {

    /* renamed from: cm.aptoide.pt.view.ActivityView$1 */
    static /* synthetic */ class C44911 {
        static final /* synthetic */ int[] $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.trello.rxlifecycle.g.a[] r0 = com.trello.rxlifecycle.p209g.C9007a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent = r0
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent     // Catch:{ NoSuchFieldError -> 0x003e }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.ActivityView.C44911.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: convertToEvent */
    public View.LifecycleEvent mo15110a(C9007a aVar) {
        switch (C44911.$SwitchMap$com$trello$rxlifecycle$android$ActivityEvent[aVar.ordinal()]) {
            case 1:
                return View.LifecycleEvent.CREATE;
            case 2:
                return View.LifecycleEvent.START;
            case 3:
                return View.LifecycleEvent.RESUME;
            case 4:
                return View.LifecycleEvent.PAUSE;
            case 5:
                return View.LifecycleEvent.STOP;
            case 6:
                return View.LifecycleEvent.DESTROY;
            default:
                throw new IllegalStateException("Unrecognized event: " + aVar.name());
        }
    }

    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    public final <T> C4749b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C4750c.m7795a(getLifecycleEvent(), lifecycleEvent);
    }

    public C5368e<View.LifecycleEvent> getLifecycleEvent() {
        return lifecycle().mo18694j(new C4587b(this));
    }
}
