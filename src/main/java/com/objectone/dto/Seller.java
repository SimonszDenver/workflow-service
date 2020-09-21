package com.objectone.dto;
import java.util.HashMap;
import java.util.Map;

public class Seller {
    private String distributorId;
    private Map<String, Object> sellerDetails;

    public Seller() {
    }

    public Seller(String distributorId, Map<String, Object> sellerDetails) {
        this.distributorId = distributorId;
        this.sellerDetails = sellerDetails;
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    public Map<String, Object> getSellerDetails() {
        return sellerDetails;
    }

    public void setSellerDetails(Map<String, Object> sellerDetails) {
        this.sellerDetails = sellerDetails;
    }

    public Map<String, Object> convertToMap(){
        Map<String, Object> sellerMap = new HashMap<>();
        sellerMap.put("distributorId", this.distributorId);
        sellerMap.put("sellerDetails", this.sellerDetails);
        return sellerMap;
    }
}
