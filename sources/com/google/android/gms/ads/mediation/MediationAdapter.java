package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface MediationAdapter extends MediationExtrasReceiver {

    public static class zza {
        private int zzemy;

        public final Bundle zzacc() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.zzemy);
            return bundle;
        }

        public final zza zzdj(int i) {
            this.zzemy = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
