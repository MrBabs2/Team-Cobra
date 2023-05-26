package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaaz;
import com.google.android.gms.internal.ads.zzaba;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Set;

@VisibleForTesting
public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final zzaaz zzaam;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    @VisibleForTesting
    public static final class Builder {
        /* access modifiers changed from: private */
        public final zzaba zzaan = new zzaba();

        public final Builder addCategoryExclusion(String str) {
            this.zzaan.mo26988g(str);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzaan.mo26980b(cls, bundle);
            return this;
        }

        public final Builder addCustomTargeting(String str, String str2) {
            this.zzaan.mo26976a(str, str2);
            return this;
        }

        public final Builder addKeyword(String str) {
            this.zzaan.mo26975a(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzaan.mo26973a(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zzaan.mo26974a(cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.zzaan.mo26981b(str);
            return this;
        }

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this);
        }

        @Deprecated
        public final Builder setBirthday(Date date) {
            this.zzaan.mo26977a(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            Preconditions.m16038a(str, (Object) "Content URL must be non-null.");
            Preconditions.m16039a(str, (Object) "Content URL must be non-empty.");
            Preconditions.m16045a(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length()));
            this.zzaan.mo26985d(str);
            return this;
        }

        @Deprecated
        public final Builder setGender(int i) {
            this.zzaan.mo26971a(i);
            return this;
        }

        @Deprecated
        public final Builder setIsDesignedForFamilies(boolean z) {
            this.zzaan.mo26984c(z);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzaan.mo26972a(location);
            return this;
        }

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzaan.mo26978a(z);
            return this;
        }

        public final Builder setMaxAdContentRating(String str) {
            this.zzaan.mo26989h(str);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.zzaan.mo26986e(str);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzaan.mo26987f(str);
            return this;
        }

        public final Builder setTagForUnderAgeOfConsent(int i) {
            this.zzaan.mo26979b(i);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzaan.mo26982b(z);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zzaan.mo26976a(str, TextUtils.join(",", list));
            }
            return this;
        }
    }

    private PublisherAdRequest(Builder builder) {
        this.zzaam = new zzaaz(builder.zzaan);
    }

    public static void updateCorrelator() {
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzaam.mo26948a();
    }

    public final String getContentUrl() {
        return this.zzaam.mo26951b();
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzaam.mo26947a((Class<? extends CustomEvent>) cls);
    }

    public final Bundle getCustomTargeting() {
        return this.zzaam.mo26952c();
    }

    @Deprecated
    public final int getGender() {
        return this.zzaam.mo26954d();
    }

    public final Set<String> getKeywords() {
        return this.zzaam.mo26955e();
    }

    public final Location getLocation() {
        return this.zzaam.mo26956f();
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzaam.mo26957g();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.zzaam.mo26950b(cls);
    }

    public final <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzaam.mo26953c(cls);
    }

    public final String getPublisherProvidedId() {
        return this.zzaam.mo26959i();
    }

    public final boolean isTestDevice(Context context) {
        return this.zzaam.mo26949a(context);
    }

    public final zzaaz zzde() {
        return this.zzaam;
    }
}
