public class RedPacketPointab extends RedPacketRandompoint{
    public static void main(String[] args) {
        RedPacketPointab redPacketRandom = new RedPacketPointab(3300,3,"abc123");
        redPacketRandom.get("高数","abc123");
        redPacketRandom.get("线代","abc123");
        redPacketRandom.get("数学建模","abc123cc");
        redPacketRandom.get("算法","abc123");
        redPacketRandom.get("几何","abc123");
    }

    RedPacketPointab(int money,int no,String secret) {
        totalMoney = money;
        redPacketNo = no;
        redPacketSecret = secret;
        leftMoney = totalMoney;
        leftredPacketNo = redPacketNo;
    }

    public void get(String name, String secret){
        if(!redPacketSecret.equals(secret)){
            System.out.println(name+"口令不对!");
        }
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
                System.out.println("红包金额："+redPacket/100.0+"元，抢夺者姓名："+name);
            }else {
                redPacket = leftMoney;
                if(redPacket>=maxMoney){
                    maxMoney = redPacket;
                    maxName = name;
                }
                System.out.println("红包金额："+redPacket/100.0+"元，抢夺者姓名"+name);
                System.out.println("运气王："+"红包金额："+maxMoney/100.0+"元，抢夺者姓名："+maxName);

            }
            leftMoney = leftMoney - redPacket;
            leftredPacketNo --;

        }
    }
}
