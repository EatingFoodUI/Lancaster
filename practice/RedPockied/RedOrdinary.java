/* public class RedOrdinary {
  public static void main(String[] args) {
       RedOrdinary redPacketOrdinary = new RedOrdinary(300,3);
       redPacketOrdinary.get("阿尔托莉雅");
       redPacketOrdinary.get("卫宫士郎");
       redPacketOrdinary.get("远坂时臣");
       redPacketOrdinary.get("间桐樱");
       redPacketOrdinary.get("远坂凛");
   }
   private final int totalMonry;
   private final int redpacketNo;
   private int leftMoney;

   RedOrdinary(int money,int no){
       totalMonry = money;
       redpacketNo = no;
       leftMoney = totalMonry;
   }
   public void get(String name) {
       // 1分钱
       if (leftMoney <= 0) {
           System.out.println("红包抢完了");
       }
       else {
           int RedOrdinary = totalMonry / redpacketNo;
           leftMoney = leftMoney - RedOrdinary;
           if (leftMoney >= 0){
               System.out.println("红包金额" + RedOrdinary / 100.0 + "元，抢夺者姓名：" + name);
           }
           else {
               System.out.println("红包抢完了");
           }
       }
   }
}*/
public  abstract class RedOrdinary {

    public int totalMonry;
    public int redpacketNo;
    public int leftMoney;

    /*RedOrdinary(int money,int no){
        totalMonry = money;
        redpacketNo = no;
        leftMoney = totalMonry;
    }*/
    public  abstract void get(String name);

}

