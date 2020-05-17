/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package module2;

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;

/**
 *
 * @author karupakula
 */
public class gui extends javax.swing.JFrame {
    
    Set<Integer> ips = new HashSet<Integer>();
    int bfr;
    int mod;
    int GD;
    Map<Integer, Bucket> maps;
    ArrayList<Bucket> bmaps;
    
    /** Creates new form gui */
    public gui() {
        this.maps = new HashMap<Integer, Bucket>();
        this.bmaps = new ArrayList<Bucket>();
        
        initComponents();
         
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input = new javax.swing.JTextField();
        inputb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bfrip = new javax.swing.JTextField();
        modip = new javax.swing.JTextField();
        gdip = new javax.swing.JTextField();
        Parameters = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ldip = new javax.swing.JTextField();
        findkey = new javax.swing.JTextField();
        findb = new javax.swing.JButton();
        delkey = new javax.swing.JTextField();
        delb = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hvalgui = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        loc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Location = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        inputb.setText("Insert");
        inputb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbActionPerformed(evt);
            }
        });

        jLabel1.setText("BFR");

        jLabel2.setText("Mod");

        jLabel3.setText("GD");

        bfrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfripActionPerformed(evt);
            }
        });

        Parameters.setText("OK");
        Parameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParametersActionPerformed(evt);
            }
        });

        jLabel4.setText("LD");

        findkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findkeyActionPerformed(evt);
            }
        });

        findb.setText("Find");
        findb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbActionPerformed(evt);
            }
        });

        delb.setText("Delete");
        delb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbActionPerformed(evt);
            }
        });

        jLabel5.setText("Hash Value :");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Directory", "Bucket ID", "Local Depth", "Bucket"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(40);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(bfrip, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(modip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(gdip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(70, 70, 70)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ldip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Parameters, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(findkey)
                                .addComponent(delkey))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(findb)
                                .addComponent(inputb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(delb))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(hvalgui))
                    .addComponent(loc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(Location))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bfrip, gdip, ldip, modip});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {findkey, input});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {delb, findb, inputb});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Location, loc, msg});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bfrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gdip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Parameters)
                            .addComponent(ldip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(findkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(hvalgui))
                        .addGap(12, 12, 12)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Location)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Location, loc, msg});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void inputbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        int ip;
        ip = Integer.parseInt(input.getText());
        ips.add(ip);
        
        int sz = Integer.toBinaryString(mod).length();
        int[] h_value = new int[sz];
        
        Hash hash = new Hash();
        h_value = hash.hval(ip, mod, sz);
        
        int[] gdepth = new int[GD];
        for(int i=0; i<GD; i++)
        {
            gdepth[i] = h_value[sz-GD+i];
        }
        
        Directory d = new Directory();
        int direct = d.dirvalue(gdepth);
        
        Misc m = new Misc();
        Bucket temp,tempcreate;
        String s;
        temp = maps.get(direct);
        
        if(!temp.isFull())
        {
            System.out.println("YES");
            temp.addtobuck(ip);
        }
        else
        {
            if(temp.ld < GD)
            {
                s = '1' + temp.id;
                tempcreate = new Bucket(s,temp.ld+1,bfr);
                bmaps.add(tempcreate);
                temp.ld = temp.ld+1;
                temp.id = '0' + temp.id;
                for(Bucket b : bmaps)
                    b.buck.clear();
                
                for (Map.Entry mapElement : maps.entrySet())
                {
                    int x = (int) mapElement.getKey(); 
                    int[] bin = m.tobin(x,sz);
                    Bucket b = maps.get(mapElement.getKey());
                    int[] bintemp = new int[b.ld];
                    for(int k=0; k<b.ld; k++)
                        bintemp[k] = bin[sz-b.ld+k];
                    
                    s = m.bintostr(bintemp);
                    
                    for(Bucket bt : bmaps)
                    {
                        if(bt.id.equals(s))
                        {
                            maps.replace(x, bt);
                        }
                    }                  
                }               
            }
            else
            {
                s = '1' + temp.id;
                tempcreate = new Bucket(s,temp.ld+1,bfr);
                bmaps.add(tempcreate);
                temp.ld = temp.ld+1;
                temp.id = '0' + temp.id;
                for(Bucket b : bmaps)
                    b.buck.clear();
                
                for(int i=0; i<Math.pow(2, GD); i++)
                {
                    int k = i + (int)Math.pow(2, GD);
                    Bucket t;
                    t = maps.get(i);
                    maps.put(k, t);
                }
                GD = GD+1;
                
                for (Map.Entry mapElement : maps.entrySet())
                {
                    int x = (int) mapElement.getKey(); 
                    int[] bin = m.tobin(x,sz);
                    Bucket b = maps.get(mapElement.getKey());
                    int[] bintemp = new int[b.ld];
                    for(int k=0; k<b.ld; k++)
                        bintemp[k] = bin[sz-b.ld+k];
                    
                    s = m.bintostr(bintemp);
                    
                    for(Bucket bt : bmaps)
                    {
                        if(bt.id.equals(s))
                        {
                            maps.replace(x, bt);
                        }
                    }                  
                }
                
            }
            
            for(int p : ips)
            {
                h_value = hash.hval(p, mod,sz);
                
                int[] gdepthn = new int[GD];
                for(int a=0; a<GD; a++)
                {
                    gdepthn[a] = h_value[sz-GD+a];
                }
                
                direct = d.dirvalue(gdepthn);
                
                Bucket fb;
                fb = maps.get(direct);
                fb.addtobuck(p);
            }
            
        }
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Bucket bp;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0; i<Math.pow(2, GD); i++)
        {
            bp = maps.get(i);
            System.out.print(m.bintostr(m.tobin(i,GD)));
            System.out.print("->");
            System.out.print(bp.ld);
            System.out.print("->");
            System.out.print(bp.id);
            System.out.print("->");
            System.out.println(bp.buck.toString());
            
            model.addRow(new Object[]{m.bintostr(m.tobin(i,GD)),bp.id,bp.ld,bp.buck.toString()});            
        }
        
        hvalgui.setText(Integer.toString(ip%mod));
        input.setText("");
    }//GEN-LAST:event_inputbActionPerformed

    private void bfripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bfripActionPerformed

    private void ParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParametersActionPerformed
        // TODO add your handling code here:
        bfr = Integer.parseInt(bfrip.getText());
        mod = Integer.parseInt(modip.getText());
        GD = Integer.parseInt(gdip.getText());
        int ld = Integer.parseInt(ldip.getText());
        
        Misc m = new Misc();
        
        int[] ids = new int[ld];
        String id;
        for(int i=0; i<Math.pow(2, ld); i++)
        {            
            ids = m.tobin(i, ld);
            id = m.bintostr(ids);
            
            Bucket temp = new Bucket(id,ld,bfr);
            bmaps.add(temp);
        }
        
        Bucket temp;
        String retid;
        for(int i=0; i<Math.pow(2,GD); i++)
        {
            int ret[] = new int[GD];
            ret = m.tobin(i, GD);
            int[] retld = new int[ld];
            for(int k=0; k<ld; k++)
                retld[k] = ret[GD-ld+k];
            retid = m.bintostr(retld);
            
            for(Bucket b : bmaps)
            {
                if(b.id.equals(retid))
                {
                    maps.put(i, b);
                    break;
                }
            }                
        } 
        
    }//GEN-LAST:event_ParametersActionPerformed

    private void findkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findkeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findkeyActionPerformed

    private void findbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findbActionPerformed
        // TODO add your handling code here:
        int fk = Integer.parseInt(findkey.getText());
        hvalgui.setText(Integer.toString(fk%mod));
        if(!ips.contains(fk))
        {
            msg.setText("***Key Not Found***");
        }
        else
        {
            msg.setText("***Key Found***");
            int sz = Integer.toBinaryString(mod).length();
            int[] h_value = new int[sz];
            Hash hash = new Hash();
            h_value = hash.hval(fk, mod, sz);
        
            int[] gdepth = new int[GD];
            for(int i=0; i<GD; i++)
            {
                gdepth[i] = h_value[sz-GD+i];
            }
        
            Directory d = new Directory();
            int direct = d.dirvalue(gdepth);
            
            Misc m = new Misc();
            String dkey = m.bintostr(gdepth);
            
            Bucket b;
            b = maps.get(direct);
            
            loc.setText("Location : ");
            Location.setText("Directory -> " + dkey + " Bucket -> " + b.id);
        }
    }//GEN-LAST:event_findbActionPerformed

    private void delbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        
        int dk = Integer.parseInt(delkey.getText());
        hvalgui.setText(Integer.toString(dk%mod));
        if(!ips.contains(dk))
        {
            msg.setText("***Key Not Found***");
        }
        else
        {
            ips.remove(dk);
            int sz = Integer.toBinaryString(mod).length();
            int[] h_value = new int[sz];
            
            Hash hash = new Hash();
            h_value = hash.hval(dk, mod, sz);
        
            int[] gdepth = new int[GD];
            for(int i=0; i<GD; i++)
            {
                gdepth[i] = h_value[sz-GD+i];
            }
        
            Directory d = new Directory();
            int direct = d.dirvalue(gdepth);
        
            Misc m = new Misc();
            Bucket temp;
            String s;
            temp = maps.get(direct);
            Bucket tempc = new Bucket();
            
            if(temp.ld>=2)
            {
                for(Bucket b : bmaps)
                {
                    if(b.id.charAt(0) != temp.id.charAt(0) && 
                            b.id.substring(1).equals(temp.id.substring(1)))
                    {
                        tempc = b;
                        break;
                    }
                }
                
                if(temp.buck.size()+tempc.buck.size()==bfr+1)
                {
                    
                    temp.ld = temp.ld-1;
                    temp.id = tempc.id.substring(1);
                    
                    
                    for(Bucket b : bmaps)
                        b.buck.clear();
                    
                    for (Map.Entry mapElement : maps.entrySet())
                        {
                            int x = (int) mapElement.getKey(); 
                            int[] bin = m.tobin(x,sz);
                            Bucket b = maps.get(mapElement.getKey());
                            if(b.id.equals(tempc.id))
                            {
                                maps.replace(x, temp);
                            }
                        }
                    bmaps.remove(tempc);
                    
                    if(bmaps.size()>Math.pow(2, GD-1) && bmaps.size()<=Math.pow(2,GD))
                    {                       
                        for(int p : ips)
                        {
                            h_value = hash.hval(p, mod,sz);
                
                            int[] gdepthn = new int[GD];
                            for(int a=0; a<GD; a++)
                            {
                                gdepthn[a] = h_value[sz-GD+a];
                            }
                
                            direct = d.dirvalue(gdepthn);
                
                            Bucket fb;
                            fb = maps.get(direct);
                            fb.addtobuck(p);
                        }
                        
                    }
                    else 
                    {
                        if(!(GD-1<Integer.parseInt(gdip.getText())))
                        {
                            GD = GD - 1; 
                            for(int it=(int) Math.pow(2, GD);it<Math.pow (2, GD+1);it++)
                            {
                                maps.remove(it);
                            }
                            
                        }
               
                        for(int p : ips)
                        {
                            h_value = hash.hval(p, mod,sz);
                
                            int[] gdepthn = new int[GD];
                            for(int a=0; a<GD; a++)
                            {
                                gdepthn[a] = h_value[sz-GD+a];
                            }
                
                            direct = d.dirvalue(gdepthn);
                
                            Bucket fb;
                            fb = maps.get(direct);
                            fb.addtobuck(p);
                        }
                        
                    }
                }
                else
                {
                    temp.buck.remove(new Integer(dk));
                }
            }
            else
            {
                temp.buck.remove(new Integer(dk));
            }
            
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Bucket bp;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0; i<Math.pow(2, GD); i++)
        {
            bp = maps.get(i);
            System.out.print(m.bintostr(m.tobin(i,GD)));
            System.out.print("->");
            System.out.print(bp.ld);
            System.out.print("->");
            System.out.print(bp.id);
            System.out.print("->");
            System.out.println(bp.buck.toString());
            
            model.addRow(new Object[]{m.bintostr(m.tobin(i,GD)),bp.id,bp.ld,bp.buck.toString()});            
        }
        }
        
    }//GEN-LAST:event_delbActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Location;
    private javax.swing.JButton Parameters;
    private javax.swing.JTextField bfrip;
    private javax.swing.JButton delb;
    private javax.swing.JTextField delkey;
    private javax.swing.JButton findb;
    private javax.swing.JTextField findkey;
    private javax.swing.JTextField gdip;
    private javax.swing.JLabel hvalgui;
    private javax.swing.JTextField input;
    private javax.swing.JButton inputb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ldip;
    private javax.swing.JLabel loc;
    private javax.swing.JTextField modip;
    private javax.swing.JLabel msg;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
