package redpacket;

public class RedPacketOrdinary {

	public static void main(String[] args) {
		RedPacketOrdinary redPacketOrdinary = new RedPacketOrdinary(300,3);
		redPacketOrdinary.get("李永林1");
		redPacketOrdinary.get("李永林2");
		redPacketOrdinary.get("李永林3");
		redPacketOrdinary.get("李永林4");
		redPacketOrdinary.get("李永林5");
	}

	private final int totalMoney;

	private final int redPacketNo;

	private int leftMoney;

	RedPacketOrdinary(int money,int no) {
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
				System.out.println("红包金额：" + redPacket / 100.0 + "元,抢夺人姓名：" + name);
			} else {
				System.out.println("红包抢完了");
			}
		}
	}

}
