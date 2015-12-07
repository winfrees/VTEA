/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MicroProtocol;

import MicroProtocol.listeners.BatchStateListener;
import static VTC._VTC.PROCESSOPTIONS;
import ij.IJ;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author vinfrais
 */
public class BatchImageProcessing extends javax.swing.JPanel implements BatchStateListener{

    //public microWindowManager openerWindow = new microWindowManager(OpenImages);

    
    DefaultComboBoxModel cbm = new DefaultComboBoxModel();
    
//batch support

    private MicroExperiment me = new MicroExperiment();
    
    private int tab;
    private ArrayList tabs;
    private ArrayList files;
    private String directory;
    
    private ArrayList preprocessingprotocol;
    private ArrayList objectprotocol;
    //private ArrayList preprocessingprotocol;
    /**
     * Creates new form NewJPanel
     */
    public BatchImageProcessing(ArrayList tabs, int selected)  {
       
       cbm = new DefaultComboBoxModel(tabs.toArray());
       
        initComponents();
        this.ModelAnalysis.setSelectedIndex(selected);
        this.SourceDirectory.setText(this.directory);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        BatchImageProcessing = new javax.swing.JPanel();
        FileList_Header = new javax.swing.JPanel();
        PreProcessingLabel = new javax.swing.JLabel();
        AddFiles = new javax.swing.JButton();
        DeleteFile = new javax.swing.JButton();
        FileList_Panel = new javax.swing.JPanel();
        PreProcessingStepsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FileList = new javax.swing.JList();
        Options_Header = new javax.swing.JPanel();
        ObjectsLabel = new javax.swing.JLabel();
        Options_Panel = new javax.swing.JPanel();
        ObjectStepsPanel = new javax.swing.JPanel();
        SourceDirectoryPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        GetDirectoryForAnalysis = new javax.swing.JButton();
        SourceDirectory = new javax.swing.JTextField();
        ModelImageSelection = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ModelAnalysis = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        MethodSummary = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MethodSysnopsis = new javax.swing.JTextArea();
        MethodSaving = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PreProcessingGo = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(690, 455));
        setMinimumSize(new java.awt.Dimension(690, 455));
        setPreferredSize(new java.awt.Dimension(690, 420));

        BatchImageProcessing.setLayout(new java.awt.GridBagLayout());

        FileList_Header.setBackground(new java.awt.Color(102, 102, 102));
        FileList_Header.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FileList_Header.setForeground(new java.awt.Color(102, 102, 102));
        FileList_Header.setAlignmentX(0.0F);
        FileList_Header.setAlignmentY(0.0F);
        FileList_Header.setMaximumSize(new java.awt.Dimension(160, 36));
        FileList_Header.setMinimumSize(new java.awt.Dimension(160, 36));
        FileList_Header.setPreferredSize(new java.awt.Dimension(160, 36));
        FileList_Header.setLayout(new java.awt.GridBagLayout());

