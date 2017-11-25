package redpacket;

public class RedPacketRandom {

	public static void main(String[] args) {
		RedPacketRandom redPacketRandom = new RedPacketRandom(30000,3);
		redPacketRandom.get("������1");
		redPacketRandom.get("������2");
		redPacketRandom.get("������3");
		redPacketRandom.get("������4");
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
			System.out.println("���������");
		}else{
			int redPacket;
			if(leftredPacketNo >1){
				redPacket = (int) (leftMoney*Math.random());
				if(redPacket>=maxMoney){
					maxMoney = redPacket;
					maxName = name;
				}
				System.out.println("�����"+redPacket/100.0+"Ԫ,������������"+name);
			}else {	
				redPacket = leftMoney;
				if(redPacket>=maxMoney){
					maxMoney = redPacket;
					maxName = name;
				}
				System.out.println("�����"+redPacket/100.0+"Ԫ,������������"+name);
				System.out.println("��������"+"�����"+maxMoney/100.0+"Ԫ,������������"+maxName);
				
			}
			leftMoney = leftMoney - redPacket;
			leftredPacketNo --;
			
		}
	}
	

}
