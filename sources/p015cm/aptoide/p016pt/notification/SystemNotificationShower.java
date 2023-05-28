package p015cm.aptoide.p016pt.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.C0373i;
import androidx.core.content.C0394a;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.C5879h;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.NotificationApplicationView;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p015cm.aptoide.p016pt.install.installer.RootInstallErrorNotification;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.themes.NewFeatureManager;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p123rx.C5328b;
import p123rx.Single;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C12495m;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.notification.SystemNotificationShower */
public class SystemNotificationShower implements Presenter {
    private Context context;
    private CrashReport crashReport;
    private final NavigationTracker navigationTracker;
    private NewFeatureManager newFeatureManager;
    private NotificationAnalytics notificationAnalytics;
    private NotificationCenter notificationCenter;
    private NotificationIdsMapper notificationIdsMapper;
    private NotificationManager notificationManager;
    private NotificationProvider notificationProvider;
    private ReadyToInstallNotificationManager readyToInstallNotificationManager;
    private C5383b subscriptions;
    private ThemeAnalytics themeAnalytics;
    private NotificationApplicationView view;

    public SystemNotificationShower(Context context2, NotificationManager notificationManager2, NotificationIdsMapper notificationIdsMapper2, NotificationCenter notificationCenter2, NotificationAnalytics notificationAnalytics2, CrashReport crashReport2, NotificationProvider notificationProvider2, NotificationApplicationView notificationApplicationView, C5383b bVar, NavigationTracker navigationTracker2, NewFeatureManager newFeatureManager2, ThemeAnalytics themeAnalytics2, ReadyToInstallNotificationManager readyToInstallNotificationManager2) {
        this.context = context2;
        this.notificationManager = notificationManager2;
        this.notificationIdsMapper = notificationIdsMapper2;
        this.notificationCenter = notificationCenter2;
        this.notificationAnalytics = notificationAnalytics2;
        this.crashReport = crashReport2;
        this.notificationProvider = notificationProvider2;
        this.subscriptions = bVar;
        this.view = notificationApplicationView;
        this.navigationTracker = navigationTracker2;
        this.newFeatureManager = newFeatureManager2;
        this.themeAnalytics = themeAnalytics2;
        this.readyToInstallNotificationManager = readyToInstallNotificationManager2;
    }

    /* renamed from: a */
    static /* synthetic */ void m6600a() {
    }

    /* renamed from: b */
    static /* synthetic */ NotificationInfo m6601b(NotificationInfo notificationInfo, RoomNotification roomNotification) {
        return notificationInfo;
    }

    /* renamed from: b */
    static /* synthetic */ void m6602b() {
    }

    /* renamed from: b */
    static /* synthetic */ void m6603b(AptoideNotification aptoideNotification) {
    }

    private Single<Notification> buildLocalNotification(Context context2, String str, String str2, String str3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Single.m10126b(new C3489j1(context2, pendingIntent, str, str2, pendingIntent2, str3)).mo18563b(Schedulers.computation()).mo18556a(C5376a.m10346b());
    }

    private Single<Notification> buildNewFeatureNotification(Context context2, String str, String str2, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Single.m10126b(new C3545w0(context2, pendingIntent, str, str2, pendingIntent2, i)).mo18563b(Schedulers.computation()).mo18556a(C5376a.m10346b());
    }

    private Single<Notification> buildNotification(Context context2, String str, String str2, String str3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Single.m10126b(new C3504o1(context2, pendingIntent, str3, str, str2, pendingIntent2)).mo18563b(Schedulers.computation()).mo18556a(C5376a.m10346b());
    }

