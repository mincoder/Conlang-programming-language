package pamlang.compilers;

import pamlang.Keyslib;
import pamlang.compiler;

public class ebloop {

	public String compile(String command) {
        String todo = Keyslib.DeconstructKeysMessage(command)[1];
        command = "while(true) {" + compiler.compileLine(todo);
		return null;
	}

}
