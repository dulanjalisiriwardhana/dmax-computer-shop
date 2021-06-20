package dmaxcomputershop;

public class AccessDatabase {

    private String item_id;
    private String item_name;
    private String item_model;
    private String item_brand;
    private String store_count;
    private String price;
    private String username;
    private String password;
    private String order_id;
    private String customer_name;
    private String customer_address;
    private String customer_nic;
    private String customer_email;
    private String quantity;

    public AccessDatabase(String Item_id, String Item_name, String Item_model, String Item_brand, String Store_count, String Price) {
        this.item_id = Item_id;
        this.item_name = Item_name;
        this.item_model = Item_model;
        this.item_brand = Item_brand;
        this.store_count = Store_count;
        this.price = Price;
    }

    public AccessDatabase(String Username, String Password) {
        this.username = Username;
        this.password = Password;
    }

    public AccessDatabase(String Order_id, String Customer_name, String Customer_address, String Customer_nic, String Customer_email, String Item_id, String Quantity, String Price) {
        this.order_id = Order_id;
        this.customer_name = Customer_name;
        this.customer_address = Customer_address;
        this.customer_nic = Customer_nic;
        this.customer_email = Customer_email;
        this.item_id = Item_id;
        this.quantity = Quantity;
        this.price = Price;
    }

    /**
     * @return the item_id
     */
    public String getItem_id() {
        return item_id;
    }

    /**
     * @param item_id the item_id to set
     */
    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    /**
     * @return the item_name
     */
    public String getItem_name() {
        return item_name;
    }

    /**
     * @param item_name the item_name to set
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    /**
     * @return the item_model
     */
    public String getItem_model() {
        return item_model;
    }

    /**
     * @param item_model the item_model to set
     */
    public void setItem_model(String item_model) {
        this.item_model = item_model;
    }

    /**
     * @return the item_brand
     */
    public String getItem_brand() {
        return item_brand;
    }

    /**
     * @param item_brand the item_brand to set
     */
    public void setItem_brand(String item_brand) {
        this.item_brand = item_brand;
    }

    /**
     * @return the store_count
     */
    public String getStore_count() {
        return store_count;
    }

    /**
     * @param store_count the store_count to set
     */
    public void setStore_count(String store_count) {
        this.store_count = store_count;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the order_id
     */
    public String getOrder_id() {
        return order_id;
    }

    /**
     * @param order_id the order_id to set
     */
    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    /**
     * @return the customer_name
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * @param customer_name the customer_name to set
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
     * @return the customer_address
     */
    public String getCustomer_address() {
        return customer_address;
    }

    /**
     * @param customer_address the customer_address to set
     */
    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    /**
     * @return the customer_nic
     */
    public String getCustomer_nic() {
        return customer_nic;
    }

    /**
     * @param customer_nic the customer_nic to set
     */
    public void setCustomer_nic(String customer_nic) {
        this.customer_nic = customer_nic;
    }

    /**
     * @return the customer_email
     */
    public String getCustomer_email() {
        return customer_email;
    }

    /**
     * @param customer_email the customer_email to set
     */
    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
