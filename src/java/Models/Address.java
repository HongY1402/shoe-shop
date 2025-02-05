package Models;

/**
 *
 * @author Duy
 */
public class Address {
    private String addressId;
    private String city;
    private String addressDetail;
    private String staffId;
    private String customerId;
    private boolean isPrimary;

    public Address(String addressId, String city, String addressDetail, String staffId, String customerId,
            boolean isPrimary) {
        this.addressId = addressId;
        this.city = city;
        this.addressDetail = addressDetail;
        this.staffId = staffId;
        this.customerId = customerId;
        this.isPrimary = isPrimary;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

}
