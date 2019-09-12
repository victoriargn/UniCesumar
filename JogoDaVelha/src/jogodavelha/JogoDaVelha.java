package jogodavelha;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 * @author Victória Regina Oliveira Brito Almeida
 * RA: 1850353-5
 */
public class JogoDaVelha extends javax.swing.JFrame {

    private String[][] matrizJogo = new String[3][3];
    private JogoDaVelha jogoDaVelha;
    private ArrayList<JButton> listaDeBotoes;
    private int contadorJogadas = 0;
    private boolean haVencedor = false;
    private String jogadorDaVez = "";
    
    public JogoDaVelha() {
        initComponents();
        inicializarMatriz();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn2x0 = new javax.swing.JButton();
        btn1x0 = new javax.swing.JButton();
        btn0x1 = new javax.swing.JButton();
        btn2x1 = new javax.swing.JButton();
        btn0x2 = new javax.swing.JButton();
        btn2x2 = new javax.swing.JButton();
        btn0x0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn1x1 = new javax.swing.JButton();
        btn1x2 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        lblVencedor = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn2x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        btn1x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        btn0x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        btn2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        btn0x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        btn2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        btn0x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel1.setText("Jogo da Velha");

        btn1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        btn1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJogada(evt);
            }
        });

        btnReiniciar.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarJogo(evt);
            }
        });

        lblVencedor.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        lblVencedor.setText("O vencedor foi o jogador X.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0x0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2x0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1x0, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(170, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn0x0, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1x0, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn2x0, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblVencedor)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblVencedor.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializarMatriz(){

        matrizJogo[0][0] = btn0x0.getText();
        matrizJogo[0][1] = btn0x1.getText();
        matrizJogo[0][2] = btn0x2.getText();
        matrizJogo[1][0] = btn1x0.getText();
        matrizJogo[1][1] = btn1x1.getText();
        matrizJogo[1][2] = btn1x2.getText();
        matrizJogo[2][0] = btn2x0.getText();
        matrizJogo[2][1] = btn2x1.getText();
        matrizJogo[2][2] = btn2x2.getText();
    }
    
    private String jogadorDaVez(){
    
        int x = 0;
        String[] jogadorDaVez = {"X", "0"};
        
        while (!haVencedor){
            
            for(x=0; x<2; x++){
                
                System.out.println("O jogador da vez é: " + jogadorDaVez[x]);
            }
            
        }
        //Buscar em qual posição do vetor está o valor correspondente ao ganhador e
        // fazer com que x seja igual a esta posição para que seja o jogador inicial.
        //Novo jogo deve ter conhecimento de quem foi o ganhador na partida anterior.
        
        return jogadorDaVez[x];
    
    }
    
    private boolean haVencedor(String jogadorDaVez){
    
        
        return false;
    }
    private void registrarJogada(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarJogada
        
        contadorJogadas++; // contadorJogadas = 5

        jogadorDaVez = jogadorDaVez(); // Jogador = X
        
        JButton botaoClicado = (JButton)evt.getSource(); //btn0x2 
       
        botaoClicado.setText(jogadorDaVez); //Jogada de X foi registrada
        botaoClicado.setEnabled(false); //Desabilita o botão clicado
       
        if(contadorJogadas > 5){
        
            haVencedor = haVencedor(jogadorDaVez);
            
            if(haVencedor){

                lblVencedor.setText("O vencedor foi: " + jogadorDaVez);
                manipularBotoes(false, false);
            }
        }
    }//GEN-LAST:event_registrarJogada

    /* Método responsável por decidir estados dos botões onde serão registradas
        as jogadas, onde podem ser habilitados/desabilitados e terem seus valores
        apagados ou não. 
    */
    private void manipularBotoes(boolean habilitar, boolean resetarBotoes){
        
        if(habilitar){
            btn0x0.setEnabled(true);   
            btn0x1.setEnabled(true);
            btn0x2.setEnabled(true);
            btn1x0.setEnabled(true);
            btn1x1.setEnabled(true);
            btn1x2.setEnabled(true);
            btn2x0.setEnabled(true);
            btn2x1.setEnabled(true);
            btn2x2.setEnabled(true);
            
            if(resetarBotoes){
                btn0x0.setText("");
                btn0x1.setText("");
                btn0x2.setText("");
                btn1x0.setText("");
                btn1x1.setText("");
                btn1x2.setText("");
                btn2x0.setText("");
                btn2x1.setText("");
                btn2x2.setText("");
            }
        }else{
            btn0x0.setEnabled(false);
            btn0x1.setEnabled(false);
            btn0x2.setEnabled(false);
            btn1x0.setEnabled(false);
            btn1x1.setEnabled(false);
            btn1x2.setEnabled(false);
            btn2x0.setEnabled(false);
            btn2x1.setEnabled(false);
            btn2x2.setEnabled(false);
        }
    }
    
    /* Método responsável por iniciar um novo jogo após resetar os estados dos
        botões após já ter sido iniciada uma rodada.
    */
    private void reiniciarJogo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarJogo
       
        this.manipularBotoes(true, true);
        this.novoJogo();
    }//GEN-LAST:event_reiniciarJogo

    // Método responsável por iniciar um novo jogo.
    public void novoJogo(){
        
        if(!this.isVisible()){
            this.setVisible(true);
        }
        
        jogoDaVelha = new JogoDaVelha(); 
    }
    
    public static void main(String args[]) {

        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });*/
        
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        jogoDaVelha.novoJogo();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0x0;
    private javax.swing.JButton btn0x1;
    private javax.swing.JButton btn0x2;
    private javax.swing.JButton btn1x0;
    private javax.swing.JButton btn1x1;
    private javax.swing.JButton btn1x2;
    private javax.swing.JButton btn2x0;
    private javax.swing.JButton btn2x1;
    private javax.swing.JButton btn2x2;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblVencedor;
    // End of variables declaration//GEN-END:variables
}
