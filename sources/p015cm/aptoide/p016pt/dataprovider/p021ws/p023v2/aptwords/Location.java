package p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v2.aptwords.Location */
public enum Location {
    homepage("native-aptoide:homepage"),
    appview("native-aptoide:appview"),
    middleappview("native-aptoide:middleappview"),
    search("native-aptoide:search"),
    secondinstall("native-aptoide:secondinstall"),
    secondtry("native-aptoide:secondtry"),
    aptoidesdk("sdk-aptoide:generic"),
    firstinstall("native-aptoide:first-install");
    
    private final String value;

    private Location(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
