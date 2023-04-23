abstract public class worker {
    private String name;
    private String address;
    worker(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
    abstract void earnings();
}


