package redpacket;

public class RedPacketRandomSecret {

	public static void main(String[] args) {
		RedPacketRandomSecret redPacketRandom = new RedPacketRandomSecret(3300,3,"abc123");
		redPacketRandom.get("李永林1","abc123");
		redPacketRandom.get("李永林2","abc123");
		redPacketRandom.get("李永林3","abc123cc");
		redPacketRandom.get("李永林4","abc123");
		redPacketRandom.get("李永林5","abc123");
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
			System.out.println(name+"你的口令不对！");
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
				System.out.println("红包金额："+redPacket/100.0+"元,抢夺人姓名："+name);
			}else {	
				redPacket = leftMoney;
				if(redPacket>=maxMoney){
					maxMoney = redPacket;
					maxName = name;
				}
				System.out.println("红包金额："+redPacket/100.0+"元,抢夺人姓名："+name);
				System.out.println("运气王："+"红包金额："+maxMoney/100.0+"元,抢夺人姓名："+maxName);
				
			}
			leftMoney = leftMoney - redPacket;
			leftredPacketNo --;
			
		}
	}
	

}
