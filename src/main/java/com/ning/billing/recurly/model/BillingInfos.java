package com.ning.billing.recurly.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "coupons")
public class BillingInfos extends RecurlyObjects<BillingInfo> {

    @XmlTransient
    public static final String BILLING_INFO_RESOURCE = "/billing_info";

    @XmlTransient
    private static final String PROPERTY_NAME = "billing_info";

    @JsonSetter(value = PROPERTY_NAME)
    @Override
    public void setRecurlyObject(final BillingInfo value) {
        super.setRecurlyObject(value);
    }

    @JsonIgnore
    public BillingInfos getStart() {
        return getStart(BillingInfos.class);
    }

    @JsonIgnore
    public BillingInfos getPrev() {
        return getPrev(BillingInfos.class);
    }

    @JsonIgnore
    public BillingInfos getNext() {
        return getNext(BillingInfos.class);
    }
}
