package ch10ex3;

public class WaterProduction extends Water implements HuanChong, JiaRe,
		FangTang, GuoLv {

	@Override
	public void huanChong() {
		// TODO Auto-generated method stub
		System.out.println("缓冲成功！");
	}
	@Override
	public void guoLv() {
		System.out.println("过滤成功！");

	}
	@Override
	public void jiaRe() {
		// TODO Auto-generated method stub
		System.out.println("加热成功！");
	}

	@Override
	public void fangTang() {
		// TODO Auto-generated method stub
		System.out.println("放糖成功！");

	}

	

	

}
