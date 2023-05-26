package p015cm.aptoide.p016pt.search.analytics;

import p015cm.aptoide.p016pt.BuildConfig;

/* renamed from: cm.aptoide.pt.search.analytics.SearchSource */
public enum SearchSource {
    WIDGET("widget"),
    SHORTCUT("shortcut"),
    DEEP_LINK("deep_link"),
    SEARCH_ICON(BuildConfig.FLAVOR_product),
    SEARCH_TOOLBAR(BuildConfig.FLAVOR_product),
    BOTTOM_NAVIGATION("vanilla_bottom_nav");
    
    private final String identifier;

    private SearchSource(String str) {
        this.identifier = str;
    }

    public String getIdentifier() {
        return this.identifier;
    }
}
