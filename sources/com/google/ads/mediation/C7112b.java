package com.google.ads.mediation;

import com.google.ads.mediation.MediationServerParameters;

@Deprecated
/* renamed from: com.google.ads.mediation.b */
public interface C7112b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
