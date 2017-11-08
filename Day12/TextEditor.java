import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TextEditor {

	JFrame frame;
	JButton load_button;
	JButton save_button;
	JTextArea text_area;
	JPanel panel;

	public TextEditor() {
		frame = new JFrame();
		panel = new JPanel();

    // Create other components
		load_button = new JButton("Load File");
		save_button = new JButton("Save File");
		text_area = new JTextArea(40, 40);

		load_button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
    			System.out.println("Loading file...");
					loadFile();
        }
    });
		
		save_button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					System.out.println("Saving file...");
					saveFile();
				}
		});


    // Add other components to frame?
		panel.add(load_button);
		panel.add(save_button);
		panel.add(text_area);
		frame.add(panel);

		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void loadFile() {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		File f = jfc.getSelectedFile();
		try {
			Scanner my_scanner = new Scanner(f);
			while (my_scanner.hasNextLine()) {
				String line = my_scanner.nextLine();
				text_area.append(line + "\n");
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e);
		}
		
	}
	
	public void saveFile() {
		JFileChooser jfc = new JFileChooser();
		jfc.showSaveDialog(null);
		File f = jfc.getSelectedFile();
		try {
			PrintWriter pw = new PrintWriter(f.getPath());
			String txt = text_area.getText();
			pw.write(txt);
			pw.flush();
			pw.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e);
		}
	}
	
	

	public static void main(String args[]) {
		TextEditor editor = new TextEditor();
	}
}







//
