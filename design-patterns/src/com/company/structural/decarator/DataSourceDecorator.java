package com.company.structural.decarator;

/**
 * Created by omerfarukcoban on 7.12.2019.
 */
public class DataSourceDecorator implements DataSource {

    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }
}
