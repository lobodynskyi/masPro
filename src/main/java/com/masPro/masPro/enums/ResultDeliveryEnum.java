package com.masPro.masPro.enums;

import java.util.ArrayList;

public enum ResultDeliveryEnum {

    EMAIL(1), IN_CLINIC(2);

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

    public static String[] getStringArray(){
        ArrayList<String> enumList = new ArrayList<>();
        for (ResultDeliveryEnum resultDeliveryEnum : ResultDeliveryEnum.values()) {
            enumList.add(resultDeliveryEnum.name()) ;
        }
        return enumList.toArray(new String[enumList.size()]);
    }
}
