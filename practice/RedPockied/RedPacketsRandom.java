/*public class RedPacketsRandom
{
    public static void main(String[] args) {
        RedPacketsRandom redPacketsRandom = new RedPacketsRandom(30000,5);
        redPacketsRandom.get("斯蒂芬库里");
        redPacketsRandom.get("克莱汤普森");
        redPacketsRandom.get("凯文杜兰特");
        redPacketsRandom.get("伊戈达拉");
        redPacketsRandom.get("德拉蒙德格林");
    }
    private final int totalMoney;
    private final int redPacketNo;
    private int leftMoney;
    private int leftredPacketNo;
    private int maxMoney=0;
    private String maxName;

    RedPacketsRandom(int money,int no){
        totalMoney = money;
        redPacketNo = no;
        leftMoney = totalMoney;
        leftredPacketNo = redPacketNo;
    }

    public void get(String name){
        if(leftMoney <=0){
            System.out.println("红包抢完了");
        }
        else{
            int redPacket;
            if(leftredPacketNo >1){
                redPacket = (int)(leftMoney*Math.random());
                if(redPacket>=maxMoney){
                    maxMoney = redPacket;
                    maxName = name;
                }
                System.out.println("红包金额："+redPacket/100.0+"元，抢夺者姓名"+name);
            }
            else {
                redPacket = leftMoney;
                if (redPacket>=maxMoney) {
                    maxMoney = redPacket;
                    maxName = name;
                }
                System.out.println("红包金额：" + redPacket / 100.0 + "元，抢夺者姓名：" + name);
                System.out.println("运气王：" + maxMoney/ 100.0 + "元，抢夺者姓名" + maxName);
            }
            leftMoney = leftMoney - redPacket;
            leftredPacketNo --;
        }
    }
}
*/
public  abstract class RedPacketsRandom {
    /* public static void main(String[] args) {
         RedPacketsRandom redPacketsRandom = new RedPacketsRandom(30000,5);
         redPacketsRandom.get("斯蒂芬库里");
         redPacketsRandom.get("克莱汤普森");
         redPacketsRandom.get("凯文杜兰特");
         redPacketsRandom.get("伊戈达拉");
         redPacketsRandom.get("德拉蒙德格林");
     } */
    public int totalMoney;
    public int redPacketNo;
    public int leftMoney;
    public int leftredPacketNo;
    public int maxMoney = 0;
    public String maxName;

    public abstract void get(String name);
}