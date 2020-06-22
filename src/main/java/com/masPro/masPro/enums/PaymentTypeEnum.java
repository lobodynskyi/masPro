package com.masPro.masPro.enums;

public enum PaymentTypeEnum {

    CARD(1), CASH(2);

    private Integer value;

    PaymentTypeEnum(Integer status) {
        this.value = status;
    }

    public Integer getStatus() {
        return value;
    }

    public static PaymentTypeEnum getByNumericStatus(int status) {
        for (PaymentTypeEnum paymentTypeEnum : PaymentTypeEnum.values()) {
            if (paymentTypeEnum.getStatus() == status) {
                return paymentTypeEnum;
            }
        }
        return null;
    }

    public Integer getValue() {
        return value;
    }
}
