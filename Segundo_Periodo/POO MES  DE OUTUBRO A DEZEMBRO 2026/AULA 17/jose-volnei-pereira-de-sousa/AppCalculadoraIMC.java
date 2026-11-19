
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppCalculadoraIMC {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            
            JFrame frame = new JFrame("Calculadora de IMC");

            
            frame.setSize(400, 180);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
            JPanel panel = new JPanel();

            
            JLabel labelPeso = new JLabel("Peso (kg):");
            JTextField campoPeso = new JTextField(8);

            JLabel labelAltura = new JLabel("Altura (m):");
            JTextField campoAltura = new JTextField(8);

            JButton botaoCalcular = new JButton("Calcular IMC");

            JLabel labelResultado = new JLabel("...");

            
            panel.add(labelPeso);
            panel.add(campoPeso);
            panel.add(labelAltura);
            panel.add(campoAltura);
            panel.add(botaoCalcular);
            panel.add(labelResultado);

            
            botaoCalcular.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    try {

                        
                        double peso = Double.parseDouble(
                            campoPeso.getText().replace(",", ".")
                        );

                        double altura = Double.parseDouble(
                            campoAltura.getText().replace(",", ".")
                        );

                        
                        if (peso <= 0 || altura <= 0) {
                            labelResultado.setText(
                                "Digite valores maiores que zero."
                            );
                            return;
                        }

                        
                        double imc = peso / (altura * altura);

                
                        labelResultado.setText(
                            String.format(
                                java.util.Locale.US,
                                "Seu IMC é: %.2f",
                                imc
                            )
                        );

                    } catch (NumberFormatException erro) {

                        
                        labelResultado.setText(
                            "Digite valores numéricos válidos."
                        );
                    }
                }
            });

            
            frame.add(panel);

            
            frame.setVisible(true);

        });
    }
}
