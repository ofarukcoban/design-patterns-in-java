package com.company.structural.decarator;

/**
 * Created by omerfarukcoban on 7.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        String data = "Secret Info";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("OutputDemo.txt")));
        encoded.writeData(data);

        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
