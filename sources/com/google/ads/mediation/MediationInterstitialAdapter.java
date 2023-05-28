package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.C7121e;
import com.google.ads.mediation.MediationServerParameters;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends C7121e, SERVER_PARAMETERS extends MediationServerParameters> extends C7112b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(C7120d dVar, Activity activity, SERVER_PARAMETERS server_parameters, C7111a aVar, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