    private void callDeepLink(Context context2, NotificationInfo notificationInfo) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(notificationInfo.getNotificationUrl()));
        intent.setFlags(268435456);
        try {
            context2.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            this.crashReport.log(e);
        }
    }

    private C5328b dismissNotificationAfterAction(int i) {
        return C5328b.m10166b((C12495m<? extends C5328b>) new C3483h1(this, i));
    }

    private Single<PendingIntent> getPressIntentAction(String str, String str2, int i, Context context2) {
        return Single.m10126b(new C3552y1(context2, i, str, str2)).mo18563b(Schedulers.computation());
    }

    /* renamed from: j */
    static /* synthetic */ void m6604j(NotificationInfo notificationInfo) {
    }

    /* renamed from: k */
    static /* synthetic */ Boolean m6605k(NotificationInfo notificationInfo) {
        return Boolean.valueOf(notificationInfo.getNotificationType() < 9);
    }

    private Single<Notification> mapLocalToAndroidNotification(AptoideNotification aptoideNotification, int i) {
        return getPressIntentAction(aptoideNotification.getUrlTrack(), aptoideNotification.getUrl(), i, this.context).mo18559a(new C3512q1(this, aptoideNotification, i));
    }

    private Single<Notification> mapToAndroidNotification(AptoideNotification aptoideNotification, int i) {
        return getPressIntentAction(aptoideNotification.getUrlTrack(), aptoideNotification.getUrl(), i, this.context).mo18559a(new C3518s1(this, aptoideNotification, i));
    }

    private void setNotificationBootCompletedSubscribe() {
        this.view.getActionBootCompleted().mo18664b(new C3549x1(this)).mo18655a(C3460a1.f6444f, (C5378b<Throwable>) new C3480g1(this));
    }

    private void setNotificationDismissSubscribe() {
        this.view.getNotificationDismissed().mo18681d(C3548x0.f6561f).mo18664b(new C3525u1(this)).mo18689g(new C3471d1(this)).mo18681d(new C3464b1(this)).mo18689g(new C3515r1(this)).mo18696k().mo18594a((C5377a) C3477f1.f6461f, (C5378b<? super Throwable>) new C3501n1(this));
    }

    private void setNotificationPressSubscribe() {
        this.view.getNotificationClick().mo18692i(new C3546w1(this)).mo18689g(new C3554z0(this)).mo18681d(new C3522t1(this)).mo18689g(new C3468c1(this)).mo18696k().mo18594a((C5377a) C3528v1.f6535f, (C5378b<? super Throwable>) new C3461a2(this));
    }

    private void setupChannels() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.notificationManager.createNotificationChannel(this.readyToInstallNotificationManager.getNotificationChannel());
        }
    }

    private void showNewNotification() {
        this.subscriptions.mo18721a(this.notificationCenter.getNewNotifications().mo18689g(new C3474e1(this)).mo18686f().mo18655a(C3555z1.f6572f, (C5378b<Throwable>) new C3492k1(this)));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13232a(AptoideNotification aptoideNotification) {
        int notificationId = this.notificationIdsMapper.getNotificationId(aptoideNotification.getType());
        if (aptoideNotification.getType() == 7 || aptoideNotification.getType() == 8 || aptoideNotification.getType() == 9) {
            return mapLocalToAndroidNotification(aptoideNotification, notificationId).mo18564b(new C3486i1(this, notificationId)).mo18565b();
        }
        this.notificationAnalytics.sendPushNotficationImpressionEvent(aptoideNotification.getType(), aptoideNotification.getAbTestingGroup(), aptoideNotification.getCampaignId(), aptoideNotification.getUrl());
        return mapToAndroidNotification(aptoideNotification, notificationId).mo18564b(new C3507p1(this, notificationId)).mo18565b();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13240b(int i, Notification notification) {
        this.notificationManager.notify(i, notification);
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo13243c(NotificationInfo notificationInfo) {
        return dismissNotificationAfterAction(notificationInfo.getNotificationType());
    }

    /* renamed from: d */
    public /* synthetic */ void mo13246d(Throwable th) {
        this.crashReport.log(th);
    }

    public void dismissNotification(int i) {
        this.notificationManager.cancel(i);
    }

    /* renamed from: e */
    public /* synthetic */ C5328b mo13248e(NotificationInfo notificationInfo) {
        return this.notificationProvider.deleteAllForType(7);
    }

    /* renamed from: f */
    public /* synthetic */ Single mo13249f(NotificationInfo notificationInfo) {
        return this.notificationProvider.getLastShowed(this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())).mo18564b(new C3551y0(this, notificationInfo)).mo18564b(new C3465b2(this)).mo18569d(new C3498m1(notificationInfo));
    }

    /* renamed from: g */
    public /* synthetic */ C5328b mo13250g(NotificationInfo notificationInfo) {
        callDeepLink(this.context, notificationInfo);
        return dismissNotificationAfterAction(notificationInfo.getNotificationType());
    }

    public PendingIntent getOnDismissAction(int i) {
        Intent intent = new Intent(this.context, NotificationReceiver.class);
        intent.setAction(NotificationReceiver.NOTIFICATION_DISMISSED_ACTION);
        intent.putExtra(NotificationReceiver.NOTIFICATION_NOTIFICATION_ID, i);
        return PendingIntent.getBroadcast(this.context, i, intent, 134217728);
    }

    /* renamed from: h */
    public /* synthetic */ Boolean mo13252h(NotificationInfo notificationInfo) {
        return Boolean.valueOf(this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())[0].equals(7));
    }

    /* renamed from: i */
    public /* synthetic */ C5328b mo13253i(NotificationInfo notificationInfo) {
        return this.notificationProvider.deleteAllForType(7);
    }

    public void present() {
        setupChannels();
        setNotificationPressSubscribe();
        setNotificationDismissSubscribe();
        setNotificationBootCompletedSubscribe();
        showNewNotification();
    }

    public void showNotification(Context context2, RootInstallErrorNotification rootInstallErrorNotification) {
        this.notificationManager.notify(rootInstallErrorNotification.getNotificationId(), mapToAndroidNotification(context2, rootInstallErrorNotification));
    }

    /* renamed from: b */
    public /* synthetic */ Single mo13239b(AptoideNotification aptoideNotification, int i, PendingIntent pendingIntent) {
        return buildNotification(this.context, aptoideNotification.getTitle(), aptoideNotification.getBody(), aptoideNotification.getImg(), pendingIntent, getOnDismissAction(i));
    }

    /* renamed from: d */
    public /* synthetic */ Boolean mo13245d(NotificationInfo notificationInfo) {
        return Boolean.valueOf(this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())[0].equals(7));
    }

    private Notification mapToAndroidNotification(Context context2, RootInstallErrorNotification rootInstallErrorNotification) {
        C0373i.C0377d dVar = new C0373i.C0377d(context2);
        dVar.mo2252b((CharSequence) rootInstallErrorNotification.getMessage());
        dVar.mo2254c((int) C1086R.C1087drawable.ic_stat_aptoide_notification);
        dVar.mo2243a(rootInstallErrorNotification.getIcon());
        dVar.mo2248a(true);
        dVar.mo2244a(rootInstallErrorNotification.getAction());
        dVar.mo2251b(rootInstallErrorNotification.getDeleteAction());
        Notification a = dVar.mo2237a();
        a.flags = 20;
        return a;
    }

    /* renamed from: c */
    public /* synthetic */ void mo13244c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo13241b(NotificationInfo notificationInfo) {
        if (this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())[0].equals(8)) {
            this.themeAnalytics.sendDarkThemeDismissClickEvent("Notification");
        }
        if (this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())[0].equals(9)) {
            this.readyToInstallNotificationManager.setIsNotificationDisplayed(false);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo13233a(int i, Notification notification) {
        this.notificationManager.notify(i, notification);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13230a(AptoideNotification aptoideNotification, int i, PendingIntent pendingIntent) {
        if (aptoideNotification.getType() == 8) {
            this.newFeatureManager.setFeatureAsShown();
            return buildNewFeatureNotification(this.context, aptoideNotification.getTitle(), aptoideNotification.getBody(), aptoideNotification.getActionStringRes(), pendingIntent, getOnDismissAction(i));
        } else if (aptoideNotification.getType() == 9) {
            return this.readyToInstallNotificationManager.buildNotification(aptoideNotification, this.context).mo18564b(new C3495l1(this));
        } else {
            return buildLocalNotification(this.context, aptoideNotification.getTitle(), aptoideNotification.getBody(), aptoideNotification.getImg(), pendingIntent, getOnDismissAction(i));
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo13242b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13234a(Notification notification) {
        this.readyToInstallNotificationManager.setIsNotificationDisplayed(true);
    }

    /* renamed from: a */
    static /* synthetic */ PendingIntent m6599a(Context context2, int i, String str, String str2) throws Exception {
        Intent intent = new Intent(context2, NotificationReceiver.class);
        intent.setAction(NotificationReceiver.NOTIFICATION_PRESSED_ACTION);
        intent.putExtra(NotificationReceiver.NOTIFICATION_NOTIFICATION_ID, i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(NotificationReceiver.NOTIFICATION_TRACK_URL, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(NotificationReceiver.NOTIFICATION_TARGET_URL, str2);
        }
        return PendingIntent.getBroadcast(context2, i, intent, 134217728);
    }

    /* renamed from: a */
    static /* synthetic */ Notification m6597a(Context context2, PendingIntent pendingIntent, String str, String str2, PendingIntent pendingIntent2, String str3) throws Exception {
        C0373i.C0377d dVar = new C0373i.C0377d(context2);
        dVar.mo2242a(pendingIntent);
        dVar.mo2254c((int) C1086R.C1087drawable.ic_stat_aptoide_notification);
        dVar.mo2238a(C0394a.m1909a(context2, (int) C1086R.color.default_orange_gradient_end));
        dVar.mo2252b((CharSequence) str);
        dVar.mo2246a((CharSequence) str2);
        dVar.mo2240a(0, (CharSequence) context2.getResources().getString(C1086R.string.promo_update2appc_notification_dismiss_button), pendingIntent2);
        dVar.mo2240a(0, (CharSequence) context2.getResources().getString(C1086R.string.promo_update2appc_notification_claim_button), pendingIntent);
        C5879h<Bitmap> a = C5874c.m11490e(context2).mo19995a();
        a.mo19988a(str3);
        dVar.mo2243a((Bitmap) a.mo19981O().get());
        Notification a2 = dVar.mo2237a();
        a2.flags = 20;
        return a2;
    }

    /* renamed from: a */
    static /* synthetic */ Notification m6596a(Context context2, PendingIntent pendingIntent, String str, String str2, PendingIntent pendingIntent2, int i) throws Exception {
        C0373i.C0377d dVar = new C0373i.C0377d(context2);
        dVar.mo2242a(pendingIntent);
        dVar.mo2254c((int) C1086R.C1087drawable.ic_stat_aptoide_notification);
        dVar.mo2238a(C0394a.m1909a(context2, (int) C1086R.color.default_orange_gradient_end));
        dVar.mo2252b((CharSequence) str);
        dVar.mo2246a((CharSequence) str2);
        dVar.mo2240a(0, (CharSequence) context2.getResources().getString(C1086R.string.updates_notification_dismiss_button), pendingIntent2);
        dVar.mo2240a(0, (CharSequence) context2.getResources().getString(i), pendingIntent);
        Notification a = dVar.mo2237a();
        a.flags = 20;
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ Notification m6598a(Context context2, PendingIntent pendingIntent, String str, String str2, String str3, PendingIntent pendingIntent2) throws Exception {
        C0373i.C0377d dVar = new C0373i.C0377d(context2);
        dVar.mo2242a(pendingIntent);
        dVar.mo2256c(false);
        dVar.mo2254c((int) C1086R.C1087drawable.ic_stat_aptoide_notification);
        dVar.mo2243a(ImageLoader.with(context2).loadBitmap(str));
        dVar.mo2252b((CharSequence) str2);
        dVar.mo2246a((CharSequence) str3);
        dVar.mo2251b(pendingIntent2);
        C0373i.C0375b bVar = new C0373i.C0375b();
        bVar.mo2234a((CharSequence) str3);
        dVar.mo2245a((C0373i.C0378e) bVar);
        Notification a = dVar.mo2237a();
        a.flags = 20;
        return a;
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13231a(int i) {
        try {
            return this.notificationCenter.notificationDismissed(this.notificationIdsMapper.getNotificationType(i));
        } catch (RuntimeException e) {
            return C5328b.m10163b((Throwable) e);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo13236a(NotificationInfo notificationInfo) {
        this.notificationCenter.setup();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13238a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13237a(NotificationInfo notificationInfo, RoomNotification roomNotification) {
        if (!(roomNotification.getType() == 7 || roomNotification.getType() == 8 || roomNotification.getType() == 9)) {
            this.notificationAnalytics.sendPushNotificationPressedEvent(roomNotification.getType(), roomNotification.getAbTestingGroup(), roomNotification.getCampaignId(), roomNotification.getUrl());
            this.notificationAnalytics.sendNotificationTouchEvent(notificationInfo.getNotificationTrackUrl(), notificationInfo.getNotificationType(), notificationInfo.getNotificationUrl(), roomNotification.getCampaignId(), roomNotification.getAbTestingGroup());
        }
        if (roomNotification.getType() == 8) {
            this.themeAnalytics.sendDarkThemeDialogTurnItOnClickEvent("Notification");
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo13235a(RoomNotification roomNotification) {
        this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build("Notification"));
    }
}
