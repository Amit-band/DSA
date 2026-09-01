package undoSystem;

public class ProgramDriver {
	public static void main(String[] args) {
		UndoSystem us = new UndoSystem();
		us.TYPE("A");
		us.TYPE("B");
		us.UNDO();
		us.UNDO();
		us.UNDO();
		us.printData();
		us.REDO();
		us.REDO();
		us.printData();
	}
}
