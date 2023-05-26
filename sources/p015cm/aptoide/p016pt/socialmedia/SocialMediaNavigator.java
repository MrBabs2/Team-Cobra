package p015cm.aptoide.p016pt.socialmedia;

import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.navigator.ExternalNavigator;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/pt/socialmedia/SocialMediaNavigator;", "", "externalNavigator", "Lcm/aptoide/pt/navigator/ExternalNavigator;", "(Lcm/aptoide/pt/navigator/ExternalNavigator;)V", "getExternalNavigator", "()Lcm/aptoide/pt/navigator/ExternalNavigator;", "mapSocialMediaTypeToUrl", "", "socialMediaType", "Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", "navigateToSocialMediaWebsite", "", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.socialmedia.SocialMediaNavigator */
/* compiled from: SocialMediaNavigator.kt */
public final class SocialMediaNavigator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static String FACEBOOK_URL = "https://facebook.com/aptoide/";
    /* access modifiers changed from: private */
    public static String INSTAGRAM_URL = "https://www.instagram.com/aptoideappstore/";
    /* access modifiers changed from: private */
    public static String TWITTER_URL = "https://twitter.com/aptoide";
    private final ExternalNavigator externalNavigator;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/pt/socialmedia/SocialMediaNavigator$Companion;", "", "()V", "FACEBOOK_URL", "", "getFACEBOOK_URL", "()Ljava/lang/String;", "setFACEBOOK_URL", "(Ljava/lang/String;)V", "INSTAGRAM_URL", "getINSTAGRAM_URL", "setINSTAGRAM_URL", "TWITTER_URL", "getTWITTER_URL", "setTWITTER_URL", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.socialmedia.SocialMediaNavigator$Companion */
    /* compiled from: SocialMediaNavigator.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getFACEBOOK_URL() {
            return SocialMediaNavigator.FACEBOOK_URL;
        }

        public final String getINSTAGRAM_URL() {
            return SocialMediaNavigator.INSTAGRAM_URL;
        }

        public final String getTWITTER_URL() {
            return SocialMediaNavigator.TWITTER_URL;
        }

        public final void setFACEBOOK_URL(String str) {
            C10202j.m34178b(str, "<set-?>");
            SocialMediaNavigator.FACEBOOK_URL = str;
        }

        public final void setINSTAGRAM_URL(String str) {
            C10202j.m34178b(str, "<set-?>");
            SocialMediaNavigator.INSTAGRAM_URL = str;
        }

        public final void setTWITTER_URL(String str) {
            C10202j.m34178b(str, "<set-?>");
            SocialMediaNavigator.TWITTER_URL = str;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.socialmedia.SocialMediaNavigator$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialMediaView.SocialMediaType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[SocialMediaView.SocialMediaType.FACEBOOK_CLICK.ordinal()] = 1;
            $EnumSwitchMapping$0[SocialMediaView.SocialMediaType.TWITTER_CLICK.ordinal()] = 2;
            $EnumSwitchMapping$0[SocialMediaView.SocialMediaType.INSTAGRAM_CLICK.ordinal()] = 3;
        }
    }

    public SocialMediaNavigator(ExternalNavigator externalNavigator2) {
        C10202j.m34178b(externalNavigator2, "externalNavigator");
        this.externalNavigator = externalNavigator2;
    }

    private final String mapSocialMediaTypeToUrl(SocialMediaView.SocialMediaType socialMediaType) {
        int i = WhenMappings.$EnumSwitchMapping$0[socialMediaType.ordinal()];
        if (i == 1) {
            return FACEBOOK_URL;
        }
        if (i == 2) {
            return TWITTER_URL;
        }
        if (i == 3) {
            return INSTAGRAM_URL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ExternalNavigator getExternalNavigator() {
        return this.externalNavigator;
    }

    public final void navigateToSocialMediaWebsite(SocialMediaView.SocialMediaType socialMediaType) {
        C10202j.m34178b(socialMediaType, "socialMediaType");
        this.externalNavigator.navigateToExternalWebsite(mapSocialMediaTypeToUrl(socialMediaType));
    }
}
