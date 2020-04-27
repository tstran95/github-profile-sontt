package baitap;

public class BaiTapVeSo {
	private int[] mang;
	private int max;
	private int min;
	public void init() {
		mang = new int[] {0,1,2,3,4,5,6,7,8,9,6,9,9,0,9,4,5,7,9};
	}
	public void timMinMax() {
		min = max = mang[0];
		for (int i = 0; i < mang.length; i++) {
			if (max<=mang[i]) {
				max = mang [i];
			}
			if (min>=mang[i]) {
				min= mang[i];
			}
		}		int dem1 = 0;
		int dem2 = 0;
		String res1 = "";
		String res2 = "";
		boolean flag = true;
		boolean flag1 = true;
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] ==  max) {
				dem1++;
				if (flag) {
					res1 = i +"";
					flag = false;
				}
				else {
					res1 +="," + i;
				}
			}
			if (mang[i] == min) {
				dem2++;
				if (flag1) {
					res2 = i +"";
					flag1 = false;
				}else {
					res2 +="," + i;
				}
			}
		}
		System.out.println("Số nhỏ nhất là: " + min + " xuất hiện:"+dem2+" lần tại các vị trí "+ res2+".");
		System.out.println("Số nhỏ nhất là: " + max + " xuất hiện:"+dem1+" lần tại các vị trí "+ res1+".");
	}
	public static void main(String[] args) {
		BaiTapVeSo bt = new BaiTapVeSo();
		bt.init();
		bt.timMinMax();
	}
}