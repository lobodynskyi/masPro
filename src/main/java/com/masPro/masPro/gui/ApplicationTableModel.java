package com.masPro.masPro.gui;

import com.masPro.masPro.enums.ApplicationStatusEnum;
import com.masPro.masPro.enums.BloodTestEnum;
import com.masPro.masPro.enums.PaymentTypeEnum;
import com.masPro.masPro.enums.ResultDeliveryEnum;
import com.masPro.masPro.model.Application;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ApplicationTableModel  extends AbstractTableModel {

    private List<Application> applications;
    private String headers[] = { "id", "typ badania", "typ platnosci", "dostarczenie wyniol","status" };

    public ApplicationTableModel(List<Application> list) {
        this.applications = list;
    }


    @Override
    public int getRowCount() {

        return applications.size();
    }

    @Override
    public String getColumnName(int column) {

        return headers[column];
    }

    @Override
    public int getColumnCount() {

        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Application app = applications.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return app.getDateOfRes();
            case 1:
                return BloodTestEnum.getByNumericStatus(app.getIdResearch()) ;
            case 2:
                return PaymentTypeEnum.getByNumericStatus(app.isPaymentMethod());
            case 3:
                return ResultDeliveryEnum.getByNumericStatus(app.isSendRez());
            case 4:
                return ApplicationStatusEnum.getByNumericStatus(app.getStatus());
        }
        return null;
    }

    public void add(Application app) {
        applications.add(app);
        int row = applications.indexOf(app);
        fireTableRowsInserted(row, row);
    }

    public Application getValueAtRow(int row) {
        return applications.get(row);
    }

    public void remove(Application item) {
        if (applications.contains(item)) {
            int row = applications.indexOf(item);
            applications.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }

}
