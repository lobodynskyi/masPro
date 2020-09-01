package com.masPro.masPro.gui;

import com.masPro.masPro.enums.ApplicationStatusEnum;
import com.masPro.masPro.enums.BloodTestEnum;
import com.masPro.masPro.enums.PaymentTypeEnum;
import com.masPro.masPro.enums.ResultDeliveryEnum;
import com.masPro.masPro.model.Application;
import com.masPro.masPro.model.Client;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ClientsTableModel extends AbstractTableModel {
    private List<Client> clients;
    private String headers[] = { "E-mail","Imie", "Nazwisko", "Zniżka", "Uczulenia","Pesel", "Data urodzenia"};

    public ClientsTableModel(List<Client> clients) {
        this.clients = clients;
    }


    @Override
    public int getRowCount() {

        return clients.size();
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
        Client client = clients.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return client.getEmail();
            case 1:
                return client.getName();
            case 2:
                return client.getLastName();
            case 3:
                return client.getDiscount();
            case 4:
                return client.getAllergy();
            case 5:
                return client.getPasel();
            case 6:
                return client.getBirthday().toString();
        }
        return null;
    }

    public void add(Client client) {
        clients.add(client);
        int row = clients.indexOf(client);
        fireTableRowsInserted(row, row);
    }

    public Client getValueAtRow(int row) {
        return clients.get(row);
    }

    public void remove(Client item) {
        if (clients.contains(item)) {
            int row = clients.indexOf(item);
            clients.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }
}
