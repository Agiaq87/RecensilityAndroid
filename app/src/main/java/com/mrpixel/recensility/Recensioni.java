package com.mrpixel.recensility;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;

import java.io.IOException;

public class Recensioni implements Parcelable {

    public Recensioni() {
        try {
            this.recensioni = (Document) Jsoup.connect("https://recensility.it/recensioni/").get();

        } catch (IOException e) {
            Log.d("JSOUP ERROR:", "Open Internet Connection")
        }
    }

    @Override
    public int describeContents() {
        // TODO: 25/09/20
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    private final static Document recensioni = null;
}
