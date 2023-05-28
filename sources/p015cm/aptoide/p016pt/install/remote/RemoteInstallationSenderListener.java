package p015cm.aptoide.p016pt.install.remote;

/* renamed from: cm.aptoide.pt.install.remote.RemoteInstallationSenderListener */
public interface RemoteInstallationSenderListener {
    void onAppSendSuccess();

    void onAppSendUnsuccess();

    void onAptoideTVServiceFound(ReceiverDevice receiverDevice);

    void onAptoideTVServiceLost(ReceiverDevice receiverDevice);

    void onDiscoveryStarted();

    void onDiscoveryStopped();

    void onNoNetworkAccess();
}
