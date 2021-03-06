package com.example.jstore_android_afdalridhoarman;


public class Location {
    private String province;
    private String description;
    private String city;

    //Konstruktor dari kelas Supplier
    public Location(String city, String province, String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }

    //Menampilkan nama provinsi
    /**
     * Method getProvince()
     * @return province
     */
    public String getProvince()
    {
        return province;
    }

    //Menampilkan nama kota
    /**
     * Method getCity()
     * @return city
     */
    public String getCity()
    {
        return city;
    }

    //Menampilkan deskripsi lokasi
    /**
     * Method getDescription()
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    //Mengganti nama provinsi
    /**
     * Method setProvince()
     * @param province
     */
    public void setProvince(String province)
    {
        this.province=province;
    }

    //Mengganti nama kota
    /**
     * Method setCity()
     * @param city
     */
    public void setCity(String city)
    {
        this.city=city;
    }

    //Mengganti deskripsi lokasi
    /**
     * Method setDescription()
     * @param description
     */
    public void setDescription(String description)
    {
        this.description=description;
    }


}