/*public class RedPacketRandompoint {

    public static void main(String[] args) {
        RedPacketRandompoint redPacketRandom = new RedPacketRandompoint(3300,3,"abc123");
        redPacketRandom.get("高数","abc123");
        redPacketRandom.get("线代","abc123");
        redPacketRandom.get("数学建模","abc123cc");
        redPacketRandom.get("算法","abc123");
        redPacketRandom.get("几何","abc123");
    }

    private final int totalMoney;
    private final int redPacketNo;
    private final String redPacketSecret;
    private int leftMoney;
    private int leftredPacketNo;
    private int maxMoney=0;
    private String maxName;
    RedPacketRandompoint(int money,int no,String secret) {
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
*/
public abstract class RedPacketRandompoint {

    public  int totalMoney;
    public  int redPacketNo;
    public String redPacketSecret;
    public int leftMoney;
    public int leftredPacketNo;
    public int maxMoney=0;
    public String maxName;

    public abstract void get(String name, String secret);

}