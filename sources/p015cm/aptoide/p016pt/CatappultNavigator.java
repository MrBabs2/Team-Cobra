package p015cm.aptoide.p016pt;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.navigator.ExternalNavigator;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo16641d2 = {"Lcm/aptoide/pt/CatappultNavigator;", "", "externalNavigator", "Lcm/aptoide/pt/navigator/ExternalNavigator;", "(Lcm/aptoide/pt/navigator/ExternalNavigator;)V", "navigateToCatappultWebsite", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.CatappultNavigator */
/* compiled from: CatappultNavigator.kt */
public final class CatappultNavigator {
    private final ExternalNavigator externalNavigator;

    public CatappultNavigator(ExternalNavigator externalNavigator2) {
        C10202j.m34178b(externalNavigator2, "externalNavigator");
        this.externalNavigator = externalNavigator2;
    }

    public final void navigateToCatappultWebsite() {
        this.externalNavigator.navigateToExternalWebsite("https://catappult.io/?utm_source=vanilla");
    }
}
