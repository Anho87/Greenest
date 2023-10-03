import javax.swing.*;
import java.io.*;
import java.util.*;


public class Greenest {

    public static void main(String[] args) {
        new Greenest();
    }

    public Greenest() {
        List<Plant> plantList = new ArrayList<>();
        readDataFromFile(plantList);
        checkHowMuchWater(plantList);
    }

    public void readDataFromFile(List<Plant> plantList) {
        try (BufferedReader in = new BufferedReader(new FileReader("Data"))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 3) {
                    try {
                        String type = parts[0];
                        String name = parts[1];
                        double height = Double.parseDouble(parts[2]);
                        createPlant(type, name, height, plantList);
                    } catch (NumberFormatException e) {
                        System.out.println("Det blev fel när filen lästes!");
                        System.exit(0);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("hitta inte filen" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Filen kunde inte läsas");
        }
    }

    public void addPlant(List<Plant> plantList) {

        JPanel panel = new JPanel();
        String[] options = {"Palm", "Köttätare", "Kaktus"};
        JComboBox<String> dropdown = new JComboBox<>(options);

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        panel.add(new JLabel("Typ av växt: "));
        panel.add(dropdown);
        panel.add(new JLabel("Namn: "));
        panel.add(textField1);
        panel.add(new JLabel("Höjd: "));
        panel.add(textField2);

        int result = JOptionPane.showConfirmDialog(null, panel, "Greenest", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String type = (String) dropdown.getSelectedItem();
            String name = textField1.getText().trim();
            String textfield2String = textField2.getText();
            if (name.isEmpty() || textfield2String.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Du måste skriva in något i båda rutorna.");
            } else {
                try {
                    name = name.toLowerCase();
                    name = name.substring(0, 1).toUpperCase() + name.substring(1);
                    double height = Double.parseDouble(textfield2String);
                    createPlant(type, name, height, plantList);
                    printToDataFile(type, name, height);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Du måste skriva in ett nummer i höjd rutan.");
                }
            }
        }
        checkHowMuchWater(plantList);
    }

    public void checkHowMuchWater(List<Plant> plantList) {

        JFrame frame = new JFrame("Greenest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 230);

        JTextArea textArea = new JTextArea(7, 18);
        textArea.setEditable(false);

        List<CustomItem> options = new ArrayList<>();
        for (Plant p : plantList) {
            options.add(new CustomItem(p.getName(), p.printToTextArea()));
        }
        textArea.setText(plantList.get(0).printToTextArea());
        JComboBox<CustomItem> dropdown = new JComboBox<>(options.toArray(new CustomItem[0]));

        JPanel panel = new JPanel();
        JButton addButton = new JButton("Lägg till växt");
        JButton exitButton = new JButton("Exit");
        panel.add(new JLabel("Välj en växt"));
        panel.add(dropdown);
        panel.add(new JScrollPane(textArea));
        panel.add(addButton);
        panel.add(exitButton);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setVisible(true);


        dropdown.addActionListener(e -> {
            CustomItem selectedItem = (CustomItem) dropdown.getSelectedItem();
            assert selectedItem != null;
            String selectedValue = selectedItem.getValue();
            textArea.setText(selectedValue);
        });
        
        addButton.addActionListener(e -> {
            frame.dispose();
            addPlant(plantList);
        });

        exitButton.addActionListener(e -> System.exit(0));
    }

    public void printToDataFile(String type, String name, double height) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("Data", true)))) {
            writer.print("\n" + type + " " + name + " " + height);
        } catch (FileNotFoundException e) {
            System.out.println("hitta inte filen" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Filen kunde inte läsas");
        }
    }

    public void createPlant(String type, String name, double height, List<Plant> plantList) {
        switch (Objects.requireNonNull(type)) {
            case "Palm" -> {
                Plant palm = new PalmTree(name, height);
                plantList.add(palm);
            }
            case "Köttätare" -> {
                Plant meatEatingPlant = new MeatEatingPlant(name, height);
                plantList.add(meatEatingPlant);
            }
            case "Kaktus" -> {
                Plant cactus = new Cactus(name, height);
                plantList.add(cactus);
            }
        }
    }

    static class CustomItem {
        private final String name;
        private final String value;

        public CustomItem(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
