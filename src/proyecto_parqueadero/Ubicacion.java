/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parqueadero;

import java.awt.Color;

/**
 *
 * @author home
 */
public class Ubicacion extends javax.swing.JFrame {

    /**
     * Creates new form Ubicacion
     */
    public Ubicacion() {
        initComponents();
    }
    public void desactivar(int seleccion,int index){
        seleccion--;
        if(index==1){
        for(int i=0;i<99;i++){
            
            if(i==seleccion){
            }else{
                jPanel_primer.getComponent(i).setEnabled(false);
                jPanel_primer.getComponent(i).setBackground(Color.yellow);
            }
            //jPanel_segunda.getComponent(i).setEnabled(false);
            //jPanel_segunda.getComponent(i).setBackground(Color.yellow);
            //jPanel_tercera.getComponent(i).setEnabled(false);
            //jPanel_tercera.getComponent(i).setBackground(Color.yellow);
        }
        }else{
            if(index==2){
            for(int i=0;i<97;i++){
                if(i==seleccion){
                }else{
                    jPanel_segunda.getComponent(i).setEnabled(false);
                    jPanel_segunda.getComponent(i).setBackground(Color.yellow);
                    
                }
                jPanel_primer.getComponent(i).setEnabled(false);
                jPanel_primer.getComponent(i).setBackground(Color.yellow);
                jPanel_tercera.getComponent(i).setEnabled(false);
                jPanel_tercera.getComponent(i).setBackground(Color.yellow);
            }
            }else{
            if(index==3){
            for(int i=0;i<97;i++){
                if(i==seleccion){
                }else{
                    
                    jPanel_tercera.getComponent(i).setEnabled(false);
                    jPanel_tercera.getComponent(i).setBackground(Color.yellow);
                    
                    
                }
                jPanel_primer.getComponent(i).setEnabled(false);
                jPanel_primer.getComponent(i).setBackground(Color.yellow);
                jPanel_segunda.getComponent(i).setEnabled(false);
                jPanel_segunda.getComponent(i).setBackground(Color.yellow);
            }
            }
        }
     
        }
        
        
        /* jButton_p10a.setEnabled(false);
    jButton_p10a1.setEnabled(false);
    jButton_p10a2.setEnabled(false);
    jButton_p11a.setEnabled(false);
    jButton_p11a1.setEnabled(false);
    jButton_p11a2.setEnabled(false);
    jButton_p12a.setEnabled(false);
    jButton_p12a1.setEnabled(false);
    jButton_p12a2.setEnabled(false);
    jButton_p13a.setEnabled(false);
    jButton_p13a1.setEnabled(false);
    jButton_p13a2.setEnabled(false);
    jButton_p15a.setEnabled(false);
    jButton_p15a1.setEnabled(false);
    jButton_p15a2.setEnabled(false);
    jButton_p16a.setEnabled(false);
    jButton_p16a1.setEnabled(false);
    jButton_p16a2.setEnabled(false);
    jButton_p17a.setEnabled(false);
    jButton_p17a1.setEnabled(false);
    jButton_p17a2.setEnabled(false);
    jButton_p18a.setEnabled(false);
    jButton_p18a1.setEnabled(false);
    jButton_p18a2.setEnabled(false);
    jButton_p19a.setEnabled(false);
    jButton_p19a1.setEnabled(false);
    jButton_p19a2.setEnabled(false);
    jButton_p1a.setEnabled(false);
    jButton_p1a1.setEnabled(false);
    jButton_p1a2.setEnabled(false);
    jButton_p20a.setEnabled(false);
    jButton_p20a1.setEnabled(false);
    jButton_p20a2.setEnabled(false);
    jButton_p21a.setEnabled(false);
    jButton_p21a1.setEnabled(false);
    jButton_p21a2.setEnabled(false);
    jButton_p22a.setEnabled(false);
    jButton_p22a1.setEnabled(false);
    jButton_p22a2.setEnabled(false);
    jButton_p23a.setEnabled(false);
    jButton_p23a1.setEnabled(false);
    jButton_p23a2.setEnabled(false);
    jButton_p24a.setEnabled(false);
    jButton_p24a1.setEnabled(false);
    jButton_p24a2.setEnabled(false);
    jButton_p25a.setEnabled(false);
    jButton_p25a1.setEnabled(false);
    jButton_p25a2.setEnabled(false);
    jButton_p26a.setEnabled(false);
    jButton_p26a1.setEnabled(false);
    jButton_p26a2.setEnabled(false);
    jButton_p27a.setEnabled(false);
    jButton_p27a1.setEnabled(false);
    jButton_p27a2.setEnabled(false);
    jButton_p28a.setEnabled(false);
    jButton_p28a1.setEnabled(false);
    jButton_p28a2.setEnabled(false);
    jButton_p29a.setEnabled(false);
    jButton_p29a1.setEnabled(false);
    jButton_p29a2.setEnabled(false);
    jButton_p2a.setEnabled(false);
    jButton_p2a1.setEnabled(false);
    jButton_p2a2.setEnabled(false);
    jButton_p30a.setEnabled(false);
    jButton_p30a1.setEnabled(false);
    jButton_p30a2.setEnabled(false);
    jButton_p31a.setEnabled(false);
    jButton_p31a1.setEnabled(false);
    jButton_p31a2.setEnabled(false);
   jButton_p32a.setEnabled(false);
   jButton_p32a1.setEnabled(false);
   jButton_p32a2.setEnabled(false);
   jButton_p33a.setEnabled(false);
   jButton_p33a1.setEnabled(false);
   jButton_p33a2.setEnabled(false);
   jButton_p34a.setEnabled(false);
   jButton_p34a1.setEnabled(false);
   jButton_p34a2.setEnabled(false);
   jButton_p35a.setEnabled(false);
   jButton_p35a1.setEnabled(false);
   jButton_p35a2.setEnabled(false);
   jButton_p36a.setEnabled(false);
   jButton_p36a1.setEnabled(false);
   jButton_p36a2.setEnabled(false);
   jButton_p37a.setEnabled(false);
   jButton_p37a1.setEnabled(false);
   jButton_p37a2.setEnabled(false);
   jButton_p38a.setEnabled(false);
   jButton_p38a1.setEnabled(false);
   jButton_p38a2.setEnabled(false);
   jButton_p39a.setEnabled(false);
   jButton_p39a1.setEnabled(false);
   jButton_p39a2.setEnabled(false);
   jButton_p3a.setEnabled(false);
   jButton_p3a1.setEnabled(false);
   jButton_p3a2.setEnabled(false);
   jButton_p40a.setEnabled(false);
   jButton_p40a1.setEnabled(false);
   jButton_p40a2.setEnabled(false);
   jButton_p41a.setEnabled(false);
   jButton_p41a1.setEnabled(false);
   jButton_p41a2.setEnabled(false);
   jButton_p42a.setEnabled(false);
   jButton_p42a1.setEnabled(false);
   jButton_p42a2.setEnabled(false);
   jButton_p43a.setEnabled(false);
   jButton_p43a1.setEnabled(false);
   jButton_p43a2.setEnabled(false);
   jButton_p44a.setEnabled(false);
   jButton_p44a1.setEnabled(false);
   jButton_p44a2.setEnabled(false);
   jButton_p45a.setEnabled(false);
   jButton_p45a1.setEnabled(false);
   jButton_p45a2.setEnabled(false);
   jButton_p46a.setEnabled(false);
   jButton_p46a1.setEnabled(false);
   jButton_p46a2.setEnabled(false);
   jButton_p47a.setEnabled(false);
   jButton_p47a1.setEnabled(false);
   jButton_p47a2.setEnabled(false);
   jButton_p48a.setEnabled(false);
   jButton_p48a1.setEnabled(false);
   jButton_p48a2.setEnabled(false);
   jButton_p49a.setEnabled(false);
   jButton_p49a1.setEnabled(false);
   jButton_p49a2.setEnabled(false);
   jButton_p4a.setEnabled(false);
   jButton_p4a1.setEnabled(false);
   jButton_p4a2.setEnabled(false);
   jButton_p50a.setEnabled(false);
   jButton_p50a1.setEnabled(false);
   jButton_p50a2.setEnabled(false);
   jButton_p51a.setEnabled(false);
   jButton_p51a1.setEnabled(false);
   jButton_p51a2.setEnabled(false);
   jButton_p52a.setEnabled(false);
   jButton_p52a1.setEnabled(false);
   jButton_p52a2.setEnabled(false);
   jButton_p53a.setEnabled(false);
   jButton_p53a1.setEnabled(false);
   jButton_p53a2.setEnabled(false);
   jButton_p54a.setEnabled(false);
   jButton_p54a1.setEnabled(false);
   jButton_p54a2.setEnabled(false);
   jButton_p55a.setEnabled(false);
   jButton_p55a1.setEnabled(false);
   jButton_p55a2.setEnabled(false);
   jButton_p56a.setEnabled(false);
   jButton_p56a1.setEnabled(false);
   jButton_p56a2.setEnabled(false);
   jButton_p57a.setEnabled(false);
   jButton_p57a1.setEnabled(false);
   jButton_p57a2.setEnabled(false);
   jButton_p58a.setEnabled(false);
   jButton_p58a1.setEnabled(false);
   jButton_p58a2.setEnabled(false);
   jButton_p59a.setEnabled(false);
   jButton_p59a1.setEnabled(false);
   jButton_p59a2.setEnabled(false);
   jButton_p5a.setEnabled(false);
   jButton_p5a1.setEnabled(false);
   jButton_p5a2.setEnabled(false);
   jButton_p60a.setEnabled(false);
   jButton_p60a1.setEnabled(false);
   jButton_p60a2.setEnabled(false);
   jButton_p61a.setEnabled(false);
   jButton_p61a1.setEnabled(false);
   jButton_p61a2.setEnabled(false);
   jButton_p62a.setEnabled(false);
   jButton_p62a1.setEnabled(false);
   jButton_p62a2.setEnabled(false);
   jButton_p63a.setEnabled(false);
   jButton_p63a1.setEnabled(false);
   jButton_p63a2.setEnabled(false);
   jButton_p64a.setEnabled(false);
   jButton_p64a1.setEnabled(false);
   jButton_p64a2.setEnabled(false);
   jButton_p65a.setEnabled(false);
   jButton_p65a1.setEnabled(false);
   jButton_p65a2.setEnabled(false);
   jButton_p66a.setEnabled(false);
   jButton_p66a1.setEnabled(false);
   jButton_p66a2.setEnabled(false);
   jButton_p67a.setEnabled(false);
   jButton_p67a1.setEnabled(false);
   jButton_p67a2.setEnabled(false);
   jButton_p68a.setEnabled(false);
   jButton_p68a1.setEnabled(false);
   jButton_p68a2.setEnabled(false);
   jButton_p69a.setEnabled(false);
   jButton_p69a1.setEnabled(false);
   jButton_p69a2.setEnabled(false);
   jButton_p6a.setEnabled(false);
   jButton_p6a1.setEnabled(false);
   jButton_p6a2.setEnabled(false);
   jButton_p70a.setEnabled(false);
   jButton_p70a1.setEnabled(false);
   jButton_p70a2.setEnabled(false);
   jButton_p71a.setEnabled(false);
   jButton_p71a1.setEnabled(false);
   jButton_p71a2.setEnabled(false);
   jButton_p72a.setEnabled(false);
   jButton_p72a1.setEnabled(false);
   jButton_p72a2.setEnabled(false);
   jButton_p73a.setEnabled(false);
   jButton_p73a1.setEnabled(false);
   jButton_p73a2.setEnabled(false);
   jButton_p74a.setEnabled(false);
   jButton_p74a1.setEnabled(false);
   jButton_p74a2.setEnabled(false);
   jButton_p75a.setEnabled(false);
   jButton_p75a1.setEnabled(false);
   jButton_p75a2.setEnabled(false);
   jButton_p76a.setEnabled(false);
   jButton_p76a1.setEnabled(false);
   jButton_p76a2.setEnabled(false);
   jButton_p77a.setEnabled(false);
   jButton_p77a1.setEnabled(false);
   jButton_p77a2.setEnabled(false);
   jButton_p78a.setEnabled(false);
   jButton_p78a1.setEnabled(false);
   jButton_p78a2.setEnabled(false);
   jButton_p79a.setEnabled(false);
   jButton_p79a1.setEnabled(false);
   jButton_p79a2.setEnabled(false);
   jButton_p7a.setEnabled(false);
   jButton_p7a1.setEnabled(false);
   jButton_p7a2.setEnabled(false);
   jButton_p80a.setEnabled(false);
   jButton_p80a1.setEnabled(false);
   jButton_p80a2.setEnabled(false);
   jButton_p81a.setEnabled(false);
   jButton_p81a1.setEnabled(false);
   jButton_p81a2.setEnabled(false);
   jButton_p82a.setEnabled(false);
   jButton_p82a1.setEnabled(false);
   jButton_p82a2.setEnabled(false);
   jButton_p83a.setEnabled(false);
   jButton_p83a1.setEnabled(false);
   jButton_p83a2.setEnabled(false);
   jButton_p84a.setEnabled(false);
   jButton_p84a1.setEnabled(false);
   jButton_p84a2.setEnabled(false);
   jButton_p85a.setEnabled(false);
   jButton_p85a1.setEnabled(false);
   jButton_p85a2.setEnabled(false);
   jButton_p86a.setEnabled(false);
   jButton_p86a1.setEnabled(false);
   jButton_p86a2.setEnabled(false);
   jButton_p87a.setEnabled(false);
   jButton_p87a1.setEnabled(false);
   jButton_p87a2.setEnabled(false);
    jButton_p88a.setEnabled(false);
    jButton_p88a1.setEnabled(false);
    jButton_p88a2.setEnabled(false);
    jButton_p89a.setEnabled(false);
    jButton_p89a1.setEnabled(false);
    jButton_p89a2.setEnabled(false);
    jButton_p8a.setEnabled(false);
    jButton_p8a1.setEnabled(false);
    jButton_p8a2.setEnabled(false);
    jButton_p90a.setEnabled(false);
    jButton_p90a1.setEnabled(false);
    jButton_p90a2.setEnabled(false);
    jButton_p91a.setEnabled(false);
    jButton_p91a1.setEnabled(false);
    jButton_p91a2.setEnabled(false);
    jButton_p92a.setEnabled(false);
    jButton_p92a1.setEnabled(false);
    jButton_p92a2.setEnabled(false);
    jButton_p93a.setEnabled(false);
    jButton_p93a1.setEnabled(false);
    jButton_p93a2.setEnabled(false);
    jButton_p94a.setEnabled(false);
    jButton_p94a1.setEnabled(false);
    jButton_p94a2.setEnabled(false);
    jButton_p95a.setEnabled(false);
    jButton_p95a1.setEnabled(false);
    jButton_p95a2.setEnabled(false);
    jButton_p96a.setEnabled(false);
    jButton_p96a1.setEnabled(false);
    jButton_p96a2.setEnabled(false);
    jButton_p97a.setEnabled(false);
    jButton_p97a1.setEnabled(false);
    jButton_p97a2.setEnabled(false);
    jButton_p98a.setEnabled(false);
    jButton_p98a1.setEnabled(false);
    jButton_p98a2.setEnabled(false);
    jButton_p99a.setEnabled(false);
    jButton_p99a1.setEnabled(false);
    jButton_p99a2.setEnabled(false);
    */
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane_principal = new javax.swing.JTabbedPane();
        jPanel_primer = new javax.swing.JPanel();
        jButton_p1a = new javax.swing.JButton();
        jButton_p2a = new javax.swing.JButton();
        jButton_p3a = new javax.swing.JButton();
        jButton_p4a = new javax.swing.JButton();
        jButton_p5a = new javax.swing.JButton();
        jButton_p6a = new javax.swing.JButton();
        jButton_p7a = new javax.swing.JButton();
        jButton_p8a = new javax.swing.JButton();
        jButton_p9a = new javax.swing.JButton();
        jButton_p10a = new javax.swing.JButton();
        jButton_p11a = new javax.swing.JButton();
        jButton_p12a = new javax.swing.JButton();
        jButton_p13a = new javax.swing.JButton();
        jButton_p14a = new javax.swing.JButton();
        jButton_p15a = new javax.swing.JButton();
        jButton_p16a = new javax.swing.JButton();
        jButton_p17a = new javax.swing.JButton();
        jButton_p18a = new javax.swing.JButton();
        jButton_p19a = new javax.swing.JButton();
        jButton_p20a = new javax.swing.JButton();
        jButton_p21a = new javax.swing.JButton();
        jButton_p22a = new javax.swing.JButton();
        jButton_p23a = new javax.swing.JButton();
        jButton_p24a = new javax.swing.JButton();
        jButton_p25a = new javax.swing.JButton();
        jButton_p26a = new javax.swing.JButton();
        jButton_p27a = new javax.swing.JButton();
        jButton_p28a = new javax.swing.JButton();
        jButton_p29a = new javax.swing.JButton();
        jButton_p30a = new javax.swing.JButton();
        jButton_p31a = new javax.swing.JButton();
        jButton_p32a = new javax.swing.JButton();
        jButton_p33a = new javax.swing.JButton();
        jButton_p34a = new javax.swing.JButton();
        jButton_p35a = new javax.swing.JButton();
        jButton_p36a = new javax.swing.JButton();
        jButton_p37a = new javax.swing.JButton();
        jButton_p38a = new javax.swing.JButton();
        jButton_p39a = new javax.swing.JButton();
        jButton_p40a = new javax.swing.JButton();
        jButton_p41a = new javax.swing.JButton();
        jButton_p42a = new javax.swing.JButton();
        jButton_p43a = new javax.swing.JButton();
        jButton_p44a = new javax.swing.JButton();
        jButton_p45a = new javax.swing.JButton();
        jButton_p46a = new javax.swing.JButton();
        jButton_p47a = new javax.swing.JButton();
        jButton_p48a = new javax.swing.JButton();
        jButton_p49a = new javax.swing.JButton();
        jButton_p50a = new javax.swing.JButton();
        jButton_p51a = new javax.swing.JButton();
        jButton_p52a = new javax.swing.JButton();
        jButton_p53a = new javax.swing.JButton();
        jButton_p54a = new javax.swing.JButton();
        jButton_p55a = new javax.swing.JButton();
        jButton_p56a = new javax.swing.JButton();
        jButton_p57a = new javax.swing.JButton();
        jButton_p58a = new javax.swing.JButton();
        jButton_p59a = new javax.swing.JButton();
        jButton_p60a = new javax.swing.JButton();
        jButton_p61a = new javax.swing.JButton();
        jButton_p62a = new javax.swing.JButton();
        jButton_p63a = new javax.swing.JButton();
        jButton_p64a = new javax.swing.JButton();
        jButton_p65a = new javax.swing.JButton();
        jButton_p66a = new javax.swing.JButton();
        jButton_p67a = new javax.swing.JButton();
        jButton_p68a = new javax.swing.JButton();
        jButton_p69a = new javax.swing.JButton();
        jButton_p70a = new javax.swing.JButton();
        jButton_p71a = new javax.swing.JButton();
        jButton_p72a = new javax.swing.JButton();
        jButton_p73a = new javax.swing.JButton();
        jButton_p74a = new javax.swing.JButton();
        jButton_p75a = new javax.swing.JButton();
        jButton_p76a = new javax.swing.JButton();
        jButton_p77a = new javax.swing.JButton();
        jButton_p78a = new javax.swing.JButton();
        jButton_p79a = new javax.swing.JButton();
        jButton_p80a = new javax.swing.JButton();
        jButton_p81a = new javax.swing.JButton();
        jButton_p82a = new javax.swing.JButton();
        jButton_p83a = new javax.swing.JButton();
        jButton_p84a = new javax.swing.JButton();
        jButton_p85a = new javax.swing.JButton();
        jButton_p86a = new javax.swing.JButton();
        jButton_p87a = new javax.swing.JButton();
        jButton_p88a = new javax.swing.JButton();
        jButton_p89a = new javax.swing.JButton();
        jButton_p90a = new javax.swing.JButton();
        jButton_p91a = new javax.swing.JButton();
        jButton_p92a = new javax.swing.JButton();
        jButton_p93a = new javax.swing.JButton();
        jButton_p94a = new javax.swing.JButton();
        jButton_p95a = new javax.swing.JButton();
        jButton_p96a = new javax.swing.JButton();
        jButton_p97a = new javax.swing.JButton();
        jButton_p98a = new javax.swing.JButton();
        jButton_p99a = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel_segunda = new javax.swing.JPanel();
        jButton_p1a1 = new javax.swing.JButton();
        jButton_p2a1 = new javax.swing.JButton();
        jButton_p3a1 = new javax.swing.JButton();
        jButton_p4a1 = new javax.swing.JButton();
        jButton_p5a1 = new javax.swing.JButton();
        jButton_p6a1 = new javax.swing.JButton();
        jButton_p7a1 = new javax.swing.JButton();
        jButton_p8a1 = new javax.swing.JButton();
        jButton_p9a1 = new javax.swing.JButton();
        jButton_p10a1 = new javax.swing.JButton();
        jButton_p11a1 = new javax.swing.JButton();
        jButton_p12a1 = new javax.swing.JButton();
        jButton_p13a1 = new javax.swing.JButton();
        jButton_p14a1 = new javax.swing.JButton();
        jButton_p15a1 = new javax.swing.JButton();
        jButton_p16a1 = new javax.swing.JButton();
        jButton_p17a1 = new javax.swing.JButton();
        jButton_p18a1 = new javax.swing.JButton();
        jButton_p19a1 = new javax.swing.JButton();
        jButton_p20a1 = new javax.swing.JButton();
        jButton_p21a1 = new javax.swing.JButton();
        jButton_p22a1 = new javax.swing.JButton();
        jButton_p23a1 = new javax.swing.JButton();
        jButton_p24a1 = new javax.swing.JButton();
        jButton_p25a1 = new javax.swing.JButton();
        jButton_p26a1 = new javax.swing.JButton();
        jButton_p27a1 = new javax.swing.JButton();
        jButton_p28a1 = new javax.swing.JButton();
        jButton_p29a1 = new javax.swing.JButton();
        jButton_p30a1 = new javax.swing.JButton();
        jButton_p31a1 = new javax.swing.JButton();
        jButton_p32a1 = new javax.swing.JButton();
        jButton_p33a1 = new javax.swing.JButton();
        jButton_p34a1 = new javax.swing.JButton();
        jButton_p35a1 = new javax.swing.JButton();
        jButton_p36a1 = new javax.swing.JButton();
        jButton_p37a1 = new javax.swing.JButton();
        jButton_p38a1 = new javax.swing.JButton();
        jButton_p39a1 = new javax.swing.JButton();
        jButton_p40a1 = new javax.swing.JButton();
        jButton_p41a1 = new javax.swing.JButton();
        jButton_p42a1 = new javax.swing.JButton();
        jButton_p43a1 = new javax.swing.JButton();
        jButton_p44a1 = new javax.swing.JButton();
        jButton_p45a1 = new javax.swing.JButton();
        jButton_p46a1 = new javax.swing.JButton();
        jButton_p47a1 = new javax.swing.JButton();
        jButton_p48a1 = new javax.swing.JButton();
        jButton_p49a1 = new javax.swing.JButton();
        jButton_p50a1 = new javax.swing.JButton();
        jButton_p51a1 = new javax.swing.JButton();
        jButton_p52a1 = new javax.swing.JButton();
        jButton_p53a1 = new javax.swing.JButton();
        jButton_p54a1 = new javax.swing.JButton();
        jButton_p55a1 = new javax.swing.JButton();
        jButton_p56a1 = new javax.swing.JButton();
        jButton_p57a1 = new javax.swing.JButton();
        jButton_p58a1 = new javax.swing.JButton();
        jButton_p59a1 = new javax.swing.JButton();
        jButton_p60a1 = new javax.swing.JButton();
        jButton_p61a1 = new javax.swing.JButton();
        jButton_p62a1 = new javax.swing.JButton();
        jButton_p63a1 = new javax.swing.JButton();
        jButton_p64a1 = new javax.swing.JButton();
        jButton_p65a1 = new javax.swing.JButton();
        jButton_p66a1 = new javax.swing.JButton();
        jButton_p67a1 = new javax.swing.JButton();
        jButton_p68a1 = new javax.swing.JButton();
        jButton_p69a1 = new javax.swing.JButton();
        jButton_p70a1 = new javax.swing.JButton();
        jButton_p71a1 = new javax.swing.JButton();
        jButton_p72a1 = new javax.swing.JButton();
        jButton_p73a1 = new javax.swing.JButton();
        jButton_p74a1 = new javax.swing.JButton();
        jButton_p75a1 = new javax.swing.JButton();
        jButton_p76a1 = new javax.swing.JButton();
        jButton_p77a1 = new javax.swing.JButton();
        jButton_p78a1 = new javax.swing.JButton();
        jButton_p79a1 = new javax.swing.JButton();
        jButton_p80a1 = new javax.swing.JButton();
        jButton_p81a1 = new javax.swing.JButton();
        jButton_p82a1 = new javax.swing.JButton();
        jButton_p83a1 = new javax.swing.JButton();
        jButton_p84a1 = new javax.swing.JButton();
        jButton_p85a1 = new javax.swing.JButton();
        jButton_p86a1 = new javax.swing.JButton();
        jButton_p87a1 = new javax.swing.JButton();
        jButton_p88a1 = new javax.swing.JButton();
        jButton_p89a1 = new javax.swing.JButton();
        jButton_p90a1 = new javax.swing.JButton();
        jButton_p91a1 = new javax.swing.JButton();
        jButton_p92a1 = new javax.swing.JButton();
        jButton_p93a1 = new javax.swing.JButton();
        jButton_p94a1 = new javax.swing.JButton();
        jButton_p95a1 = new javax.swing.JButton();
        jButton_p96a1 = new javax.swing.JButton();
        jButton_p97a1 = new javax.swing.JButton();
        jButton_p98a1 = new javax.swing.JButton();
        jButton_p99a1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel_tercera = new javax.swing.JPanel();
        jButton_p1a2 = new javax.swing.JButton();
        jButton_p2a2 = new javax.swing.JButton();
        jButton_p3a2 = new javax.swing.JButton();
        jButton_p4a2 = new javax.swing.JButton();
        jButton_p5a2 = new javax.swing.JButton();
        jButton_p6a2 = new javax.swing.JButton();
        jButton_p7a2 = new javax.swing.JButton();
        jButton_p8a2 = new javax.swing.JButton();
        jButton_p9a2 = new javax.swing.JButton();
        jButton_p10a2 = new javax.swing.JButton();
        jButton_p11a2 = new javax.swing.JButton();
        jButton_p12a2 = new javax.swing.JButton();
        jButton_p13a2 = new javax.swing.JButton();
        jButton_p14a2 = new javax.swing.JButton();
        jButton_p15a2 = new javax.swing.JButton();
        jButton_p16a2 = new javax.swing.JButton();
        jButton_p17a2 = new javax.swing.JButton();
        jButton_p18a2 = new javax.swing.JButton();
        jButton_p19a2 = new javax.swing.JButton();
        jButton_p20a2 = new javax.swing.JButton();
        jButton_p21a2 = new javax.swing.JButton();
        jButton_p22a2 = new javax.swing.JButton();
        jButton_p23a2 = new javax.swing.JButton();
        jButton_p24a2 = new javax.swing.JButton();
        jButton_p25a2 = new javax.swing.JButton();
        jButton_p26a2 = new javax.swing.JButton();
        jButton_p27a2 = new javax.swing.JButton();
        jButton_p28a2 = new javax.swing.JButton();
        jButton_p29a2 = new javax.swing.JButton();
        jButton_p30a2 = new javax.swing.JButton();
        jButton_p31a2 = new javax.swing.JButton();
        jButton_p32a2 = new javax.swing.JButton();
        jButton_p33a2 = new javax.swing.JButton();
        jButton_p34a2 = new javax.swing.JButton();
        jButton_p35a2 = new javax.swing.JButton();
        jButton_p36a2 = new javax.swing.JButton();
        jButton_p37a2 = new javax.swing.JButton();
        jButton_p38a2 = new javax.swing.JButton();
        jButton_p39a2 = new javax.swing.JButton();
        jButton_p40a2 = new javax.swing.JButton();
        jButton_p41a2 = new javax.swing.JButton();
        jButton_p42a2 = new javax.swing.JButton();
        jButton_p43a2 = new javax.swing.JButton();
        jButton_p44a2 = new javax.swing.JButton();
        jButton_p45a2 = new javax.swing.JButton();
        jButton_p46a2 = new javax.swing.JButton();
        jButton_p47a2 = new javax.swing.JButton();
        jButton_p48a2 = new javax.swing.JButton();
        jButton_p49a2 = new javax.swing.JButton();
        jButton_p50a2 = new javax.swing.JButton();
        jButton_p51a2 = new javax.swing.JButton();
        jButton_p52a2 = new javax.swing.JButton();
        jButton_p53a2 = new javax.swing.JButton();
        jButton_p54a2 = new javax.swing.JButton();
        jButton_p55a2 = new javax.swing.JButton();
        jButton_p56a2 = new javax.swing.JButton();
        jButton_p57a2 = new javax.swing.JButton();
        jButton_p58a2 = new javax.swing.JButton();
        jButton_p59a2 = new javax.swing.JButton();
        jButton_p60a2 = new javax.swing.JButton();
        jButton_p61a2 = new javax.swing.JButton();
        jButton_p62a2 = new javax.swing.JButton();
        jButton_p63a2 = new javax.swing.JButton();
        jButton_p64a2 = new javax.swing.JButton();
        jButton_p65a2 = new javax.swing.JButton();
        jButton_p66a2 = new javax.swing.JButton();
        jButton_p67a2 = new javax.swing.JButton();
        jButton_p68a2 = new javax.swing.JButton();
        jButton_p69a2 = new javax.swing.JButton();
        jButton_p70a2 = new javax.swing.JButton();
        jButton_p71a2 = new javax.swing.JButton();
        jButton_p72a2 = new javax.swing.JButton();
        jButton_p73a2 = new javax.swing.JButton();
        jButton_p74a2 = new javax.swing.JButton();
        jButton_p75a2 = new javax.swing.JButton();
        jButton_p76a2 = new javax.swing.JButton();
        jButton_p77a2 = new javax.swing.JButton();
        jButton_p78a2 = new javax.swing.JButton();
        jButton_p79a2 = new javax.swing.JButton();
        jButton_p80a2 = new javax.swing.JButton();
        jButton_p81a2 = new javax.swing.JButton();
        jButton_p82a2 = new javax.swing.JButton();
        jButton_p83a2 = new javax.swing.JButton();
        jButton_p84a2 = new javax.swing.JButton();
        jButton_p85a2 = new javax.swing.JButton();
        jButton_p86a2 = new javax.swing.JButton();
        jButton_p87a2 = new javax.swing.JButton();
        jButton_p88a2 = new javax.swing.JButton();
        jButton_p89a2 = new javax.swing.JButton();
        jButton_p90a2 = new javax.swing.JButton();
        jButton_p91a2 = new javax.swing.JButton();
        jButton_p92a2 = new javax.swing.JButton();
        jButton_p93a2 = new javax.swing.JButton();
        jButton_p94a2 = new javax.swing.JButton();
        jButton_p95a2 = new javax.swing.JButton();
        jButton_p96a2 = new javax.swing.JButton();
        jButton_p97a2 = new javax.swing.JButton();
        jButton_p98a2 = new javax.swing.JButton();
        jButton_p99a2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(806, 630));
        setMinimumSize(new java.awt.Dimension(806, 630));

