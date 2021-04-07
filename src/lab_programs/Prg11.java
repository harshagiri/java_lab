package lab_programs;

import javax.swing.*;

class Prg11 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// frame
	static JFrame f;
	// text areas
	static JTextArea t1, t2;

	// main class
	public static void main(String[] args) {
		// create a new frame
		f = new JFrame("frame");
		// create a object solve s = new solve();
		// create a panel
		JPanel p1 = new JPanel();
		JPanel p = new JPanel();
		// create text areas
		t1 = new JTextArea(10, 10);
		t2 = new JTextArea(10, 10);
		// set texts
		t1.setText("this  is  first  text  area");
		t2.setText("this  is  second  text  area");
		// add text area to panel p1.add(t1);
		p.add(t2);
		// create a splitpane
		JSplitPane sl = new JSplitPane(SwingConstants.HORIZONTAL, p1, p);
		// add panel f.add(sl);
		// set the size of frame f.setSize(300, 300);
		f.show();
	}
}
