package p015cm.aptoide.p016pt.ads.data;

import java.util.Arrays;

/* renamed from: cm.aptoide.pt.ads.data.Payout */
public class Payout {
    double appcAmount;
    double fiatAmount;
    String fiatCurrency;
    String fiatSymbol;

    public Payout() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Payout.class != obj.getClass()) {
            return false;
        }
        Payout payout = (Payout) obj;
        if (Double.compare(payout.appcAmount, this.appcAmount) != 0 || Double.compare(payout.fiatAmount, this.fiatAmount) != 0 || !this.fiatCurrency.equals(payout.fiatCurrency) || !this.fiatSymbol.equals(payout.fiatSymbol)) {
            return false;
        }
        return true;
    }

    public double getAppcAmount() {
        return this.appcAmount;
    }

    public double getFiatAmount() {
        return this.fiatAmount;
    }

    public String getFiatCurrency() {
        return this.fiatCurrency;
    }

    public String getFiatSymbol() {
        return this.fiatSymbol;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Double.valueOf(this.appcAmount), Double.valueOf(this.fiatAmount), this.fiatCurrency, this.fiatSymbol});
    }

    public void setAppcAmount(double d) {
        this.appcAmount = d;
    }

    public void setFiatAmount(double d) {
        this.fiatAmount = d;
    }

    public void setFiatCurrency(String str) {
        this.fiatCurrency = str;
    }

    public void setFiatSymbol(String str) {
        this.fiatSymbol = str;
    }

    public Payout(double d, double d2, String str, String str2) {
        this.appcAmount = d;
        this.fiatAmount = d2;
        this.fiatCurrency = str;
        this.fiatSymbol = str2;
    }
}
