package com.daysun.javase.adv.reflection;

/**
 * Created by Administrator on 2016/9/27.
 */
public class AddressPort {
    @BindAddress("http://www.hfjy.com")
    private String address;

    @BindPort("8080")
    private String port;

    private int number;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void info(){
        System.out.println("info is "+address+":"+port);
    }


    @BindGet("hello")
    public void getHttp(String param){
        String url="http://www.luqu.la/?username="+param;
        System.out.println("get--------> "+url);
    }

}
