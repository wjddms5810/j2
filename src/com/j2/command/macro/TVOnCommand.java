package com.j2.command.macro;

public class TVOnCommand implements Command{
	TV TV;
	int level;
	public TVOnCommand(TV TV) {
		this.TV = TV;
	}
 
	public void execute() {
        level = TV.getLevel();
		TV.on();
	}
 
	public void undo() {
		TV.control(level);
	}

}

