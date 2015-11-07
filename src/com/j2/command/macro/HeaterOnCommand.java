package com.j2.command.macro;
public class HeaterOnCommand implements Command{
	Heater Heater;
	int level;
	public HeaterOnCommand(Heater Heater) {
		this.Heater = Heater;
	}
 
	public void execute() {
        level = Heater.getLevel();
		Heater.on();
	}
 
	public void undo() {
		Heater.control(level);
	}

}
