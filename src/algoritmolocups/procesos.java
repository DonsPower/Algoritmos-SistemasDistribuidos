
package algoritmolocups;

import java.awt.Color;
import java.util.ArrayList;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

public class procesos extends javax.swing.JFrame {

    /**
     * Creates new form procesos
     */
    //Variables
    ArrayList proceso1 =new ArrayList();
    ArrayList proceso2 =new ArrayList();
    ArrayList proceso3 =new ArrayList();
    //Creamos arreglo para captar donde comparar en la siguiente proceso.
    ArrayList auxi=new ArrayList();
    int num1=0;//Num1=Boton1; proceso1 
    int num2=0;//boton2 proceso2
    int num3=0;//Boton 3 proceso3
    
    public procesos() {
        initComponents();
        text1.setText("0");//Igualamos a cero.
        text2.setText("0");//Igualamos a cero.
        text3.setText("0");//Igualamos a cero.
        emisorText.setText("0");
        receptorText.setText("0");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsinc = new javax.swing.JButton();
        unoA = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dosA = new javax.swing.JLabel();
        tresA = new javax.swing.JLabel();
        cuatroA = new javax.swing.JLabel();
        sincoA = new javax.swing.JLabel();
        seiasA = new javax.swing.JLabel();
        sieteA = new javax.swing.JLabel();
        ochoA = new javax.swing.JLabel();
        unoB = new javax.swing.JLabel();
        dosB = new javax.swing.JLabel();
        tresB = new javax.swing.JLabel();
        cuatroB = new javax.swing.JLabel();
        sincoB = new javax.swing.JLabel();
        seisB = new javax.swing.JLabel();
        sieteB = new javax.swing.JLabel();
        ochoB = new javax.swing.JLabel();
        unoC = new javax.swing.JLabel();
        dosC = new javax.swing.JLabel();
        tresC = new javax.swing.JLabel();
        cuatroC = new javax.swing.JLabel();
        SEISc = new javax.swing.JLabel();
        sieteC = new javax.swing.JLabel();
        ochoC = new javax.swing.JLabel();
        sincoC = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        btn3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        emisor = new javax.swing.JLabel();
        receptor = new javax.swing.JLabel();
        emisorText = new javax.swing.JTextField();
        receptorText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnsinc.setText("Sincronizar");
        btnsinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsincActionPerformed(evt);
            }
        });

        unoA.setText("0");

        dosA.setText("0");

        tresA.setText("0");

        cuatroA.setText("0");

        sincoA.setText("0");

        seiasA.setText("0");

        sieteA.setText("0");

        ochoA.setText("0");

        unoB.setText("0");

        dosB.setText("0");

        tresB.setText("0");

        cuatroB.setText("0");

        sincoB.setText("0");

        seisB.setText("0");

        sieteB.setText("0");

        ochoB.setText("0");

        unoC.setText("0");

        dosC.setText("0");

        tresC.setText("0");

        cuatroC.setText("0");

        SEISc.setText("0");

        sieteC.setText("0");

        ochoC.setText("0");

        sincoC.setText("0");

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        emisor.setText("Emisor");

        receptor.setText("Receptor");

        jButton1.setText("Finalizar.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sieteA)
                                    .addComponent(ochoA)
                                    .addComponent(seiasA)
                                    .addComponent(sincoA)
                                    .addComponent(cuatroA)
                                    .addComponent(tresA)
                                    .addComponent(dosA)
                                    .addComponent(unoA)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(text1))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tresC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dosC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(unoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ochoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sieteC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SEISc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sincoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cuatroC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sieteB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seisB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ochoB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(sincoB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(66, 66, 66))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cuatroB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tresB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dosB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(unoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(text2)
                                                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                                                .addGap(63, 63, 63)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text3))))
                        .addGap(14, 14, 14)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(emisor)
                                    .addGap(26, 26, 26)
                                    .addComponent(emisorText))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(receptor)
                                    .addGap(18, 18, 18)
                                    .addComponent(receptorText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnsinc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(siguiente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emisorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emisor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receptorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receptor))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsinc)
                            .addComponent(siguiente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unoA)
                    .addComponent(unoB)
                    .addComponent(unoC))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosA)
                    .addComponent(dosB)
                    .addComponent(dosC))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tresA)
                    .addComponent(tresB)
                    .addComponent(tresC))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuatroA)
                    .addComponent(cuatroB)
                    .addComponent(cuatroC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sincoA)
                    .addComponent(sincoB)
                    .addComponent(sincoC))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seiasA)
                    .addComponent(seisB)
                    .addComponent(SEISc))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sieteA)
                    .addComponent(sieteB)
                    .addComponent(sieteC))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ochoA)
                    .addComponent(ochoB)
                    .addComponent(ochoC)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       //Boton 1
       //int num1=0;
       num1=Integer.parseInt(text1.getText());
       if(num1<=0){
           JOptionPane.showMessageDialog(null,"Introduce el tiempo del proceso", "Algoritmo de Lamport",JOptionPane.ERROR_MESSAGE);
       }else{
        
       for(int i=0;i<8;i++){
           int resu=i*num1;
           proceso1.add(resu);
       }
       mostrar.append("Primer proceso incremento en: "+num1+"\n");
       setearValor(proceso1);
       }
       
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
             //Boton 2
       //int num1=0;
       num2=Integer.parseInt(text2.getText());
       if(num2<=0){
           JOptionPane.showMessageDialog(null,"Introduce el tiempo del proceso", "Algoritmo de Lamport",JOptionPane.ERROR_MESSAGE);
       }else{
        
       for(int i=0;i<8;i++){
           int resu=i*num2;
           proceso2.add(resu);
       }
       mostrar.append("Segundo proceso incremento en: "+num2+"\n");
       setearValor2(proceso2);
       }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
           //Boton 3
       //int num1=0;
       num3=Integer.parseInt(text3.getText());
       if(num3<=0){
           JOptionPane.showMessageDialog(null,"Introduce el tiempo del proceso", "Algoritmo de Lamport",JOptionPane.ERROR_MESSAGE);
       }else{
        
       for(int i=0;i<8;i++){
           int resu=i*num3;
           proceso3.add(resu);
       }
       mostrar.append("Tercer proceso incremento en: "+num3+"\n");
       setearValor3(proceso3);
       }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnsincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsincActionPerformed
       //Primero sincronizamos y despues desaparece el emisor y receptor
       //Priemro cachamos el proceso
        int receptor=Integer.parseInt(receptorText.getText());
        int emisor=Integer.parseInt(emisorText.getText());
        if(receptor<=0 || receptor>3 || emisor>3 || emisor<=0 || receptor==emisor){
            //Si no tiene nada o es mayor el numero no existen proceso mandamos error.
            JOptionPane.showMessageDialog(null,"Introduce un proceso mayor que cero y menor que 3", "Algoritmo de Lamport",JOptionPane.ERROR_MESSAGE);
        }else{
            int aux=0,aux2=0;//Auxiliar para ver las posiciones.
            //Ya que verificamos que tiene algo hubicamos el emisor y receptor 
            if(emisor==1){
                 mostrar.append("Emisor: 1 y mensaje dirigido al proceso: "+receptor+ "\n");
                 if(receptor==2){
                     int numero = (int) (Math.random() * 6) + 1;
                     aux=(int) proceso1.get(numero);
                     System.out.println(proceso1.get(numero));
                     int numero2 = (int) (Math.random() * 6) + 1;
                     aux2=(int) proceso2.get(numero2);
                     System.out.println(proceso2.get(numero2));
                      mostrar.append("Proceso 1 es : "+aux+" Proceso 2: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla
                             resu=u*num2;
                             repetirP2(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 1 no es mayor que el proceso 2"+ "\n");  
                     }
                     
                 }else if(receptor==3){ 
                     int numero = (int) (Math.random() * 6) + 1;
                     aux=(int) proceso1.get(numero);
                      System.out.println(proceso1.get(numero));
                     int numero2 = (int) (Math.random() * 6) + 1;
                     aux2= (int)proceso3.get(numero2);
                      System.out.println(proceso3.get(numero2));
                       mostrar.append("Proceso 1 es : "+aux+" Proceso 3: "+aux2+ "\n");
                      if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num3;
                             repetirP3(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 1 no es mayor que el proceso 3"+ "\n");  
                     }
                 }
            }
            else if(emisor==2){
                mostrar.append("Emisor: 2 y mensaje dirigido al proceso: "+receptor+ "\n");
                if(receptor==3){
                     int numero = (int) (Math.random() * 6) + 1;
                     aux=(int) proceso2.get(numero);
                     int numero2 = (int) (Math.random() * 6) + 1;
                     aux2=(int) proceso3.get(numero2);
                      mostrar.append("Proceso 2 es : "+aux+" Proceso 3: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num3;
                             repetirP3(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 2 no es mayor que el proceso 3"+ "\n");  
                     }
                 }else if(receptor==1){
                     int numero = (int) (Math.random() * 6) + 1;
                     aux=(int) proceso2.get(numero);
                     int numero2 = (int) (Math.random() * 6) + 1;
                     aux2=(int)proceso1.get(numero2);
                      mostrar.append("Proceso 2 es : "+aux+" Proceso 1: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num1;
                             repetirP1(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 2 no es mayor que el proceso 1"+ "\n");  
                     }
                 }
            }
            else if(emisor==3){
                mostrar.append("Emisor: 3 y mensaje dirigido al proceso: "+receptor+ "\n");
                if(receptor==1){
                     int numero = (int) (Math.random() * 6) + 1;
                     aux=(int)proceso3.get(numero);
                     int numero2 = (int) (Math.random() * 6) + 1;
                     aux2=(int)proceso1.get(numero2);
                      mostrar.append("Proceso 3 es : "+aux+" Proceso 1: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num1;
                             repetirP1(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 3 no es mayor que el proceso 1"+ "\n");  
                     }
                     
                     
                 }else if(receptor==2){
                     int numero = (int) (Math.random() * 6) + 1;
                     aux=(int) proceso3.get(numero);
                     int numero2 = (int) (Math.random() * 6) + 1;
                     aux2=(int)proceso2.get(numero2);
                      mostrar.append("Proceso 3 es : "+aux+" Proceso 2: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num2;
                             repetirP2(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 3 no es mayor que el proceso 2"+ "\n");  
                     }
                     
                 }
            }
        auxi.add(0);
        auxi.add(emisor);
        auxi.add(3);
         mostrar.append("----------------DONSinc-----------------------"+ "\n\n"); 
        }
        emisorText.setVisible(false);
        receptorText.setVisible(false);
        btnsinc.setVisible(false);
        
    }//GEN-LAST:event_btnsincActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        //Boton siguiente.
        //Hacewmos lo mismo pero ahora tomamos la posicion del ultimo arreglo.
        //Creamos numero aleatorio para ver que p´roseso recibe
        int sigP = (int) (Math.random() * 3) + 1;
        int tam=auxi.size()-1;
        if(sigP==tam){
            sigP = (int) (Math.random() * 3) + 1;
        }
        System.out.println(tam);
        System.out.println(sigP);
        System.out.println(auxi);
        int receptor=sigP;
        int emisor=(int) auxi.get(tam-1);
        if(receptor<=0 || receptor>=4 || emisor>=4 || emisor<=0 || receptor==emisor){
            //Si no tiene nada o es mayor el numero no existen proceso mandamos error.
            JOptionPane.showMessageDialog(null,"Introduce un proceso mayor que cero y menor que 3", "Algoritmo de Lamport",JOptionPane.ERROR_MESSAGE);
        }else{
            int aux=0,aux2=0;//Auxiliar para ver las posiciones.
            //En vez que de sean al azar es encontrar la posicion de donde se modifico.
            //Ya que verificamos que tiene algo hubicamos el emisor y receptor 
            if(emisor==1){
                 mostrar.append("Emisor: 1 y mensaje dirigido al proceso: "+receptor+ "\n");
                 if(receptor==2){
                     int numero = (int) (Math.random() * 7) + 1;
                     aux=(int) proceso1.get(numero);
                     System.out.println(proceso1.get(numero));
                     int numero2 = (int) (Math.random() * 7) + 1;
                     aux2=(int) proceso2.get(numero2);
                     System.out.println(proceso2.get(numero2));
                     mostrar.append("Proceso 1 es : "+aux+" Proceso 2: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla
                             resu=u*num2;
                             repetirP2(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 1 no es mayor que el proceso 2"+ "\n");  
                     }
                     
                 }else if(receptor==3){ 
                     int numero = (int) (Math.random() * 7) + 1;
                     aux=(int) proceso1.get(numero);
                      System.out.println(proceso1.get(numero));
                     int numero2 = (int) (Math.random() * 7) + 1;
                     aux2= (int)proceso3.get(numero2);
                      System.out.println(proceso3.get(numero2));
                      mostrar.append("Proceso 1 es : "+aux+"Proceso 3: "+aux2+ "\n");
                      if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num3;
                             repetirP3(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 1 no es mayor que el proceso 3"+ "\n");  
                     }
                 }
            }
            else if(emisor==2){
                mostrar.append("Emisor: 2 y mensaje dirigido al proceso: "+receptor+ "\n");
                if(receptor==3){
                     int numero = (int) (Math.random() * 7) + 1;
                     aux=(int) proceso2.get(numero);
                     int numero2 = (int) (Math.random() * 7) + 1;
                     aux2=(int) proceso3.get(numero2);
                     mostrar.append("Proceso 2 es :"+aux+" Proceso 3: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num3;
                             repetirP3(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 2 no es mayor que el proceso 3"+ "\n");  
                     }
                 }else if(receptor==1){
                     int numero = (int) (Math.random() * 7) + 1;
                     aux=(int) proceso2.get(numero);
                     int numero2 = (int) (Math.random() * 7) + 1;
                     aux2=(int)proceso1.get(numero2);
                     mostrar.append("Proceso 2 es :"+aux+" Proceso 1: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num1;
                             repetirP1(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 2 no es mayor que el proceso 1"+ "\n");  
                     }
                 }
            }
            else if(emisor==3){
                mostrar.append("Emisor: 3 y mensaje dirigido al proceso: "+receptor+ "\n");
                if(receptor==1){
                     int numero = (int) (Math.random() * 7) + 1;
                     aux=(int)proceso3.get(numero);
                     int numero2 = (int) (Math.random() * 7) + 1;
                     aux2=(int)proceso1.get(numero2);
                     mostrar.append("Proceso 3 es :"+aux+" Proceso 1: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num1;
                             repetirP1(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 3 no es mayor que el proceso 1"+ "\n");  
                     }
                     
                     
                 }else if(receptor==2){
                     int numero = (int) (Math.random() * 7) + 1;
                     aux=(int) proceso3.get(numero);
                     int numero2 = (int) (Math.random() * 7) + 1;
                     aux2=(int)proceso2.get(numero2);
                     mostrar.append("Proceso 3 es :"+aux+" Proceso 1: "+aux2+ "\n");
                     if(aux>aux2){
                         int u=0;
                         for(int i=numero2;i<8;i++){
                             int resu=0;
                             //Aqui falla, ya no
                             resu=u*num2;
                             repetirP2(i,resu,aux);
                             u++;
                         }
                     }else{
                        mostrar.append("El proceso 3 no es mayor que el proceso 2"+ "\n");  
                     }
                     
                 }
            }
        auxi.add(tam);
        auxi.add(sigP);
        auxi.add(3);
        }
        tam=0;
        sigP=0;
        mostrar.append("----------------DONSinc-----------------------"+ "\n\n"); 
       
    }//GEN-LAST:event_siguienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"ADIOOOOOOS CHAOITOO", "Algoritmo de Lamport",JOptionPane.OK_OPTION);
        exit();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void repetirP2(int n, int sum, int aux){
        int resu=aux+1;
        int al=0;
        if(n==0){
            al=resu+sum;
            this.unoB.setText(Integer.toString((al)));
            proceso2.set(n, al);
        }else if(n==1){
             al=resu+sum;
            this.dosB.setText(Integer.toString((al)));
            proceso2.set(n, al);
        }else if(n==2){
             al=resu+sum;
            this.tresB.setText(Integer.toString((al)));
            proceso2.set(n, al);
        }else if(n==3){
             al=resu+sum;
            this.cuatroB.setText(Integer.toString((al)));
            this.cuatroB.setOpaque(true);
            proceso2.set(n, al);
        }else if(n==4){
             al=resu+sum;
            this.sincoB.setText(Integer.toString((al)));
            this.sincoB.setOpaque(true);
            proceso2.set(n, al);
        }else if(n==5){
             al=resu+sum;
            this.seisB.setText(Integer.toString((al)));
            this.seisB.setOpaque(true);
            proceso2.set(n, al);
        }else if(n==6){
             al=resu+sum;
            this.sieteB.setText(Integer.toString((al)));
        }else if(n==7){
             al=resu+sum;
            this.ochoB.setText(Integer.toString((al)));
            proceso2.set(n, al);
        }
    }
    public void repetirP1(int n, int sum, int aux){
        int resu=aux+1;
        int al=0;
        if(n==0){
            al=resu+sum;
            this.unoA.setText(Integer.toString((al)));
            proceso1.set(n, al);
        }else if(n==1){
             al=resu+sum;
            this.dosA.setText(Integer.toString((al)));
            proceso1.set(n, al);
            
        }else if(n==2){
             al=resu+sum;
            this.tresA.setText(Integer.toString((al)));
            proceso1.set(n, al);
        }else if(n==3){
             al=resu+sum;
            this.cuatroA.setText(Integer.toString((al)));
            this.cuatroA.setOpaque(true);
            proceso1.set(n, al);
        }else if(n==4){
             al=resu+sum;
            this.sincoA.setText(Integer.toString((al)));
            this.sincoA.setOpaque(true);
            proceso1.set(n, al);
        }else if(n==5){
             al=resu+sum;
            this.seiasA.setText(Integer.toString((al)));
            this.seiasA.setOpaque(true);
            proceso1.set(n, al);
        }else if(n==6){
             al=resu+sum;
            this.sieteA.setText(Integer.toString((al)));
            proceso1.set(n, al);
        }else if(n==7){
             al=resu+sum;
            this.ochoA.setText(Integer.toString((al)));
            proceso1.set(n, al);
        }
    }
    public void repetirP3(int n, int sum, int aux){
        int resu=aux+1;
        int al=0;
        if(n==0){
            al=resu+sum;
            this.unoC.setText(Integer.toString((al)));
            proceso3.set(n, al);
        }else if(n==1){
             al=resu+sum;
            this.dosC.setText(Integer.toString((al)));
            proceso3.set(n, al);
        }else if(n==2){
             al=resu+sum;
            this.tresC.setText(Integer.toString((al)));
            proceso3.set(n, al);
        }else if(n==3){
             al=resu+sum;
            this.cuatroC.setText(Integer.toString((al)));
            this.cuatroC.setOpaque(true);
            proceso3.set(n, al);
        }else if(n==4){
             al=resu+sum;
            this.sincoC.setText(Integer.toString((al)));
            this.sincoC.setOpaque(true);
            proceso3.set(n, al);
        }else if(n==5){
             al=resu+sum;
            this.SEISc.setText(Integer.toString((al)));
            this.SEISc.setOpaque(true);
            proceso3.set(n, al);
        }else if(n==6){
             al=resu+sum;
            this.sieteC.setText(Integer.toString((al)));
            proceso3.set(n, al);
        }else if(n==7){
             al=resu+sum;
            this.ochoC.setText(Integer.toString((al)));
            proceso3.set(n, al);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(procesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(procesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(procesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(procesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new procesos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SEISc;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btnsinc;
    private javax.swing.JLabel cuatroA;
    private javax.swing.JLabel cuatroB;
    private javax.swing.JLabel cuatroC;
    private javax.swing.JLabel dosA;
    private javax.swing.JLabel dosB;
    private javax.swing.JLabel dosC;
    private javax.swing.JLabel emisor;
    private javax.swing.JTextField emisorText;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JLabel ochoA;
    private javax.swing.JLabel ochoB;
    private javax.swing.JLabel ochoC;
    private javax.swing.JLabel receptor;
    private javax.swing.JTextField receptorText;
    private javax.swing.JLabel seiasA;
    private javax.swing.JLabel seisB;
    private javax.swing.JLabel sieteA;
    private javax.swing.JLabel sieteB;
    private javax.swing.JLabel sieteC;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel sincoA;
    private javax.swing.JLabel sincoB;
    private javax.swing.JLabel sincoC;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JLabel tresA;
    private javax.swing.JLabel tresB;
    private javax.swing.JLabel tresC;
    private javax.swing.JLabel unoA;
    private javax.swing.JLabel unoB;
    private javax.swing.JLabel unoC;
    // End of variables declaration//GEN-END:variables

    private void setearValor(ArrayList proceso1) {
       this.unoA.setText(Integer.toString(((int)proceso1.get(0))));
       this.dosA.setText(Integer.toString(((int) proceso1.get(1))));
       this.tresA.setText(Integer.toString(((int) proceso1.get(2))));
       this.cuatroA.setText(Integer.toString(((int) proceso1.get(3))));
       this.sincoA.setText(Integer.toString(((int) proceso1.get(4))));
       this.seiasA.setText(Integer.toString(((int) proceso1.get(5))));
       this.sieteA.setText(Integer.toString(((int) proceso1.get(6))));
       this.ochoA.setText(Integer.toString(((int) proceso1.get(7))));
    }

    private void setearValor2(ArrayList proceso2) {
        this.unoB.setText(Integer.toString(((int)proceso2.get(0))));
       this.dosB.setText(Integer.toString(((int) proceso2.get(1))));
       this.tresB.setText(Integer.toString(((int) proceso2.get(2))));
       this.cuatroB.setText(Integer.toString(((int) proceso2.get(3))));
       this.sincoB.setText(Integer.toString(((int) proceso2.get(4))));
       this.seisB.setText(Integer.toString(((int) proceso2.get(5))));
       this.sieteB.setText(Integer.toString(((int) proceso2.get(6))));
       this.ochoB.setText(Integer.toString(((int) proceso2.get(7))));
    }

    private void setearValor3(ArrayList proceso3) {
        this.unoC.setText(Integer.toString(((int)proceso3.get(0))));
       this.dosC.setText(Integer.toString(((int) proceso3.get(1))));
       this.tresC.setText(Integer.toString(((int) proceso3.get(2))));
       this.cuatroC.setText(Integer.toString(((int) proceso3.get(3))));
       this.sincoC.setText(Integer.toString(((int) proceso3.get(4))));
       this.SEISc.setText(Integer.toString(((int) proceso3.get(5))));
       this.sieteC.setText(Integer.toString(((int) proceso3.get(6))));
       this.ochoC.setText(Integer.toString(((int) proceso3.get(7))));
    }
}
