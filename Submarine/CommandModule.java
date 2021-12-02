package Submarine;

import java.util.ArrayList;

public class CommandModule {
    private Submarine submarine;

    public CommandModule() {
        this.submarine = new Submarine();
    }

    public int performInstructionsPart1(ArrayList<Instruction> instructions) {
        for(Instruction instruction : instructions) {
            switch(instruction.getDirection()) {
                case "forward":
                    submarine.moveSubHorizontal(instruction.getImpulse());
                    break;
                case "up":
                    submarine.moveSubDepth(-instruction.getImpulse());
                    break;
                case "down":
                    submarine.moveSubDepth(instruction.getImpulse());
                    break;
                default:
                   System.out.println("What have you done? " + instruction.getDirection());
            }
        }
        return submarine.getDepth() * submarine.getHorizontalPos();
    }


    public int performInstructionsPart2(ArrayList<Instruction> instructions) {
        for(Instruction instruction : instructions) {
            switch(instruction.getDirection()) {
                case "forward":
                    submarine.moveSubWithAim(instruction.getImpulse());
                    break;
                case "up":
                    submarine.calibrateAim(-instruction.getImpulse());
                    break;
                case "down":
                    submarine.calibrateAim(instruction.getImpulse());
                break;
                default:
                   System.out.println("What have you done? " + instruction.getDirection());
            }
        }
        return submarine.getDepth() * submarine.getHorizontalPos();
    }
}
