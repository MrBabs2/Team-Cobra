package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzacd;
import com.google.android.gms.internal.ads.zzard;

@zzard
public final class VideoOptions {
    private final boolean zzaax;
    private final boolean zzaay;
    private final boolean zzaaz;

    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzaax = true;
        /* access modifiers changed from: private */
        public boolean zzaay = false;
        /* access modifiers changed from: private */
        public boolean zzaaz = false;

        public final VideoOptions build() {
            return new VideoOptions(this);
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzaaz = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzaay = z;
            return this;
        }

        public final Builder setStartMuted(boolean z) {
            this.zzaax = z;
            return this;
        }
    }

    public VideoOptions(zzacd zzacd) {
        this.zzaax = zzacd.f17755f;
        this.zzaay = zzacd.f17756g;
        this.zzaaz = zzacd.f17757h;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzaaz;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzaay;
    }

    public final boolean getStartMuted() {
        return this.zzaax;
    }

    private VideoOptions(Builder builder) {
        this.zzaax = builder.zzaax;
        this.zzaay = builder.zzaay;
        this.zzaaz = builder.zzaaz;
    }
}
