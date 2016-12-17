package Zup;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Resultado_rover extends javax.swing.JFrame {

    private ArrayList<Rover> rover_resutado = new ArrayList<>();
    private Rover[][] campo_resultado;

    public Resultado_rover(ArrayList<Rover> rover, Rover[][] campo) {
        initComponents();
        this.rover_resutado = rover;
        this.campo_resultado = campo;
    }

    public void navegar() {
        String msg = "Sucesso";

        for (Rover rover_atual : rover_resutado) { // percorrer os rovers

            for (int i = 0; i < rover_atual.getInstrucao().length(); i++) { // percorrer as instruções de cada rover
                char c = rover_atual.getInstrucao().charAt(i);

                switch (c) {
                    case 'L': // girar 90 graus para a esquerda

                        rover_atual.setSentido(rover_atual.GirarEsquerda(rover_atual.getSentido())); // atualizar sentido do rover 

                        break;
                    case 'R': // girar 90 graus para a direita

                        rover_atual.setSentido(rover_atual.GirarDireita(rover_atual.getSentido())); // atualizar sentido do rover 

                        break;
                    case 'M': //avançar uma posição no planalto
                        try {

                            switch (rover_atual.getSentido()) {
                                case "N":
                                    campo_resultado[rover_atual.getCoordenadaX()][rover_atual.getCoordenadaY()] = null; // apagando o rover da posição anterior
                                    campo_resultado[rover_atual.getCoordenadaX()][rover_atual.getCoordenadaY() + 1] = rover_atual;
                                    rover_atual.setCoordenadaY(rover_atual.getCoordenadaY() + 1); //atualizar rover para a nova posição
                                    break;
                                case "S":
                                    campo_resultado[rover_atual.getCoordenadaX()][rover_atual.getCoordenadaY()] = null;
                                    campo_resultado[rover_atual.getCoordenadaX()][rover_atual.getCoordenadaY() - 1] = rover_atual;
                                    rover_atual.setCoordenadaY(rover_atual.getCoordenadaY() - 1); //atualizar rover para a nova posição
                                    break;
                                case "W":
                                    campo_resultado[rover_atual.getCoordenadaX()][rover_atual.getCoordenadaY()] = null;
                                    campo_resultado[rover_atual.getCoordenadaX() - 1][rover_atual.getCoordenadaY()] = rover_atual;
                                    rover_atual.setCoordenadaX(rover_atual.getCoordenadaX() - 1); //atualizar rover para a nova posição
                                    break;
                                default:
                                    campo_resultado[rover_atual.getCoordenadaX()][rover_atual.getCoordenadaY()] = null;
                                    campo_resultado[rover_atual.getCoordenadaX() + 1][rover_atual.getCoordenadaY()] = rover_atual;
                                    rover_atual.setCoordenadaX(rover_atual.getCoordenadaX() + 1); //atualizar rover para a nova posição
                                    break;
                            }

                        } catch (Exception e) {
                            msg = "Erro - Rover parou pois sairia fora da área do planalto!";
                            campo_resultado[rover_atual.getCoordenadaX()][rover_atual.getCoordenadaY()] = rover_atual; // onde ele parou antes de tentar sair do planalto
                        }

                        break;
                }

            }

            DefaultTableModel val = (DefaultTableModel) rover_result.getModel();

            val.addRow(new String[]{rover_atual.getNome(),
                String.valueOf(rover_atual.getCoordenadaX()),
                String.valueOf(rover_atual.getCoordenadaY()),
                rover_atual.getSentido(), msg});

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rover_result = new javax.swing.JTable();
        btt_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultados dos Rovers");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resultados dos Rovers");

        rover_result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Coordenada X Final", "Coordenada Y Final", "Sentido Final", "Mensagem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rover_result);
        if (rover_result.getColumnModel().getColumnCount() > 0) {
            rover_result.getColumnModel().getColumn(1).setPreferredWidth(100);
            rover_result.getColumnModel().getColumn(2).setPreferredWidth(100);
            rover_result.getColumnModel().getColumn(3).setPreferredWidth(100);
            rover_result.getColumnModel().getColumn(4).setPreferredWidth(300);
        }

        btt_voltar.setText("Início");
        btt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btt_voltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btt_voltar)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_voltarActionPerformed
        dispose();
        Inicial frame = new Inicial();
        frame.setVisible(true);
    }//GEN-LAST:event_btt_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_voltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rover_result;
    // End of variables declaration//GEN-END:variables
}
