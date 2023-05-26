package p015cm.aptoide.p016pt.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.RegisterAdRefererRequest;
import p015cm.aptoide.p016pt.dataprovider.util.referrer.SimpleTimedFuture;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p123rx.C5328b;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.util.ReferrerUtils */
public class ReferrerUtils extends p015cm.aptoide.p016pt.dataprovider.util.referrer.ReferrerUtils {
    private static final String TAG = "ReferrerUtils";

    /* renamed from: a */
    static /* synthetic */ void m7445a(Context context, String[] strArr, String str, SimpleTimedFuture simpleTimedFuture) {
        IdsRepository idsRepository = ((AptoideApplication) context.getApplicationContext()).getIdsRepository();
        strArr[0] = AdNetworkUtils.parseMacros(str, idsRepository.getAndroidId(), idsRepository.getUniqueIdentifier().mo18562a().mo41082a(), idsRepository.getAdvertisingId().mo18562a().mo41082a());
        simpleTimedFuture.set(strArr[0]);
        Logger instance = Logger.getInstance();
        instance.mo12975d("ExtractReferrer", "Parsed clickUrl: " + strArr[0]);
    }

    public static void broadcastReferrer(String str, String str2, Context context) {
        Intent intent = new Intent("com.android.vending.INSTALL_REFERRER");
        intent.setPackage(str);
        intent.setFlags(32);
        intent.putExtra("referrer", str2);
        context.sendBroadcast(intent);
        Logger instance = Logger.getInstance();
        String str3 = TAG;
        instance.mo12975d(str3, "Sent broadcast to " + str + " with referrer " + str2);
    }

    /* access modifiers changed from: private */
    public static List<Long> clearExcludedNetworks(String str) {
        return (List) p015cm.aptoide.p016pt.dataprovider.util.referrer.ReferrerUtils.excludedNetworks.remove(str);
    }

