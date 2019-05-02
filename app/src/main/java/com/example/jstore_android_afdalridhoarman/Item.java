package com.example.jstore_android_afdalridhoarman;


public class Item {
    private int idItem;
    private String nameItem;
    private int priceItem;
    private String categoryItem;
    private String statusItem;
    private Supplier supplierItem;

    //Konstruktor dari kelas Item
    public Item(int idItem, String nameItem, int priceItem, String categoryItem, String statusItem, Supplier supplierItem)
    {
        this.idItem=idItem;
        this.nameItem=nameItem;
        this.priceItem=priceItem;
        this.categoryItem=categoryItem;
        this.statusItem=statusItem;
        this.supplierItem=supplierItem;
    }

    //Menampilkan nomor id
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        return idItem;
    }

    //Menampilkan nama Item
    /**
     * Method getName()
     * @return name
     */
    public String getName()
    {
        return nameItem;
    }

    //Menampilkan harga Item
    /**
     * Method getPrice()
     * @return price
     */
    public int getPrice()
    {
        return priceItem;
    }

    //Menampilkan kategori Item
    /**
     * Method getCategory()
     * @return category
     */
    public String getCategory()
    {
        return categoryItem;
    }

    public String getStatus()
    {
        return statusItem;
    }

    //Menampilkan supplier Item
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplierItem;
    }

    //Mengganti nomor id
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.idItem=idItem;
    }

    //Mengganti nama Item
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.nameItem=nameItem;
    }

    //Mengganti harga Item
    /**
     * Method setPrice()
     * @param price
     */
    public void setPrice(int price)
    {
        this.priceItem=priceItem;
    }

    //Mengganti kategori Item
    /**
     * Method setCategory()
     * @param category
     */
    public void setCategory(String category)
    {
        this.categoryItem=categoryItem;
    }

    public void setStatus(String status)
    {
        this.statusItem=statusItem;
    }

    //Mengganti supplier Item
    /**
     * Method setSupplier()
     * @param supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplierItem=supplierItem;
    }

}
