package com.masPro.masPro.enums;

public enum ResultDeliveryEnum {

    EMAIL(1), INCLINIC(2);

    private Integer value;

    ResultDeliveryEnum(Integer status) {
        this.value = status;
    }

    public Integer getStatus() {
        return value;
    }

    public static ResultDeliveryEnum getByNumericStatus(int status) {
        for (ResultDeliveryEnum resultDeliveryEnum : ResultDeliveryEnum.values()) {
            if (resultDeliveryEnum.getStatus() == status) {
                return resultDeliveryEnum;
            }
        }
        return null;
    }

    public Integer getValue() {
        return value;
    }
}
