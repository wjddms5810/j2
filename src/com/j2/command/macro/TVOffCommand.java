package com.j2.command.macro;
public class TVOffCommand implements Command{
	TV TV;
	int level;
	public TVOffCommand(TV TV) {
		this.TV = TV;
	}
 
	public void execute() {
        level = TV.getLevel();
		TV.off();
	}
 
	public void undo() {
		TV.control(level);
	}
}
