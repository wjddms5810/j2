package com.j2.command.macro;

public class DVDOnCommand implements Command{
	DVD dvd;
	int level;
	public DVDOnCommand(DVD dvd) {
		this.dvd = dvd;
	}
 
	public void execute() {
        level = dvd.getLevel();
		dvd.on();
	}
 
	public void undo() {
		dvd.control(level);
	}

}