        jPanel1.setMaximumSize(new java.awt.Dimension(806, 630));
        jPanel1.setMinimumSize(new java.awt.Dimension(806, 630));

        jTabbedPane_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane_principal.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jTabbedPane_principal.setMaximumSize(new java.awt.Dimension(806, 565));

        jPanel_primer.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_primer.setMaximumSize(new java.awt.Dimension(801, 471));
        jPanel_primer.setMinimumSize(new java.awt.Dimension(801, 471));
        jPanel_primer.setLayout(null);

        jButton_p1a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p1a.setText("1");
        jButton_p1a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p1a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p1a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p1aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p1a);
        jButton_p1a.setBounds(100, 130, 50, 40);

        jButton_p2a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p2a.setText("2");
        jButton_p2a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p2a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p2a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p2a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p2aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p2a);
        jButton_p2a.setBounds(150, 130, 50, 40);

        jButton_p3a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p3a.setText("3");
        jButton_p3a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p3a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p3a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p3a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p3aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p3a);
        jButton_p3a.setBounds(200, 130, 50, 40);

        jButton_p4a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p4a.setText("4");
        jButton_p4a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p4a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p4a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p4a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p4aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p4a);
        jButton_p4a.setBounds(250, 130, 50, 40);

        jButton_p5a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p5a.setText("5");
        jButton_p5a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p5a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p5a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p5a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p5aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p5a);
        jButton_p5a.setBounds(300, 130, 50, 40);

        jButton_p6a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p6a.setText("6");
        jButton_p6a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p6a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p6a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p6a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p6aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p6a);
        jButton_p6a.setBounds(350, 130, 50, 40);

        jButton_p7a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p7a.setText("7");
        jButton_p7a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p7a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p7a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p7a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p7aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p7a);
        jButton_p7a.setBounds(400, 130, 50, 40);

        jButton_p8a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p8a.setText("8");
        jButton_p8a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p8a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p8a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p8a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p8aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p8a);
        jButton_p8a.setBounds(450, 130, 50, 40);

        jButton_p9a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p9a.setText("9");
        jButton_p9a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p9a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p9a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p9a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p9aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p9a);
        jButton_p9a.setBounds(500, 130, 50, 40);

        jButton_p10a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p10a.setText("10");
        jButton_p10a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p10a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p10a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p10a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p10aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p10a);
        jButton_p10a.setBounds(550, 130, 50, 40);

        jButton_p11a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p11a.setText("11");
        jButton_p11a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p11a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p11a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p11a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p11aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p11a);
        jButton_p11a.setBounds(600, 130, 50, 40);

        jButton_p12a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p12a.setText("12");
        jButton_p12a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p12a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p12a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p12a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p12aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p12a);
        jButton_p12a.setBounds(650, 130, 50, 40);

        jButton_p13a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p13a.setText("13");
        jButton_p13a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p13a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p13a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p13a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p13aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p13a);
        jButton_p13a.setBounds(100, 170, 50, 40);

        jButton_p14a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p14a.setText("14");
        jButton_p14a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p14a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p14a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p14a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p14aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p14a);
        jButton_p14a.setBounds(150, 170, 50, 40);

        jButton_p15a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p15a.setText("15");
        jButton_p15a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p15a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p15a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p15a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p15aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p15a);
        jButton_p15a.setBounds(200, 170, 50, 40);

        jButton_p16a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p16a.setText("16");
        jButton_p16a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p16a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p16a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p16a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p16aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p16a);
        jButton_p16a.setBounds(250, 170, 50, 40);

        jButton_p17a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p17a.setText("17");
        jButton_p17a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p17a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p17a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p17a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p17aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p17a);
        jButton_p17a.setBounds(300, 170, 50, 40);

        jButton_p18a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p18a.setText("18");
        jButton_p18a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p18a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p18a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p18a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p18aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p18a);
        jButton_p18a.setBounds(350, 170, 50, 40);

        jButton_p19a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p19a.setText("19");
        jButton_p19a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p19a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p19a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p19a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p19aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p19a);
        jButton_p19a.setBounds(400, 170, 50, 40);

        jButton_p20a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p20a.setText("20");
        jButton_p20a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p20a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p20a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p20a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p20aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p20a);
        jButton_p20a.setBounds(450, 170, 50, 40);

        jButton_p21a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p21a.setText("21");
        jButton_p21a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p21a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p21a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p21a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p21aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p21a);
        jButton_p21a.setBounds(500, 170, 50, 40);

        jButton_p22a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p22a.setText("22");
        jButton_p22a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p22a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p22a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p22a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p22aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p22a);
        jButton_p22a.setBounds(550, 170, 50, 40);

        jButton_p23a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p23a.setText("23");
        jButton_p23a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p23a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p23a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p23a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p23aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p23a);
        jButton_p23a.setBounds(600, 170, 50, 40);

        jButton_p24a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p24a.setText("24");
        jButton_p24a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p24a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p24a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p24a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p24aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p24a);
        jButton_p24a.setBounds(650, 170, 50, 40);

        jButton_p25a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p25a.setText("25");
        jButton_p25a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p25a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p25a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p25a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p25aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p25a);
        jButton_p25a.setBounds(100, 210, 50, 40);

        jButton_p26a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p26a.setText("26");
        jButton_p26a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p26a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p26a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p26a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p26aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p26a);
        jButton_p26a.setBounds(150, 210, 50, 40);

        jButton_p27a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p27a.setText("27");
        jButton_p27a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p27a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p27a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p27a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p27aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p27a);
        jButton_p27a.setBounds(200, 210, 50, 40);

        jButton_p28a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p28a.setText("28");
        jButton_p28a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p28a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p28a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p28a);
        jButton_p28a.setBounds(250, 210, 50, 40);

        jButton_p29a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p29a.setText("29");
        jButton_p29a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p29a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p29a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p29a);
        jButton_p29a.setBounds(300, 210, 50, 40);

        jButton_p30a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p30a.setText("30");
        jButton_p30a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p30a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p30a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p30a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p30aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p30a);
        jButton_p30a.setBounds(350, 210, 50, 40);

        jButton_p31a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p31a.setText("31");
        jButton_p31a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p31a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p31a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p31a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p31aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p31a);
        jButton_p31a.setBounds(400, 210, 50, 40);

        jButton_p32a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p32a.setText("32");
        jButton_p32a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p32a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p32a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p32a);
        jButton_p32a.setBounds(450, 210, 50, 40);

        jButton_p33a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p33a.setText("33");
        jButton_p33a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p33a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p33a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p33a);
        jButton_p33a.setBounds(500, 210, 50, 40);

        jButton_p34a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p34a.setText("34");
        jButton_p34a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p34a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p34a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p34a);
        jButton_p34a.setBounds(550, 210, 50, 40);

        jButton_p35a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p35a.setText("35");
        jButton_p35a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p35a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p35a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p35a);
        jButton_p35a.setBounds(600, 210, 50, 40);

        jButton_p36a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p36a.setText("36");
        jButton_p36a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p36a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p36a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p36a);
        jButton_p36a.setBounds(650, 210, 50, 40);

        jButton_p37a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p37a.setText("37");
        jButton_p37a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p37a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p37a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p37a);
        jButton_p37a.setBounds(100, 250, 50, 40);

        jButton_p38a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p38a.setText("38");
        jButton_p38a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p38a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p38a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p38a);
        jButton_p38a.setBounds(150, 250, 50, 40);

        jButton_p39a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p39a.setText("39");
        jButton_p39a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p39a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p39a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p39a);
        jButton_p39a.setBounds(200, 250, 50, 40);

        jButton_p40a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p40a.setText("40");
        jButton_p40a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p40a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p40a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p40a);
        jButton_p40a.setBounds(250, 250, 50, 40);

        jButton_p41a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p41a.setText("41");
        jButton_p41a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p41a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p41a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p41a);
        jButton_p41a.setBounds(300, 250, 50, 40);

        jButton_p42a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p42a.setText("42");
        jButton_p42a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p42a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p42a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p42a);
        jButton_p42a.setBounds(350, 250, 50, 40);

        jButton_p43a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p43a.setText("43");
        jButton_p43a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p43a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p43a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p43a);
        jButton_p43a.setBounds(400, 250, 50, 40);

        jButton_p44a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p44a.setText("44");
        jButton_p44a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p44a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p44a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p44a);
        jButton_p44a.setBounds(450, 250, 50, 40);

        jButton_p45a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p45a.setText("45");
        jButton_p45a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p45a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p45a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p45a);
        jButton_p45a.setBounds(500, 250, 50, 40);

        jButton_p46a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p46a.setText("46");
        jButton_p46a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p46a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p46a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p46a);
        jButton_p46a.setBounds(550, 250, 50, 40);

        jButton_p47a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p47a.setText("47");
        jButton_p47a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p47a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p47a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p47a);
        jButton_p47a.setBounds(600, 250, 50, 40);

        jButton_p48a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p48a.setText("48");
        jButton_p48a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p48a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p48a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p48a);
        jButton_p48a.setBounds(650, 250, 50, 40);

        jButton_p49a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p49a.setText("49");
        jButton_p49a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p49a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p49a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p49a);
        jButton_p49a.setBounds(100, 290, 50, 40);

        jButton_p50a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p50a.setText("50");
        jButton_p50a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p50a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p50a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p50a);
        jButton_p50a.setBounds(150, 290, 50, 40);

        jButton_p51a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p51a.setText("51");
        jButton_p51a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p51a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p51a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p51a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p51aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p51a);
        jButton_p51a.setBounds(200, 290, 50, 40);

        jButton_p52a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p52a.setText("52");
        jButton_p52a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p52a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p52a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p52a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p52aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p52a);
        jButton_p52a.setBounds(250, 290, 50, 40);

        jButton_p53a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p53a.setText("53");
        jButton_p53a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p53a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p53a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p53a);
        jButton_p53a.setBounds(300, 290, 50, 40);

        jButton_p54a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p54a.setText("54");
        jButton_p54a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p54a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p54a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p54a);
        jButton_p54a.setBounds(350, 290, 50, 40);

        jButton_p55a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p55a.setText("55");
        jButton_p55a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p55a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p55a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p55a);
        jButton_p55a.setBounds(400, 290, 50, 40);

        jButton_p56a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p56a.setText("56");
        jButton_p56a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p56a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p56a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p56a);
        jButton_p56a.setBounds(450, 290, 50, 40);

        jButton_p57a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p57a.setText("57");
        jButton_p57a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p57a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p57a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p57a);
        jButton_p57a.setBounds(500, 290, 50, 40);

        jButton_p58a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p58a.setText("58");
        jButton_p58a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p58a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p58a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p58a);
        jButton_p58a.setBounds(550, 290, 50, 40);

        jButton_p59a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p59a.setText("59");
        jButton_p59a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p59a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p59a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p59a);
        jButton_p59a.setBounds(600, 290, 50, 40);

        jButton_p60a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p60a.setText("60");
        jButton_p60a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p60a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p60a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p60a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p60aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p60a);
        jButton_p60a.setBounds(650, 290, 50, 40);

        jButton_p61a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p61a.setText("61");
        jButton_p61a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p61a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p61a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p61a);
        jButton_p61a.setBounds(100, 330, 50, 40);

        jButton_p62a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p62a.setText("62");
        jButton_p62a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p62a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p62a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p62a);
        jButton_p62a.setBounds(150, 330, 50, 40);

        jButton_p63a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p63a.setText("63");
        jButton_p63a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p63a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p63a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p63a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p63aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p63a);
        jButton_p63a.setBounds(200, 330, 50, 40);

        jButton_p64a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p64a.setText("64");
        jButton_p64a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p64a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p64a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p64a);
        jButton_p64a.setBounds(250, 330, 50, 40);

        jButton_p65a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p65a.setText("65");
        jButton_p65a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p65a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p65a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p65a);
        jButton_p65a.setBounds(300, 330, 50, 40);

        jButton_p66a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p66a.setText("66");
        jButton_p66a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p66a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p66a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p66a);
        jButton_p66a.setBounds(350, 330, 50, 40);

        jButton_p67a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p67a.setText("67");
        jButton_p67a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p67a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p67a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p67a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p67aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p67a);
        jButton_p67a.setBounds(400, 330, 50, 40);

        jButton_p68a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p68a.setText("68");
        jButton_p68a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p68a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p68a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p68a);
        jButton_p68a.setBounds(450, 330, 50, 40);

        jButton_p69a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p69a.setText("69");
        jButton_p69a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p69a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p69a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p69a);
        jButton_p69a.setBounds(500, 330, 50, 40);

        jButton_p70a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p70a.setText("70");
        jButton_p70a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p70a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p70a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p70a);
        jButton_p70a.setBounds(550, 330, 50, 40);

        jButton_p71a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p71a.setText("71");
        jButton_p71a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p71a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p71a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p71a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p71aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p71a);
        jButton_p71a.setBounds(600, 330, 50, 40);

        jButton_p72a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p72a.setText("72");
        jButton_p72a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p72a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p72a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p72a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p72aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p72a);
        jButton_p72a.setBounds(650, 330, 50, 40);

        jButton_p73a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p73a.setText("73");
        jButton_p73a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p73a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p73a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p73a);
        jButton_p73a.setBounds(100, 370, 50, 40);

        jButton_p74a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p74a.setText("74");
        jButton_p74a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p74a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p74a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p74a);
        jButton_p74a.setBounds(150, 370, 50, 40);

        jButton_p75a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p75a.setText("75");
        jButton_p75a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p75a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p75a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p75a);
        jButton_p75a.setBounds(200, 370, 50, 40);

        jButton_p76a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p76a.setText("76");
        jButton_p76a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p76a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p76a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p76a);
        jButton_p76a.setBounds(250, 370, 50, 40);

        jButton_p77a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p77a.setText("77");
        jButton_p77a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p77a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p77a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p77a);
        jButton_p77a.setBounds(300, 370, 50, 40);

        jButton_p78a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p78a.setText("78");
        jButton_p78a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p78a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p78a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p78a);
        jButton_p78a.setBounds(350, 370, 50, 40);

        jButton_p79a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p79a.setText("79");
        jButton_p79a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p79a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p79a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p79a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p79aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p79a);
        jButton_p79a.setBounds(400, 370, 50, 40);

        jButton_p80a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p80a.setText("80");
        jButton_p80a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p80a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p80a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p80a);
        jButton_p80a.setBounds(450, 370, 50, 40);

        jButton_p81a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p81a.setText("81");
        jButton_p81a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p81a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p81a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p81a);
        jButton_p81a.setBounds(500, 370, 50, 40);

        jButton_p82a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p82a.setText("82");
        jButton_p82a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p82a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p82a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p82a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p82aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p82a);
        jButton_p82a.setBounds(550, 370, 50, 40);

        jButton_p83a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p83a.setText("83");
        jButton_p83a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p83a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p83a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p83a);
        jButton_p83a.setBounds(600, 370, 50, 40);

        jButton_p84a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p84a.setText("84");
        jButton_p84a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p84a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p84a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p84a);
        jButton_p84a.setBounds(650, 370, 50, 40);

        jButton_p85a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p85a.setText("85");
        jButton_p85a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p85a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p85a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p85a);
        jButton_p85a.setBounds(100, 410, 50, 40);

        jButton_p86a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p86a.setText("86");
        jButton_p86a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p86a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p86a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p86a);
        jButton_p86a.setBounds(150, 410, 50, 40);

        jButton_p87a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p87a.setText("87");
        jButton_p87a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p87a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p87a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p87a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p87aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p87a);
        jButton_p87a.setBounds(200, 410, 50, 40);

        jButton_p88a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p88a.setText("88");
        jButton_p88a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p88a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p88a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p88a);
        jButton_p88a.setBounds(250, 410, 50, 40);

        jButton_p89a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p89a.setText("89");
        jButton_p89a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p89a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p89a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p89a);
        jButton_p89a.setBounds(300, 410, 50, 40);

        jButton_p90a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p90a.setText("90");
        jButton_p90a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p90a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p90a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p90a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p90aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p90a);
        jButton_p90a.setBounds(350, 410, 50, 40);

        jButton_p91a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p91a.setText("91");
        jButton_p91a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p91a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p91a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p91a);
        jButton_p91a.setBounds(400, 410, 50, 40);

        jButton_p92a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p92a.setText("92");
        jButton_p92a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p92a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p92a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p92a);
        jButton_p92a.setBounds(450, 410, 50, 40);

        jButton_p93a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p93a.setText("93");
        jButton_p93a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p93a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p93a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p93a);
        jButton_p93a.setBounds(500, 410, 50, 40);

        jButton_p94a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p94a.setText("94");
        jButton_p94a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p94a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p94a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p94a);
        jButton_p94a.setBounds(550, 410, 50, 40);

        jButton_p95a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p95a.setText("95");
        jButton_p95a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p95a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p95a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p95a);
        jButton_p95a.setBounds(600, 410, 50, 40);

        jButton_p96a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p96a.setText("96");
        jButton_p96a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p96a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p96a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p96a);
        jButton_p96a.setBounds(650, 410, 50, 40);

        jButton_p97a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p97a.setText("97");
        jButton_p97a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p97a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p97a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p97a);
        jButton_p97a.setBounds(100, 450, 50, 40);

        jButton_p98a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p98a.setText("98");
        jButton_p98a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p98a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p98a.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_primer.add(jButton_p98a);
        jButton_p98a.setBounds(150, 450, 50, 40);

        jButton_p99a.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p99a.setText("99");
        jButton_p99a.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p99a.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p99a.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p99a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p99aActionPerformed(evt);
            }
        });
        jPanel_primer.add(jButton_p99a);
        jButton_p99a.setBounds(200, 450, 50, 40);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setText("seleccione la posicion de ubicacion");
        jPanel_primer.add(jLabel2);
        jLabel2.setBounds(170, 30, 460, 70);

        jTabbedPane_principal.addTab("primer planta", jPanel_primer);

        jPanel_segunda.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_segunda.setMaximumSize(new java.awt.Dimension(801, 529));
        jPanel_segunda.setMinimumSize(new java.awt.Dimension(801, 529));
        jPanel_segunda.setLayout(null);

        jButton_p1a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p1a1.setText("1");
        jButton_p1a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p1a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p1a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p1a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p1a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p1a1);
        jButton_p1a1.setBounds(100, 130, 50, 40);

        jButton_p2a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p2a1.setText("2");
        jButton_p2a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p2a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p2a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p2a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p2a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p2a1);
        jButton_p2a1.setBounds(150, 130, 50, 40);

        jButton_p3a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p3a1.setText("3");
        jButton_p3a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p3a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p3a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p3a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p3a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p3a1);
        jButton_p3a1.setBounds(200, 130, 50, 40);

        jButton_p4a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p4a1.setText("4");
        jButton_p4a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p4a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p4a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p4a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p4a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p4a1);
        jButton_p4a1.setBounds(250, 130, 50, 40);

        jButton_p5a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p5a1.setText("5");
        jButton_p5a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p5a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p5a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p5a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p5a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p5a1);
        jButton_p5a1.setBounds(300, 130, 50, 40);

        jButton_p6a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p6a1.setText("6");
        jButton_p6a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p6a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p6a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p6a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p6a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p6a1);
        jButton_p6a1.setBounds(350, 130, 50, 40);

        jButton_p7a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p7a1.setText("7");
        jButton_p7a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p7a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p7a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p7a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p7a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p7a1);
        jButton_p7a1.setBounds(400, 130, 50, 40);

        jButton_p8a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p8a1.setText("8");
        jButton_p8a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p8a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p8a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p8a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p8a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p8a1);
        jButton_p8a1.setBounds(450, 130, 50, 40);

        jButton_p9a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p9a1.setText("9");
        jButton_p9a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p9a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p9a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p9a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p9a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p9a1);
        jButton_p9a1.setBounds(500, 130, 50, 40);

        jButton_p10a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p10a1.setText("10");
        jButton_p10a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p10a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p10a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p10a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p10a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p10a1);
        jButton_p10a1.setBounds(550, 130, 50, 40);

        jButton_p11a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p11a1.setText("11");
        jButton_p11a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p11a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p11a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p11a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p11a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p11a1);
        jButton_p11a1.setBounds(600, 130, 50, 40);

        jButton_p12a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p12a1.setText("12");
        jButton_p12a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p12a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p12a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p12a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p12a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p12a1);
        jButton_p12a1.setBounds(650, 130, 50, 40);

        jButton_p13a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p13a1.setText("13");
        jButton_p13a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p13a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p13a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p13a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p13a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p13a1);
        jButton_p13a1.setBounds(100, 170, 50, 40);

        jButton_p14a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p14a1.setText("14");
        jButton_p14a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p14a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p14a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p14a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p14a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p14a1);
        jButton_p14a1.setBounds(150, 170, 50, 40);

        jButton_p15a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p15a1.setText("15");
        jButton_p15a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p15a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p15a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p15a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p15a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p15a1);
        jButton_p15a1.setBounds(200, 170, 50, 40);

        jButton_p16a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p16a1.setText("16");
        jButton_p16a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p16a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p16a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p16a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p16a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p16a1);
        jButton_p16a1.setBounds(250, 170, 50, 40);

        jButton_p17a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p17a1.setText("17");
        jButton_p17a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p17a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p17a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p17a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p17a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p17a1);
        jButton_p17a1.setBounds(300, 170, 50, 40);

        jButton_p18a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p18a1.setText("18");
        jButton_p18a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p18a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p18a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p18a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p18a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p18a1);
        jButton_p18a1.setBounds(350, 170, 50, 40);

        jButton_p19a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p19a1.setText("19");
        jButton_p19a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p19a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p19a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p19a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p19a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p19a1);
        jButton_p19a1.setBounds(400, 170, 50, 40);

        jButton_p20a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p20a1.setText("20");
        jButton_p20a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p20a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p20a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p20a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p20a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p20a1);
        jButton_p20a1.setBounds(450, 170, 50, 40);

        jButton_p21a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p21a1.setText("21");
        jButton_p21a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p21a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p21a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p21a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p21a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p21a1);
        jButton_p21a1.setBounds(500, 170, 50, 40);

        jButton_p22a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p22a1.setText("22");
        jButton_p22a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p22a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p22a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p22a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p22a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p22a1);
        jButton_p22a1.setBounds(550, 170, 50, 40);

        jButton_p23a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p23a1.setText("23");
        jButton_p23a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p23a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p23a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p23a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p23a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p23a1);
        jButton_p23a1.setBounds(600, 170, 50, 40);

        jButton_p24a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p24a1.setText("24");
        jButton_p24a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p24a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p24a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p24a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p24a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p24a1);
        jButton_p24a1.setBounds(650, 170, 50, 40);

        jButton_p25a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p25a1.setText("25");
        jButton_p25a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p25a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p25a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p25a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p25a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p25a1);
        jButton_p25a1.setBounds(100, 210, 50, 40);

        jButton_p26a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p26a1.setText("26");
        jButton_p26a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p26a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p26a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p26a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p26a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p26a1);
        jButton_p26a1.setBounds(150, 210, 50, 40);

        jButton_p27a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p27a1.setText("27");
        jButton_p27a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p27a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p27a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p27a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p27a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p27a1);
        jButton_p27a1.setBounds(200, 210, 50, 40);

        jButton_p28a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p28a1.setText("28");
        jButton_p28a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p28a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p28a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p28a1);
        jButton_p28a1.setBounds(250, 210, 50, 40);

        jButton_p29a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p29a1.setText("29");
        jButton_p29a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p29a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p29a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p29a1);
        jButton_p29a1.setBounds(300, 210, 50, 40);

        jButton_p30a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p30a1.setText("30");
        jButton_p30a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p30a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p30a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p30a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p30a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p30a1);
        jButton_p30a1.setBounds(350, 210, 50, 40);

        jButton_p31a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p31a1.setText("31");
        jButton_p31a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p31a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p31a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p31a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p31a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p31a1);
        jButton_p31a1.setBounds(400, 210, 50, 40);

        jButton_p32a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p32a1.setText("32");
        jButton_p32a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p32a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p32a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p32a1);
        jButton_p32a1.setBounds(450, 210, 50, 40);

        jButton_p33a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p33a1.setText("33");
        jButton_p33a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p33a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p33a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p33a1);
        jButton_p33a1.setBounds(500, 210, 50, 40);

        jButton_p34a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p34a1.setText("34");
        jButton_p34a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p34a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p34a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p34a1);
        jButton_p34a1.setBounds(550, 210, 50, 40);

        jButton_p35a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p35a1.setText("35");
        jButton_p35a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p35a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p35a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p35a1);
        jButton_p35a1.setBounds(600, 210, 50, 40);

        jButton_p36a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p36a1.setText("36");
        jButton_p36a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p36a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p36a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p36a1);
        jButton_p36a1.setBounds(650, 210, 50, 40);

        jButton_p37a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p37a1.setText("37");
        jButton_p37a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p37a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p37a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p37a1);
        jButton_p37a1.setBounds(100, 250, 50, 40);

        jButton_p38a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p38a1.setText("38");
        jButton_p38a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p38a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p38a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p38a1);
        jButton_p38a1.setBounds(150, 250, 50, 40);

        jButton_p39a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p39a1.setText("39");
        jButton_p39a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p39a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p39a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p39a1);
        jButton_p39a1.setBounds(200, 250, 50, 40);

        jButton_p40a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p40a1.setText("40");
        jButton_p40a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p40a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p40a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p40a1);
        jButton_p40a1.setBounds(250, 250, 50, 40);

        jButton_p41a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p41a1.setText("41");
        jButton_p41a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p41a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p41a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p41a1);
        jButton_p41a1.setBounds(300, 250, 50, 40);

        jButton_p42a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p42a1.setText("42");
        jButton_p42a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p42a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p42a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p42a1);
        jButton_p42a1.setBounds(350, 250, 50, 40);

        jButton_p43a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p43a1.setText("43");
        jButton_p43a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p43a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p43a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p43a1);
        jButton_p43a1.setBounds(400, 250, 50, 40);

        jButton_p44a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p44a1.setText("44");
        jButton_p44a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p44a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p44a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p44a1);
        jButton_p44a1.setBounds(450, 250, 50, 40);

        jButton_p45a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p45a1.setText("45");
        jButton_p45a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p45a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p45a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p45a1);
        jButton_p45a1.setBounds(500, 250, 50, 40);

        jButton_p46a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p46a1.setText("46");
        jButton_p46a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p46a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p46a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p46a1);
        jButton_p46a1.setBounds(550, 250, 50, 40);

        jButton_p47a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p47a1.setText("47");
        jButton_p47a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p47a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p47a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p47a1);
        jButton_p47a1.setBounds(600, 250, 50, 40);

        jButton_p48a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p48a1.setText("48");
        jButton_p48a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p48a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p48a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p48a1);
        jButton_p48a1.setBounds(650, 250, 50, 40);

        jButton_p49a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p49a1.setText("49");
        jButton_p49a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p49a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p49a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p49a1);
        jButton_p49a1.setBounds(100, 290, 50, 40);

        jButton_p50a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p50a1.setText("50");
        jButton_p50a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p50a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p50a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p50a1);
        jButton_p50a1.setBounds(150, 290, 50, 40);

        jButton_p51a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p51a1.setText("51");
        jButton_p51a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p51a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p51a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p51a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p51a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p51a1);
        jButton_p51a1.setBounds(200, 290, 50, 40);

        jButton_p52a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p52a1.setText("52");
        jButton_p52a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p52a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p52a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p52a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p52a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p52a1);
        jButton_p52a1.setBounds(250, 290, 50, 40);

        jButton_p53a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p53a1.setText("53");
        jButton_p53a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p53a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p53a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p53a1);
        jButton_p53a1.setBounds(300, 290, 50, 40);

        jButton_p54a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p54a1.setText("54");
        jButton_p54a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p54a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p54a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p54a1);
        jButton_p54a1.setBounds(350, 290, 50, 40);

        jButton_p55a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p55a1.setText("55");
        jButton_p55a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p55a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p55a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p55a1);
        jButton_p55a1.setBounds(400, 290, 50, 40);

        jButton_p56a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p56a1.setText("56");
        jButton_p56a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p56a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p56a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p56a1);
        jButton_p56a1.setBounds(450, 290, 50, 40);

        jButton_p57a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p57a1.setText("57");
        jButton_p57a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p57a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p57a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p57a1);
        jButton_p57a1.setBounds(500, 290, 50, 40);

        jButton_p58a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p58a1.setText("58");
        jButton_p58a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p58a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p58a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p58a1);
        jButton_p58a1.setBounds(550, 290, 50, 40);

        jButton_p59a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p59a1.setText("59");
        jButton_p59a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p59a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p59a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p59a1);
        jButton_p59a1.setBounds(600, 290, 50, 40);

        jButton_p60a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p60a1.setText("60");
        jButton_p60a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p60a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p60a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p60a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p60a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p60a1);
        jButton_p60a1.setBounds(650, 290, 50, 40);

        jButton_p61a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p61a1.setText("61");
        jButton_p61a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p61a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p61a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p61a1);
        jButton_p61a1.setBounds(100, 330, 50, 40);

        jButton_p62a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p62a1.setText("62");
        jButton_p62a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p62a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p62a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p62a1);
        jButton_p62a1.setBounds(150, 330, 50, 40);

        jButton_p63a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p63a1.setText("63");
        jButton_p63a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p63a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p63a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p63a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p63a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p63a1);
        jButton_p63a1.setBounds(200, 330, 50, 40);

        jButton_p64a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p64a1.setText("64");
        jButton_p64a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p64a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p64a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p64a1);
        jButton_p64a1.setBounds(250, 330, 50, 40);

        jButton_p65a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p65a1.setText("65");
        jButton_p65a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p65a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p65a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p65a1);
        jButton_p65a1.setBounds(300, 330, 50, 40);

        jButton_p66a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p66a1.setText("66");
        jButton_p66a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p66a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p66a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p66a1);
        jButton_p66a1.setBounds(350, 330, 50, 40);

        jButton_p67a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p67a1.setText("67");
        jButton_p67a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p67a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p67a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p67a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p67a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p67a1);
        jButton_p67a1.setBounds(400, 330, 50, 40);

        jButton_p68a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p68a1.setText("68");
        jButton_p68a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p68a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p68a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p68a1);
        jButton_p68a1.setBounds(450, 330, 50, 40);

        jButton_p69a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p69a1.setText("69");
        jButton_p69a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p69a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p69a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p69a1);
        jButton_p69a1.setBounds(500, 330, 50, 40);

        jButton_p70a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p70a1.setText("70");
        jButton_p70a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p70a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p70a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p70a1);
        jButton_p70a1.setBounds(550, 330, 50, 40);

        jButton_p71a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p71a1.setText("71");
        jButton_p71a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p71a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p71a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p71a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p71a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p71a1);
        jButton_p71a1.setBounds(600, 330, 50, 40);

        jButton_p72a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p72a1.setText("72");
        jButton_p72a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p72a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p72a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p72a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p72a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p72a1);
        jButton_p72a1.setBounds(650, 330, 50, 40);

        jButton_p73a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p73a1.setText("73");
        jButton_p73a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p73a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p73a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p73a1);
        jButton_p73a1.setBounds(100, 370, 50, 40);

        jButton_p74a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p74a1.setText("74");
        jButton_p74a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p74a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p74a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p74a1);
        jButton_p74a1.setBounds(150, 370, 50, 40);

        jButton_p75a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p75a1.setText("75");
        jButton_p75a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p75a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p75a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p75a1);
        jButton_p75a1.setBounds(200, 370, 50, 40);

        jButton_p76a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p76a1.setText("76");
        jButton_p76a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p76a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p76a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p76a1);
        jButton_p76a1.setBounds(250, 370, 50, 40);

        jButton_p77a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p77a1.setText("77");
        jButton_p77a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p77a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p77a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p77a1);
        jButton_p77a1.setBounds(300, 370, 50, 40);

        jButton_p78a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p78a1.setText("78");
        jButton_p78a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p78a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p78a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p78a1);
        jButton_p78a1.setBounds(350, 370, 50, 40);

        jButton_p79a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p79a1.setText("79");
        jButton_p79a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p79a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p79a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p79a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p79a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p79a1);
        jButton_p79a1.setBounds(400, 370, 50, 40);

        jButton_p80a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p80a1.setText("80");
        jButton_p80a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p80a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p80a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p80a1);
        jButton_p80a1.setBounds(450, 370, 50, 40);

        jButton_p81a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p81a1.setText("81");
        jButton_p81a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p81a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p81a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p81a1);
        jButton_p81a1.setBounds(500, 370, 50, 40);

        jButton_p82a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p82a1.setText("82");
        jButton_p82a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p82a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p82a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p82a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p82a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p82a1);
        jButton_p82a1.setBounds(550, 370, 50, 40);

        jButton_p83a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p83a1.setText("83");
        jButton_p83a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p83a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p83a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p83a1);
        jButton_p83a1.setBounds(600, 370, 50, 40);

        jButton_p84a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p84a1.setText("84");
        jButton_p84a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p84a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p84a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p84a1);
        jButton_p84a1.setBounds(650, 370, 50, 40);

        jButton_p85a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p85a1.setText("85");
        jButton_p85a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p85a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p85a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p85a1);
        jButton_p85a1.setBounds(100, 410, 50, 40);

        jButton_p86a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p86a1.setText("86");
        jButton_p86a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p86a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p86a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p86a1);
        jButton_p86a1.setBounds(150, 410, 50, 40);

        jButton_p87a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p87a1.setText("87");
        jButton_p87a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p87a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p87a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p87a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p87a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p87a1);
        jButton_p87a1.setBounds(200, 410, 50, 40);

        jButton_p88a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p88a1.setText("88");
        jButton_p88a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p88a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p88a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p88a1);
        jButton_p88a1.setBounds(250, 410, 50, 40);

        jButton_p89a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p89a1.setText("89");
        jButton_p89a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p89a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p89a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p89a1);
        jButton_p89a1.setBounds(300, 410, 50, 40);

        jButton_p90a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p90a1.setText("90");
        jButton_p90a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p90a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p90a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p90a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p90a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p90a1);
        jButton_p90a1.setBounds(350, 410, 50, 40);

        jButton_p91a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p91a1.setText("91");
        jButton_p91a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p91a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p91a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p91a1);
        jButton_p91a1.setBounds(400, 410, 50, 40);

        jButton_p92a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p92a1.setText("92");
        jButton_p92a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p92a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p92a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p92a1);
        jButton_p92a1.setBounds(450, 410, 50, 40);

        jButton_p93a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p93a1.setText("93");
        jButton_p93a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p93a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p93a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p93a1);
        jButton_p93a1.setBounds(500, 410, 50, 40);

        jButton_p94a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p94a1.setText("94");
        jButton_p94a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p94a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p94a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p94a1);
        jButton_p94a1.setBounds(550, 410, 50, 40);

        jButton_p95a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p95a1.setText("95");
        jButton_p95a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p95a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p95a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p95a1);
        jButton_p95a1.setBounds(600, 410, 50, 40);

        jButton_p96a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p96a1.setText("96");
        jButton_p96a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p96a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p96a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p96a1);
        jButton_p96a1.setBounds(650, 410, 50, 40);

        jButton_p97a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p97a1.setText("97");
        jButton_p97a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p97a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p97a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p97a1);
        jButton_p97a1.setBounds(100, 450, 50, 40);

        jButton_p98a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p98a1.setText("98");
        jButton_p98a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p98a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p98a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_segunda.add(jButton_p98a1);
        jButton_p98a1.setBounds(150, 450, 50, 40);

        jButton_p99a1.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p99a1.setText("99");
        jButton_p99a1.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p99a1.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p99a1.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p99a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p99a1ActionPerformed(evt);
            }
        });
        jPanel_segunda.add(jButton_p99a1);
        jButton_p99a1.setBounds(200, 450, 50, 40);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel3.setText("seleccione la posicion de ubicacion");
        jPanel_segunda.add(jLabel3);
        jLabel3.setBounds(170, 30, 460, 70);

        jTabbedPane_principal.addTab("segunda planta", jPanel_segunda);

        jPanel_tercera.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_tercera.setLayout(null);

        jButton_p1a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p1a2.setText("1");
        jButton_p1a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p1a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p1a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p1a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p1a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p1a2);
        jButton_p1a2.setBounds(100, 130, 50, 40);

        jButton_p2a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p2a2.setText("2");
        jButton_p2a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p2a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p2a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p2a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p2a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p2a2);
        jButton_p2a2.setBounds(150, 130, 50, 40);

        jButton_p3a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p3a2.setText("3");
        jButton_p3a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p3a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p3a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p3a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p3a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p3a2);
        jButton_p3a2.setBounds(200, 130, 50, 40);

        jButton_p4a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p4a2.setText("4");
        jButton_p4a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p4a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p4a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p4a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p4a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p4a2);
        jButton_p4a2.setBounds(250, 130, 50, 40);

        jButton_p5a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p5a2.setText("5");
        jButton_p5a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p5a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p5a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p5a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p5a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p5a2);
        jButton_p5a2.setBounds(300, 130, 50, 40);

        jButton_p6a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p6a2.setText("6");
        jButton_p6a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p6a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p6a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p6a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p6a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p6a2);
        jButton_p6a2.setBounds(350, 130, 50, 40);

        jButton_p7a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p7a2.setText("7");
        jButton_p7a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p7a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p7a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p7a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p7a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p7a2);
        jButton_p7a2.setBounds(400, 130, 50, 40);

        jButton_p8a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p8a2.setText("8");
        jButton_p8a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p8a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p8a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p8a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p8a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p8a2);
        jButton_p8a2.setBounds(450, 130, 50, 40);

        jButton_p9a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p9a2.setText("9");
        jButton_p9a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p9a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p9a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p9a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p9a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p9a2);
        jButton_p9a2.setBounds(500, 130, 50, 40);

        jButton_p10a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p10a2.setText("10");
        jButton_p10a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p10a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p10a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p10a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p10a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p10a2);
        jButton_p10a2.setBounds(550, 130, 50, 40);

        jButton_p11a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p11a2.setText("11");
        jButton_p11a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p11a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p11a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p11a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p11a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p11a2);
        jButton_p11a2.setBounds(600, 130, 50, 40);

        jButton_p12a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p12a2.setText("12");
        jButton_p12a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p12a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p12a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p12a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p12a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p12a2);
        jButton_p12a2.setBounds(650, 130, 50, 40);

        jButton_p13a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p13a2.setText("13");
        jButton_p13a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p13a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p13a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p13a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p13a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p13a2);
        jButton_p13a2.setBounds(100, 170, 50, 40);

        jButton_p14a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p14a2.setText("14");
        jButton_p14a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p14a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p14a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p14a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p14a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p14a2);
        jButton_p14a2.setBounds(150, 170, 50, 40);

        jButton_p15a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p15a2.setText("15");
        jButton_p15a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p15a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p15a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p15a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p15a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p15a2);
        jButton_p15a2.setBounds(200, 170, 50, 40);

        jButton_p16a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p16a2.setText("16");
        jButton_p16a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p16a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p16a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p16a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p16a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p16a2);
        jButton_p16a2.setBounds(250, 170, 50, 40);

        jButton_p17a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p17a2.setText("17");
        jButton_p17a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p17a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p17a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p17a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p17a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p17a2);
        jButton_p17a2.setBounds(300, 170, 50, 40);

        jButton_p18a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p18a2.setText("18");
        jButton_p18a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p18a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p18a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p18a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p18a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p18a2);
        jButton_p18a2.setBounds(350, 170, 50, 40);

        jButton_p19a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p19a2.setText("19");
        jButton_p19a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p19a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p19a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p19a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p19a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p19a2);
        jButton_p19a2.setBounds(400, 170, 50, 40);

        jButton_p20a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p20a2.setText("20");
        jButton_p20a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p20a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p20a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p20a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p20a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p20a2);
        jButton_p20a2.setBounds(450, 170, 50, 40);

        jButton_p21a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p21a2.setText("21");
        jButton_p21a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p21a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p21a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p21a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p21a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p21a2);
        jButton_p21a2.setBounds(500, 170, 50, 40);

        jButton_p22a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p22a2.setText("22");
        jButton_p22a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p22a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p22a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p22a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p22a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p22a2);
        jButton_p22a2.setBounds(550, 170, 50, 40);

        jButton_p23a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p23a2.setText("23");
        jButton_p23a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p23a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p23a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p23a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p23a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p23a2);
        jButton_p23a2.setBounds(600, 170, 50, 40);

        jButton_p24a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p24a2.setText("24");
        jButton_p24a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p24a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p24a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p24a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p24a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p24a2);
        jButton_p24a2.setBounds(650, 170, 50, 40);

        jButton_p25a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p25a2.setText("25");
        jButton_p25a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p25a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p25a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p25a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p25a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p25a2);
        jButton_p25a2.setBounds(100, 210, 50, 40);

        jButton_p26a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p26a2.setText("26");
        jButton_p26a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p26a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p26a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p26a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p26a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p26a2);
        jButton_p26a2.setBounds(150, 210, 50, 40);

        jButton_p27a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p27a2.setText("27");
        jButton_p27a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p27a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p27a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p27a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p27a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p27a2);
        jButton_p27a2.setBounds(200, 210, 50, 40);

        jButton_p28a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p28a2.setText("28");
        jButton_p28a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p28a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p28a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p28a2);
        jButton_p28a2.setBounds(250, 210, 50, 40);

        jButton_p29a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p29a2.setText("29");
        jButton_p29a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p29a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p29a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p29a2);
        jButton_p29a2.setBounds(300, 210, 50, 40);

        jButton_p30a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p30a2.setText("30");
        jButton_p30a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p30a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p30a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p30a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p30a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p30a2);
        jButton_p30a2.setBounds(350, 210, 50, 40);

        jButton_p31a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p31a2.setText("31");
        jButton_p31a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p31a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p31a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p31a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p31a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p31a2);
        jButton_p31a2.setBounds(400, 210, 50, 40);

        jButton_p32a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p32a2.setText("32");
        jButton_p32a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p32a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p32a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p32a2);
        jButton_p32a2.setBounds(450, 210, 50, 40);

        jButton_p33a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p33a2.setText("33");
        jButton_p33a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p33a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p33a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p33a2);
        jButton_p33a2.setBounds(500, 210, 50, 40);

        jButton_p34a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p34a2.setText("34");
        jButton_p34a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p34a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p34a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p34a2);
        jButton_p34a2.setBounds(550, 210, 50, 40);

        jButton_p35a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p35a2.setText("35");
        jButton_p35a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p35a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p35a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p35a2);
        jButton_p35a2.setBounds(600, 210, 50, 40);

        jButton_p36a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p36a2.setText("36");
        jButton_p36a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p36a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p36a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p36a2);
        jButton_p36a2.setBounds(650, 210, 50, 40);

        jButton_p37a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p37a2.setText("37");
        jButton_p37a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p37a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p37a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p37a2);
        jButton_p37a2.setBounds(100, 250, 50, 40);

        jButton_p38a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p38a2.setText("38");
        jButton_p38a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p38a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p38a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p38a2);
        jButton_p38a2.setBounds(150, 250, 50, 40);

        jButton_p39a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p39a2.setText("39");
        jButton_p39a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p39a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p39a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p39a2);
        jButton_p39a2.setBounds(200, 250, 50, 40);

        jButton_p40a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p40a2.setText("40");
        jButton_p40a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p40a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p40a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p40a2);
        jButton_p40a2.setBounds(250, 250, 50, 40);

        jButton_p41a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p41a2.setText("41");
        jButton_p41a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p41a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p41a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p41a2);
        jButton_p41a2.setBounds(300, 250, 50, 40);

        jButton_p42a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p42a2.setText("42");
        jButton_p42a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p42a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p42a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p42a2);
        jButton_p42a2.setBounds(350, 250, 50, 40);

        jButton_p43a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p43a2.setText("43");
        jButton_p43a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p43a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p43a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p43a2);
        jButton_p43a2.setBounds(400, 250, 50, 40);

        jButton_p44a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p44a2.setText("44");
        jButton_p44a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p44a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p44a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p44a2);
        jButton_p44a2.setBounds(450, 250, 50, 40);

        jButton_p45a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p45a2.setText("45");
        jButton_p45a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p45a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p45a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p45a2);
        jButton_p45a2.setBounds(500, 250, 50, 40);

        jButton_p46a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p46a2.setText("46");
        jButton_p46a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p46a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p46a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p46a2);
        jButton_p46a2.setBounds(550, 250, 50, 40);

        jButton_p47a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p47a2.setText("47");
        jButton_p47a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p47a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p47a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p47a2);
        jButton_p47a2.setBounds(600, 250, 50, 40);

        jButton_p48a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p48a2.setText("48");
        jButton_p48a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p48a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p48a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p48a2);
        jButton_p48a2.setBounds(650, 250, 50, 40);

        jButton_p49a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p49a2.setText("49");
        jButton_p49a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p49a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p49a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p49a2);
        jButton_p49a2.setBounds(100, 290, 50, 40);

        jButton_p50a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p50a2.setText("50");
        jButton_p50a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p50a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p50a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p50a2);
        jButton_p50a2.setBounds(150, 290, 50, 40);

        jButton_p51a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p51a2.setText("51");
        jButton_p51a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p51a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p51a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p51a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p51a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p51a2);
        jButton_p51a2.setBounds(200, 290, 50, 40);

        jButton_p52a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p52a2.setText("52");
        jButton_p52a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p52a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p52a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p52a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p52a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p52a2);
        jButton_p52a2.setBounds(250, 290, 50, 40);

        jButton_p53a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p53a2.setText("53");
        jButton_p53a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p53a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p53a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p53a2);
        jButton_p53a2.setBounds(300, 290, 50, 40);

        jButton_p54a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p54a2.setText("54");
        jButton_p54a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p54a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p54a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p54a2);
        jButton_p54a2.setBounds(350, 290, 50, 40);

        jButton_p55a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p55a2.setText("55");
        jButton_p55a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p55a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p55a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p55a2);
        jButton_p55a2.setBounds(400, 290, 50, 40);

        jButton_p56a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p56a2.setText("56");
        jButton_p56a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p56a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p56a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p56a2);
        jButton_p56a2.setBounds(450, 290, 50, 40);

        jButton_p57a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p57a2.setText("57");
        jButton_p57a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p57a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p57a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p57a2);
        jButton_p57a2.setBounds(500, 290, 50, 40);

        jButton_p58a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p58a2.setText("58");
        jButton_p58a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p58a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p58a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p58a2);
        jButton_p58a2.setBounds(550, 290, 50, 40);

        jButton_p59a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p59a2.setText("59");
        jButton_p59a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p59a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p59a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p59a2);
        jButton_p59a2.setBounds(600, 290, 50, 40);

        jButton_p60a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p60a2.setText("60");
        jButton_p60a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p60a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p60a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p60a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p60a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p60a2);
        jButton_p60a2.setBounds(650, 290, 50, 40);

        jButton_p61a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p61a2.setText("61");
        jButton_p61a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p61a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p61a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p61a2);
        jButton_p61a2.setBounds(100, 330, 50, 40);

        jButton_p62a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p62a2.setText("62");
        jButton_p62a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p62a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p62a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p62a2);
        jButton_p62a2.setBounds(150, 330, 50, 40);

        jButton_p63a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p63a2.setText("63");
        jButton_p63a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p63a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p63a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p63a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p63a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p63a2);
        jButton_p63a2.setBounds(200, 330, 50, 40);

        jButton_p64a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p64a2.setText("64");
        jButton_p64a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p64a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p64a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p64a2);
        jButton_p64a2.setBounds(250, 330, 50, 40);

        jButton_p65a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p65a2.setText("65");
        jButton_p65a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p65a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p65a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p65a2);
        jButton_p65a2.setBounds(300, 330, 50, 40);

        jButton_p66a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p66a2.setText("66");
        jButton_p66a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p66a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p66a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p66a2);
        jButton_p66a2.setBounds(350, 330, 50, 40);

        jButton_p67a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p67a2.setText("67");
        jButton_p67a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p67a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p67a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p67a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p67a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p67a2);
        jButton_p67a2.setBounds(400, 330, 50, 40);

        jButton_p68a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p68a2.setText("68");
        jButton_p68a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p68a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p68a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p68a2);
        jButton_p68a2.setBounds(450, 330, 50, 40);

        jButton_p69a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p69a2.setText("69");
        jButton_p69a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p69a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p69a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p69a2);
        jButton_p69a2.setBounds(500, 330, 50, 40);

        jButton_p70a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p70a2.setText("70");
        jButton_p70a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p70a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p70a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p70a2);
        jButton_p70a2.setBounds(550, 330, 50, 40);

        jButton_p71a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p71a2.setText("71");
        jButton_p71a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p71a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p71a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p71a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p71a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p71a2);
        jButton_p71a2.setBounds(600, 330, 50, 40);

        jButton_p72a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p72a2.setText("72");
        jButton_p72a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p72a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p72a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p72a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p72a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p72a2);
        jButton_p72a2.setBounds(650, 330, 50, 40);

        jButton_p73a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p73a2.setText("73");
        jButton_p73a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p73a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p73a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p73a2);
        jButton_p73a2.setBounds(100, 370, 50, 40);

        jButton_p74a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p74a2.setText("74");
        jButton_p74a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p74a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p74a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p74a2);
        jButton_p74a2.setBounds(150, 370, 50, 40);

        jButton_p75a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p75a2.setText("75");
        jButton_p75a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p75a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p75a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p75a2);
        jButton_p75a2.setBounds(200, 370, 50, 40);

        jButton_p76a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p76a2.setText("76");
        jButton_p76a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p76a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p76a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p76a2);
        jButton_p76a2.setBounds(250, 370, 50, 40);

        jButton_p77a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p77a2.setText("77");
        jButton_p77a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p77a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p77a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p77a2);
        jButton_p77a2.setBounds(300, 370, 50, 40);

        jButton_p78a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p78a2.setText("78");
        jButton_p78a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p78a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p78a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p78a2);
        jButton_p78a2.setBounds(350, 370, 50, 40);

        jButton_p79a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p79a2.setText("79");
        jButton_p79a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p79a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p79a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p79a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p79a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p79a2);
        jButton_p79a2.setBounds(400, 370, 50, 40);

        jButton_p80a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p80a2.setText("80");
        jButton_p80a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p80a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p80a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p80a2);
        jButton_p80a2.setBounds(450, 370, 50, 40);

        jButton_p81a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p81a2.setText("81");
        jButton_p81a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p81a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p81a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p81a2);
        jButton_p81a2.setBounds(500, 370, 50, 40);

        jButton_p82a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p82a2.setText("82");
        jButton_p82a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p82a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p82a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p82a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p82a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p82a2);
        jButton_p82a2.setBounds(550, 370, 50, 40);

        jButton_p83a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p83a2.setText("83");
        jButton_p83a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p83a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p83a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p83a2);
        jButton_p83a2.setBounds(600, 370, 50, 40);

        jButton_p84a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p84a2.setText("84");
        jButton_p84a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p84a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p84a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p84a2);
        jButton_p84a2.setBounds(650, 370, 50, 40);

        jButton_p85a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p85a2.setText("85");
        jButton_p85a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p85a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p85a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p85a2);
        jButton_p85a2.setBounds(100, 410, 50, 40);

        jButton_p86a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p86a2.setText("86");
        jButton_p86a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p86a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p86a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p86a2);
        jButton_p86a2.setBounds(150, 410, 50, 40);

        jButton_p87a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p87a2.setText("87");
        jButton_p87a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p87a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p87a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p87a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p87a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p87a2);
        jButton_p87a2.setBounds(200, 410, 50, 40);

        jButton_p88a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p88a2.setText("88");
        jButton_p88a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p88a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p88a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p88a2);
        jButton_p88a2.setBounds(250, 410, 50, 40);

        jButton_p89a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p89a2.setText("89");
        jButton_p89a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p89a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p89a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p89a2);
        jButton_p89a2.setBounds(300, 410, 50, 40);

        jButton_p90a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p90a2.setText("90");
        jButton_p90a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p90a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p90a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p90a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p90a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p90a2);
        jButton_p90a2.setBounds(350, 410, 50, 40);

        jButton_p91a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p91a2.setText("91");
        jButton_p91a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p91a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p91a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p91a2);
        jButton_p91a2.setBounds(400, 410, 50, 40);

        jButton_p92a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p92a2.setText("92");
        jButton_p92a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p92a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p92a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p92a2);
        jButton_p92a2.setBounds(450, 410, 50, 40);

        jButton_p93a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p93a2.setText("93");
        jButton_p93a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p93a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p93a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p93a2);
        jButton_p93a2.setBounds(500, 410, 50, 40);

        jButton_p94a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p94a2.setText("94");
        jButton_p94a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p94a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p94a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p94a2);
        jButton_p94a2.setBounds(550, 410, 50, 40);

        jButton_p95a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p95a2.setText("95");
        jButton_p95a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p95a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p95a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p95a2);
        jButton_p95a2.setBounds(600, 410, 50, 40);

        jButton_p96a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p96a2.setText("96");
        jButton_p96a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p96a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p96a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p96a2);
        jButton_p96a2.setBounds(650, 410, 50, 40);

        jButton_p97a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p97a2.setText("97");
        jButton_p97a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p97a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p97a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p97a2);
        jButton_p97a2.setBounds(100, 450, 50, 40);

        jButton_p98a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p98a2.setText("98");
        jButton_p98a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p98a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p98a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jPanel_tercera.add(jButton_p98a2);
        jButton_p98a2.setBounds(150, 450, 50, 40);

        jButton_p99a2.setBackground(new java.awt.Color(204, 255, 255));
        jButton_p99a2.setText("99");
        jButton_p99a2.setMaximumSize(new java.awt.Dimension(50, 40));
        jButton_p99a2.setMinimumSize(new java.awt.Dimension(50, 40));
        jButton_p99a2.setPreferredSize(new java.awt.Dimension(50, 40));
        jButton_p99a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_p99a2ActionPerformed(evt);
            }
        });
        jPanel_tercera.add(jButton_p99a2);
        jButton_p99a2.setBounds(200, 450, 50, 40);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel4.setText("seleccione la posicion de ubicacion");
        jPanel_tercera.add(jLabel4);
        jLabel4.setBounds(170, 30, 460, 70);

        jTabbedPane_principal.addTab("tercera planta", jPanel_tercera);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jTabbedPane_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_p99aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p99aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p99aActionPerformed

    private void jButton_p90aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p90aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p90aActionPerformed

    private void jButton_p82aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p82aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p82aActionPerformed

    private void jButton_p87aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p87aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p87aActionPerformed

    private void jButton_p67aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p67aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p67aActionPerformed

    private void jButton_p52aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p52aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p52aActionPerformed

    private void jButton_p71aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p71aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p71aActionPerformed

    private void jButton_p51aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p51aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p51aActionPerformed

    private void jButton_p60aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p60aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p60aActionPerformed

    private void jButton_p72aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p72aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p72aActionPerformed

    private void jButton_p63aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p63aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p63aActionPerformed

    private void jButton_p30aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p30aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p30aActionPerformed

    private void jButton_p31aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p31aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p31aActionPerformed

    private void jButton_p16aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p16aActionPerformed
      desactivar(16,1);
    }//GEN-LAST:event_jButton_p16aActionPerformed

    private void jButton_p8aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p8aActionPerformed
       desactivar(8,1);
    }//GEN-LAST:event_jButton_p8aActionPerformed

    private void jButton_p10aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p10aActionPerformed
        desactivar(10,1);
    }//GEN-LAST:event_jButton_p10aActionPerformed

    private void jButton_p2aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p2aActionPerformed
    desactivar(2,1);
    }//GEN-LAST:event_jButton_p2aActionPerformed

    private void jButton_p1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p1aActionPerformed
        desactivar(1,1);
    }//GEN-LAST:event_jButton_p1aActionPerformed

    private void jButton_p3aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p3aActionPerformed
    desactivar(3,1);
    }//GEN-LAST:event_jButton_p3aActionPerformed

    private void jButton_p79aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p79aActionPerformed
    desactivar(78,1);
    }//GEN-LAST:event_jButton_p79aActionPerformed

    private void jButton_p6aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p6aActionPerformed
       desactivar(6,1);
    }//GEN-LAST:event_jButton_p6aActionPerformed

    private void jButton_p9aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p9aActionPerformed
        desactivar(9,1);
    }//GEN-LAST:event_jButton_p9aActionPerformed

    private void jButton_p14aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p14aActionPerformed
       desactivar(14,1);
    }//GEN-LAST:event_jButton_p14aActionPerformed

    private void jButton_p26aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p26aActionPerformed
        desactivar(26,1);
    }//GEN-LAST:event_jButton_p26aActionPerformed

    private void jButton_p4aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p4aActionPerformed
       desactivar(4,1);
    }//GEN-LAST:event_jButton_p4aActionPerformed

    private void jButton_p5aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p5aActionPerformed
       desactivar(5,1);
    }//GEN-LAST:event_jButton_p5aActionPerformed

    private void jButton_p7aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p7aActionPerformed
       desactivar(7,1);
    }//GEN-LAST:event_jButton_p7aActionPerformed

    private void jButton_p11aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p11aActionPerformed
       desactivar(11,1);
    }//GEN-LAST:event_jButton_p11aActionPerformed

    private void jButton_p12aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p12aActionPerformed
        desactivar(12,1);
    }//GEN-LAST:event_jButton_p12aActionPerformed

    private void jButton_p13aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p13aActionPerformed
        desactivar(13,1);
    }//GEN-LAST:event_jButton_p13aActionPerformed

    private void jButton_p15aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p15aActionPerformed
        desactivar(15,1);
    }//GEN-LAST:event_jButton_p15aActionPerformed

    private void jButton_p17aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p17aActionPerformed
        desactivar(17,1);
    }//GEN-LAST:event_jButton_p17aActionPerformed

    private void jButton_p18aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p18aActionPerformed
        desactivar(18,1);
    }//GEN-LAST:event_jButton_p18aActionPerformed

    private void jButton_p19aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p19aActionPerformed
        desactivar(19,1);
    }//GEN-LAST:event_jButton_p19aActionPerformed

    private void jButton_p20aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p20aActionPerformed
        desactivar(20,1);
    }//GEN-LAST:event_jButton_p20aActionPerformed

    private void jButton_p21aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p21aActionPerformed
        desactivar(21,1);
    }//GEN-LAST:event_jButton_p21aActionPerformed

    private void jButton_p22aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p22aActionPerformed
        desactivar(22,1);
    }//GEN-LAST:event_jButton_p22aActionPerformed

    private void jButton_p23aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p23aActionPerformed
        desactivar(23,1);
    }//GEN-LAST:event_jButton_p23aActionPerformed

    private void jButton_p24aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p24aActionPerformed
       desactivar(24,1);
    }//GEN-LAST:event_jButton_p24aActionPerformed

    private void jButton_p25aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p25aActionPerformed
        desactivar(25,1);
    }//GEN-LAST:event_jButton_p25aActionPerformed

    private void jButton_p27aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p27aActionPerformed
        desactivar(27,1);
    }//GEN-LAST:event_jButton_p27aActionPerformed

    private void jButton_p1a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p1a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p1a2ActionPerformed

    private void jButton_p2a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p2a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p2a2ActionPerformed

    private void jButton_p3a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p3a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p3a2ActionPerformed

    private void jButton_p4a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p4a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p4a2ActionPerformed

    private void jButton_p5a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p5a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p5a2ActionPerformed

    private void jButton_p6a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p6a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p6a2ActionPerformed

    private void jButton_p7a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p7a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p7a2ActionPerformed

    private void jButton_p8a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p8a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p8a2ActionPerformed

    private void jButton_p9a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p9a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p9a2ActionPerformed

    private void jButton_p10a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p10a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p10a2ActionPerformed

    private void jButton_p11a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p11a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p11a2ActionPerformed

    private void jButton_p12a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p12a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p12a2ActionPerformed

    private void jButton_p13a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p13a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p13a2ActionPerformed

    private void jButton_p14a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p14a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p14a2ActionPerformed

    private void jButton_p15a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p15a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p15a2ActionPerformed

    private void jButton_p16a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p16a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p16a2ActionPerformed

    private void jButton_p17a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p17a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p17a2ActionPerformed

    private void jButton_p18a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p18a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p18a2ActionPerformed

    private void jButton_p19a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p19a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p19a2ActionPerformed

    private void jButton_p20a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p20a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p20a2ActionPerformed

    private void jButton_p21a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p21a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p21a2ActionPerformed

    private void jButton_p22a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p22a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p22a2ActionPerformed

    private void jButton_p23a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p23a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p23a2ActionPerformed

    private void jButton_p24a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p24a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p24a2ActionPerformed

    private void jButton_p25a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p25a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p25a2ActionPerformed

    private void jButton_p26a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p26a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p26a2ActionPerformed

    private void jButton_p27a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p27a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p27a2ActionPerformed

    private void jButton_p30a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p30a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p30a2ActionPerformed

    private void jButton_p31a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p31a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p31a2ActionPerformed

    private void jButton_p51a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p51a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p51a2ActionPerformed

    private void jButton_p52a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p52a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p52a2ActionPerformed

    private void jButton_p60a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p60a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p60a2ActionPerformed

    private void jButton_p63a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p63a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p63a2ActionPerformed

    private void jButton_p67a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p67a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p67a2ActionPerformed

    private void jButton_p71a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p71a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p71a2ActionPerformed

    private void jButton_p72a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p72a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p72a2ActionPerformed

    private void jButton_p79a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p79a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p79a2ActionPerformed

    private void jButton_p82a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p82a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p82a2ActionPerformed

    private void jButton_p87a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p87a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p87a2ActionPerformed

    private void jButton_p90a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p90a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p90a2ActionPerformed

    private void jButton_p99a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p99a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p99a2ActionPerformed

    private void jButton_p1a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p1a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p1a1ActionPerformed

    private void jButton_p2a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p2a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p2a1ActionPerformed

    private void jButton_p3a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p3a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p3a1ActionPerformed

    private void jButton_p4a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p4a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p4a1ActionPerformed

    private void jButton_p5a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p5a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p5a1ActionPerformed

    private void jButton_p6a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p6a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p6a1ActionPerformed

    private void jButton_p7a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p7a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p7a1ActionPerformed

    private void jButton_p8a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p8a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p8a1ActionPerformed

    private void jButton_p9a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p9a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p9a1ActionPerformed

    private void jButton_p10a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p10a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p10a1ActionPerformed

    private void jButton_p11a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p11a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p11a1ActionPerformed

    private void jButton_p12a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p12a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p12a1ActionPerformed

    private void jButton_p13a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p13a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p13a1ActionPerformed

    private void jButton_p14a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p14a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p14a1ActionPerformed

    private void jButton_p15a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p15a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p15a1ActionPerformed

    private void jButton_p16a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p16a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p16a1ActionPerformed

    private void jButton_p17a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p17a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p17a1ActionPerformed

    private void jButton_p18a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p18a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p18a1ActionPerformed

    private void jButton_p19a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p19a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p19a1ActionPerformed

    private void jButton_p20a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p20a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p20a1ActionPerformed

    private void jButton_p21a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p21a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p21a1ActionPerformed

    private void jButton_p22a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p22a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p22a1ActionPerformed

    private void jButton_p23a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p23a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p23a1ActionPerformed

    private void jButton_p24a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p24a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p24a1ActionPerformed

    private void jButton_p25a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p25a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p25a1ActionPerformed

    private void jButton_p26a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p26a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p26a1ActionPerformed

    private void jButton_p27a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p27a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p27a1ActionPerformed

    private void jButton_p30a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p30a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p30a1ActionPerformed

    private void jButton_p31a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p31a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p31a1ActionPerformed

    private void jButton_p51a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p51a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p51a1ActionPerformed

    private void jButton_p52a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p52a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p52a1ActionPerformed

    private void jButton_p60a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p60a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p60a1ActionPerformed

    private void jButton_p63a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p63a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p63a1ActionPerformed

    private void jButton_p67a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p67a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p67a1ActionPerformed

    private void jButton_p71a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p71a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p71a1ActionPerformed

    private void jButton_p72a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p72a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p72a1ActionPerformed

    private void jButton_p79a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p79a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p79a1ActionPerformed

    private void jButton_p82a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p82a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p82a1ActionPerformed

    private void jButton_p87a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p87a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p87a1ActionPerformed

    private void jButton_p90a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p90a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p90a1ActionPerformed

    private void jButton_p99a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_p99a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_p99a1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ubicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ubicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ubicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ubicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ubicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_p10a;
    private javax.swing.JButton jButton_p10a1;
    private javax.swing.JButton jButton_p10a2;
    private javax.swing.JButton jButton_p11a;
    private javax.swing.JButton jButton_p11a1;
    private javax.swing.JButton jButton_p11a2;
    private javax.swing.JButton jButton_p12a;
    private javax.swing.JButton jButton_p12a1;
    private javax.swing.JButton jButton_p12a2;
    private javax.swing.JButton jButton_p13a;
    private javax.swing.JButton jButton_p13a1;
    private javax.swing.JButton jButton_p13a2;
    private javax.swing.JButton jButton_p14a;
    private javax.swing.JButton jButton_p14a1;
    private javax.swing.JButton jButton_p14a2;
    private javax.swing.JButton jButton_p15a;
    private javax.swing.JButton jButton_p15a1;
    private javax.swing.JButton jButton_p15a2;
    private javax.swing.JButton jButton_p16a;
    private javax.swing.JButton jButton_p16a1;
    private javax.swing.JButton jButton_p16a2;
    private javax.swing.JButton jButton_p17a;
    private javax.swing.JButton jButton_p17a1;
    private javax.swing.JButton jButton_p17a2;
    private javax.swing.JButton jButton_p18a;
    private javax.swing.JButton jButton_p18a1;
    private javax.swing.JButton jButton_p18a2;
    private javax.swing.JButton jButton_p19a;
    private javax.swing.JButton jButton_p19a1;
    private javax.swing.JButton jButton_p19a2;
    private javax.swing.JButton jButton_p1a;
    private javax.swing.JButton jButton_p1a1;
    private javax.swing.JButton jButton_p1a2;
    private javax.swing.JButton jButton_p20a;
    private javax.swing.JButton jButton_p20a1;
    private javax.swing.JButton jButton_p20a2;
    private javax.swing.JButton jButton_p21a;
    private javax.swing.JButton jButton_p21a1;
    private javax.swing.JButton jButton_p21a2;
    private javax.swing.JButton jButton_p22a;
    private javax.swing.JButton jButton_p22a1;
    private javax.swing.JButton jButton_p22a2;
    private javax.swing.JButton jButton_p23a;
    private javax.swing.JButton jButton_p23a1;
    private javax.swing.JButton jButton_p23a2;
    private javax.swing.JButton jButton_p24a;
    private javax.swing.JButton jButton_p24a1;
    private javax.swing.JButton jButton_p24a2;
    private javax.swing.JButton jButton_p25a;
    private javax.swing.JButton jButton_p25a1;
    private javax.swing.JButton jButton_p25a2;
    private javax.swing.JButton jButton_p26a;
    private javax.swing.JButton jButton_p26a1;
    private javax.swing.JButton jButton_p26a2;
    private javax.swing.JButton jButton_p27a;
    private javax.swing.JButton jButton_p27a1;
    private javax.swing.JButton jButton_p27a2;
    private javax.swing.JButton jButton_p28a;
    private javax.swing.JButton jButton_p28a1;
    private javax.swing.JButton jButton_p28a2;
    private javax.swing.JButton jButton_p29a;
    private javax.swing.JButton jButton_p29a1;
    private javax.swing.JButton jButton_p29a2;
    private javax.swing.JButton jButton_p2a;
    private javax.swing.JButton jButton_p2a1;
    private javax.swing.JButton jButton_p2a2;
    private javax.swing.JButton jButton_p30a;
    private javax.swing.JButton jButton_p30a1;
    private javax.swing.JButton jButton_p30a2;
    private javax.swing.JButton jButton_p31a;
    private javax.swing.JButton jButton_p31a1;
    private javax.swing.JButton jButton_p31a2;
    private javax.swing.JButton jButton_p32a;
    private javax.swing.JButton jButton_p32a1;
    private javax.swing.JButton jButton_p32a2;
    private javax.swing.JButton jButton_p33a;
    private javax.swing.JButton jButton_p33a1;
    private javax.swing.JButton jButton_p33a2;
    private javax.swing.JButton jButton_p34a;
    private javax.swing.JButton jButton_p34a1;
    private javax.swing.JButton jButton_p34a2;
    private javax.swing.JButton jButton_p35a;
    private javax.swing.JButton jButton_p35a1;
    private javax.swing.JButton jButton_p35a2;
    private javax.swing.JButton jButton_p36a;
    private javax.swing.JButton jButton_p36a1;
    private javax.swing.JButton jButton_p36a2;
    private javax.swing.JButton jButton_p37a;
    private javax.swing.JButton jButton_p37a1;
    private javax.swing.JButton jButton_p37a2;
    private javax.swing.JButton jButton_p38a;
    private javax.swing.JButton jButton_p38a1;
    private javax.swing.JButton jButton_p38a2;
    private javax.swing.JButton jButton_p39a;
    private javax.swing.JButton jButton_p39a1;
    private javax.swing.JButton jButton_p39a2;
    private javax.swing.JButton jButton_p3a;
    private javax.swing.JButton jButton_p3a1;
    private javax.swing.JButton jButton_p3a2;
    private javax.swing.JButton jButton_p40a;
    private javax.swing.JButton jButton_p40a1;
    private javax.swing.JButton jButton_p40a2;
    private javax.swing.JButton jButton_p41a;
    private javax.swing.JButton jButton_p41a1;
    private javax.swing.JButton jButton_p41a2;
    private javax.swing.JButton jButton_p42a;
    private javax.swing.JButton jButton_p42a1;
    private javax.swing.JButton jButton_p42a2;
    private javax.swing.JButton jButton_p43a;
    private javax.swing.JButton jButton_p43a1;
    private javax.swing.JButton jButton_p43a2;
    private javax.swing.JButton jButton_p44a;
    private javax.swing.JButton jButton_p44a1;
    private javax.swing.JButton jButton_p44a2;
    private javax.swing.JButton jButton_p45a;
    private javax.swing.JButton jButton_p45a1;
    private javax.swing.JButton jButton_p45a2;
    private javax.swing.JButton jButton_p46a;
    private javax.swing.JButton jButton_p46a1;
    private javax.swing.JButton jButton_p46a2;
    private javax.swing.JButton jButton_p47a;
    private javax.swing.JButton jButton_p47a1;
    private javax.swing.JButton jButton_p47a2;
    private javax.swing.JButton jButton_p48a;
    private javax.swing.JButton jButton_p48a1;
    private javax.swing.JButton jButton_p48a2;
    private javax.swing.JButton jButton_p49a;
    private javax.swing.JButton jButton_p49a1;
    private javax.swing.JButton jButton_p49a2;
    private javax.swing.JButton jButton_p4a;
    private javax.swing.JButton jButton_p4a1;
    private javax.swing.JButton jButton_p4a2;
    private javax.swing.JButton jButton_p50a;
    private javax.swing.JButton jButton_p50a1;
    private javax.swing.JButton jButton_p50a2;
    private javax.swing.JButton jButton_p51a;
    private javax.swing.JButton jButton_p51a1;
    private javax.swing.JButton jButton_p51a2;
    private javax.swing.JButton jButton_p52a;
    private javax.swing.JButton jButton_p52a1;
    private javax.swing.JButton jButton_p52a2;
    private javax.swing.JButton jButton_p53a;
    private javax.swing.JButton jButton_p53a1;
    private javax.swing.JButton jButton_p53a2;
    private javax.swing.JButton jButton_p54a;
    private javax.swing.JButton jButton_p54a1;
    private javax.swing.JButton jButton_p54a2;
    private javax.swing.JButton jButton_p55a;
    private javax.swing.JButton jButton_p55a1;
    private javax.swing.JButton jButton_p55a2;
    private javax.swing.JButton jButton_p56a;
    private javax.swing.JButton jButton_p56a1;
    private javax.swing.JButton jButton_p56a2;
    private javax.swing.JButton jButton_p57a;
    private javax.swing.JButton jButton_p57a1;
    private javax.swing.JButton jButton_p57a2;
    private javax.swing.JButton jButton_p58a;
    private javax.swing.JButton jButton_p58a1;
    private javax.swing.JButton jButton_p58a2;
    private javax.swing.JButton jButton_p59a;
    private javax.swing.JButton jButton_p59a1;
    private javax.swing.JButton jButton_p59a2;
    private javax.swing.JButton jButton_p5a;
    private javax.swing.JButton jButton_p5a1;
    private javax.swing.JButton jButton_p5a2;
    private javax.swing.JButton jButton_p60a;
    private javax.swing.JButton jButton_p60a1;
    private javax.swing.JButton jButton_p60a2;
    private javax.swing.JButton jButton_p61a;
    private javax.swing.JButton jButton_p61a1;
    private javax.swing.JButton jButton_p61a2;
    private javax.swing.JButton jButton_p62a;
    private javax.swing.JButton jButton_p62a1;
    private javax.swing.JButton jButton_p62a2;
    private javax.swing.JButton jButton_p63a;
    private javax.swing.JButton jButton_p63a1;
    private javax.swing.JButton jButton_p63a2;
    private javax.swing.JButton jButton_p64a;
    private javax.swing.JButton jButton_p64a1;
    private javax.swing.JButton jButton_p64a2;
    private javax.swing.JButton jButton_p65a;
    private javax.swing.JButton jButton_p65a1;
    private javax.swing.JButton jButton_p65a2;
    private javax.swing.JButton jButton_p66a;
    private javax.swing.JButton jButton_p66a1;
    private javax.swing.JButton jButton_p66a2;
    private javax.swing.JButton jButton_p67a;
    private javax.swing.JButton jButton_p67a1;
    private javax.swing.JButton jButton_p67a2;
    private javax.swing.JButton jButton_p68a;
    private javax.swing.JButton jButton_p68a1;
    private javax.swing.JButton jButton_p68a2;
    private javax.swing.JButton jButton_p69a;
    private javax.swing.JButton jButton_p69a1;
    private javax.swing.JButton jButton_p69a2;
    private javax.swing.JButton jButton_p6a;
    private javax.swing.JButton jButton_p6a1;
    private javax.swing.JButton jButton_p6a2;
    private javax.swing.JButton jButton_p70a;
    private javax.swing.JButton jButton_p70a1;
    private javax.swing.JButton jButton_p70a2;
    private javax.swing.JButton jButton_p71a;
    private javax.swing.JButton jButton_p71a1;
    private javax.swing.JButton jButton_p71a2;
    private javax.swing.JButton jButton_p72a;
    private javax.swing.JButton jButton_p72a1;
    private javax.swing.JButton jButton_p72a2;
    private javax.swing.JButton jButton_p73a;
    private javax.swing.JButton jButton_p73a1;
    private javax.swing.JButton jButton_p73a2;
    private javax.swing.JButton jButton_p74a;
    private javax.swing.JButton jButton_p74a1;
    private javax.swing.JButton jButton_p74a2;
    private javax.swing.JButton jButton_p75a;
    private javax.swing.JButton jButton_p75a1;
    private javax.swing.JButton jButton_p75a2;
    private javax.swing.JButton jButton_p76a;
    private javax.swing.JButton jButton_p76a1;
    private javax.swing.JButton jButton_p76a2;
    private javax.swing.JButton jButton_p77a;
    private javax.swing.JButton jButton_p77a1;
    private javax.swing.JButton jButton_p77a2;
    private javax.swing.JButton jButton_p78a;
    private javax.swing.JButton jButton_p78a1;
    private javax.swing.JButton jButton_p78a2;
    private javax.swing.JButton jButton_p79a;
    private javax.swing.JButton jButton_p79a1;
    private javax.swing.JButton jButton_p79a2;
    private javax.swing.JButton jButton_p7a;
    private javax.swing.JButton jButton_p7a1;
    private javax.swing.JButton jButton_p7a2;
    private javax.swing.JButton jButton_p80a;
    private javax.swing.JButton jButton_p80a1;
    private javax.swing.JButton jButton_p80a2;
    private javax.swing.JButton jButton_p81a;
    private javax.swing.JButton jButton_p81a1;
    private javax.swing.JButton jButton_p81a2;
    private javax.swing.JButton jButton_p82a;
    private javax.swing.JButton jButton_p82a1;
    private javax.swing.JButton jButton_p82a2;
    private javax.swing.JButton jButton_p83a;
    private javax.swing.JButton jButton_p83a1;
    private javax.swing.JButton jButton_p83a2;
    private javax.swing.JButton jButton_p84a;
    private javax.swing.JButton jButton_p84a1;
    private javax.swing.JButton jButton_p84a2;
    private javax.swing.JButton jButton_p85a;
    private javax.swing.JButton jButton_p85a1;
    private javax.swing.JButton jButton_p85a2;
    private javax.swing.JButton jButton_p86a;
    private javax.swing.JButton jButton_p86a1;
    private javax.swing.JButton jButton_p86a2;
    private javax.swing.JButton jButton_p87a;
    private javax.swing.JButton jButton_p87a1;
    private javax.swing.JButton jButton_p87a2;
    private javax.swing.JButton jButton_p88a;
    private javax.swing.JButton jButton_p88a1;
    private javax.swing.JButton jButton_p88a2;
    private javax.swing.JButton jButton_p89a;
    private javax.swing.JButton jButton_p89a1;
    private javax.swing.JButton jButton_p89a2;
    private javax.swing.JButton jButton_p8a;
    private javax.swing.JButton jButton_p8a1;
    private javax.swing.JButton jButton_p8a2;
    private javax.swing.JButton jButton_p90a;
    private javax.swing.JButton jButton_p90a1;
    private javax.swing.JButton jButton_p90a2;
    private javax.swing.JButton jButton_p91a;
    private javax.swing.JButton jButton_p91a1;
    private javax.swing.JButton jButton_p91a2;
    private javax.swing.JButton jButton_p92a;
    private javax.swing.JButton jButton_p92a1;
    private javax.swing.JButton jButton_p92a2;
    private javax.swing.JButton jButton_p93a;
    private javax.swing.JButton jButton_p93a1;
    private javax.swing.JButton jButton_p93a2;
    private javax.swing.JButton jButton_p94a;
    private javax.swing.JButton jButton_p94a1;
    private javax.swing.JButton jButton_p94a2;
    private javax.swing.JButton jButton_p95a;
    private javax.swing.JButton jButton_p95a1;
    private javax.swing.JButton jButton_p95a2;
    private javax.swing.JButton jButton_p96a;
    private javax.swing.JButton jButton_p96a1;
    private javax.swing.JButton jButton_p96a2;
    private javax.swing.JButton jButton_p97a;
    private javax.swing.JButton jButton_p97a1;
    private javax.swing.JButton jButton_p97a2;
    private javax.swing.JButton jButton_p98a;
    private javax.swing.JButton jButton_p98a1;
    private javax.swing.JButton jButton_p98a2;
    private javax.swing.JButton jButton_p99a;
    private javax.swing.JButton jButton_p99a1;
    private javax.swing.JButton jButton_p99a2;
    private javax.swing.JButton jButton_p9a;
    private javax.swing.JButton jButton_p9a1;
    private javax.swing.JButton jButton_p9a2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_primer;
    private javax.swing.JPanel jPanel_segunda;
    private javax.swing.JPanel jPanel_tercera;
    private javax.swing.JTabbedPane jTabbedPane_principal;
    // End of variables declaration//GEN-END:variables
}
