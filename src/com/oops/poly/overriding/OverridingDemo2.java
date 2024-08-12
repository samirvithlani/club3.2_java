package com.oops.poly.overriding;

import java.io.File;
import java.io.IOException;

class Unity {

	public void statue() throws RuntimeException {

	}

}

public class OverridingDemo2 extends Unity {

	public void statue() {

		File file = new File("");
		//file.createNewFile();
	}

	public static void main(String[] args) {

	}
}
