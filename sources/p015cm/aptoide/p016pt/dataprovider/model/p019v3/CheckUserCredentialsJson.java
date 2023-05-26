package p015cm.aptoide.p016pt.dataprovider.model.p019v3;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cm.aptoide.pt.dataprovider.model.v3.CheckUserCredentialsJson */
public class CheckUserCredentialsJson extends BaseV3Response {
    public String access;
    @JsonProperty("access_confirmed")
    public boolean accessConfirmed;
    public String avatar;
    public String email;

    /* renamed from: id */
    public int f4839id;
    public String ravatarHd;
    public String repo;
    public Settings settings;
    public String token;
    public String username;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v3.CheckUserCredentialsJson$Settings */
    public static class Settings {
        @JsonProperty("matureswitch")
        public String matureswitch;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Settings;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) obj;
            if (!settings.canEqual(this)) {
                return false;
            }
            String matureswitch2 = getMatureswitch();
            String matureswitch3 = settings.getMatureswitch();
            return matureswitch2 != null ? matureswitch2.equals(matureswitch3) : matureswitch3 == null;
        }

        public String getMatureswitch() {
            return this.matureswitch;
        }

        public int hashCode() {
            int i;
            String matureswitch2 = getMatureswitch();
            if (matureswitch2 == null) {
                i = 43;
            } else {
                i = matureswitch2.hashCode();
            }
            return 59 + i;
        }

        public void setMatureswitch(String str) {
            this.matureswitch = str;
        }

        public String toString() {
            return "CheckUserCredentialsJson.Settings(matureswitch=" + getMatureswitch() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof CheckUserCredentialsJson;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckUserCredentialsJson)) {
            return false;
        }
        CheckUserCredentialsJson checkUserCredentialsJson = (CheckUserCredentialsJson) obj;
        if (!checkUserCredentialsJson.canEqual(this) || !super.equals(obj) || getId() != checkUserCredentialsJson.getId()) {
            return false;
        }
        String token2 = getToken();
        String token3 = checkUserCredentialsJson.getToken();
        if (token2 != null ? !token2.equals(token3) : token3 != null) {
            return false;
        }
        String repo2 = getRepo();
        String repo3 = checkUserCredentialsJson.getRepo();
        if (repo2 != null ? !repo2.equals(repo3) : repo3 != null) {
            return false;
        }
        String avatar2 = getAvatar();
        String avatar3 = checkUserCredentialsJson.getAvatar();
        if (avatar2 != null ? !avatar2.equals(avatar3) : avatar3 != null) {
            return false;
        }
        String username2 = getUsername();
        String username3 = checkUserCredentialsJson.getUsername();
        if (username2 != null ? !username2.equals(username3) : username3 != null) {
            return false;
        }
        String email2 = getEmail();
        String email3 = checkUserCredentialsJson.getEmail();
        if (email2 != null ? !email2.equals(email3) : email3 != null) {
            return false;
        }
        Settings settings2 = getSettings();
        Settings settings3 = checkUserCredentialsJson.getSettings();
        if (settings2 != null ? !settings2.equals(settings3) : settings3 != null) {
            return false;
        }
        String access2 = getAccess();
        String access3 = checkUserCredentialsJson.getAccess();
        if (access2 != null ? !access2.equals(access3) : access3 != null) {
            return false;
        }
        if (isAccessConfirmed() != checkUserCredentialsJson.isAccessConfirmed()) {
            return false;
        }
        String ravatarHd2 = getRavatarHd();
        String ravatarHd3 = checkUserCredentialsJson.getRavatarHd();
        return ravatarHd2 != null ? ravatarHd2.equals(ravatarHd3) : ravatarHd3 == null;
    }

    public String getAccess() {
        return this.access;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getEmail() {
        return this.email;
    }

    public int getId() {
        return this.f4839id;
    }

    public String getRavatarHd() {
        return this.ravatarHd;
    }

    public String getRepo() {
        return this.repo;
    }

    public Settings getSettings() {
        return this.settings;
    }

    public String getToken() {
        return this.token;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int hashCode = ((super.hashCode() + 59) * 59) + getId();
        String token2 = getToken();
        int i8 = hashCode * 59;
        int i9 = 43;
        if (token2 == null) {
            i = 43;
        } else {
            i = token2.hashCode();
        }
        int i10 = i8 + i;
        String repo2 = getRepo();
        int i11 = i10 * 59;
        if (repo2 == null) {
            i2 = 43;
        } else {
            i2 = repo2.hashCode();
        }
        int i12 = i11 + i2;
        String avatar2 = getAvatar();
        int i13 = i12 * 59;
        if (avatar2 == null) {
            i3 = 43;
        } else {
            i3 = avatar2.hashCode();
        }
        int i14 = i13 + i3;
        String username2 = getUsername();
        int i15 = i14 * 59;
        if (username2 == null) {
            i4 = 43;
        } else {
            i4 = username2.hashCode();
        }
        int i16 = i15 + i4;
        String email2 = getEmail();
        int i17 = i16 * 59;
        if (email2 == null) {
            i5 = 43;
        } else {
            i5 = email2.hashCode();
        }
        int i18 = i17 + i5;
        Settings settings2 = getSettings();
        int i19 = i18 * 59;
        if (settings2 == null) {
            i6 = 43;
        } else {
            i6 = settings2.hashCode();
        }
        int i20 = i19 + i6;
        String access2 = getAccess();
        int i21 = i20 * 59;
        if (access2 == null) {
            i7 = 43;
        } else {
            i7 = access2.hashCode();
        }
        int i22 = ((i21 + i7) * 59) + (isAccessConfirmed() ? 79 : 97);
        String ravatarHd2 = getRavatarHd();
        int i23 = i22 * 59;
        if (ravatarHd2 != null) {
            i9 = ravatarHd2.hashCode();
        }
        return i23 + i9;
    }

    public boolean isAccessConfirmed() {
        return this.accessConfirmed;
    }

    public void setAccess(String str) {
        this.access = str;
    }

    public void setAccessConfirmed(boolean z) {
        this.accessConfirmed = z;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setId(int i) {
        this.f4839id = i;
    }

    public void setRavatarHd(String str) {
        this.ravatarHd = str;
    }

    public void setRepo(String str) {
        this.repo = str;
    }

    public void setSettings(Settings settings2) {
        this.settings = settings2;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        return "CheckUserCredentialsJson(id=" + getId() + ", token=" + getToken() + ", repo=" + getRepo() + ", avatar=" + getAvatar() + ", username=" + getUsername() + ", email=" + getEmail() + ", settings=" + getSettings() + ", access=" + getAccess() + ", accessConfirmed=" + isAccessConfirmed() + ", ravatarHd=" + getRavatarHd() + ")";
    }
}
