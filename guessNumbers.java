package stupid;

public class guessNumbers {
	private static int answer;
	private static int guess;
	private static int count;	//static instance variable is already set to 0 (default value)
	
	public static void startGame() {
		while(true) {
			try {
				guess = SimpleIO.readInt();
			} catch(NumberFormatException ex) {
				System.out.println("请输入一个 0 到 100 之间的整数！");
				continue;
			}
			count++;			
			if(guess == answer) {
				System.out.println("恭喜你猜对了！你一共猜了" + count + "次。");
				break;
			} else if(guess < answer) {
				System.out.println("太小了！再猜~");
			} else {
				System.out.println("太大了！再猜~");
			}			
		}		
	}
	
	public static void main(String[] args) {
		System.out.println("来猜一个 0 - 100 内的数字：");
		answer = (int) (Math.random() * 100);		
		startGame();
	}
}
