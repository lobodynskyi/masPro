package com.masPro.masPro.gui;

import com.masPro.masPro.enums.ApplicationStatusEnum;
import com.masPro.masPro.enums.BloodTestEnum;
import com.masPro.masPro.enums.PaymentTypeEnum;
import com.masPro.masPro.enums.ResultDeliveryEnum;
import com.masPro.masPro.model.Application;

import javax.swing.table.AbstractTableModel;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public class ApplicationTableModel  extends AbstractTableModel {

    private List<Application> applications;
    private String headers[] = { "Id","Data badania", "Typ badania", "Typ płatności", "Dostarczenie wyników","Status", "Klient", "E-mail" };

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
                return app.getId();
            case 1:
                return app.getDateOfRes().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
            case 2:
                return BloodTestEnum.getByNumericStatus(app.getIdResearch()) ;
            case 3:
                return PaymentTypeEnum.getByNumericStatus(app.isPaymentMethod());
            case 4:
                return ResultDeliveryEnum.getByNumericStatus(app.isSendRez());
            case 5:
                return ApplicationStatusEnum.getByNumericStatus(app.getStatus());
            case 6:
                return app.getClient().getName() + " " + app.getClient().getLastName();
            case 7:
                return app.getClient().getEmail();
        }
        return null;
    }

    public void add(Application app) {
        applications.add(app);
        int row = applications.indexOf(app);
        fireTableRowsInserted(row, row);
    }
}
