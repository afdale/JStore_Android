package com.example.jstore_android_afdalridhoarman;


public class Supplier {
    private int idSupplier;
    private String nameSupplier;
    private String emailSupplier;
    private String phoneNumberSupplier;
    private Location locationSupplier;

    //Konstruktor dari kelas Supplier
    public Supplier(int idSupplier, String nameSupplier, String emailSupplier, String phoneNumberSupplier, Location locationSupplier)
    {

        this.nameSupplier=nameSupplier;
        this.emailSupplier=emailSupplier;
        this.phoneNumberSupplier=phoneNumberSupplier;
        this.locationSupplier=locationSupplier;
        this.idSupplier=idSupplier;
    }

    //Menampilkan nomor id supplier
    /**
     * Method getId()
     * @return id
     */
    public int getIdSupplier()
    {
        return idSupplier;
    }

    //Menampilkan nama supplier
    /**
     * Method getName()
     * @return name
     */
    public String getNameSupplier()
    {
        return nameSupplier;
    }

    //Menampilkan email supplier
    /**
     * Method getEmail()
     * @return email
     */
    public String getEmailSupplier()
    {
        return emailSupplier;
    }

    //Menampilkan nomor telepon supplier
    /**
     * Method getPhoneNumber()
     * @return phoneNumber
     */
    public String getPhoneNumberSupplier()
    {
        return phoneNumberSupplier;
    }

    //Menampilkan lokasi supplier
    /**
     * Method getLccation()
     * @return location
     */
    public Location getLocationSupplier()
    {
        return locationSupplier;
    }

    //Mengubah id supplier
    /**
     * Method setId()
     * @param idSupplier
     */
    public void setIdSupplier(int idSupplier)
    {
        this.idSupplier=idSupplier;
    }

    //Mengubah nama supplier
    /**
     * Method setName()
     * @param nameSupplier
     */
    public void setNameSupplier(String nameSupplier)
    {
        this.nameSupplier=nameSupplier;
    }

    //Mengubah email supplier
    /**
     * Method setEmail()
     * @param emailSupplier
     */
    public void setEmailSupplier(String emailSupplier)
    {
        this.emailSupplier=emailSupplier;
    }

    //Mengubah nomor telepon supplier
    /**
     * Method setPhoneNumber()
     * @param phoneNumberSupplier
     */
    public void setPhoneNumberSupplier(String phoneNumberSupplier)
    {
        this.phoneNumberSupplier=phoneNumberSupplier;
    }

    //Mengubah lokasi supplier
    /**
     * Method setLocation()
     * @param locationSupplier
     */
    public void setLocationSupplier(Location locationSupplier)
    {
        this.locationSupplier=locationSupplier;
    }

    public String getName() {
        return nameSupplier;
    }

    public int getId() {
        return idSupplier;
    }
}