
import java.util.Random;
public class osake_random {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random random = new Random();
		int r = random.nextInt(3);
		System.out.println(r);
		if(r==0){
			System.out.println("うどん");
		}else if(r==1){
			System.out.println("スぺ");

		}else if(r==2){
			System.out.println("よたにき");

		}
	}

}
