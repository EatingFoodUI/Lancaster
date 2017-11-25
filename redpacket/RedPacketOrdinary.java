package redpacket;

public class RedPacketOrdinary {

	public static void main(String[] args) {
		RedPacketOrdinary redPacketOrdinary = new RedPacketOrdinary(300,3);
		redPacketOrdinary.get("������1");
		redPacketOrdinary.get("������2");
		redPacketOrdinary.get("������3");
		redPacketOrdinary.get("������4");
		redPacketOrdinary.get("������5");
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
		// 1��Ǯ
		if (leftMoney <= 0) {
			System.out.println("���������");
		} else {
			int redPacket = totalMoney / redPacketNo;
			leftMoney = leftMoney - redPacket;
			if (leftMoney >= 0) {
				System.out.println("�����" + redPacket / 100.0 + "Ԫ,������������" + name);
			} else {
				System.out.println("���������");
			}
		}
	}

}
