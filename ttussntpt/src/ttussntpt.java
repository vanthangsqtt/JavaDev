public class ttussntpt extends javax.swing.JFrame {
   
    public ttussntpt() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        txtKQ = new javax.swing.JTextField();
        tong = new javax.swing.JRadioButton();
        uocso = new javax.swing.JRadioButton();
        songuyento = new javax.swing.JRadioButton();
        phantich = new javax.swing.JRadioButton();
        thuchien = new javax.swing.JButton();
        tieptuc = new javax.swing.JButton();
        thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tính Tổng - Ước Số - Số Nguyên Tố - Phân Tích");
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 20));

        jLabel2.setText("Nhập N");

        jLabel3.setText("Kết Quả");

        txtKQ.setEditable(false);
        txtKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKQActionPerformed(evt);
            }
        });

        buttonGroup1.add(tong);
        tong.setText("S=1+2+...+N");
        tong.setName("tong"); // NOI18N
        tong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongActionPerformed(evt);
            }
        });

        buttonGroup1.add(uocso);
        uocso.setText("Ước Số");
        uocso.setName("uocso"); // NOI18N
        uocso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uocsoActionPerformed(evt);
            }
        });

        buttonGroup1.add(songuyento);
        songuyento.setText("Số Nguyên Tố");
        songuyento.setName("songuyento"); // NOI18N
        songuyento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songuyentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(phantich);
        phantich.setText("Phân tích(<14 thì run oke >14 sai updating)");
        phantich.setName("phantich"); // NOI18N
        phantich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phantichActionPerformed(evt);
            }
        });

        thuchien.setText("thực hiện");
        thuchien.setName("thuchien"); // NOI18N
        thuchien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuchienActionPerformed(evt);
            }
        });

        tieptuc.setText("tiếp tục");
        tieptuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tieptucActionPerformed(evt);
            }
        });

        thoat.setText("thoat");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uocso)
                            .addComponent(tong)
                            .addComponent(songuyento)
                            .addComponent(phantich)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thuchien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tieptuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uocso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songuyento)
                    .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phantich)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thuchien)
                    .addComponent(tieptuc)
                    .addComponent(thoat))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>                        

    private void tongActionPerformed(java.awt.event.ActionEvent evt) {                                     
      
    }                                    

    private void uocsoActionPerformed(java.awt.event.ActionEvent evt) {                                      
     
    }                                     

    private void songuyentoActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
    }                                          

    private void phantichActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        

    private void txtKQActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     

    private void thuchienActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(tong.isSelected())
        {
        int n=Integer.parseInt(txtN.getText());
        int t=(n*(n+1)/2);
        txtKQ.setText(t + "");
        
        }
        if(uocso.isSelected())
        {
            int i=0,dem=0;
            int n=Integer.parseInt(txtN.getText());
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    dem++;
                }
            }
            txtKQ.setText(n+" có "+dem + " ước số");
        }
        if(songuyento.isSelected())
        {
            int i=0,j=0; 
            int n=Integer.parseInt(txtN.getText());
            if(n<1)
            {
                 txtKQ.setText("NHẬP SỐ > 0");
            }
            if(n==1 || n==2)
            {  
                txtKQ.setText(n+" là SNT");
            }
            if(n>2)
            {
                for(i=2; i<n; i++)
                {
                    if(n%i==0)
                    {
                        j=1;
                    }
                }
                if(j==1)
                
                    txtKQ.setText(n+" ko là SNT");
                else
                    txtKQ.setText(n+" là SNT");
            }
            
             
        }
         if(phantich.isSelected())
        {
            String i = "",j="";
            int n=Integer.parseInt(txtN.getText());
            txtKQ.setText(n+"=1");
            int a=2;
            while(true){
                if(n%a==0)
                {
                    i=i+"*"+a;
                    n=n/a;
                }
                if(n/a==1)
                {
                    j=j+"*"+n;
                    break;
                }
                a++;
            }
            txtKQ.setText(n+"=1"+i+j);
        }
        
    }                                        

    private void tieptucActionPerformed(java.awt.event.ActionEvent evt) {                                        
        txtN.setText("");
        txtKQ.setText("");
    }                                       

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {                                      
        System.exit(0);
    }                                     

   
    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ttussntpt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton phantich;
    private javax.swing.JRadioButton songuyento;
    private javax.swing.JButton thoat;
    private javax.swing.JButton thuchien;
    private javax.swing.JButton tieptuc;
    private javax.swing.JRadioButton tong;
    private javax.swing.JTextField txtKQ;
    private javax.swing.JTextField txtN;
    private javax.swing.JRadioButton uocso;
    // End of variables declaration                   
}