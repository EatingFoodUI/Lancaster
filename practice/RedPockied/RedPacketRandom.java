package src;

public class RedPacketRandom {

    public static void main(String[] args) {
        RedPacketRandom redPacketRandom = new RedPacketRandom(30000,3);
        redPacketRandom.get("抢夺者1");
        redPacketRandom.get("抢夺者2");
        redPacketRandom.get("抢夺者3");
        redPacketRandom.get("抢夺者4");
    }

    private final int totalMoney;

    private final int redPacketNo;

    private int leftMoney;

    private int leftredPacketNo;

    private int maxMoney=0;

    private String maxName;

    RedPacketRandom(int money,int no) {
        totalMoney = money;
        redPacketNo = no;
        leftMoney = totalMoney;
        leftredPacketNo = redPacketNo;
    }

    public void get(String name){
        if(leftMoney <=0){
            System.out.println("红包抢完了");
        }else{
            int redPacket;
            if(leftredPacketNo >1){
                redPacket = (int) (leftMoney*Math.random());
                if(redPacket>=maxMoney){
                    maxMoney = redPacket;
                    maxName = name;
                }
                System.out.println("红包金额："+redPacket/100.0+"元，抢夺者姓名："+name);
            }else {
                redPacket = leftMoney;
                if(redPacket>=maxMoney){
                    maxMoney = redPacket;
                    maxName = name;
                }
                System.out.println("红包金额："+redPacket/100.0+"元，抢夺者姓名："+name);
                System.out.println("运气王："+"红包金额"+maxMoney/100.0+"元，抢夺者姓名"+maxName);

            }
            leftMoney = leftMoney - redPacket;
            leftredPacketNo --;

        }
    }


}
