package object;

public class Driver {

	public static void main(String[] args) {
		//		会社名表示
		System.out.println();
		SalesEmployee.displayCompany();

		//		インスタンス数の表示
		System.out.println();
		System.out.println("インスタンス数：" + SalesEmployee.instanceCnt);

		SalesEmployee member1 = new SalesEmployee("山田太郎", 200000);
		//		コンストラクターを設置したので、削除
		//		member1.name = "山田太郎";
		//		member1.salesAmt = 200000;
		System.out.println("");
		member1.displayInfo();
		
		//売上・情報表示
		member1.sell(300000);  //引数30万円
		member1.displayInfo();
		
		//デフォルト売上金額で、売上情報表示
		member1.sell(); //引数なし
		member1.displayInfo();

		SalesEmployee member2 = new SalesEmployee("鈴木次郎", 500000);
		//		コンストラクターを設置したので、削除
		//		member2.name = "鈴木次郎";
		//		member2.salesAmt = 500000;
		System.out.println("");
		member2.displayInfo();

		//		下記で、計上が逆であることになった
		member1.refund(200000); //20万円返品
		member2.sell(200000); //20万円売上
		System.out.println("---------返品、売上処理後---\n");
		member1.displayInfo();
		System.out.println();
		member2.displayInfo();
		System.out.println();
		System.out.println("合計売上金額" + (member1.salesAmt + member2.salesAmt) + "円");

	}

}
