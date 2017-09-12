package com.briup.ch15;

public class Printer1 extends Thread {
	public Storage sto;

	public Printer1() {
	}

	public Printer1(String name, Storage sto) {
		setName(name);
		this.sto = sto;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (sto) {
				if (!sto.isFlag()) {

					try {
						sto.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
				System.out.println(getName() + "取出了：" + sto.getA());
				sto.setFlag(false);
				sto.notify();
				try {
					sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}

		}
	}
}
