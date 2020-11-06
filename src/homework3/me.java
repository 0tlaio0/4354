package homework3;

public    class me  implements   BackInterface{
    private jd jd;
    @Override
    public void back() {

        jd.daohuo(this);
    }
public me(jd jd){
        this.jd=jd;
}
    public void xiadan(){System.out.println("我下单了...");
        jd.receive(this);}
        public  void receive(){
            System.out.println("我拿到电脑");

        }
}
