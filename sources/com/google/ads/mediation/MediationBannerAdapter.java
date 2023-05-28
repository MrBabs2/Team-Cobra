package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.C7121e;
import com.google.ads.mediation.MediationServerParameters;
import p112n.p277e.p278a.C10569c;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends C7121e, SERVER_PARAMETERS extends MediationServerParameters> extends C7112b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(C7113c cVar, Activity activity, SERVER_PARAMETERS server_parameters, C10569c cVar2, C7111a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}