    public static void extractReferrer(SearchAdResult searchAdResult, int i, boolean z, AdsRepository adsRepository, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager, Context context, SharedPreferences sharedPreferences, MinimalAdMapper minimalAdMapper, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        Context context2 = context;
        final String packageName = searchAdResult.getPackageName();
        final long networkId = searchAdResult.getNetworkId();
        String clickUrl = searchAdResult.getClickUrl();
        if (clickUrl == null) {
            Logger instance = Logger.getInstance();
            instance.mo12975d("ExtractReferrer", "No click_url for packageName " + packageName);
        } else if (AptoideUtils.ThreadU.isUiThread()) {
            try {
                Logger instance2 = Logger.getInstance();
                instance2.mo12975d("ExtractReferrer", "Called for: " + clickUrl + " with packageName " + packageName);
                String[] strArr = {clickUrl};
                SimpleTimedFuture simpleTimedFuture = new SimpleTimedFuture();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2006, 16, -3);
                layoutParams.gravity = 51;
                layoutParams.x = 0;
                layoutParams.y = 0;
                layoutParams.width = 0;
                layoutParams.height = 0;
                LinearLayout linearLayout = new LinearLayout(context2);
                linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                AptoideUtils.ThreadU.runOnIoThread(new C4445g(context2, strArr, clickUrl, simpleTimedFuture));
                simpleTimedFuture.get();
                WebView webView = new WebView(context2);
                webView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout.addView(webView);
                webView.getSettings().setJavaScriptEnabled(true);
                final SearchAdResult searchAdResult2 = searchAdResult;
                final int i2 = i;
                final OkHttpClient okHttpClient2 = okHttpClient;
                final Converter.Factory factory2 = factory;
                final QManager qManager2 = qManager;
                C44351 r16 = r1;
                WebView webView2 = webView;
                final boolean z2 = z;
                LinearLayout linearLayout2 = linearLayout;
                final Context context3 = context;
                final RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence2 = roomStoredMinimalAdPersistence;
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                final MinimalAdMapper minimalAdMapper2 = minimalAdMapper;
                final SharedPreferences sharedPreferences2 = sharedPreferences;
                String[] strArr2 = strArr;
                final AdsRepository adsRepository2 = adsRepository;
                C44351 r1 = new WebViewClient() {
                    Future<Void> future;

                    /* renamed from: a */
                    static /* synthetic */ MinimalAd m7446a(Throwable th) {
                        return null;
                    }

                    private ScheduledFuture<Void> postponeReferrerExtraction(SearchAdResult searchAdResult, int i, int i2, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager) {
                        QManager qManager2 = qManager;
                        return postponeReferrerExtraction(searchAdResult, i, false, i2, okHttpClient, factory, qManager2.getFilters(ManagerPreferences.getHWSpecsFilter(sharedPreferences2)), qManager2);
                    }

                    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        super.onPageStarted(webView, str, bitmap);
                        Logger instance = Logger.getInstance();
                        instance.mo12975d("ExtractReferrer", "Openened clickUrl: " + str);
                        if (this.future == null) {
                            this.future = postponeReferrerExtraction(SearchAdResult.this, 5, i2, okHttpClient2, factory2, qManager2);
                        }
                    }

                    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        if (this.future == null) {
                            Logger instance = Logger.getInstance();
                            instance.mo12975d("ExtractReferrer", "onPageStarted potentially not called : " + str);
                            this.future = postponeReferrerExtraction(SearchAdResult.this, 5, i2, okHttpClient2, factory2, qManager2);
                        }
                        Logger instance2 = Logger.getInstance();
                        instance2.mo12975d("ExtractReferrer", "ClickUrl redirect: " + str);
                        if (str.startsWith("market://") || str.startsWith("https://play.google.com") || str.startsWith("http://play.google.com")) {
                            Logger.getInstance().mo12975d("ExtractReferrer", "Clickurl landed on market");
                            String access$000 = ReferrerUtils.getReferrer(str);
                            if (!TextUtils.isEmpty(access$000)) {
                                Logger.getInstance().mo12975d("ExtractReferrer", "Referrer successfully extracted");
                                if (z2) {
                                    ReferrerUtils.broadcastReferrer(packageName, access$000, context3);
                                } else {
                                    C5328b.m10169d(new C4440b(roomStoredMinimalAdPersistence2, minimalAdMapper2, SearchAdResult.this, access$000)).mo18600b(Schedulers.m10352io()).mo18609d();
                                }
                                Future<Void> future2 = this.future;
                                if (future2 != null) {
                                    future2.cancel(false);
                                }
                                postponeReferrerExtraction(SearchAdResult.this, 0, true, okHttpClient2, factory2, qManager2);
                            }
                        }
                        return false;
                    }

                    /* renamed from: a */
                    static /* synthetic */ Void m7448a(boolean z, SearchAdResult searchAdResult, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager, SharedPreferences sharedPreferences, int i, String str, long j, AdsRepository adsRepository, boolean z2, Context context, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) throws Exception {
                        boolean z3 = z;
                        int i2 = i;
                        String str2 = str;
                        Logger instance = Logger.getInstance();
                        instance.mo12975d("ExtractReferrer", "Sending RegisterAdRefererRequest with value " + z);
                        RegisterAdRefererRequest.m5237of(searchAdResult.getAdId(), searchAdResult.getAppId(), searchAdResult.getClickUrl(), z, okHttpClient, factory, qManager.getFilters(ManagerPreferences.getHWSpecsFilter(sharedPreferences)), sharedPreferences).execute();
                        Logger instance2 = Logger.getInstance();
                        instance2.mo12975d("ExtractReferrer", "Retries left: " + i2);
                        if (!z3) {
                            p015cm.aptoide.p016pt.dataprovider.util.referrer.ReferrerUtils.excludedNetworks.add(str2, j);
                            if (i2 > 0) {
                                try {
                                    adsRepository.getAdsFromSecondTry(str2).mo18644a(C5376a.m10346b()).mo18699l(C4442d.f7613f).mo18681d(new C4439a(searchAdResult)).mo18655a(new C4443e(i, z2, adsRepository, okHttpClient, factory, qManager, context, sharedPreferences, roomStoredMinimalAdPersistence), (C5378b<Throwable>) new C4441c(str2));
                                    return null;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return null;
                                }
                            } else {
                                List unused = ReferrerUtils.clearExcludedNetworks(str);
                                return null;
                            }
                        } else {
                            List unused2 = ReferrerUtils.clearExcludedNetworks(str);
                            return null;
                        }
                    }

                    private ScheduledFuture<Void> postponeReferrerExtraction(SearchAdResult searchAdResult, int i, boolean z, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager) {
                        QManager qManager2 = qManager;
                        return postponeReferrerExtraction(searchAdResult, i, z, 0, okHttpClient, factory, qManager2.getFilters(ManagerPreferences.getHWSpecsFilter(sharedPreferences2)), qManager2);
                    }

                    private ScheduledFuture<Void> postponeReferrerExtraction(SearchAdResult searchAdResult, int i, boolean z, int i2, OkHttpClient okHttpClient, Converter.Factory factory, String str, QManager qManager) {
                        int i3 = i;
                        Logger instance = Logger.getInstance();
                        instance.mo12975d("ExtractReferrer", "Referrer postponed " + i3 + " seconds.");
                        SharedPreferences sharedPreferences = sharedPreferences2;
                        String str2 = packageName;
                        long j = networkId;
                        AdsRepository adsRepository = adsRepository2;
                        boolean z2 = z2;
                        Context context = context3;
                        RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence = roomStoredMinimalAdPersistence2;
                        C4444f fVar = r5;
                        C4444f fVar2 = new C4444f(z, searchAdResult, okHttpClient, factory, qManager, sharedPreferences, i2, str2, j, adsRepository, z2, context, roomStoredMinimalAdPersistence);
                        return p015cm.aptoide.p016pt.dataprovider.util.referrer.ReferrerUtils.executorService.schedule(fVar, (long) i3, TimeUnit.SECONDS);
                    }

                    /* renamed from: a */
                    static /* synthetic */ Boolean m7447a(SearchAdResult searchAdResult, MinimalAd minimalAd) {
                        return Boolean.valueOf(searchAdResult != null);
                    }
                };
                webView2.setWebViewClient(r16);
                webView2.loadUrl(strArr2[0]);
                windowManager.addView(linearLayout2, layoutParams);
            } catch (Exception e) {
                CrashReport.getInstance().log(e);
            }
        } else {
            throw new RuntimeException("ExtractReferrer must be run on UI thread!");
        }
    }

    /* access modifiers changed from: private */
    public static String getReferrer(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("referrer");
        if (!TextUtils.isEmpty(queryParameter)) {
            Logger instance = Logger.getInstance();
            String str2 = TAG;
            instance.mo12985v(str2, "Found referrer: " + queryParameter);
        } else {
            Logger instance2 = Logger.getInstance();
            String str3 = TAG;
            instance2.mo12985v(str3, "Didn't find any referrer: " + str);
        }
        return queryParameter;
    }
}
