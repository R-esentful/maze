package maze_runner;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Stocks {
	
	int BurgerSteak =0;
	int Burger = 0;
	int ComboMeal=0;
	int Addon = 0;

	int selectedLine = 0;

	ArrayList<String> burgerSteakArray;

	public Stocks() throws IOException {
		JFrame Stocks = new JFrame();
		Stocks.setBounds(10,10,1393,781);
		Stocks.getContentPane().setLayout(null);

		BufferedReader product = new BufferedReader(new FileReader("ProductIMG/Products"));
		List<String> product_list = new ArrayList<String>();
		try {
			String line = null;
			while (( line = product.readLine()) != null){
				product_list.add(line);
			}
		}

		catch (FileNotFoundException e) {
		}
		finally {
			product.close();
		}
		String[] product_array = product_list.toArray(new String[]{});

		ArrayList<String> burgerArray = fileArray("ProductIMG/Burger/Burger.txt");
		ArrayList<String> addOnArray = fileArray("ProductIMG/Add-ON/Add-On.txt");

		ArrayList<String> comboMealArray = fileArray("ProductIMG/Combo Meal/CMeal.txt");

//		BufferedReader burgerFile = new BufferedReader(new FileReader("ProductIMG/Burger/Burger.txt"));
//		BufferedReader addOnFile = new BufferedReader(new FileReader("ProductIMG/Burger/Add-On.txt"));
//		BufferedReader burgerSteakFile = new BufferedReader(new FileReader("ProductIMG/Burger/BurgerSteak.txt"));
//		BufferedReader comboMealFile = new BufferedReader(new FileReader("ProductIMG/Burger/CMeal.txt"));

		JButton btnNewButton = new JButton("New button 2");
		btnNewButton.setBounds(863, 599, 132, 50);
		Stocks.getContentPane().add(btnNewButton);
		
		JButton updateButton = new JButton("Update");
		updateButton.setBounds(1007, 599, 132, 50);
		Stocks.getContentPane().add(updateButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(1150, 599, 132, 50);
		Stocks.getContentPane().add(cancelButton);
		
		JLabel lbl2 = new JLabel("New label 5");
		lbl2.setBounds(291, 13, 236, 295);
		Stocks.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("New label 6");
		lbl3.setBounds(581, 13, 236, 295);
		Stocks.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("New label 7");
		lbl4.setBounds(12, 426, 236, 295);
		Stocks.getContentPane().add(lbl4);
		
		JLabel lbl5 = new JLabel("New label 8");
		lbl5.setBounds(291, 426, 236, 295);
		Stocks.getContentPane().add(lbl5);
		
		JLabel lbl6 = new JLabel("New label 9");
		lbl6.setBounds(581, 426, 236, 295);
		Stocks.getContentPane().add(lbl6);
		
		JPanel panel = new JPanel();
		panel.setBounds(863, 13, 419, 284);
		Stocks.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel img = new JLabel("New label 10");
		img.setBounds(0, 0, 419, 284);
		panel.add(img);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(863, 324, 419, 127);
		Stocks.getContentPane().add(textArea);
		
		JLabel lbl1 = new JLabel("New label 1");
		
		lbl1.setBounds(12, 13, 236, 295);
		Stocks.getContentPane().add(lbl1);

		JComboBox comboBox = new JComboBox();

		comboBox.addItem(product_array[0]);
		comboBox.addItem(product_array[1]);
		comboBox.addItem(product_array[2]);
		comboBox.addItem(product_array[3]);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals(product_array[0])){
					
					BurgerSteak =1;
					Burger = 0;
					ComboMeal=0;
					Addon=0;
					
					lbl1.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(), Image.SCALE_SMOOTH)));
					lbl2.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
					lbl3.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
					lbl4.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
					lbl5.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
					lbl6.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));
				}
				else if(comboBox.getSelectedItem().equals(product_array[1])){
					BurgerSteak =0;
					Burger = 1;
					ComboMeal=0;
					Addon=0;
					
					lbl1.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));
					lbl2.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
					lbl3.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
					lbl4.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
					lbl5.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
					lbl6.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));


				}
				else if(comboBox.getSelectedItem().equals(product_array[2])){
					BurgerSteak =0;
					Burger = 0;
					ComboMeal=1;
					Addon=0;
					
					lbl1.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));
					lbl2.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
					lbl3.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
					lbl4.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
					lbl5.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
					lbl6.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));

				}
				else if(comboBox.getSelectedItem().equals(product_array[3])){
					BurgerSteak =0;
					Burger = 0;
					ComboMeal=0;
					Addon=1;
					
					lbl1.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));
					lbl2.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
					lbl3.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
					lbl4.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
					lbl5.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
					lbl6.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));

				}
			}
		});
		comboBox.setBounds(863, 464, 419, 50);
		Stocks.getContentPane().add(comboBox);
		
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(BurgerSteak == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(), Image.SCALE_SMOOTH)));

					selectedLine = 1;
					try {
						burgerSteakArray = fileArray("ProductIMG/BurgerSteak/BurgerSteak.txt");
						String[] split = burgerSteakArray.get(0).split("\\s");
						String join = String.join("\n", split);
						textArea.setText(join);
					} catch (IOException ioException) {
						ioException.printStackTrace();
					}
				}
				else if (Burger == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));
				}
				else if(ComboMeal == 1){
					lbl1.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));

				}
				else if (Addon == 1){
					lbl1.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A1.png").getImage().getScaledInstance(lbl1.getWidth(),lbl1.getHeight(),Image.SCALE_SMOOTH)));

				}
				
			}
		});
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(BurgerSteak == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(), Image.SCALE_SMOOTH)));
				}
				else if (Burger == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));
				}
				else if(ComboMeal == 1){
					lbl1.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));

				}
				else if (Addon == 1){
					lbl1.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A2.png").getImage().getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH)));

				}

			}
		});
		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(BurgerSteak == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(), Image.SCALE_SMOOTH)));
				}
				else if (Burger == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));
				}
				else if(ComboMeal == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));

				}
				else if (Addon == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A3.png").getImage().getScaledInstance(lbl3.getWidth(),lbl3.getHeight(),Image.SCALE_SMOOTH)));

				}

			}
		});
		lbl4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(BurgerSteak == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(), Image.SCALE_SMOOTH)));
				}
				else if (Burger == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));
				}
				else if(ComboMeal == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));

				}
				else if (Addon == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A4.png").getImage().getScaledInstance(lbl4.getWidth(),lbl4.getHeight(),Image.SCALE_SMOOTH)));

				}
			}
		});
		lbl5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(BurgerSteak == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(), Image.SCALE_SMOOTH)));
				}
				else if (Burger == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));
				}
				else if(ComboMeal == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));

				}
				else if (Addon == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A5.png").getImage().getScaledInstance(lbl5.getWidth(),lbl5.getHeight(),Image.SCALE_SMOOTH)));

				}
			}
		});
		lbl6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(BurgerSteak == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/BurgerSteak/BS6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(), Image.SCALE_SMOOTH)));
				}
				else if (Burger == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Burger/burger6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));
				}
				else if(ComboMeal == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Combo Meal/C6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));

				}
				else if (Addon == 1){
					img.setIcon(new ImageIcon(new ImageIcon("ProductIMG/Add-On/A6.png").getImage().getScaledInstance(lbl6.getWidth(),lbl6.getHeight(),Image.SCALE_SMOOTH)));

				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		lblNewLabel.setBounds(0, 0, 1375, 734);
		Stocks.getContentPane().add(lblNewLabel);
		
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.print("Cancel");
				Stocks.setVisible(false);
			}
		});

		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {

				String[] input = textArea.getText().split("\\n");
				String joined = String.join(" ", input);

				try {
					writeFile(joined);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
		
		Stocks.setVisible(true);
	}

	public static ArrayList<String> fileArray(String filename) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader(filename));
		ArrayList<String> array = new ArrayList<String>();
		String line;

		while ((line = file.readLine()) != null) {
			array.add(line);
		}

		return array;
	}

	public void writeFile(String content) throws IOException {
		ArrayList<String> fileContent;
		Path path = null;

		if (Burger == 1) {
			path = Paths.get("ProductIMG/Burger/Burger.txt") ;
		}
		if (Addon == 1) {
			path = Paths.get("ProductIMG/Add-ON/Add-On.txt");
		}
		if (BurgerSteak == 1) {
			path = Paths.get("ProductIMG/BurgerSteak/BurgerSteak.txt");
		}
		if (ComboMeal == 1) {
			path = Paths.get("ProductIMG/Combo Meal/CMeal.txt");
		}

		fileContent = new ArrayList<String>(Files.readAllLines(path));

		for (int i = 0; i < fileContent.size();i++) {
			if (i == selectedLine - 1) {
				fileContent.set(i, content);
			}
		}

		Files.write(path, fileContent, StandardCharsets.UTF_8);
		System.out.print(fileContent);
	}

	public static void main(String[] args) throws IOException {
		new Stocks();

	}
}