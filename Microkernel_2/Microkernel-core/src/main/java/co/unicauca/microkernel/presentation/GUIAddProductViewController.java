
package co.unicauca.microkernel.presentation;

import co.unicauca.microkernel.business.MeasureService;
import co.unicauca.microkernel.business.ServiceModel;
import co.unicauca.microkernel.common.entities.Measure;
import co.unicauca.microkernel.common.entities.Product;
import javax.swing.JOptionPane;

public class GUIAddProductViewController extends javax.swing.JFrame {
    private final ServiceModel service;
    private final MeasureService measureService;
    /**
     * Creates new form AddProduct
     * @param service
     */
    public GUIAddProductViewController(ServiceModel service) {
        initComponents();
        this.service = service;
        measureService = new MeasureService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelBk = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblTMedicion = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtTMedicion = new javax.swing.JTextField();
        btnAddProduct = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        txtCodeItem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanelBk.setBackground(new java.awt.Color(255, 153, 102));

        lblTitulo.setText("NUEVO PRODUCTO - SISTEMA DE MEDICION");

        lblPeso.setText("Peso del producto");

        lblTMedicion.setText("Tiempo de medicion");

        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-product.png")));
        btnAddProduct.setText("Agregar");
        btnAddProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-product.png")));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblID.setText("ID del producto");

        lblCode.setText("Codigo del producto");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setText("**Nota: Para buscar o agregar producto por favor llene todos los campos ");

        javax.swing.GroupLayout JPanelBkLayout = new javax.swing.GroupLayout(JPanelBk);
        JPanelBk.setLayout(JPanelBkLayout);
        JPanelBkLayout.setHorizontalGroup(
            JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBkLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(42, 42, 42))
            .addGroup(JPanelBkLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID)
                    .addComponent(lblPeso)
                    .addComponent(lblTMedicion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTMedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JPanelBkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        JPanelBkLayout.setVerticalGroup(
            JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBkLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblID))
                    .addComponent(btnAddProduct))
                .addGap(6, 6, 6)
                .addGroup(JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelBkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTMedicion)
                    .addComponent(txtTMedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelBk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JPanelBk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearFields(){
        
        txtCodeItem.setText("");
        
        txtID.setText("");
        txtPeso.setText("");
        txtTMedicion.setText("");
    }
    
    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        
        int id = Integer.parseInt(txtID.getText());
        double peso = Double.parseDouble(txtPeso.getText());
        int tiempo_medicion = Integer.parseInt(txtTMedicion.getText());
        String codigo_producto = txtCodeItem.getText();
   
        Product newProduct = new Product(id, peso);
        Measure measurementEntity = new Measure(/*newProduct, tiempo_medicion, codigo_producto*/);
        measurementEntity.setProduct(newProduct);
        measurementEntity.setEstado("En medicion");
        measurementEntity.setTiempo(tiempo_medicion);
        measurementEntity.setItemCode(codigo_producto);
        try {
            boolean medicion = measureService.calculateMeasureCost(measurementEntity);
            if(medicion){
                JOptionPane.showMessageDialog(null, "La medición fue exitosa.");
                measurementEntity.setEstado("Aceptable");
                service.addMeasure(measurementEntity);
                clearFields();
            }else{
                JOptionPane.showMessageDialog(null, "La medición indica que la lata esta defectuosa.");
                measurementEntity.setEstado("Defectuoso");
                service.addMeasure(measurementEntity);
                clearFields();
            }
        } catch (Exception exception) {
            System.out.println("No fue posible medir el item. " + exception.getMessage());
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Measure mesure = service.findMeasure(Integer.parseInt(txtID.getText()));
        if(mesure!=null){
            txtID.setText(Integer.toString(mesure.getProduct().getProductId()));
            txtPeso.setText(Double.toString(mesure.getProduct().getWeight()));            
            txtTMedicion.setText(Integer.toString(mesure.getTiempo()));
            txtCodeItem.setText(mesure.getItemCode());
        }else{
            JOptionPane.showMessageDialog(null, "No se ha medido el item.");   
            clearFields();
        }        
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBk;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTMedicion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCodeItem;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTMedicion;
    // End of variables declaration//GEN-END:variables
}