        PreProcessingLabel.setBackground(new java.awt.Color(204, 204, 204));
        PreProcessingLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PreProcessingLabel.setForeground(new java.awt.Color(204, 204, 204));
        PreProcessingLabel.setText("Add Files");
        PreProcessingLabel.setPreferredSize(new java.awt.Dimension(110, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        FileList_Header.add(PreProcessingLabel, gridBagConstraints);

        AddFiles.setBackground(new java.awt.Color(102, 102, 102));
        AddFiles.setForeground(new java.awt.Color(102, 102, 102));
        AddFiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-add_22.png"))); // NOI18N
        AddFiles.setToolTipText("Adds a preprocessing step.");
        AddFiles.setMaximumSize(new java.awt.Dimension(32, 32));
        AddFiles.setMinimumSize(new java.awt.Dimension(32, 32));
        AddFiles.setName(""); // NOI18N
        AddFiles.setPreferredSize(new java.awt.Dimension(34, 34));
        AddFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFilesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        FileList_Header.add(AddFiles, gridBagConstraints);
        AddFiles.getAccessibleContext().setAccessibleDescription("Add files for batch processing.");

        DeleteFile.setBackground(new java.awt.Color(102, 102, 102));
        DeleteFile.setForeground(new java.awt.Color(102, 102, 102));
        DeleteFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-delete-6_24.png"))); // NOI18N
        DeleteFile.setPreferredSize(new java.awt.Dimension(34, 34));
        DeleteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFileActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        FileList_Header.add(DeleteFile, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        BatchImageProcessing.add(FileList_Header, gridBagConstraints);

        FileList_Panel.setBackground(new java.awt.Color(102, 102, 102));
        FileList_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FileList_Panel.setForeground(new java.awt.Color(102, 102, 102));
        FileList_Panel.setAlignmentX(0.0F);
        FileList_Panel.setAlignmentY(0.0F);
        FileList_Panel.setMaximumSize(new java.awt.Dimension(220, 400));
        FileList_Panel.setMinimumSize(new java.awt.Dimension(220, 400));
        FileList_Panel.setPreferredSize(new java.awt.Dimension(220, 360));
        FileList_Panel.setLayout(new java.awt.GridBagLayout());

        PreProcessingStepsPanel.setBackground(VTC._VTC.ACTIONPANELBACKGROUND);
        PreProcessingStepsPanel.setPreferredSize(new java.awt.Dimension(196, 350));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        FileList.setModel(populateBatchFiles());
        jScrollPane2.setViewportView(FileList);

        javax.swing.GroupLayout PreProcessingStepsPanelLayout = new javax.swing.GroupLayout(PreProcessingStepsPanel);
        PreProcessingStepsPanel.setLayout(PreProcessingStepsPanelLayout);
        PreProcessingStepsPanelLayout.setHorizontalGroup(
            PreProcessingStepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreProcessingStepsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
        PreProcessingStepsPanelLayout.setVerticalGroup(
            PreProcessingStepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreProcessingStepsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        FileList_Panel.add(PreProcessingStepsPanel, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        BatchImageProcessing.add(FileList_Panel, gridBagConstraints);

        Options_Header.setBackground(new java.awt.Color(102, 102, 102));
        Options_Header.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Options_Header.setForeground(new java.awt.Color(102, 102, 102));
        Options_Header.setAlignmentX(0.0F);
        Options_Header.setAlignmentY(0.0F);
        Options_Header.setMaximumSize(new java.awt.Dimension(160, 36));
        Options_Header.setMinimumSize(new java.awt.Dimension(160, 36));
        Options_Header.setPreferredSize(new java.awt.Dimension(160, 36));
        Options_Header.setLayout(new java.awt.GridBagLayout());

        ObjectsLabel.setBackground(new java.awt.Color(204, 204, 204));
        ObjectsLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ObjectsLabel.setForeground(new java.awt.Color(204, 204, 204));
        ObjectsLabel.setText("Options");
        Options_Header.add(ObjectsLabel, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        BatchImageProcessing.add(Options_Header, gridBagConstraints);

        Options_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Options_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Options_Panel.setForeground(new java.awt.Color(102, 102, 102));
        Options_Panel.setAlignmentX(0.0F);
        Options_Panel.setAlignmentY(0.0F);
        Options_Panel.setMaximumSize(new java.awt.Dimension(220, 400));
        Options_Panel.setMinimumSize(new java.awt.Dimension(220, 400));
        Options_Panel.setPreferredSize(new java.awt.Dimension(440, 360));
        Options_Panel.setRequestFocusEnabled(false);

        ObjectStepsPanel.setBackground(VTC._VTC.ACTIONPANELBACKGROUND);
        ObjectStepsPanel.setMinimumSize(new java.awt.Dimension(320, 305));
        ObjectStepsPanel.setPreferredSize(new java.awt.Dimension(320, 305));
        ObjectStepsPanel.setLayout(new java.awt.GridBagLayout());

        SourceDirectoryPanel.setMinimumSize(new java.awt.Dimension(400, 29));
        SourceDirectoryPanel.setPreferredSize(new java.awt.Dimension(400, 29));
        SourceDirectoryPanel.setRequestFocusEnabled(false);
        SourceDirectoryPanel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Directory");
        SourceDirectoryPanel.add(jLabel2, new java.awt.GridBagConstraints());

        GetDirectoryForAnalysis.setText("Select");
        GetDirectoryForAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDirectoryForAnalysisActionPerformed(evt);
            }
        });
        SourceDirectoryPanel.add(GetDirectoryForAnalysis, new java.awt.GridBagConstraints());

        SourceDirectory.setText("(No directory selected)");
        SourceDirectory.setEnabled(false);
        SourceDirectory.setPreferredSize(new java.awt.Dimension(250, 28));
        SourceDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceDirectoryActionPerformed(evt);
            }
        });
        SourceDirectoryPanel.add(SourceDirectory, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        ObjectStepsPanel.add(SourceDirectoryPanel, gridBagConstraints);

        ModelImageSelection.setMinimumSize(new java.awt.Dimension(305, 29));
        ModelImageSelection.setPreferredSize(new java.awt.Dimension(400, 29));
        ModelImageSelection.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Batch based on: ");
        ModelImageSelection.add(jLabel1, new java.awt.GridBagConstraints());

        ModelAnalysis.setModel(this.cbm);
        ModelAnalysis.setMinimumSize(new java.awt.Dimension(110, 27));
        ModelAnalysis.setPreferredSize(new java.awt.Dimension(125, 27));
        ModelAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelAnalysisActionPerformed(evt);
            }
        });
        ModelImageSelection.add(ModelAnalysis, new java.awt.GridBagConstraints());

        jPanel2.setPreferredSize(new java.awt.Dimension(160, 29));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ModelImageSelection.add(jPanel2, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        ObjectStepsPanel.add(ModelImageSelection, gridBagConstraints);

        MethodSummary.setPreferredSize(new java.awt.Dimension(400, 200));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 200));

        MethodSysnopsis.setColumns(20);
        MethodSysnopsis.setRows(5);
        MethodSysnopsis.setMinimumSize(new java.awt.Dimension(380, 190));
        MethodSysnopsis.setPreferredSize(new java.awt.Dimension(395, 190));
        MethodSysnopsis.setSize(new java.awt.Dimension(395, 195));
        jScrollPane1.setViewportView(MethodSysnopsis);

        MethodSummary.add(jScrollPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        ObjectStepsPanel.add(MethodSummary, gridBagConstraints);

        MethodSaving.setMinimumSize(new java.awt.Dimension(305, 29));
        MethodSaving.setPreferredSize(new java.awt.Dimension(400, 40));
        MethodSaving.setSize(new java.awt.Dimension(305, 29));
        MethodSaving.setLayout(new java.awt.GridBagLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(350, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        MethodSaving.add(jPanel1, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document-open-folder_24.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(36, 36));
        jButton1.setMinimumSize(new java.awt.Dimension(36, 36));
        jButton1.setPreferredSize(new java.awt.Dimension(36, 36));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        MethodSaving.add(jButton1, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document-save-2_24.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(36, 36));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MethodSaving.add(jButton2, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        ObjectStepsPanel.add(MethodSaving, gridBagConstraints);

        PreProcessingGo.setBackground(new java.awt.Color(102, 102, 102));
        PreProcessingGo.setText("Go");
        PreProcessingGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreProcessingGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Options_PanelLayout = new javax.swing.GroupLayout(Options_Panel);
        Options_Panel.setLayout(Options_PanelLayout);
        Options_PanelLayout.setHorizontalGroup(
            Options_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Options_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Options_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ObjectStepsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Options_PanelLayout.createSequentialGroup()
                        .addGap(0, 323, Short.MAX_VALUE)
                        .addComponent(PreProcessingGo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Options_PanelLayout.setVerticalGroup(
            Options_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Options_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObjectStepsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PreProcessingGo)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        BatchImageProcessing.add(Options_Panel, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BatchImageProcessing, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BatchImageProcessing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFileActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_DeleteFileActionPerformed

    private void PreProcessingGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreProcessingGoActionPerformed
       
    }//GEN-LAST:event_PreProcessingGoActionPerformed

    private void AddFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFilesActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AddFilesActionPerformed

    private void SourceDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceDirectoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SourceDirectoryActionPerformed

    private void ModelAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelAnalysisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelAnalysisActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void GetDirectoryForAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDirectoryForAnalysisActionPerformed
     
     this.FileList.setModel(populateBatchFiles());
     
    }//GEN-LAST:event_GetDirectoryForAnalysisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddFiles;
    private javax.swing.JPanel BatchImageProcessing;
    private javax.swing.JButton DeleteFile;
    private javax.swing.JList FileList;
    private javax.swing.JPanel FileList_Header;
    public javax.swing.JPanel FileList_Panel;
    private javax.swing.JButton GetDirectoryForAnalysis;
    private javax.swing.JPanel MethodSaving;
    private javax.swing.JPanel MethodSummary;
    private javax.swing.JTextArea MethodSysnopsis;
    private javax.swing.JComboBox ModelAnalysis;
    private javax.swing.JPanel ModelImageSelection;
    public javax.swing.JPanel ObjectStepsPanel;
    private javax.swing.JLabel ObjectsLabel;
    private javax.swing.JPanel Options_Header;
    private javax.swing.JPanel Options_Panel;
    private javax.swing.JButton PreProcessingGo;
    private javax.swing.JLabel PreProcessingLabel;
    public javax.swing.JPanel PreProcessingStepsPanel;
    private javax.swing.JTextField SourceDirectory;
    private javax.swing.JPanel SourceDirectoryPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private DefaultListModel populateBatchFiles() {
    
        DefaultListModel dlm = new DefaultListModel();
        String test = "";
     
        
        this.directory = IJ.getDirectory("Select source directory...");

        File f = new File(this.directory);
        
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));
        
        ListIterator<String> itr = names.listIterator();
        
        while(itr.hasNext()){     
//            test = itr.next();
//            if(test == )
            dlm.addElement(itr.next());
        }
this.SourceDirectory.setText(this.directory);
        return dlm;
    }
      
 public void setTabValue(int tab){this.tab = tab;}

    @Override
    public void batchStateAdd(String selected, ArrayList tabs) {
        
    }
 
     private class ModelName extends javax.swing.JComboBox {

        public ModelName(ArrayList tabs) {
            this.setModel(new javax.swing.DefaultComboBoxModel(tabs.toArray()));
        }
    ;

    };
   
     
public void setPreProcessingProtocols(ArrayList al){this.preprocessingprotocol = al;}

public void setObjectProcotols(ArrayList al){this.objectprotocol = al;}

public void setProtocolSynopsis(ArrayList process, ArrayList objects){
    this.MethodSysnopsis.setText("Process: " + process.toString() + "  Objects: " + objects.toString());
}
    
};