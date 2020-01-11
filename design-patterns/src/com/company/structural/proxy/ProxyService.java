package com.company.structural.proxy;

/**
 * Created by omerfarukcoban on 9.12.2019.
 */
public class ProxyService implements Service {

    private RealService service;

    public ProxyService(RealService service) {
        this.service = service;
    }

    @Override
    public void someOperation() {
        if(checkAccess())
            service.someOperation();
    }

    private boolean checkAccess(){
        return true;
    }
}
