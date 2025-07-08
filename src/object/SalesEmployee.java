package object;

/**
 * 
 */
public class SalesEmployee {
	/**
	 * 名前
	 */
	String name;
	
	/**
	 * 売上合計金額
	 */
	int salesAmt;

	/**
	 * 売上合計金額
	 * @param amt　売上金額
	 * @return 　　処理後の売上合計金額
	 */
	int sell(int amt) {
		return salesAmt += amt;
	}

	/**
	 * 返品を受け付ける
	 * @param amt  返品金額
	 * @return　　　処理後の売上合計金額
	 */
	int refund(int amt) {
		return salesAmt -= amt;
	}


	/**
	 * 情報表示
	 */
	void displayInfo() {
		 System.out.println("名前:" + name);
		 System.out.println("売上:" + salesAmt + "円");
	}

}
