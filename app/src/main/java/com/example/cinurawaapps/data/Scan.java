package com.example.cinurawaapps.data;

import android.os.Parcel;
import android.os.Parcelable;

public class Scan implements Parcelable {
    private String id;
    private String nama;
    private String foto;
    private String keunggulan;
    private String alamatLengkap;
    private double latitude;
    private double longitude;

    public Scan() {
    }

    public Scan(String id, String nama, String foto, String keunggulan, String alamatLengkap, double latitude, double longitude) {
        this.id = id;
        this.nama = nama;
        this.foto = foto;
        this.keunggulan = keunggulan;
        this.alamatLengkap = alamatLengkap;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    protected Scan(Parcel in) {
        id = in.readString();
        nama = in.readString();
        foto = in.readString();
        keunggulan = in.readString();
        alamatLengkap = in.readString();
        latitude = in.readDouble();
        longitude = in.readDouble();
    }

    public static final Creator<Scan> CREATOR = new Creator<Scan>() {
        @Override
        public Scan createFromParcel(Parcel in) {
            return new Scan(in);
        }

        @Override
        public Scan[] newArray(int size) {
            return new Scan[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getKeunggulan() {
        return keunggulan;
    }

    public void setKeunggulan(String keunggulan) {
        this.keunggulan = keunggulan;
    }

    public String getAlamatLengkap() {
        return alamatLengkap;
    }

    public void setAlamatLengkap(String alamatLengkap) {
        this.alamatLengkap = alamatLengkap;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Scan{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", foto='" + foto + '\'' +
                ", keunggulan='" + keunggulan + '\'' +
                ", alamatLengkap='" + alamatLengkap + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(nama);
        dest.writeString(foto);
        dest.writeString(keunggulan);
        dest.writeString(alamatLengkap);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
    }
}
