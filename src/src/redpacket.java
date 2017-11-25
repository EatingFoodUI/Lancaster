
package src;
public class redpacket {

     public static void main(String[] args) {
          redpacket redPacketOrdinary = new redpacket(300,3);
          redPacketOrdinary.get("获得者1");
          redPacketOrdinary.get("获得者2");
          redPacketOrdinary.get("获得者3");
          redPacketOrdinary.get("获得者4");
          redPacketOrdinary.get("获得者5");
     }

     private final int totalMoney;

     private final int redPacketNo;

     private int leftMoney;

     redpacket(int money,int no) {
          totalMoney = money;
          redPacketNo = no;
          leftMoney = totalMoney;
     }

     public void get(String name) {
          // 1分钱
          if (leftMoney <= 0) {
               System.out.println("红包抢完了");
          } else {
               int redPacket = totalMoney / redPacketNo;
               leftMoney = leftMoney - redPacket;
               if (leftMoney >= 0) {
                    System.out.println("红包金额" + redPacket / 100.0 + "元，抢夺者姓名：" + name);
               } else {
                    System.out.println("红包抢完了");
               }
          }
     }

}