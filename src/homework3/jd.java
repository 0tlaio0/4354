package homework3;

public    class jd  implements BackInterface{
    private me me;
    @Override
    public void back(){}
public jd(me me){
        this.me=me;
}
    public void receive(BackInterface BackInterface){
        System.out.println("京东收到订单...");
        System.out.println("京东店铺快递发货...");
BackInterface.back();

    }
    public void daohuo(me me){System.out.println("电脑到了...");
        me.receive();}
}
