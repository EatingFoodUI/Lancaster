package redpacket;

public class RedPacketRandomSecret {

	public static void main(String[] args) {
		RedPacketRandomSecret redPacketRandom = new RedPacketRandomSecret(3300,3,"abc123");
		redPacketRandom.get("������1","abc123");
		redPacketRandom.get("������2","abc123");
		redPacketRandom.get("������3","abc123cc");
		redPacketRandom.get("������4","abc123");
		redPacketRandom.get("������5","abc123");
	}
	
	private final int totalMoney;
	
	private final int redPacketNo;
	
	private final String redPacketSecret;
	
	private int leftMoney;
	
	private int leftredPacketNo;
	
	private int maxMoney=0;
	
	private String maxName;
	
	RedPacketRandomSecret(int money,int no,String secret) {
		totalMoney = money;
		redPacketNo = no;
		redPacketSecret = secret;
		leftMoney = totalMoney;
		leftredPacketNo = redPacketNo;
	}
	
	public void get(String name, String secret){
		if(!redPacketSecret.equals(secret)){
			System.out.println(name+"��Ŀ���ԣ�");
		}
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
