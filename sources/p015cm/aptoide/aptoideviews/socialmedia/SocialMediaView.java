package p015cm.aptoide.aptoideviews.socialmedia;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onFacebookClicked", "Lrx/Observable;", "Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", "onInstagramClicked", "onSocialMediaClick", "onTwitterClicked", "SocialMediaType", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.socialmedia.SocialMediaView */
/* compiled from: SocialMediaView.kt */
public final class SocialMediaView extends FrameLayout {
    private HashMap _$_findViewCache;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", "", "(Ljava/lang/String;I)V", "INSTAGRAM_CLICK", "TWITTER_CLICK", "FACEBOOK_CLICK", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.socialmedia.SocialMediaView$SocialMediaType */
    /* compiled from: SocialMediaView.kt */
    public enum SocialMediaType {
        INSTAGRAM_CLICK,
        TWITTER_CLICK,
        FACEBOOK_CLICK
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C10202j.m34178b(context, "context");
        C10202j.m34178b(attributeSet, "attrs");
        FrameLayout.inflate(context, C1033R.layout.social_media_view, this);
    }

    private final C5368e<SocialMediaType> onFacebookClicked() {
        C5368e<R> j = C10695a.m36221a((ImageView) _$_findCachedViewById(C1033R.C1035id.facebook_button)).mo18694j(SocialMediaView$onFacebookClicked$1.INSTANCE);
        C10202j.m34174a((Object) j, "RxView.clicks(facebook_b…ediaType.FACEBOOK_CLICK }");
        return j;
    }

    private final C5368e<SocialMediaType> onInstagramClicked() {
        C5368e<R> j = C10695a.m36221a((ImageView) _$_findCachedViewById(C1033R.C1035id.instagram_button)).mo18694j(SocialMediaView$onInstagramClicked$1.INSTANCE);
        C10202j.m34174a((Object) j, "RxView.clicks(instagram_…diaType.INSTAGRAM_CLICK }");
        return j;
    }

    private final C5368e<SocialMediaType> onTwitterClicked() {
        C5368e<R> j = C10695a.m36221a((ImageView) _$_findCachedViewById(C1033R.C1035id.twitter_button)).mo18694j(SocialMediaView$onTwitterClicked$1.INSTANCE);
        C10202j.m34174a((Object) j, "RxView.clicks(twitter_bu…MediaType.TWITTER_CLICK }");
        return j;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C5368e<SocialMediaType> onSocialMediaClick() {
        C5368e<SocialMediaType> a = C5368e.m10243a(onFacebookClicked(), onInstagramClicked(), onTwitterClicked());
        C10202j.m34174a((Object) a, "Observable.merge(onFaceb…ed(), onTwitterClicked())");
        return a;
    }
}
