package com.asf.appcoins.sdk.contractproxy.repository;

import com.asf.appcoins.sdk.contractproxy.repository.RemoteRepository;

public interface ApiProvider {
    RemoteRepository.Api getApi(int i);
}
